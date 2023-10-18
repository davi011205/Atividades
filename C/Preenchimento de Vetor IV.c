//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1179

#include <stdio.h>

int main (void) {
int vet_par[5], vet_impar[5]; //declaracao de variaveis;
int N, i, j;
int cont_par = 0, cont_impar = 0;
int *ponteiro;                       

  for(i = 0; i < 15; i++) {  //ira ler os 15 numeros;
    scanf("%d", &N); //lendo os numeros;
    
    ponteiro = &N; //o ponteiro aponta para o local de memoria do numero;

    if(N % 2 == 0) { //verifica se o numero eh par;
      vet_par[cont_par] = *ponteiro; //caso seja par, atribui o valor que o ponteiro esta apontando(no caso o ponteiro aponta para o local de armazenamento do numero, e, devido ao asterisco traz seu valor) ao vet_par em sua posicao de acordo com a variaveeel de contagem de ocorrencias maximas;
      ++cont_par; //atribuindo 1 a cada numero par adicionado ao vetor par;
      if(cont_par == 5) { //quando chegar em 5, sigbifica que o o numero maximo de ocorrencias de numeros pares(5) ja foi atinjida;
        for(j = 0; j < 5; j++) { //for para percorrer  o vetor de numeros pares;
          printf("par[%d] = %d\n", j, vet_par[j]); //imprimindo os valores pares;
          cont_par = 0; //zerando o numero de ocorrencias de numeros pares para que possam ser colocados outros numeros;
        }
      }
    }

    else {
      vet_impar[cont_impar] = *ponteiro;//caso seja impar, atribui o valor que o ponteiro esta apontando(no caso o ponteiro aponta para o local de armazenamento do numero, e, devido ao asterisco traz seu valor) ao vet_impar em sua posicao de acordo com a variaveeel de contagem de ocorrencias maximas;
      ++cont_impar; //atribuindo 1 a cada numero par adicionado ao vetor impar;
      if(cont_impar == 5) { //quando chegar em 5, sigbifica que o o numero maximo de ocorrencias de numeros impares(5) ja foi atinjida;
        for(j=0; j < 5; j++) { //for para percorrer  o vetor de numeros impares;
          printf("impar[%d] = %d\n", j, vet_impar[j]); //imprimindo os valores impares;
          cont_impar = 0; //zerando o numero de ocorrencias de numeros impares para que possam ser colocados outros numeros;
        }
      }
    }
  }

  for(j = 0; j < cont_impar; j++) { 
    printf("impar[%d] = %d\n", j, vet_impar[j]); //imprimindo primeiro os valores impares que restaram como pedido no enunciado;
  }
  
  for(j = 0; j < cont_par; j++) {
    printf("par[%d] = %d\n", j , vet_par[j]); //imprimindo depois os valores pares que restaram como pedido no enunciado;
  }

  return 0;
}