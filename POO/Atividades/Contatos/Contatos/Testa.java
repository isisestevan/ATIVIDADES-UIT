package Contatos;

import java.util.ArrayList;
import java.util.Scanner;

public class Testa {

    public static void main(String[] args) {
        ArrayList<Contatos> contatos = new ArrayList<>();
        int op = 0;
        System.out.println("Entre com a opção que deseja");
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("---MENU---\n");

            System.out.println("0 - Sair");

            System.out.println("1 - Adiconar contato");

            System.out.println("2 - Remover contato");

            System.out.println("3 - Listar todos os contatos");

            System.out.println("4 - Listar todos os contatos Inativos");

            System.out.println("5 - Ativar contato");

            System.out.println("6 - Bloquear contato");

            System.out.println("7 - Buscar por nome");

            System.out.println("8 - Listar por cidade");

            System.out.println("9 - Limpar Agenda");

            op = entrada.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Informe o nome do seu contato:");
                    String nome = entrada.next();
                    System.out.println("Informe o numero do telefone:");
                    int telefone = entrada.nextInt();
                    System.out.println("Informe o nome da Cidade:");
                    String cidade = entrada.next();
                    contatos.add(new Contatos(nome, telefone, cidade));
                    break;
                case 2:

                    System.out.println("Informe o id do contato que deseja excluir");
                    int id = entrada.nextInt();
                    contatos.remove(id);
                    break;
                case 3:
                    for (Contatos c : contatos) {
                        if (c.isAtivo() == true) {
                            System.out.println(c.toString());
                        }
                    }
                    break;
                case 4:
                    for (Contatos c : contatos) {
                        if (c.isAtivo() == false) {
                            System.out.println(c.toString());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Informe o id do contato que deseja ativar");
                    int idAtiva = entrada.nextInt();
                    for (Contatos c : contatos) {
                        if (c.getIdContato() == idAtiva) {
                            c.ativar();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Informe o id do contato que deseja bloquear");
                    int idBlock = entrada.nextInt();
                    for (Contatos c : contatos) {
                        if (c.getIdContato() == idBlock) {
                            c.bloquear();
                        }
                    }
                    break;
                case 7:
                    System.out.println("Informe o nome que deseja buscar");
                    String nomeBusca = entrada.next();
                    for (Contatos c : contatos) {
                        if (c.isAtivo() == true) {
                            if (c.getNome() == nomeBusca) {
                                System.out.println(c);
                            } else {
                                System.out.println("Nome não encontrado");
                            }
                        }
                    }
                    break;
                case 8:
                    System.out.println("Informe o nome da cidade que deseja buscar");
                    String cidadeBusca = entrada.next();
                    for (Contatos c : contatos) {
                        if (c.isAtivo() == true) {
                            if (c.getNome() == cidadeBusca) {
                                System.out.println(c);
                            } else {
                                System.out.println("Cidade não encontrada");
                            }
                        }
                    }
                    break;
                case 9:
                    contatos.clear();
                    break;
                default:
                    System.out.println("Opção Inválida - Tente novamente...");
                    break;
            }

        } while (op != 0);
    }

}
