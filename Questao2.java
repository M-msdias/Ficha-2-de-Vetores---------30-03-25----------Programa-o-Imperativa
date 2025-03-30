import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner ler  = new Scanner(System.in);
        
        int[] valores = new int[6];
        
        System.out.println("Digite 6 valores inteiros:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = ler.nextInt();
        }
        
        System.out.println("\nValores lidos:");
        for (int i = 0; i < 6; i++) {
            System.out.println(valores[i]);
        }
        
        ler.close();
    }
}
