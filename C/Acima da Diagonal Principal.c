// enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1183

#include <stdio.h>

int main(void) {
    int i, k;
    float M[12][12], soma = 0;
    char conta;

    scanf("%c", &conta);

    for (i = 0; i < 12; i++) {
        for (k = 0; k < 12; k++) {
            scanf("%f", &M[i][k]);
        }
    }
    for (i = 0; i < 12; i++) {
        for (k = 0; k < 12; k++) {
            if (k > i) {
                soma += M[i][k];
            }
        }
    }
    if (conta == 'S') {
        printf("%.1f\n", soma);
    }
    else if (conta == 'M') {
        printf("%.1f\n", soma / 66);
    }

    return 0;
}