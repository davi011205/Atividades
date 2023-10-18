//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1094

#include <stdio.h>

int main(void) {
  int quantia_de_casos, quantia_de_cobaias, i, total, R, S, C;
  char tipo_cobaia;
  float  percentual_S, percentual_R, percentual_C;

  S=0;
  R=0;
  C=0;

  scanf("%d", &quantia_de_casos);

  i=1;
 do {
   scanf("%d %c", &quantia_de_cobaias, &tipo_cobaia);

    if(tipo_cobaia=='C') {
      C+=quantia_de_cobaias;
    }
    else if(tipo_cobaia=='R') {
      R+=quantia_de_cobaias;
    }
    else if(tipo_cobaia=='S') {
      S+=quantia_de_cobaias;
    }  
 
   i++;
 } while(i<=quantia_de_casos);
  total=R+S+C;
  percentual_C= C/total*100;
  percentual_R= R/total*100;
  percentual_S= S/total*100;

  printf("Total: %d cobaias\n", total);
  printf("Total de coelhos: %d\n", C);
  printf("Total de ratos: %d\n", R);
  printf("Total de sapos: %d\n", S);
  printf("Percentual de coelhos: %.2f %%\n",(float)C/total*100);
  printf("Percentual de ratos: %.2f %%\n",(float)R/total*100);
  printf("Percentual de sapos: %.2f %%\n",(float)S/total*100);
  
  return 0;
}