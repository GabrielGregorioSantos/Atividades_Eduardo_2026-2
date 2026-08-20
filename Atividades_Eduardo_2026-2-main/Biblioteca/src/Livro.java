public abstract class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getNumeroDePaginas(){
        return numeroDePaginas;
    }
    public void setNumeroDePaginas(int numeroDePaginas){
        this.numeroDePaginas = numeroDePaginas;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }


    public abstract void descricao();

}
