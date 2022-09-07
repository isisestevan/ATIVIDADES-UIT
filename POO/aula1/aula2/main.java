package aula2;
import java.util.Scanner;
public class main { 
    public static void main(String[] args) {
        Carro car = new Carro(); 
        Scanner entrada = new Scanner( System.in ); 
        car.liga();
        System.out.println("Digite a capacidade do tanque");
         double entradaLitros = entrada.nextLine();
        car.setCapacidade(entrada.nextLine());
        car.show_car();




    
    
    
    
    
    
    
    }
    
}
