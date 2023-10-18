//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1281

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        int numTestes, produtosDisponiveis, produtosComprar, quantidadeComprar;
        String nomeProdutoComprar;

        numTestes = scan.nextInt();
        for (int i = 0; i < numTestes; i++) {
            double precoTotal = 0;
            produtosDisponiveis = scan.nextInt();

            String nomeProduto[] = new String[produtosDisponiveis];
            double preco[] = new double[produtosDisponiveis];

            for (int j = 0; j < produtosDisponiveis; j++) {
                nomeProduto[j] = scan.next();
                preco[j] = scan.nextDouble();
            }

            produtosComprar = scan.nextInt();
            for (int j = 0; j < produtosComprar; j++) {
                nomeProdutoComprar = scan.next();
                quantidadeComprar = scan.nextInt();
                for (int k = 0; k < produtosDisponiveis; k++) {
                    if (nomeProdutoComprar.equals(nomeProduto[k])) {
                        precoTotal += preco[k] * quantidadeComprar;
                    }
                }
            }
            
            System.out.printf("R$ %.2f\n", precoTotal);
        }

    }
}
