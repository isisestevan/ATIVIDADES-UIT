package Trabalhador;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    private static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        List<Trabalhador> trabalhadores = new ArrayList<>();
        for(int i = 0; i < 3; i++){
        System.out.println("Cadastre 3 trabalhadores");
        System.out.println("Primeiro trabalhador:\n");
        System.out.println("Informe o nome");
        String nome = entrada.nextLine();
        System.out.println("Informe o numero da matricula");
        int matricula= entrada.nextInt();
        System.out.println("Informe o salario");
        Double salario= entrada.nextDouble();
        trabalhadores.add(new Trabalhador(nome, matricula, salario));
        
        }
  
        
    }
}
