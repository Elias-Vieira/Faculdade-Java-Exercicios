package aula11_tratamento_de_excecoes.Atv11;

public class OperacaoInvalidaException extends Exception {
    public OperacaoInvalidaException(String mensagem) {
        super(mensagem);
    }
}