
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[20];
        
        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = ler.nextInt();
        }
        System.out.println("Números ímpares:");
        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }
      System.out.println("Números nas posições pares (índices pares):");
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
        
        ler.close();
    }
}

    

