//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1035

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
        int a, b, c, d;
        
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        
        if( b > c && d > a && c + d > a + b && a % 2 == 0){
            System.out.printf("Valores aceitos\n");
        }
        else  System.out.printf("Valores nao aceitos\n");
    }
}