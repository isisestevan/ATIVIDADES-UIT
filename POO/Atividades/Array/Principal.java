import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(20);
        }
        System.out.println("Numeros não Ordenados");
        for(int i : a){
            System.out.print(i+" ");
        }

        for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int aux = a[i];
					a[i] = a[j];
					a[j] = aux;
				}
			}
		}
		System.out.println("\nNumeros ordenados:");
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
      
    
}
