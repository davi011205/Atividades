//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1018

import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        int num, notas100, notas50, notas20, notas10, notas5, notas2, notas1;
        int resto; 
        Scanner scan = new Scanner(System.in);
    
        num = scan.nextInt();
        
        notas100 = num / 100;
        resto = num % 100;
        
        notas50 = (resto % 100) / 50;
        resto %= 50;
        
        notas20 = (resto % 50) / 20;
        resto %= 20;
        
        notas10 = (resto % 20) / 10;
        resto %= 10;
        
        notas5 = (resto % 10) / 5;
        resto %= 5;
        
        notas2 = (resto % 5) / 2;
        resto %= 2;
        
        notas1 = (resto % 2) / 1;
    
        System.out.printf("%d\n", num);
        System.out.printf("%d nota(s) de R$ 100,00\n", notas100);
        System.out.printf("%d nota(s) de R$ 50,00\n", notas50);
        System.out.printf("%d nota(s) de R$ 20,00\n", notas20);
        System.out.printf("%d nota(s) de R$ 10,00\n", notas10);
        System.out.printf("%d nota(s) de R$ 5,00\n", notas5);
        System.out.printf("%d nota(s) de R$ 2,00\n", notas2);
        System.out.printf("%d nota(s) de R$ 1,00\n", notas1);
    }
 
}