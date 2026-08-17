public class Main {

    public static void main(String[] args){
        LivroFisico livro1 = new LivroFisico();
        Ebook livro2 = new Ebook();
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro((livro1));
        biblioteca.adicionarLivro(livro2);
        biblioteca.listarLivros();
    }

}
