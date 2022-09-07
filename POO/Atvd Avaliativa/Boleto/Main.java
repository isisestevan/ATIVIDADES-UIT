package Boleto;
import java.util.Scanner;
public class Main {
    private static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        System.out.println("Entre com os dados do Boleto");
        System.out.println("Informe o vencimento do boleto");
        Double vencimento= entrada.nextDouble();
        System.out.println("Informe o valor do boleto");
        Double valor= entrada.nextDouble();
        System.out.println("Informe o valor do desconto");
        Double desconto= entrada.nextDouble();
        System.out.println("Informe o nome");
        String nome= entrada.nextLine();
        Boleto boleto1= new Boleto(vencimento, valor, desconto, nome);
        System.out.println("O valor Liquido do seu boleto é:\n"+boleto1.getValLiquido());
        System.out.println("Deseja pagar o boleto?");
        System.out.println("Digite 1 para sim e 0 para não");
        int resp = entrada.nextInt();
        if(resp == 1){
            boleto1.pagar();
            System.out.println("Boleto pago");
        }else
        if(resp == 1){
            System.out.println("O boleto não será pago");
        }

        

    }
}
