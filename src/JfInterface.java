//Feito por: Anthony; Edson; Iury; Andre; Bruna S.
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class JfInterface extends javax.swing.JFrame {

    /**
     * Creates new form JfInterface
     */
    public JfInterface() {
        initComponents();
        
        DefaultTableModel modelo = null;
        try {
            modelo = Conexao.recuperarLivros();
        } catch (SQLException ex) {
            Logger.getLogger(JfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTabela.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jBTatt = new javax.swing.JButton();
        jBTcadastrar = new javax.swing.JButton();
        jBTdel = new javax.swing.JButton();
        jBTtest = new javax.swing.JButton();
        jTFnome = new javax.swing.JTextField();
        jTFautor = new javax.swing.JTextField();
        jTFano = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jTFarea = new javax.swing.JTextField();
        jTFeditora = new javax.swing.JTextField();
        jTFnp = new javax.swing.JTextField();
        jTFisbn = new javax.swing.JTextField();
        jBTmodifica = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBTatt.setText("Atualizar");
        jBTatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTattActionPerformed(evt);
            }
        });

        jBTcadastrar.setText("Cadastrar");
        jBTcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTcadastrarActionPerformed(evt);
            }
        });

        jBTdel.setText("Excluir");
        jBTdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTdelActionPerformed(evt);
            }
        });

        jBTtest.setText("Testar conexão");
        jBTtest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTtestActionPerformed(evt);
            }
        });

        jTFnome.setText("Nome do livro");

        jTFautor.setText("Nome do autor");

        jTFano.setText("Ano");

        jTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "cod_Livro", "ISBN", "Titulo", "Autor", "Ano", "Area", "Editora", "N Pagina"
            }
        ));
        jScrollPane2.setViewportView(jTabela);

        jTFarea.setText("Area");

        jTFeditora.setText("Nome da editora");

        jTFnp.setText("Numero de paginas");

        jTFisbn.setText("ISBN");

        jBTmodifica.setText("Modificar");
        jBTmodifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTmodificaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBTatt)
                                .addGap(18, 18, 18)
                                .addComponent(jBTcadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(jBTdel)
                                .addGap(18, 18, 18)
                                .addComponent(jBTmodifica)
                                .addGap(18, 18, 18)
                                .addComponent(jBTtest)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTFnome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFautor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFarea, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFano, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFeditora, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFnp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addComponent(jTFisbn, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBTatt)
                    .addComponent(jBTcadastrar)
                    .addComponent(jBTdel)
                    .addComponent(jBTtest)
                    .addComponent(jBTmodifica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFeditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFnp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFisbn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTattActionPerformed
      //Botão Atualizar
        DefaultTableModel modelo = null; //Dá valor nulo ao modelo
        try {
            modelo = Conexao.recuperarLivros(); //Dá o valor da função "recuperar livros" da classe conexão ao modelo, utilizada para atualizar a tabela
        } catch (SQLException ex) {
            Logger.getLogger(JfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTabela.setModel(modelo);
    }//GEN-LAST:event_jBTattActionPerformed

    private void jBTcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTcadastrarActionPerformed
       //Botão Cadastrar
        String Titulo = jTFnome.getText();
        String Autor = jTFautor.getText();
        String Ano = jTFano.getText();
        String Area = jTFarea.getText();
        String Editora = jTFeditora.getText();
        String NumeroP= jTFnp.getText();
        String isbn= jTFisbn.getText();
        Livro livro = new Livro(isbn,Titulo, Autor , Ano , Area , Editora , NumeroP);//Pega os valores inseridos pelo usuário no campo de texto e dá ao objeto livro, nos devidos campos
        
        try {
            Conexao.adicionarLivro(livro);//Utiliza a função Adicionar Livro da classe conexão para adicionar uma nova linha de livros
             DefaultTableModel modelo = null; //
        try {
            modelo = Conexao.recuperarLivros();//Função para atualizar a tabela automaticamente após cadastrar um novo livro
        } catch (SQLException ex) {
            Logger.getLogger(JfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTabela.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(JfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBTcadastrarActionPerformed

    private void jBTtestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTtestActionPerformed
       //Texta a conexão com o SQL
        Connection conexao = null;
        try {
            conexao = Conexao.getConexao();//Comando get para pegar a função conexão
        } catch (SQLException ex) {
            Logger.getLogger(JfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
       //Se a conexão for diferente de nulo (ou seja, estiver informando valores válidos), a conexão foi bem sucedida.
        if (conexao != null)
            System.out.println("Conectado com sucesso");
        else
            System.out.println("Conexão falhou");
    }//GEN-LAST:event_jBTtestActionPerformed

    private void jBTdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTdelActionPerformed
       //Função para excluir uma linha
        String numero=JOptionPane.showInputDialog(null, "Digite o cod_livro a ser deletado:");//Janela que aparece para o usuário informar a linha a ser excluída
        int linha= Integer.parseInt(numero);//Converte o valor String do optionpane para Int do cod_livro
        
        try {
            Conexao.removerLivro(linha);//Função remover livro da classe conexão
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!!!");//Janela que aparece quando a linha é excluida
             DefaultTableModel modelo = null; //
        try {
            modelo = Conexao.recuperarLivros();//Função para atualizar a tabela automaticamente após a exclusão
        } catch (SQLException ex) {
            Logger.getLogger(JfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTabela.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(JfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBTdelActionPerformed

    private void jBTmodificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTmodificaActionPerformed
       //Função para modificar a linha
        String numero=JOptionPane.showInputDialog(null, "Digite o cod_livro a ser modificado(certifique-se que os dados ja foram previamente colocados):");//Janela que aparece ao
        //selecionar o botão modificar, pedindo o codigo do livro a ser modificado
        int linha= Integer.parseInt(numero);//Converte o valor String do optionpane para Int do cod_livro
        
        String Titulo = jTFnome.getText();
        String Autor = jTFautor.getText();
        String Ano = jTFano.getText();
        String Area = jTFarea.getText();
        String Editora = jTFeditora.getText();
        String NumeroP= jTFnp.getText();
        String isbn= jTFisbn.getText();
        Livro livro = new Livro(isbn,Titulo, Autor , Ano , Area , Editora , NumeroP); //Após um novo valor ser adicionado por meio dos gets, é criado um novo objeto livro
        
        try {
            Conexao.modificarLivro(livro,linha);//Função modificar livro da classe conexao
            JOptionPane.showMessageDialog(null, "Modificado com sucesso!!!");
             DefaultTableModel modelo = null; //
        try {
            modelo = Conexao.recuperarLivros();//Função para atualizar automaticamente a tabela após a modificação
        } catch (SQLException ex) {
            Logger.getLogger(JfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTabela.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(JfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBTmodificaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JfInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTatt;
    private javax.swing.JButton jBTcadastrar;
    private javax.swing.JButton jBTdel;
    private javax.swing.JButton jBTmodifica;
    private javax.swing.JButton jBTtest;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFano;
    private javax.swing.JTextField jTFarea;
    private javax.swing.JTextField jTFautor;
    private javax.swing.JTextField jTFeditora;
    private javax.swing.JTextField jTFisbn;
    private javax.swing.JTextField jTFnome;
    private javax.swing.JTextField jTFnp;
    private javax.swing.JTable jTabela;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
