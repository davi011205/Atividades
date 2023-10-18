//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1012

#include <stdio.h>

int main(void) {
  double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;

  scanf("%lf %lf %lf", &a, &b, &c);

  triangulo= (a * c) / 2;
  circulo= 3.14159 * c * c;
  trapezio= (a + b) * c / 2;
  quadrado= b * b;
  retangulo= a * b;

  printf("TRIANGULO: %.3lf\nCIRCULO: %.3lf\nTRAPEZIO: %.3lf\nQUADRADO: %.3lf\nRETANGULO: %.3lf\n", triangulo, circulo, trapezio, quadrado, retangulo);
  
  return 0;
}