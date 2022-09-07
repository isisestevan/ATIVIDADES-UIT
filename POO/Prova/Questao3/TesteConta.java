package Questao3;
import java.util.Scanner;
public class TesteConta {
    private static Scanner entrada = new Scanner(System.in);
    public static void main(String [] args) {
        System.out.println("Informe o nome do titular");
        String titular=entrada.nextLine();
        System.out.println("Informe o numero da conta");
        int numero=entrada.nextInt();
        System.out.println("Informe o saldo");
        double saldo=entrada.nextDouble();
        Conta conta1 = new Conta(titular, numero, saldo);
        conta1.showConta();
    }
       
}
