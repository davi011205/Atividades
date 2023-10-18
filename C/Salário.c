//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1008

#include <stdio.h>

int main(void) {
  int nfuncionario, horas,  salariofinal;
  float valor;
  scanf("%d %d %f", &nfuncionario, &horas, &valor);
  valor*= horas;
  printf("NUMBER = %d\nSALARY = U$ %.2f\n", nfuncionario, valor);
  return 0;
}