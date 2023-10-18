// enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/1067

#include <stdio.h>

int main() {
    int i, num_digitado;

    scanf("%d", &num_digitado);
    i = 1;

    while (i <= num_digitado) {
        if (i % 2 == 1)
            printf("%d\n", i);
        i++;
    }
    return 0;
}
