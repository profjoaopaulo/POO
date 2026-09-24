#include <stdio.h>
#include <math.h> // Necessário para a função sqrt()

// Função procedural que recebe os coeficientes e imprime as raízes
void calcularBhaskara(float a, float b, float c)
{
    // Verificação de equação do 2º grau
    if (a == 0)
    {
        printf("O coeficiente 'a' deve ser diferente de zero para ser uma equacao do segundo grau.\n");
        return;
    }

    // Cálculo do Delta: b^2 - 4ac
    float delta = (b * b) - (4 * a * c);

    printf("Delta (Δ) = %.2f\n", delta);

    if (delta > 0)
    {
        // Duas raízes reais e distintas
        float x1 = (-b + sqrt(delta)) / (2 * a);
        float x2 = (-b - sqrt(delta)) / (2 * a);
        printf("A equacao possui duas raizes reais distintas:\n");
        printf("x1 = %.2f\n", x1);
        printf("x2 = %.2f\n", x2);
    }
    else if (delta == 0)
    {
        // Uma única raiz real (raízes iguais)
        float x = -b / (2 * a);
        printf("A equacao possui uma unica raiz real:\n");
        printf("x = %.2f\n", x);
    }
    else
    {
        // Delta negativo: sem raízes reais
        printf("A equacao nao possui raizes reais (Delta < 0).\n");
    }
}

int main()
{
    // Exemplo: Equação com duas raízes reais (x^2 - 5x + 6 = 0)
    float a = 1.0, b = -5.0, c = 6.0;

    printf("--- Calculando para a = %.1f, b = %.1f, c = %.1f ---\n", a, b, c);
    calcularBhaskara(a, b, c);

    return 0;
}
