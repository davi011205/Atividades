//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1060

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
        //declaracao de variaveis;
        float num;
        int cont = 0;
        //criando o scan;
        Scanner scan = new Scanner(System.in);
        
        //repeticao para ler os 6 numeros;
        for(int i = 0; i < 6; i++){
        num = scan.nextFloat();
        if(num > 0) //teste condicional;
        cont++;
        }
        //saida
        System.out.printf("%d valores positivos\n", cont);
    }
 
}