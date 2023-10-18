//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1007

#include <stdio.h>

int main() {
  int a, b, c, d, diferenca;

  scanf("%d %d %d %d", &a, &b, &c, &d);

  diferenca= (a*b - c*d);

  printf("DIFERENCA = %d\n", diferenca);
  
  return 0;
}