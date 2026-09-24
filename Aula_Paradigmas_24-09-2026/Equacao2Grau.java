
public class Equacao2Grau {

    // Atributos privados (Encapsulamento)
    private double a;
    private double b;
    private double c;

    // Construtor
    public Equacao2Grau(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("O coeficiente 'a' nao pode ser zero em uma equacao do 2º grau.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getters e Setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a == 0) {
            throw new IllegalArgumentException("O coeficiente 'a' nao pode ser zero.");
        }
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    // Métodos de Comportamento / Regra de Negócio
    // Calcula o Delta (b² - 4ac)
    public double getDelta() {
        return Math.pow(this.b, 2) - (4 * this.a * this.c);
    }

    // Verifica se a equação possui raízes reais
    public boolean temRaizesReais() {
        return getDelta() >= 0;
    }

    // Retorna a primeira raiz (x1)
    public double getRaiz1() {
        if (!temRaizesReais()) {
            throw new IllegalStateException("A equacao nao possui raizes reais.");
        }
        return (-this.b + Math.sqrt(getDelta())) / (2 * this.a);
    }

    // Retorna a segunda raiz (x2)
    public double getRaiz2() {
        if (!temRaizesReais()) {
            throw new IllegalStateException("A equacao nao possui raizes reais.");
        }
        return (-this.b - Math.sqrt(getDelta())) / (2 * this.a);
    }

    // Exibe o estado e o resultado do cálculo
    public void imprimirResultado() {
        System.out.printf("--- Equacao: %.1fx² + (%.1f)x + (%.1f) = 0 ---\n", a, b, c);
        double delta = getDelta();
        System.out.printf("Delta (Δ) = %.2f\n", delta);

        if (delta > 0) {
            System.out.println("Possui duas raizes reais distintas:");
            System.out.printf("x1 = %.2f\n", getRaiz1());
            System.out.printf("x2 = %.2f\n", getRaiz2());
        } else if (delta == 0) {
            System.out.println("Possui uma unica raiz real:");
            System.out.printf("x = %.2f\n", getRaiz1());
        } else {
            System.out.println("Nao possui raizes reais (Delta < 0).");
        }
        System.out.println();
    }
}
