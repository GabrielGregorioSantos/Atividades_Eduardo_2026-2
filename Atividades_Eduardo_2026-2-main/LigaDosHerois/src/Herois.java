import java.util.Scanner;

public abstract class Herois {
    private String nome;
    private int vida;
    private  int energia;

    public Herois(String nome, int vida, int energia ) {
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
    }
    public void apresentar(){
        System.out.println("Olá eu sou " + nome + ". [Vida" + vida + "| Energia" + energia + "]") ;
    }
    public abstract void atacar();

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getVida() {return vida;}
    public void setVida(int vida) {this.vida = vida;}

    public int getEnergia() {return energia;}
    public void setEnergia(int energia) {this.energia = energia;}
}
