//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/2670

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
        int primeiro, segundo, terceiro, menorDistancia, temp;
        
        primeiro = scan.nextInt();
        segundo = scan.nextInt();
        terceiro = scan.nextInt();
        
        //maquina no primeiro andar
        menorDistancia = (segundo * 2) + (terceiro * 4);
        
        //maquina no segundo andar
        temp = (primeiro * 2) + (terceiro * 2);
        if(temp < menorDistancia) {
            menorDistancia = temp;
        }
        
        //maquina no terceiro andar
        temp = (primeiro * 4) + (segundo * 2);
        if(temp < menorDistancia) {
            menorDistancia = temp;
        }
        System.out.printf("%d\n", menorDistancia);
    }
}