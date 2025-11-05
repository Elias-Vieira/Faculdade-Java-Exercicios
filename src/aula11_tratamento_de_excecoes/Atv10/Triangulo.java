package aula11_tratamento_de_excecoes.Atv10;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public void verificarTriangulo() throws TrianguloInvalidoException {
        double[] lados = {ladoA, ladoB, ladoC};
        java.util.Arrays.sort(lados);
        if (lados[0] + lados[1] <= lados[2]) {
            throw new TrianguloInvalidoException("Triangulo invalido!");
        }
        System.out.println("Triangulo valido.");
    }
}

