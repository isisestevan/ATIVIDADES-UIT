import java.util.Random;

public class Contagem {
    int array[];
    int cont = 1;

    public Contagem(int tam) {
        array = new int[tam];
    }

    public void crescente() {

        for (int i = 0; i < array.length; i++) {
            array[i] = i;

        }

    }

    public void descrescente() {

        for (int i = 0; i < array.length; i++) {
            array[i] = (array.length - 1) - i;
        }

    }

    public void aleatorio(int seed) {
        Random random = new Random(seed);
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(199);

        }
    }

    public void showArray() {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\n");

        }

    }

    public void buscaSequencial() {
        int cont = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 78) {
                System.out.println("Achado!");
                break;
            }
            cont++;
        }

        System.out.println("Contador: " + cont);
    }

    public int buscaBinaria(int esq, int dir) {

        if (esq <= dir) {
            int meio = esq + (dir - esq) / 2;
            cont++;
            if (array[meio] == 78) {

                return meio;

            } else if (array[meio] < 78) {
                cont++;
                return buscaBinaria(meio + 1, dir);
            } else {
                cont += 2;
                return buscaBinaria(esq, meio - 1);
            }
        }

        return -1;
    }

    public void getCont() {
        System.out.println("Contagem: " + cont);
    }
}
