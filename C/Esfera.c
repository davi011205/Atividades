//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1011

#include <stdio.h>

int main(void) {
  double raio, volume;

  scanf("%lf", &raio);

  volume=(4/3.0) * 3.14159 *(raio*raio*raio);

  printf("VOLUME = %.3lf\n", volume);
  
  return 0;
}