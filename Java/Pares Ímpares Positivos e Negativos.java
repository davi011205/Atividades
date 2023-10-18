//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1066

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
        int num, contPositivo = 0, contPar = 0, contImpar = 0, contNegativo = 0; 
        //criando o scan;
        Scanner scan = new Scanner(System.in);
        
        //repeticao para ler os 5 numeros;
        for( int i = 0; i < 5; i++ ) {
            num = scan.nextInt();
            if( num > 0 ) {//teste condicional;
                contPositivo++;
            }
            if( num < 0 ) {//idem
                contNegativo++;
            }
            if( num % 2 == 0 ) {//idem
                contPar++;
            }
            else contImpar++;
        }
        //saida
        System.out.printf("%d valor(es) par(es)\n", contPar);
        System.out.printf("%d valor(es) impar(es)\n", contImpar);
        System.out.printf("%d valor(es) positivo(s)\n", contPositivo);
        System.out.printf("%d valor(es) negativo(s)\n", contNegativo);
    }
 
}