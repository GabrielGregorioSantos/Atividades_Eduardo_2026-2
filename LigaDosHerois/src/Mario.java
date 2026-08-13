public class Mario extends Herois {
    public Mario() {
        super("Mário", 90, 80);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " pulou no inimigo e jogou uma: BOLA DE FOGO! ");
    }
}
