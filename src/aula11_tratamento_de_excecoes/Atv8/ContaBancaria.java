package aula11_tratamento_de_excecoes.Atv8;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque");
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
