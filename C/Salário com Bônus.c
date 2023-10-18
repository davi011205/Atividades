//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1009

#include <stdio.h>

int main() {
  char nome;
  double salario_fixo, num_vendas, salario_final;
  scanf("%s %lf %lf", &nome, &salario_fixo, &num_vendas);
  salario_final= salario_fixo + ((num_vendas/100) *15);
  printf("TOTAL = R$ %.2lf\n", salario_final);
  return 0;
}