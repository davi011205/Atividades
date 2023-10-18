//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1165

#include <stdio.h>

int main(void) {
    int i, num_testes, j, num_primo;

    scanf("%d", &num_testes);

    int vetor[num_testes];

    for(i = 0; i < num_testes; i++) {
        scanf("%d", &vetor[i]);
    }
    for (i = 0; i < num_testes; i++) {
        for(j = 2; j < vetor[i]; j++) {
        if(vetor[i] % j == 0) {
            num_primo = 0;
            break;
        }
        else 
        num_primo = 1;
        } 
        if(num_primo) {
            printf("%d eh primo\n", vetor[i]);  
        }
        else 
        printf("%d nao eh primo\n", vetor[i]);
    }
    return 0;
}