public class Ebook extends Livro{
    private double tamanhoArquivo;

    public double getTamanhoArquivo(){
        return tamanhoArquivo;
    }
    public void setTamanhoArquivo(double tamanhoArquivo){
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public void descricao(){
        System.out.println("Livro Digital");
    }

}
