package Time;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    private static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception{
        List<Time> times = new ArrayList<>();
        for(int i =0;i<2;i++){
        System.out.println("Entre com o nome do seu time");
        String nome= entrada.nextLine();
        System.out.println("Informe a serie que o time se encontra");
        char serie=entrada.next().charAt(0);
        times.add(new Time(nome, serie));
        }
        
    }
}
