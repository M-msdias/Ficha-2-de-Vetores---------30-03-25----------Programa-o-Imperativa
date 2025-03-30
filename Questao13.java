import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de linhas do Triângulo de Pascal: ");
        int n = ler.nextInt();
        int[][] triangulo = new int[n][n];

        for (int i = 0; i < n; i++) {
            triangulo[i][0] = 1; 
            triangulo[i][i] = 1; 
            
            for (int j = 1; j < i; j++) {
                triangulo[i][j] = triangulo[i - 1][j - 1] + triangulo[i - 1][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangulo[i][j] + " ");
            }
            System.out.println();
        }
        ler.close();
    }
}
