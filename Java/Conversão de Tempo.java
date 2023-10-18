//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1019

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
        int totalSegundos, hora, minuto, segundo;
        
        totalSegundos = scan.nextInt();
        
        hora = totalSegundos/3600;
        totalSegundos -= hora * 3600;
        
        minuto = totalSegundos / 60;
        totalSegundos -= minuto * 60;
        
        segundo = totalSegundos;
        
        System.out.printf("%d:%d:%d\n", hora, minuto, segundo);
    }
 
}