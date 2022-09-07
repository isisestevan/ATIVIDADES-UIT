
import java.util.Scanner;
public class TestaCelular{
    public static void main(String[] args){
      
      
      Scanner entrada = new Scanner(System.in);  
      System.out.println("Digite o modelo do seu celular\n");
      String modelo = entrada.nextLine();
      System.out.println("Informe o nivel da bateria do seu celular");
      double nivelBateria = entrada.nextDouble();
      Celular celular1 = new Celular(modelo,nivelBateria);
      

      System.out.println(Celular.qtdidCel);
      int opcao=0;
     
      
      do{
          System.out.println("====== MENU ======\n");
          System.out.println("Escolha sua próxima ação\n");
          System.out.println("Digite 0 para AUMENTAR SOM \n");
          System.out.println("Digite 1 para DIMINUIR SOM\n");
          System.out.println("Digite 2 para JOGAR\n");
          opcao = entrada.nextInt();
          
          switch(opcao){
              case 0: 
              celular1.aumentaSom();
              break;
              case 1:
              celular1.abaixaSom();
              break;
              case 2:
              System.out.println("Informe o jogo que quer jogar\n");
              System.out.println("Digite 1 para PAPEL\n2 para PEDRA \ne 3 para TESOURA");
              int numero = entrada.nextInt();
              celular1.jogar(numero);
              break;
              default:
              System.out.println("Numero Invalido");

          }
      }while(opcao!=0);

      
    }
}