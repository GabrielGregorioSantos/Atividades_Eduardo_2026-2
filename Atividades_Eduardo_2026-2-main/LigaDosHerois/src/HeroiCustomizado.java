public class HeroiCustomizado extends Herois {
    private String habilidadeAtaque;


    public HeroiCustomizado(String nome, int vida, int energia, String habilidadeAtaque) {
        super(nome, vida, energia);
        this.habilidadeAtaque = habilidadeAtaque;
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " usou a habilidade: " + habilidadeAtaque + "! 💥");
    }
}