//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1040

#include <stdio.h>

int main(void) {
  double n1, n2, n3, n4, mediaponderada,notaexame, novamedia;

  scanf("%lf%lf%lf%lf", &n1, &n2, &n3, &n4);

  mediaponderada=((n1*2)+(n2*3)+(n3*4)+(n4*1))/10;

  printf("Media: %.1lf\n", mediaponderada);
  
  if (mediaponderada>=7.0) {
    printf("Aluno aprovado.\n");
  }
  else if (mediaponderada<5.0) {
     printf("Aluno reprovado.\n");
  }
  else if (mediaponderada>=5.0 || mediaponderada==6.9) {
    printf("Aluno em exame.\n");
    scanf("%lf", &notaexame);
    printf("Nota do exame: %.1lf\n", notaexame);
    novamedia=(mediaponderada+notaexame)/2;
  }
  if (novamedia>=5.0) {
    printf("Aluno aprovado.\n");
    printf("Media final: %.1lf\n", novamedia);
  }
  
   return 0;
}