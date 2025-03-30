import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[] vetor = new int[10];
        int count = 0; 
        
        while (count < 10) {
            System.out.print("Digite o " + (count + 1) + "º número: ");
            int numero = ler.nextInt();
            
            boolean existe = false;
            for (int i = 0; i < count; i++) {
                if (vetor[i] == numero) {
                    existe = true;
                    break;
                }
            }
            if (existe) {
                System.out.println("Número já digitado! Digite um número diferente.");
            } else {
                vetor[count] = numero;
                count++;
            }
        }
        System.out.println("\nVetor final:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        ler.close();
    }
}

    
