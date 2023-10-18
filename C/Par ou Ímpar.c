// enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1074

#include <stdio.h>

int par_impar(n) {
    if (n % 2 == 0) { // par
        return 1;
    }
    if (n % 2 != 0) { // impar
    }

    return -1;
}

int positivo_negativo(n) {
    if (n > 0) { // positivo
        return 1;
    }
    else if (n < 0) { // negativo
        return -1;
    }
    else if (n == 0) { // zero
    }

    return 0;
}

int main() {
    int n, i, n_testes;

    scanf("%d", &n_testes);

    for (i = 1; i <= n_testes; i++) { // le o número de testes
        scanf("%d", &n); // le os numeros dos testes

        if (par_impar(n) == 1 && positivo_negativo(n) == 1) { // verifica se a funcao par_impar retornou 1 e se a funcao positivo_negativo retornou 1
            printf("EVEN POSITIVE\n");
        }
        if (par_impar(n) == 1 && positivo_negativo(n) == -1) { // verifica se a funcao par_impar retornou 1 e se a funcao positivo_negativo retornou -1
            printf("EVEN NEGATIVE\n");
        }
        if (par_impar(n) == -1 && positivo_negativo(n) == 1) { // verifica se a funcao par_impar retornou -1 e se a funcao positivo_negativo retornou 1
            printf("ODD POSITIVE\n");
        }
        if (par_impar(n) == -1 && positivo_negativo(n) == -1) { // verifica se a funcao par_impar retornou -1 e se a funcao positivo_negativo retornou -1
            printf("ODD NEGATIVE\n");
        }
        if (positivo_negativo(n) == 0) { // verifica se a funcao positivo_negativo retornou 0
            printf("NULL\n");
        }
    }
    
    return 0;
}