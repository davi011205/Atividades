//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1008

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
        int numFuncionario, numHoras;
        float valHora, salario;
        Scanner scan = new Scanner(System.in);
        
        numFuncionario = scan.nextInt();
        numHoras = scan.nextInt();
        valHora = scan.nextFloat();
        
        salario = numHoras * valHora;
        
        System.out.printf("NUMBER = %d\n", numFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}