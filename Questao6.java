import java.util.Scanner;

public class Questao6 {
 public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String[] nomes = new String[20];
        int[] idades = new int[20];
         int somaIdades = 0;
        
        System.out.println("Digite o nome e a idade de 20 pessoas:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = ler.nextLine(); 
            System.out.print("Digite a idade de " + nomes[i] + ": ");
            idades[i] = ler.nextInt(); 
            ler.nextLine(); 
            
            somaIdades += idades[i]; 
        }
        double mediaIdades = somaIdades / 20.0;
        System.out.println("\nIdade média do grupo: " + mediaIdades);
        
        System.out.println("\nPessoas com idade acima da média:");
        for (int i = 0; i < 20; i++) {
            if (idades[i] > mediaIdades) {
                System.out.println(nomes[i] + " (Idade: " + idades[i] + ")");
            }
        }
        
        ler.close();
    }
}

    

