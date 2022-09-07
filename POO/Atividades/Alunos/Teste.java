import java.util.Scanner;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList<Sala> salas = new ArrayList<>();
        int op = 0;
        System.out.println("Menu Sala");
        System.out.println("Entre com a opção que deseja");
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("---MENU---\n");

            System.out.println("0 - Sair");

            System.out.println("1 - Adiconar sala");

            System.out.println("2 - Remover sala");

            System.out.println("3 - Listar salas");

            op = entrada.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Informe o nome da sala:");
                    String nomeSala = entrada.next();
                    salas.add(new Sala(nomeSala));

                    break;
                case 2:

                    System.out.println("Informe o nome da sala que deseja excluir");
                    String nomeSalaExcluir = entrada.next();
                    salas.remove(nomeSalaExcluir);
                    break;
                case 3:
                for (Sala s : salas) {
                    System.out.println((s.showSala()));
                }
                    break;
                
                default:
                    System.out.println("Opção Inválida - Tente novamente...");
                    break;
            }

        } while (op != 0);

       
    }
}
