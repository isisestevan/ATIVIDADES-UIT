import java.util.ArrayList;
import java.util.Scanner;

public class Contatinhos {
    public static void main(String[] args) {
        ArrayList<String> contatinhos = new ArrayList<>();
        int op = 0;
        System.out.println("Entre com a opção que deseja");
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("---MENU---\n");

            System.out.println("0 - Sair");

            System.out.println("1 - Insere contato");

            System.out.println("2 - Remove contato");

            System.out.println("3 - Mostra quantidade da lista");

            System.out.println("4 - Lista todos os contatos");

            op = entrada.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Informe o nome que deseja adicionar");
                    contatinhos.add(entrada.next());
                    break;

                case 2:
                    System.out.println("Informe o nome que deseja remover");
                    contatinhos.remove(entrada.next());
                    break;

                case 3:
                    System.out.println(contatinhos.size());

                    break;

                case 4:
                    for (int i = 0; i < contatinhos.size(); i++) {
                        System.out.println(i + "-" + contatinhos.get(i));
                       } 
                       break;

            }

        } while (op != 0);

    }
}

/*
 * Criar um arraylist de string chamado contatinhos. Criar um menu para: inserir
 * contatos remover contatos pelo nome mostrar a quantidade de contatos listar
 * todos contatos
 */
