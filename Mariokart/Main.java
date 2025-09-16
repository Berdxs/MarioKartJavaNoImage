package Mariokart;
/*
    Main
    @authors bernardo_cardoso e caua_loiola
 */
import java.util.Scanner;
import java.util.Random;

public class Main {
    static int Personagem1, Personagem2;
    static Personagens p1, p2; // objetos escolhidos
    static int Pontuacao1, Pontuacao2;
    public static void main(String[] args) throws Personagemduplicado {
        menu();
        mostrar();
        matche();
        if (Pontuacao1 > Pontuacao2) {
            System.out.println("Personagem 1 venceu a partida com " + Pontuacao1 + " pontos.");
        }else if (Pontuacao2 > Pontuacao1) {
            System.out.println("Personagem 2 venceu a partida com " + Pontuacao2 + "pontos");
        }else
         System.out.println("empate ambos com " + Pontuacao2);
    }

    static void matche() {
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int j = i+1;
            System.out.println("round " + j );
            int dado = r.nextInt(6) + 1;
            int aleatorio = r.nextInt(3) + 1;
            System.out.println("dado: " + dado);
            if (aleatorio == 1) {
                System.out.println("Pista curva");
                int newhab1 = p1.getManobrabilidade() +dado;
                int newhab2 = p2.getManobrabilidade() +dado;
                System.out.println(" o Persongaem 1 " + "tem uma nova manobrabilidade " + newhab1);
                System.out.println(" o Persongaem 2 " + "tem uma nova manobrabilidade " + newhab2);
                if (newhab1 > newhab2) {
                    Pontuacao1 +=1;
                    System.out.println("Persongem 1 venceu a rodada");
                } else if (newhab2 > newhab1) {
                    Pontuacao2 +=1;
                    System.out.println("Personagem 2 venceu a rodada");
                }

            } else if (aleatorio == 2) {
                System.out.println("Pista reta");
                int newhab1 = p1.getVelocidade() +dado;
                int newhab2 = p2.getVelocidade() +dado;

                System.out.println(" o Persongaem 1 " + "tem uma nova velocidade  " + newhab1);
                System.out.println(" o Persongaem 2 " + "tem uma nova velocidade " + newhab2);
                if (newhab1 > newhab2) {
                    Pontuacao1 +=1;
                    System.out.println("Persongem 1 venceu a rodada");
                } else if (newhab2 > newhab1) {
                    Pontuacao2 +=1;
                    System.out.println("Personagem 2 venceu a rodada");
                }
            } else {
                System.out.println("Pista confronto");
                int newhab1 = p1.getPoder() +dado;
                int newhab2 = p2.getPoder() +dado;

                System.out.println(" o Persongaem 1 " + "tem um nova Poder " + newhab1);
                System.out.println(" o Persongaem 2 " + "tem um nova Poder " + newhab2);
                if (newhab1 > newhab2) {
                    Pontuacao1 +=1;
                    System.out.println("Persongem 1 venceu a rodada");
                } else if (newhab2 > newhab1) {
                    Pontuacao2 +=1;
                    System.out.println("Personagem 2 venceu a rodada");
                }

            }
        }

    }

    static Personagens Indicar(int Personagem) {
        switch (Personagem) {
            case 1:
                return new Personagens("Mario", 4, 3, 3);
            case 2:
                return new Personagens("Bowser", 5, 2, 5);
            case 3:
                return new Personagens("Peach", 3, 4, 2);
            case 4:
                return new Personagens("Yoshi", 2, 4, 3);
            case 5:
                return new Personagens("Luigi", 3, 4, 4);
            case 6:
                return new Personagens("Donkey Kong", 2, 2, 5);
            default:
                return null;
        }
    }

    public static void menu() throws Personagemduplicado {
        Scanner sc = new Scanner(System.in);

        System.out.println("[1] Mario\n[2] Bowser\n[3] Peach\n[4] Yoshi\n[5] Luigi\n[6] Donkey Kong\n[7] Sair");
        System.out.print("1º personagem: ");
        Personagem1 = sc.nextInt();
        System.out.print("2º personagem: ");
        Personagem2 = sc.nextInt();

        while (Personagem1 == Personagem2) {
            System.out.println("O segundo personagem não pode ser igual ao primeiro. Escolha novamente:");
            Personagem2 = sc.nextInt();
        }


        p1 = Indicar(Personagem1);
        p2 = Indicar(Personagem2);
    }

    static void mostrar() {
        System.out.println("1º Personagem escolhido: " + p1.getNome() + "\n velocidade = " + p1.getVelocidade() + "\nPoder = "+ p1.getPoder() + "\nManobrilidade = "+ p1.getManobrabilidade());
        System.out.println("2º Personagem escolhido: " + p2.getNome() + "\n velocidade = " + p2.getVelocidade() + "\nPoder = "+ p2.getPoder() + "\nManobrilidade = "+ p2.getManobrabilidade());
    }
}
