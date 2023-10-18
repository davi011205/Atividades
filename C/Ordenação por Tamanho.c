//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1244

#include <stdio.h> //biblioteca padrao
#include <string.h> //biblioteca para usar strings
#include <stdbool.h>  //biblioteca para usar o 'while(true)'

typedef struct string { //declaracao da struct
	char texto[3000]; //item da struct
} string; //chave da struct

void insercao(string E[], int n) { //funcao de ordenacao por insersao
	int i, j; 
	string temp; //declarando uma variavel(vai servir como variavel temporaria) do tipo struct string

	for (i = 1; i < n; i++) { // codig de ordenação por insercao como mostrado na aula adaptado para esse exercício
		temp = E[i];
		for (j = i - 1; j >= 0 && strlen(E[j].texto) < strlen(temp.texto); j--) {
			E[j + 1] = E[j];
		}
		E[j + 1] = temp;
	}
}

int main () {
	int numTestes; //declaracao de variavel 
	int i, j, k; //declaracao dos iteradores

	scanf("%d", &numTestes); //lendo a quantidade de testes
	string linha[50];  //declarando um vetor do do tipo struct string
	char palavrasDaLinha[3000]; //50 strings x 50 caracteres + as quebras de linha de cada linha

	while (numTestes--) {
		scanf(" %[^\n]", palavrasDaLinha);
		 i = j = k = 0;

		while (true) {
			while (palavrasDaLinha[i] != ' ') { //enquanto o caracter digitado for diferente de espaço manda para a struct(linha 39)
				if (palavrasDaLinha[i] == '\0') //se o caracter for um \0 = string terminou
					break;
				else
					linha[j].texto[k++] = palavrasDaLinha[i++];
			}
			linha[j].texto[k] = '\0';

			if (palavrasDaLinha[i] == '\0'){ //se for o caracter nulo o caracter atual vai parar o laço mais externo
				break;
      }

			i++; j++; //caso o caracter nao seja o nulo os indices acrescentam 1 normalmente
			k = 0;
		}

		j++;

		insercao(linha, j); //chamada da funcao de ordenacao passando seus parametros

		for (i = 0; i < j; i++) { //vai imprimir as strings já ordenadas
			if (i != j && i != 0)
				printf(" ");
			printf("%s", linha[i].texto);
		}
		printf("\n");
	}
}