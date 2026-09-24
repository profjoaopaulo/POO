
public class Exemplo5 {

    public static void main(String[] args) {
        // Criando instâncias de objetos Equacao2Grau
        Equacao2Grau eq1 = new Equacao2Grau(1.0, -5.0, 6.0);
        eq1.imprimirResultado();

        Equacao2Grau eq2 = new Equacao2Grau(1.0, -2.0, 1.0);
        eq2.imprimirResultado();

        Equacao2Grau eq3 = new Equacao2Grau(1.0, 1.0, 1.0);
        eq3.imprimirResultado();
    }
}
