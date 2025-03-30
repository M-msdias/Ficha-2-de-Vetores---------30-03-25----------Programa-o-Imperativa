import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorResultado = new int[10];
        
        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor1[i] = ler.nextInt();
        }
        System.out.println("\nDigite 10 números para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor2[i] = ler.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                vetorResultado[i] = vetor1[i];  
            } else {
                vetorResultado[i] = vetor2[i];  
            }
        }
        System.out.println("\nVetor resultado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorResultado[i] + " ");
        }
        ler.close();
    }
}

    

