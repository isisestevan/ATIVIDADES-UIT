import java.util.Scanner;

public class TestaComputador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Computador[] computadores = new Computador[3];

        for (int i=0; i<3; i++) {
            System.out.println("Informe os dados:");
            System.out.println("\nTamanho do HD em Gb: ");
            double tamhd = entrada.nextDouble();
      
            System.out.println("\nTamanho da RAM em Mb: ");
            double tamram = entrada.nextDouble();
      
            System.out.println("\nNumero de processadores: ");
            int numprocessadores = entrada.nextInt(); 
      
            System.out.println("\nNome do fabricante: ");
            String fabricante = entrada.next();
      
            computadores[i] = new Computador(tamhd, tamram,numprocessadores, fabricante);
          }
         
        for(Computador pc : computadores){
            if(pc.getTamram()>=512){
               System.out.println(pc.toString());
            }
        }
    }
}