package aula11_tratamento_de_excecoes.Atv9;

public class ArquivoNaoEncontradoException extends Exception {
    public ArquivoNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}

