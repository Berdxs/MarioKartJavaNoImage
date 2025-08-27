package Mariokart;
/*
    Main, simulador Mario kart
    @authors bernardo_cardoso e caua_loiola
 */

import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    static int Personagem, Personagem1, Personagem2;

    public static void main(String[] args) throws Personagemduplicado {


        menu();
        mostrar();

    }


    static void Indicar(int Personagem) {

        try (Scanner sc = new Scanner(System.in)) {
            switch (Personagem) {
                case 1:
                    Personagens Mario = new Personagens("Mario", 4, 3, 3);

                    System.out.println("nome: " + Mario.getNome() + "\n Velocidade " + Mario.getVelocidade() + "\n Manobrabilidade " + Mario.getManobrabilidade() + "\n Poder " + Mario.getPoder());
                    break;
                case 2:
                    Personagens Bowser = new Personagens("Bowser", 5, 2, 5);

                    System.out.println("nome: " + Bowser.getNome() + "\n Velocidade " + Bowser.getVelocidade() + "\n Manobrabilidade " + Bowser.getManobrabilidade() + "\n Poder " + Bowser.getPoder());
                    break;
                case 3:
                    Personagens Peach = new Personagens("Peach", 3, 4, 2);

                    System.out.println("nome: " + Peach.getNome() + "\n Velocidade " + Peach.getVelocidade() + "\n Manobrabilidade " + Peach.getManobrabilidade() + "\n Poder " + Peach.getPoder());
                    break;
                case 4:
                    Personagens Yoshi = new Personagens("Yoshi", 2, 4, 3);

                    System.out.println("nome: " + Yoshi.getNome() + "\n Velocidade " + Yoshi.getVelocidade() + "\n Manobrabilidade " + Yoshi.getManobrabilidade() + "\n Poder " + Yoshi.getPoder());
                    break;
                case 5:
                    Personagens Luigi = new Personagens("Luigi", 3, 4, 4);

                    System.out.println("nome: " + Luigi.getNome() + "\n Velocidade " + Luigi.getVelocidade() + "\n Manobrabilidade " + Luigi.getManobrabilidade() + "\n Poder " + Luigi.getPoder());
                    break;
                case 6:
                    Personagens DonkeyKong = new Personagens("Donkey Kong", 2, 2, 5);

                    System.out.println("nome: " + DonkeyKong.getNome() + "\n Velocidade " + DonkeyKong.getVelocidade() + "\n Manobrabilidade " + DonkeyKong.getManobrabilidade() + "\n Poder " + DonkeyKong.getPoder());
                    break;
                case 7:
                    break;

            }

        }
    }

    public static void menu() throws Personagemduplicado {
        try (Scanner sc = new Scanner(System.in))  {


                System.out.println("[1] Mario\n [2]- Bowser\n [3]- Peach\n [4]- Yoshi\n [5] - Luigi\n [6]- Donkey Kong\n[7] Sair");
                System.out.println("1ºpersonagem: ");
                Personagem1 = sc.nextInt();
                if(Personagem1 >7||Personagem1<1) {
                    do {

                        System.out.println(" Diga novamente o 1ºPersonagem deve ser um numero inteiro entre 1 e 7");
                        Personagem1= sc.nextInt();

                    } while (Personagem1 >7||Personagem1<1 );
                }
                System.out.println("2º personagem : ");
                Personagem2 = sc.nextInt();
            if(Personagem2 >7||Personagem2<1) {
                do {

                    System.out.println(" Diga novamente o 2ºPersonagem deve ser um numero inteiro entre 1 e 7");
                    Personagem2 = sc.nextInt();

                } while (Personagem2 >7||Personagem2<1 );
            }
                if (Personagem1 == Personagem2) {

                        do {

                            System.out.println(" Diga novamente o 2ºPersonagem, não pode ser igual ao primeiro");
                            Personagem2 = sc.nextInt();
                            if(Personagem2 >7||Personagem2<1) {
                                do {

                                    System.out.println(" Diga novamente o 2ºPersonagem deve ser um numero inteiro entre 1 e 7");
                                    Personagem2 = sc.nextInt();

                                } while (Personagem2 >7||Personagem2<1 );
                            }

                        } while (Personagem1 == Personagem2);




        }
        }

    }

    static void mostrar() {

        System.out.println("1º Personagem  escolhido:");
        Indicar(Personagem1);
        System.out.println("\n2º Personagem 2 escolhido:");
        Indicar(Personagem2);
    }

}


