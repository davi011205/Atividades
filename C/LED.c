//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1168

#include <stdio.h>
#include <string.h>

int main(void) {
    int i, num_testes, quant_leds = 0, j;
    char string[1001];

    scanf("%d", &num_testes);

    for(i = 0; i < num_testes; i++) {
        scanf("%s", string);

        for(j = 0; j < strlen(string); j++) {
            switch(string[j]) {
                case '0':
                    quant_leds+= 6;
                    break;
                case '1':
                    quant_leds+= 2;
                    break;
                case '2':
                    quant_leds+= 5;
                    break;
                case '3':
                    quant_leds+= 5;
                    break;
                case '4':
                    quant_leds+= 4;
                    break;
                case '5':
                    quant_leds+= 5;
                    break;
                case '6':
                    quant_leds+= 6;
                    break;
                case '7':
                    quant_leds+= 3;
                    break;
                case '8':
                    quant_leds+= 7;
                    break;
                case '9':
                    quant_leds+= 6;
                    break;
            }
        }

        printf("%d leds\n", quant_leds);
        quant_leds=0;
    }
    
return 0;
}