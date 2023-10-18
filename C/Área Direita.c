//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1190

#include <stdio.h>

int main(){
    int i, j;
    float M[12][12], cont = 0, soma = 0;
    char operacao;

    scanf("%c", &operacao);

    for (i = 0; i < 12; i++) {   //le as linhas
        for (j = 0; j < 12; j++) { //le as colunas
            scanf("%f", &M[i][j]); //preenche a matriz
        }
    }

    for (j = 11; j >= 7; j--) {
        for (i = 12-j; i <=j-1; i++) {
            cont++;
            soma += M[i][j];
        }
    }

    if (operacao == 'S') {
        printf("%.1f\n", soma);
    } 
    else if (operacao == 'M') {
        printf("%.1f\n", soma / cont);
    }

    return 0;
}