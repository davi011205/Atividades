//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1071

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
        int x, y, cont = 0;
    Scanner scan = new Scanner(System.in);

    x = scan.nextInt();
    y = scan.nextInt();

    if(x < y){
      for(int i = x+1; i < y; i++){
        if(i % 2 != 0){
          cont += i;
        }
      }
    }

    else if(x > y){
      for(int i = y+1; i < x; i++){
        if(i % 2 != 0){
          cont += i;
        }
      }
    }
    
    
    System.out.printf("%d\n", cont);
    }
}