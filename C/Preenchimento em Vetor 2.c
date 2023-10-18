//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1177

#include <stdio.h>

int main(void) {
int vetor[1000], j, i, num;
scanf("%d", &num);
  for(i = 0; i < 1000; i++) {
    vetor[i] = i % num;
  }
  for(i = 0; i < 1000; i++) {
    printf("N[%d] = %d\n", i, vetor[i]);
  }
return 0;
}