public class LivroFisico extends Livro{
   private double peso;

    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    @Override
    public void descricao(){
        System.out.println("Livro físico");
    }


}
