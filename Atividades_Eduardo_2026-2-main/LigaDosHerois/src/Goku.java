public class Goku extends Herois {
    public Goku() {
        super("Goku", 100, 150);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " soltou um: KAMEHAMEHA! ");
    }
}