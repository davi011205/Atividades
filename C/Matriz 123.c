//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1534

#include <stdio.h>
#include <stdlib.h>

void aloca_matriz(int ***matriz, int n) {
  int i;
  (*matriz) = (int **) malloc(n * sizeof(int));

  for(i = 0; i< n; i++) {
    (*matriz)[i] = (int *) malloc(n * sizeof(int));
  }
}

void imprime_matriz(int **matriz, int n){
  int i, j;

  for(i = 0; i < n; i++) {
    for(j = 0; j < n; j++) {
      if (i == j) {
        matriz[i][j] = 1;
      }
      if (i == n - j - 1) {
        matriz[i][j] = 2;
      }
      if (i != j && i != n - j - 1) {
        matriz[i][j] = 3;
      }
        printf("%d", matriz[i][j]);
    }
    printf("\n");
  }
}

int main() {
  int n, i, j;
  int **matriz_real;
  
  while(scanf("%d", &n) != EOF) {
    aloca_matriz(&matriz_real, n);
    imprime_matriz(matriz_real, n);
    free(matriz_real);
  }
  
  return 0;
}