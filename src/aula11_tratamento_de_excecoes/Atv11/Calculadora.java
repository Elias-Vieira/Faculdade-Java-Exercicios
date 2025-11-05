package aula11_tratamento_de_excecoes.Atv11;

public class Calculadora {
    public double dividir(double a, double b) throws OperacaoInvalidaException {
        if (b == 0) {
            throw new OperacaoInvalidaException("Nao e possivel dividir por zero.");
        }
        return a / b;
    }

    public double raizQuadrada(double a) throws OperacaoInvalidaException {
        if (a < 0) {
            throw new OperacaoInvalidaException("Nao e possivel calcular a raiz quadrada de numero negativo.");
        }
        return Math.sqrt(a);
    }

    public double exponenciacao(double base, double expoente) throws OperacaoInvalidaException {
        if (base == 0 && expoente == 0) {
            throw new OperacaoInvalidaException("Base e expoente iguais a zero nao sao permitidos.");
        }
        return Math.pow(base, expoente);
    }
}
