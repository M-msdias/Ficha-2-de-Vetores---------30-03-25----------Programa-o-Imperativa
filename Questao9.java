public class Questao9 {
        public static void main(String[] args) {
    
            int[] numeros = new int[100];
            int count = 0;  
            int numero = 1;
    
            while (count < 100) {
                if (numero % 7 != 0 && numero % 10 != 7) {
                    numeros[count] = numero; 
                    count++;  
                }
                numero++;  
            }
            System.out.println("Os 100 primeiros números que não são múltiplos de 7 e não terminam com 7:");
            for (int i = 0; i < 100; i++) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
    
    

