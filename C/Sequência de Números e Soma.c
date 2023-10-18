//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1101

#include <stdio.h>
int main(){
  int i, j, a, b, aux, soma = 0;
  while (i < 100){
    i++;
    scanf("%d %d", &a, &b);
    
    if (a <= 0 || b <= 0){
      break;
    }
    else if(a > b){
      aux = a;
      a = b;
      b = aux;
    }
    for (j = a; j <= b; j++){
      printf("%d ", j);
      soma += j;
    }
    printf("Sum=%d\n", soma);
    soma = 0;
  }
    return 0;
}