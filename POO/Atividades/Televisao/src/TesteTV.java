import java.util.Scanner;
public class TesteTV {
    private static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Informe a marca da televisao:\n");
        String marca = entrada.nextLine();
        System.out.println("Informe a quantidade de canais que sua TV possui\n");
        int qtdCanais = entrada.nextInt();
        System.out.println("Informe o volume máximo da sua TV\n");
        int volMax = entrada.nextInt();

        Televisao tv = new Televisao(marca, qtdCanais, volMax);
        
        int op=0;

        do{
            System.out.println("Digite a opção a seguir:\n");
            System.out.println("0 - Ligar televisão");
            System.out.println("1 - Desligar televisão");
            System.out.println("2 - Subir o Canal");
            System.out.println("3 - Descer o Canal");
            System.out.println("4 - Procura Canal");
            System.out.println("5 - Aumentar volume");
            System.out.println("6 - Diminuir volume");
            System.out.println("7 - Mostrar TV");
            op= entrada.nextInt();

            switch(op){
                case 0:
                 tv.ligaTV();
                 break;
                case 1:
                 tv.desligaTV();
                 break;
                case 2:
                 tv.aumentaCanal();
                 break;
                case 3:
                 tv.abaixaCanal();
                 break;
                case 4:
                 int canal;
                 System.out.println("Informe o canal que deseja acessar\n");
                 canal= entrada.nextInt();
                 tv.procuraCanal(canal);
                 break;
                case 5:
                 tv.aumentaVol();
                 break;
                case 6:
                 tv.abaixaVol();
                 break;
                case 7:
                 tv.showTV();
                 break;
                default:
                 System.out.println("Numero Invalido\n");
            }
        }while(op!=0);


    }
}
