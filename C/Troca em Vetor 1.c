//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1175

#include<stdio.h>

int main (){
    int N[20], i, j, inverte; //declaracao de variaveis
    
    for(i = 0; i < 20; i++) { //reponsavel pelo numero de leituras
        scanf("%d", &*(N + i)); //o ponteiro aponta o numero lido a posicao no vetor
    }

    for (i = 0, j = 19; i < 10; i++, j--) {
        inverte = *(N + i);
        *(N + i) = *(N + j);
        *(N + j) = inverte;
    }

    for(i = 0; i < 20; i++){
        printf("N[%d] = %d\n", i, N[i]);
    }
    
    return 0;
}