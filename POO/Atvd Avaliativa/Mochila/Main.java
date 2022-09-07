package Mochila;
import java.util.Scanner;
public class Main {
    private static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        System.out.println("Informe o nome da mochila");
        String nome= entrada.nextLine();
        System.out.println("Insira a quantidade de itens suportados");
        int qtdMax=entrada.nextInt();
        System.out.println("Insira o peso maximo suportado");
        double pesoMax= entrada.nextDouble();
        Mochila mochila1= new Mochila(nome, qtdMax, pesoMax);
        int op=0;

        do{
            System.out.println("Digite a opção a seguir:\n");
            System.out.println("0 - Inserir item");
            System.out.println("1 - Sair");
            op= entrada.nextInt();
            switch(op){
                case 0:
                 System.out.println("Digite a quantidade de itens que deseja adicionar");
                 int i= entrada.nextInt();
                for(i=0;i<0;i++){
                 System.out.println("Insira o peso do item");
                 Double peso= entrada.nextDouble();
                 mochila1.insereItem(peso);;
                 break;
                }
                 case 1:
                 System.out.println("Saindo...");
                 break;
               default:
                 System.out.println("Opção errada");
                 break;
            }
        }while(op!=0);
        mochila1.showMochila();
    }
}
    
