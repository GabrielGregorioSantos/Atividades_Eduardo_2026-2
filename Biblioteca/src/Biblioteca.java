import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        {
            for (Livro livro : livros) {

                if (livro.getTitulo().equals(titulo)) {
                    return livro;
                }
            }
        }
        return null;
    }
}