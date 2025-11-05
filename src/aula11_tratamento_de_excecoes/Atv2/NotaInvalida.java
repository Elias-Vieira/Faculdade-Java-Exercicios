package aula11_tratamento_de_excecoes.Atv2;

public class NotaInvalida extends Exception {

    public NotaInvalida(String msgErro) {
        super(msgErro);
    }

    public String getErro(){
        return "Nota fora do intervalo de 0 a 10";
    }
}
