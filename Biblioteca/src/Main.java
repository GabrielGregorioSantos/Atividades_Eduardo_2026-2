public class Main {

    public static void main(String[] args) {

        // Cria os livros
        LivroFisico livro1 = new LivroFisico();
        Ebook livro2 = new Ebook();

        // Preenchendo os dados do livro físico
        livro1.setTitulo("Dom Casmurro");
        livro1.setAutor("Machado de Assis");
        livro1.setNumeroDePaginas(256);
        livro1.setPeso(0.5);

        // Preenchendo os dados do ebook
        livro2.setTitulo("O Hobbit");
        livro2.setAutor("J.R.R. Tolkien");
        livro2.setNumeroDePaginas(310);
        livro2.setTamanhoArquivo(5.2);

        // Cria a biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adiciona os livros
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // Lista os livros
        System.out.println("Livros da biblioteca:");
        biblioteca.listarLivros();

        // Busca um livro
        System.out.println("\nBuscando livro:");

        Livro encontrado = biblioteca.buscarLivroPorTitulo("Dom Casmurro");

        if (encontrado != null) {
            System.out.println("Livro encontrado: " + encontrado.getTitulo());
            System.out.println("Autor: " + encontrado.getAutor());
            System.out.println("Páginas: " + encontrado.getNumeroDePaginas());
            encontrado.descricao();
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}