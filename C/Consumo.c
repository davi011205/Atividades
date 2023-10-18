//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1014

#include <stdio.h>

int main(void) {
  double km, litros, media;

  scanf("%lf %lf", &km, &litros);

  media= km/litros;

  printf("%.3lf km/l\n", media);
  
  return 0;
}