//Objeto livro, que será utilizado no programa, com suas devidas variáveis
public class Livro {
    private int cod_livro;
    private String ISBN;
    private String Titulo;
    private String Autor;
    private String Ano; 
    private String Area; 
    private String Editora;
    private String NumeroP;
    
    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public String getAno() {
        return Ano;
    }

    public String getArea() {
        return Area;
    }

    public String getEditora() {
        return Editora;
    }

    public Livro(int cod_livro, String ISBN, String Titulo, String Autor, String Ano, String Area, String Editora, String NumeroP) {
        this.cod_livro = cod_livro;
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Ano = Ano;
        this.Area = Area;
        this.Editora = Editora;
        this.NumeroP = NumeroP;
    }

    public Livro(String ISBN, String Titulo, String Autor, String Ano, String Area, String Editora, String NumeroP) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Ano = Ano;
        this.Area = Area;
        this.Editora = Editora;
        this.NumeroP = NumeroP;
    }

    

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setAno(String Ano) {
        this.Ano = Ano;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public void setEditora(String Editora) {
        this.Editora = Editora;
    }

    public void setNumeroP(String NumeroP) {
        this.NumeroP = NumeroP;
    }

    public void setCod_livro(int cod_livro) {
        this.cod_livro = cod_livro;
    }

    public int getCod_livro() {
        return cod_livro;
    }

    public String getNumeroP() {
        return NumeroP;
    }
    
    
}
