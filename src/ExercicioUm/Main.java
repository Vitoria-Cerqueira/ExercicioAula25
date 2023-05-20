package ExercicioUm;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            Azul cor = new Azul(1);


            cor.tornarMaisEscuro();
            System.out.println("Tonalidade atual " + cor.getTonalidade());

            System.out.println("---------------------------");
            System.out.println("Voce deseja: \n 1- Deixar a cor mais escura \n 2- Calcular a tonalidade");
            int acao = teclado.nextInt();
            switch (acao){
                case 1:
                    cor.TornarTonalidadeMaisEscura(acao);
                    System.out.println("Tonalidade alterada " + cor.getTonalidade());
                    break;

                case 2:
                    cor.calcularTonalidade();

                    break;

                default:
                    System.out.println("Erro");
                    System.exit(0);

            }







        }

    }
