public class Sonic extends Herois {
    public Sonic() {
        super("Sonic", 80, 100);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " usou o: SPIN DASH! ");
    }
}