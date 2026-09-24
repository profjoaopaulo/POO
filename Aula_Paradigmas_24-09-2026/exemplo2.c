#include <stdio.h>

#define TAMANHO 10

// Função procedural que recebe o vetor e o tamanho, retornando a média
float calcularMedia(const int v[], int tamanho)
{
    int soma = 0;
    for (int i = 0; i < tamanho; i++)
    {
        soma += v[i];
    }
    return (float) soma / tamanho;
}

int main()
{
    // Vetor pré-preenchido com 10 inteiros
    int vetor[TAMANHO] = {5, 12, 8, 20, 15, 3, 9, 14, 18, 6};

    // Chamada da função passando o vetor
    float media = calcularMedia(vetor, TAMANHO);

    // Exibição do resultado
    printf("A media aritmetica dos elementos eh: %.2f\n", media);

    return 0;
}
