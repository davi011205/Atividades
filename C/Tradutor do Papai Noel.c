//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1763

#include <stdio.h>
#include <string.h>

struct natal {
    char pais[15];
    char mensagem[24];
};

int main(void)
{
  int i;
  char pais_digitado[24];

  struct natal vetor[24];
  //copia o nome de um pais para cada posicao do vetor pais da struct
    strcpy(vetor[0].pais, "brasil");
    strcpy(vetor[1].pais, "alemanha");
    strcpy(vetor[2].pais, "austria");
    strcpy(vetor[3].pais, "coreia");
    strcpy(vetor[4].pais, "espanha");
    strcpy(vetor[5].pais, "grecia");
    strcpy(vetor[6].pais, "estados-unidos");
    strcpy(vetor[7].pais, "inglaterra");
    strcpy(vetor[8].pais, "australia");
    strcpy(vetor[9].pais, "portugal");
    strcpy(vetor[10].pais, "suecia");
    strcpy(vetor[11].pais, "turquia");
    strcpy(vetor[12].pais, "argentina");
    strcpy(vetor[13].pais, "chile");
    strcpy(vetor[14].pais, "mexico");
    strcpy(vetor[15].pais, "antardida");
    strcpy(vetor[16].pais, "canada");
    strcpy(vetor[17].pais, "irlanda");
    strcpy(vetor[18].pais, "belgica");
    strcpy(vetor[19].pais, "italia");
    strcpy(vetor[20].pais, "libia");
    strcpy(vetor[21].pais, "siria");
    strcpy(vetor[22].pais, "marrocos");
    strcpy(vetor[23].pais, "japao");
    //copia a frase de um pais para cada posicao do vetor mensagem da struct
    strcpy(vetor[0].mensagem, "Feliz Natal!");
    strcpy(vetor[1].mensagem, "Frohliche Weihnachten!");
    strcpy(vetor[2].mensagem, "Frohe Weihnacht!");
    strcpy(vetor[3].mensagem, "Chuk Sung Tan!");
    strcpy(vetor[4].mensagem, "Feliz Navidad!");
    strcpy(vetor[5].mensagem, "Kala Christougena!");
    strcpy(vetor[6].mensagem, "Merry Christmas!");
    strcpy(vetor[7].mensagem, "Merry Christmas!");
    strcpy(vetor[8].mensagem, "Merry Christmas!");
    strcpy(vetor[9].mensagem, "Feliz Natal!");
    strcpy(vetor[10].mensagem, "God Jul!");
    strcpy(vetor[11].mensagem, "Mutlu Noeller");
    strcpy(vetor[12].mensagem, "Feliz Navidad!");
    strcpy(vetor[13].mensagem, "Feliz Navidad!");
    strcpy(vetor[14].mensagem, "Feliz Navidad!");
    strcpy(vetor[15].mensagem, "Merry Christmas!");
    strcpy(vetor[16].mensagem, "Merry Christmas!");
    strcpy(vetor[17].mensagem, "Nollaig Shona Dhuit!");
    strcpy(vetor[18].mensagem, "Zalig Kerstfeest!");
    strcpy(vetor[19].mensagem, "Buon Natale!");
    strcpy(vetor[20].mensagem, "Buon Natale!");
    strcpy(vetor[21].mensagem, "Milad Mubarak!");
    strcpy(vetor[22].mensagem, "Milad Mubarak!");
    strcpy(vetor[23].mensagem, "Merii Kurisumasu!");

  while(scanf("%s", pais_digitado) != EOF) { //ler os nomes dos paises
  int checar_existencia = 1;
    for(i = 0; i < 24; i++) {
      if (strcmp(pais_digitado,vetor[i].pais) == 0) { //compara o pais digitado com o pais cadatrado na struct
        printf("%s\n", vetor[i].mensagem); //quando igual imprime a mensagem gravada na posicao do vetor correspondente ao valor da variavel i
        checar_existencia = 0; //quando igual a variavel fica em 0
        break;
      }
    }
    if(checar_existencia == 1) { //quando essa variavel esta em 1 significa que o pais nao foi encontrado nos registros da struct
        printf("--- NOT FOUND ---\n");
    }
  }
  return 0;
}