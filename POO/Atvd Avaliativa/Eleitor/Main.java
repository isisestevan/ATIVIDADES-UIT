package Eleitor;
import java.util.Scanner;
public class Main {
    private static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        System.out.println("Informe seus dados e descubra se você já pode votar\n");
        System.out.println("Insira seu nome:\n");
        String nome= entrada.nextLine();
        System.out.println("Insira sua idade");
        int idade= entrada.nextInt();
        System.out.println("Insira seu sexo");
        char sexo= entrada.next().charAt(0);
        System.out.println("Insira seu numero do titulo");   
        double titulo=entrada.nextDouble();
        Eleitor eleitor1 = new Eleitor(nome, idade, sexo, titulo);
        eleitor1.canIvote(idade);
        eleitor1.showEleitor();
    }
}
