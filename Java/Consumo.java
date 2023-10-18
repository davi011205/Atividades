//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1014

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
        int km;
        float litro, consumo;
        Scanner scan = new Scanner(System.in);
        
        km = scan.nextInt();
        litro = scan.nextFloat();
        
        consumo = km / litro;
        
        System.out.printf("%.3f km/l\n", consumo);
    }
}