import java.util.Scanner;

public class Questao4 { 
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String[] nomes = new String[15];
        System.out.println("Digite 15 nomes de pessoas:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = ler.nextLine();
        }
        
        System.out.println("\nNomes na sequência contrária:");
        for (int i = 14; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
        
        ler.close();
    }
}
