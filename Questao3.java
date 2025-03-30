import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[] valores = new int[10];
        System.out.println("Digite 10 valores inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = ler.nextInt();
        }
        
        System.out.println("\nValores pares digitados:");
        for (int i = 0; i < 10; i++) {
            if (valores[i] % 2 == 0) {
                System.out.println(valores[i]);
            }
        }
        
        ler.close();
    }
}
