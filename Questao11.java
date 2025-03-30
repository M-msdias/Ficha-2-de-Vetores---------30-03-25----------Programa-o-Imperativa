import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] V = new double[10];
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            V[i] = ler.nextDouble();
            soma += V[i];
        }
        double media = soma / 10;
        double somaQuadrados = 0;
        for (double num : V) {
            somaQuadrados += Math.pow(num - media, 2);
        }
        double desvioPadrao = Math.sqrt(somaQuadrados / 10);
        System.out.printf("Desvio padrão: %.2f\n", desvioPadrao);

        ler.close();
    }
}
