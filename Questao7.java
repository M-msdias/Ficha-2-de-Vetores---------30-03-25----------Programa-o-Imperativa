
import java.util.Scanner;

public class Questao7 {   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[] vetor1 = new int[20];
        int[] vetor2 = new int[20];
        int[] vetorIntercalado = new int[40];
        
        System.out.println("Digite 20 números para o primeiro vetor:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor1[i] = ler.nextInt();
        }
        System.out.println("\nDigite 20 números para o segundo vetor:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor2[i] = ler.nextInt();
        }
        for (int i = 0; i < 20; i++) {
            vetorIntercalado[2 * i] = vetor1[i];        
            vetorIntercalado[2 * i + 1] = vetor2[i];   
        }
        System.out.println("\nVetor intercalado:");
        for (int i = 0; i < 40; i++) {
            System.out.print(vetorIntercalado[i] + " ");
        }
        ler.close();
    }
}

    
