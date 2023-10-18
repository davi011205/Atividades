//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1006

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
        float a, b, c, media;
        Scanner scan = new Scanner(System.in);
        
        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();
        
        media = (a * 2 + b * 3 + c * 5) / 10;
        
        System.out.printf("MEDIA = %.1f\n", media);
    }
 
}