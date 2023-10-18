//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1467

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
        Scanner scan = new Scanner(System.in);
        int alice, beto, clara;
        
        while(scan.hasNext()) {
            alice = scan.nextInt();
            beto = scan.nextInt();
            clara = scan.nextInt();
            
            if(alice == beto && alice == clara) {
                System.out.printf("*\n");
            }
            else if(alice == beto && alice != clara) {
                System.out.printf("C\n");
            }
            else if(alice != beto && alice == clara) {
                System.out.printf("B\n");
            }
            else if(alice != beto && alice != clara) {
                System.out.printf("A\n");
            }
        }
    }

}