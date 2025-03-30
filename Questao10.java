import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[] x = new int[5];
        int[] y = new int[5];
        
        System.out.println("Digite 5 elementos para o vetor x:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            x[i] = ler.nextInt();
        }
        System.out.println("Digite 5 elementos para o vetor y:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Elemento " + (i + 1) + ": ");
            y[i] = ler.nextInt();
        }
        System.out.println("Soma entre x e y:");
        for (int i = 0; i < 5; i++) {
            System.out.println(x[i] + y[i] + " ");
        }
        System.out.println("Produto entre x e y:");
        for (int i = 0; i < 5; i++) {
            System.out.println(x[i] * y[i] + " ");
        }  
        System.out.println("Diferença entre x e y:");
        for (int i = 0; i < 5; i++) {
            boolean encontrado = false;
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println(x[i] + " ");
            }
        }
        System.out.println("Interseção entre x e y:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (x[i] == y[j]) {
                    System.out.println(x[i] + " ");
                    break;  
                }
            }
        }
        System.out.println("União entre x e y:");
        for (int i = 0; i < 5; i++) {
            System.out.println(x[i] + " ");
        }
        for (int i = 0; i < 5; i++) {
            boolean existe = false;
            for (int j = 0; j < 5; j++) {
                if (y[i] == x[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                System.out.println(y[i] + " ");
            }
        }
        
        ler.close();
    }
}

    

