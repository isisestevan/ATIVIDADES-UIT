import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);  
     
     Fornecedor fornecedor = new Fornecedor();
     fornecedor.setNome("Sadia");
     fornecedor.set("Rua Alemanha,777");
     fornecedor.setTelefone("3236-5050");
     System.out.println("Nome :" +fornecedor.getNome());
     System.out.println("Enederco :" +fornecedor.getEndereco());
     System.out.println("Telefone :" +fornecedor.getTelefone());
     
     System.out.printf("Insira o valor do seu Limite de crédito");
     double lCredito = entrada.nextDouble();
     fornecedor.setLimiteCredito(lCredito);
     double vDivida = entrada.nextDouble();
     fornecedor.setValorDivida(vDivida);
     
     fornecedor.obterSaldoRestante();
    } 
}

