//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1172

#include <stdio.h>

int main(void) {
  int i;
  int X[10];
  for (i=0; i<10; i++){
    scanf("%d", &X[i]);
  }
  for(i=0; i<10; i++){
    if(X[i]<=0){
      X[i]=1;
    }
    else
    X[i]=X[i];
  }
  for(i=0; i<10; i++){
  printf("X[%d] = %d\n", i, X[i]);
  }
  return 0;
}
