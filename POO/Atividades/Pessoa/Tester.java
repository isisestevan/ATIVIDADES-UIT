import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

import java.util.Scanner;


public class Tester {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String arquivo = "dados.txt";

        int op = 0;
        do {
            System.out.println("--- MENU ---");
            System.out.println("0 - Sair");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Buscar por id");
            System.out.println("3 - Mostrar pessoas acima do peso");
            op = entrada.nextInt();
            switch (op) {
            case 0:
                System.out.println("Saindo...");
                break;
            case 1:
                System.out.println("Insira o id: ");
                int id = entrada.nextInt();
                System.out.println("Insira o nome: ");
                String nome = entrada.next();
                System.out.println("Insira a altura: ");
                double altura = entrada.nextDouble();
                System.out.println("Insira o peso: ");
                double peso = entrada.nextDouble();
                Pessoa pessoa = new Pessoa(id, nome, altura, peso);
                double imc = pessoa.calculaImc(altura, peso);

                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));
                    bw.write(id + ";" + nome + ";" + altura + ";" + peso + ";" + imc + "\n");
                    bw.close();
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(Tester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

                }
                break;
            case 2:
                System.out.println("Qual id quer buscar? ");
                int idbusca = entrada.nextInt();
                try {
                    BufferedReader br = new BufferedReader(new FileReader(arquivo));
                    while (br.ready()) {
                        String linha = br.readLine();
                        String elemento[] = linha.split(";");
                        if (Integer.parseInt(elemento[0]) == idbusca) {
                            System.out.println(elemento[1]);
                        }
                    }
                } catch (FileNotFoundException ex) {
                    java.util.logging.Logger.getLogger(Pessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    java.util.logging.Logger.getLogger(Pessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }

                break;

            
             case 3:
             try {
                BufferedReader br = new BufferedReader(new FileReader(arquivo));
                while (br.ready()) {
                    String linha = br.readLine();
                    String elemento[] = linha.split(";");
                    if (Double.parseDouble(elemento[4]) > 32) {
                        System.out.println(elemento[1]);
                    }
                }
            } catch (FileNotFoundException ex) {
                java.util.logging.Logger.getLogger(Pessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(Pessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

              break;
             

            default:
                System.out.println("Invalido.");
                break;

            }
        } while (op != 0);

    }

}
