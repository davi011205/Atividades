//enunciado: https://www.beecrowd.com.br/judge/pt/problems/view/3162


#include <math.h>
#include <stdio.h>

int main() {
    int i, j, k, numNaves;
    double menorDistancia = 0, distancia;

    scanf("%d", &numNaves);

    //declarando a matriz com o numero de linhas igual ao numero de naves;
    double matriz[numNaves][3];

    //preenchendo a matriz;
    for( i = 0; i < numNaves; i++ ) {
        for( j = 0; j < 3; j++ ) {
            scanf("%lf", &matriz[i][j]);
        }
    }

    //for utilizado para que possa fazer o calculo da proxima linha de entrada menos a atual por toda a matriz,
    for(i = 0; i < numNaves; i++) {
        menorDistancia = 10000;
        for( k = 0; k < numNaves; k++ ) {

            //calculando a proxima linha da matriz - a anterior, as colunas sao fixas nesse tipo de caso;
            distancia = sqrt( pow(matriz[k][0] - matriz[i][0], 2) + pow(matriz[k][1] - matriz[i][1], 2) + pow(matriz[k][2] - matriz[i][2], 2) );
            if( distancia < menorDistancia && i != k ) {
                menorDistancia = distancia;
            }
        }

        //teste para verificar a intensidade do sinal entre as naves;
        if( menorDistancia <= 20 ) {
           printf("A\n");
        }
        else if( menorDistancia > 20 && menorDistancia <= 50) {
            printf("M\n");
        }
        else
            printf("B\n");
    }

    return 0;
}
