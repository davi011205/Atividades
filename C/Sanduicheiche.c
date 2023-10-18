//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/2153

#include <stdio.h>
#include <string.h>

int main(void) {
int i, ultima_letra;
char palavra[31];

  while(scanf("%s", palavra) != EOF) { //lê a string

    ultima_letra = palavra[strlen(palavra)-1]; //-1 pra ler de fato a ultima letra e nao o "\0"

    for(i = strlen(palavra)-2; i >= 0; i--) { // Encontra a penultima ocorrencia da ultima letra
      if(palavra[i] == ultima_letra && palavra[i-1] != ultima_letra){ 
      palavra[i + 1] = '\0'; //faz com que elimine a parte repetida da palavra
      break;
      }
    }
    printf("%s\n", palavra);
  }

return 0;
}