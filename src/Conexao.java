import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author helde
 */
public class Conexao {
    public static Connection getConexao() throws SQLException{
        //Faz a conexão da interface com o Banco de Dados (será utilizado em todas as funções para realizar a conexão)
         Connection conexao = 
                DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                        + "livro?useTimezone=true&serverTimezone=UTC", 
                        "root", null); //1° campo: pega o endereço do banco de dados; 2° campo: usuário; 3° campo: senha (não tem)
        
        return conexao; //retorna a conexão
    }
    
    public static void adicionarLivro(Livro livro) throws SQLException{
        Connection conexao = getConexao(); //Realiza a conexão
        
        //Função para adicionar os livros (será usado no botão "cadastrar" da interface)
        
        PreparedStatement declaracaoSQL =
                conexao.prepareStatement("insert into livros "
                        + "(isbn,titulo, autor , ano , area , editora ,n_paginas ) values"
                        + "(?,? , ? , ? , ? , ? , ?)"); //Comando SQL para inserir os dados nos campos da tabela
        
        //Comandos get e set para inserir os valores nas colunas:
        declaracaoSQL.setInt(1, Integer.parseInt(livro.getISBN()));//Converte o valor String do ISBN para int
        declaracaoSQL.setString(2, livro.getTitulo());
        declaracaoSQL.setString(3, livro.getAutor());
        declaracaoSQL.setString(4, livro.getAno());
        declaracaoSQL.setString(5, livro.getArea());
        declaracaoSQL.setString(6, livro.getEditora());
        declaracaoSQL.setInt(7, Integer.parseInt(livro.getNumeroP()));//Converte o valor String do numero de paginas para int
        declaracaoSQL.execute(); 
    }
    
    public static DefaultTableModel recuperarLivros() throws SQLException{
        Connection conexao = getConexao();//Realiza a conexão
        
        //Função utilizada para atualizar a tabela. Logo, será utilizada em todos as funções que modifiquem a tabela de alguma forma (excluir, cadastrar e modificar).\
        
        PreparedStatement declaracaoSQL =
                conexao.prepareStatement("select * from livros"); //seleciona todos os campos/valores da tabela
        ResultSet resultados = declaracaoSQL.executeQuery(); //cria o objeto resultados, que servirá para armazenar os valores de tal linha, e consequentemente, atualiza-los
        
        DefaultTableModel modelo =
                new DefaultTableModel(new String[]{"cod","ISBN",
                    "titulo", "autor", "ano", "area","editora","n_paginas"}, 0); //cria um novo modelo de linha para substituir a anterior (ou seja, atualiza-la)
        
        while(resultados.next()){
            modelo.addRow(new Object[]{
                resultados.getInt("cod_livro"),
                resultados.getInt("isbn"),
                resultados.getString("titulo"),
                resultados.getString("autor"),
                resultados.getString("ano"),
                resultados.getString("area"),
                resultados.getString("editora"),
                resultados.getInt("n_paginas")});
        } //Enquanto tiver linhas para atualizar, a função continuará sendo executada
        
        return modelo;//retorna o modelo
    }
    public static void removerLivro(int linha) throws SQLException{
        Connection conexao = getConexao();//Realiza a conexão
        
        //Função para excluir uma das linhas, utilizada no botão "excluir"
        
        PreparedStatement declaracaoSQL =
                conexao.prepareStatement("Delete from livros where cod_livro = ?"); //Comando SQL para deletar tal linha da tabela, que será informada pelo usuário
        declaracaoSQL.setInt(1,linha);
        declaracaoSQL.execute();
    }
    
    public static void modificarLivro(Livro livro,int linha) throws SQLException{
        Connection conexao = getConexao(); //Realiza a conexão
        
        //Função para modificar uma linha da tabela em um campo específico, utilizada no botão "modificar"
        
        PreparedStatement declaracaoSQL =
                conexao.prepareStatement("UPDATE livros SET "+
                        "isbn=?,titulo=?, autor=?, ano=?, area=?, editora=?,n_paginas=?"+" WHERE cod_livro = ?"); //Comando SQL UPDATE, para atualizar certa linha nos campos que forem modificados
        //Comandos get e set para pegar os novos valores modificados
        declaracaoSQL.setInt(1, Integer.parseInt(livro.getISBN()));//Comando para converte o valor String do ISBN para int
        declaracaoSQL.setString(2, livro.getTitulo());
        declaracaoSQL.setString(3, livro.getAutor());
        declaracaoSQL.setString(4, livro.getAno());
        declaracaoSQL.setString(5, livro.getArea());
        declaracaoSQL.setString(6, livro.getEditora());
        declaracaoSQL.setInt(7, Integer.parseInt(livro.getNumeroP()));//Comando para converte o valor String do Numero de Paginas para int
        declaracaoSQL.setInt(8,linha);
        declaracaoSQL.execute();
    }
}
