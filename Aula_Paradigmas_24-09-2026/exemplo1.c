#include <stdio.h>

#define TAMANHO 10

int main()
{
    // Vetor pré-preenchido com 10 inteiros
    int vetor[TAMANHO] = {5, 12, 8, 20, 15, 3, 9, 14, 18, 6};
    int soma = 0;
    float media;

    // Acumulação da soma
    for (int i = 0; i < TAMANHO; i++)
    {
        soma += vetor[i];
    }

    // Cálculo da média
    media = (float) soma / TAMANHO;

    // Exibição do resultado
    printf("A media aritmetica dos elementos eh: %.2f\n", media);

    return 0;
}
