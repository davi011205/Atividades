//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1178

#include <stdio.h>
//||
int main(void) {
  int i;
  double N[100], num; //declara vetor de tamanho 100
  scanf("%lf", &num); //escanea o primeiro numero
  N[0] = num; //define a posição 0 do vetor como o numero lido

  for(i = 1; i < 100; i++){ //percorre o vetor de 1 até 99
    N[i] = N[i-1]/2; //define a posição do vetor como a metade do anterior
  }
  for(i = 0; i < 100; i++){
    printf("N[%d] = %.4f\n", i, N[i]);
    //imprime a posição e o valor do vetor
  }
  return 0;
}