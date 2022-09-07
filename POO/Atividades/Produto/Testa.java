import java.util.Scanner;

public class Testa {
    public static void main(String[] args) {

        Loja lojas = new Loja("Mercadinho");

        int op = 0;
        System.out.println("Entre com a opção que deseja");
        System.out.println("Digite 7 para sair");
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("---MENU---\n");

            System.out.println("0 - Adicionar Produto");

            System.out.println("1 - Mostrar Quantidade de todos Produtos");

            System.out.println("2 - Mostrar Quantidade de um produto de sua escolha");

            System.out.println("3 - Mostrar Produtos abaixo do minimo");

            System.out.println("4 - Listar total de produtos");

            System.out.println("5 - Remover Produto");

            System.out.println("6 - Repor Produto");

            op = entrada.nextInt();

            switch (op) {
            case 0:
                System.out.print("Nome do Produto: ");

                String nome = entrada.next();

                System.out.print("Quantidade Atual: ");
                int qtdAtual = entrada.nextInt();

                System.out.print("Quantidade Mínima: ");
                int qtdMinima = entrada.nextInt();

                lojas.addProduto(new Produto(nome, qtdAtual, qtdMinima));
                break;

            case 1:
                lojas.mostraQuantidadeProdutos();
                break;
            case 2:
                System.out.println("Informe o nome do produto:");
                String name = entrada.next();
                lojas.mostraQuantidadeProdutos(name);
                break;
            case 3:
                lojas.mostraProdutosAbaixoDoMinimo();
                break;
            case 4:
                lojas.totalProdutos();
                break;

            case 5:
                System.out.println("Informe o nome do produto que deseja remover:");
                String nomeProduto = entrada.next();
                lojas.removeProduto(nomeProduto);
                break;
            case 6:
                System.out.println("Informe o nome do produto que deseja repor:");
                String nameProduto = entrada.next();
                for (Produto p : lojas.getProdutos()) {
                    if (nameProduto.equals(p.getNome())) {
                        System.out.println("Informe a quantidade que deseja repor:");
                        int qtd = entrada.nextInt();
                        p.repoe(qtd);
                        break;
                    }
                }
                break;
            default:
                System.out.println("Opção Inválida - Tente novamente...");
                break;
            }
        } while (op != 7);
    entrada.close();
    }
}
