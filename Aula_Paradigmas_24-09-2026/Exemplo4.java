
public class Exemplo4 {

    public static void main(String[] args) {
        // Coeficientes da equação (a*x^2 + b*x + c = 0)
        double a = 1.0;
        double b = -5.0;
        double c = 6.0;

        System.out.printf("--- Calculando para a = %.1f, b = %.1f, c = %.1f ---\n", a, b, c);

        // Verificação de equação do 2º grau
        if (a == 0) {
            System.out.println("O coeficiente 'a' deve ser diferente de zero.");
            return;
        }

        // Cálculo do Delta: b^2 - 4ac (usando Math.pow)
        double delta = Math.pow(b, 2) - (4 * a * c);

        System.out.printf("Delta (Δ) = %.2f\n", delta);

        // Avaliação do Delta e cálculo das raízes
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("A equacao possui duas raizes reais distintas:");
            System.out.printf("x1 = %.2f\n", x1);
            System.out.printf("x2 = %.2f\n", x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);

            System.out.println("A equacao possui uma unica raiz real:");
            System.out.printf("x = %.2f\n", x);
        } else {
            System.out.println("A equacao nao possui raizes reais (Delta < 0).");
        }
    }
}
