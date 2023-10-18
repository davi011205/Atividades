//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1072

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
        int numTestes, numero, contIn = 0, contOut = 0 ;
        
        numTestes = scan.nextInt();
    
        for(int i = 0; i < numTestes; i++){
            numero =  scan.nextInt();
            if(numero >= 10 && numero <= 20){
                contIn++;
            }
            else contOut++;
        }
        
          System.out.printf("%d in\n", contIn);
          System.out.printf("%d out\n", contOut);
    }
}