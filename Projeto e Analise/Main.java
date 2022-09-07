import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual tamanho do seu vetor?\n");
        int tam = entrada.nextInt();
        Contagem cont1 = new Contagem(tam);
        // int vetor[];

        System.out.println("Como deseja preencher seu vetor?\n");
        System.out.println("Digite 1 para ordernar de forma Crescente\n");
        System.out.println("Digite 2 para ordernar de forma Decrescente\n");
        System.out.println("Digite 3 para ordernar de forma Aleatoria\n");
        int opcao = entrada.nextInt();

        if (opcao == 1) {
            cont1.crescente();
        } else if (opcao == 2) {
            cont1.descrescente();
        } else if (opcao == 3) {
            cont1.aleatorio(3);
        }

        cont1.showArray();
        System.out.println("Selecione o tipo de busca");
        System.out.println("Digite 1 para Sequencial");
        System.out.println("Digite 2 para Binaria");
        int opcao2 = entrada.nextInt();

        if (opcao2 == 1) {
            Long inicio = System.nanoTime();
            cont1.buscaSequencial();
            Long termino = System.nanoTime();
            Double diff = (termino.doubleValue() - inicio.doubleValue()) / 1000000;
            System.out.print("Tempo:" + diff);
        } else if (opcao2 == 2) {
            Long inicio = System.nanoTime();
            cont1.buscaBinaria(0, tam - 1);
            Long termino = System.nanoTime();
            Double diff = (termino.doubleValue() - inicio.doubleValue()) / 1000000;
            System.out.print("Tempo:" + diff);
            cont1.getCont();
        }
        entrada.close();
    }

}
