import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Herois> ligaDosHerois = new ArrayList<>();

        ligaDosHerois.add(new Goku());
        ligaDosHerois.add(new Sonic());
        ligaDosHerois.add(new Mario());

        int opcao = 0;

        do {
            System.out.println("\n---  LIGA DOS HERÓIS ---");
            System.out.println("1. Cadastrar Novo Herói");
            System.out.println("2. Listar Heróis e Atacar");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- CRIANDO UM NOVO HERÓI ---");
                    System.out.print("Nome do herói: ");
                    String nome = scanner.nextLine();

                    System.out.print("Pontos de Vida (HP): ");
                    int vida = scanner.nextInt();

                    System.out.print("Pontos de Energia: ");
                    int energia = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nome do ataque especial: ");
                    String ataque = scanner.nextLine();

                    Herois novoHeroi = new HeroiCustomizado(nome, vida, energia, ataque);
                    ligaDosHerois.add(novoHeroi);

                    System.out.println("Herói " + nome + " cadastrado com sucesso na Liga!");
                    break;

                case 2:
                    System.out.println("\n--- ️ EXECUTANDO COMPORTAMENTOS  ---");
                    if (ligaDosHerois.isEmpty()) {
                        System.out.println("Nenhum herói na liga.");
                    } else {
                        for (Herois heroi : ligaDosHerois) {
                            heroi.apresentar();
                            heroi.atacar();
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Encerrando a Liga dos Heróis... Até a próxima!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        scanner.close();
    }
}
