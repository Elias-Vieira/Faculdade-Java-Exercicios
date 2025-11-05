package aula11_tratamento_de_excecoes.Atv4;

public class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String msg) {
        super(msg);
    }

    public String getErro() {
        return "A idade nao pode ser 0 ou negativa";
    }
}
