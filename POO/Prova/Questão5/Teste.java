package Questão5;

import java.util.Scanner;

public class Teste {
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Entre com a capacidade do seu elevador");
        int capacidade = entrada.nextInt();
        System.out.println("Entre com a quantidade de andares do prédio");
        int totalAndares = entrada.nextInt();
        Elevador elevador1 = new Elevador(capacidade, totalAndares);
        int op = 0;
           
        do {
            System.out.println(elevador1.toString());
            System.out.println("Digite a opção a seguir:\n");
            System.out.println("0 - Entrar");
            System.out.println("1 - Sair");
            System.out.println("2 - Subir");
            System.out.println("3 - Descer");
            System.out.println("4 - Sair do Menu");
            op = entrada.nextInt();
            switch (op) {
                case 0:
                    elevador1.entra();
                    break;
                case 1:
                    elevador1.sai();
                    break;
                case 2:
                    elevador1.sobe();
                    break;
                case 3:
                    elevador1.desce();
                    break;
                default:
                    System.out.println("Opção errada");
                    break;
            }

        } while (op !=4);

    }
}
