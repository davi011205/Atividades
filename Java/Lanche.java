//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1038

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
        int codigo, quantidade;
        double vetorPreco[] = new double[5], resultado = 0;
        
        vetorPreco[0] = 4;
        vetorPreco[1] = 4.5;
        vetorPreco[2] = 5;
        vetorPreco[3] = 2;
        vetorPreco[4] = 1.5;
        
        codigo = scan.nextInt();
        quantidade = scan.nextInt();
        
        switch (codigo){
            case 1:
                resultado = vetorPreco[0] * quantidade;
            break;
            case 2:
                resultado = vetorPreco[1] * quantidade;
            break;
            case 3:
                resultado = vetorPreco[2] * quantidade;
            break;
            case 4:
                resultado = vetorPreco[3] * quantidade;
            break;
            case 5:
                resultado = vetorPreco[4] * quantidade;
            break;
        }
        System.out.printf("Total: R$ %.2f\n", resultado);
    }
 
}