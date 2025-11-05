package aula11_tratamento_de_excecoes.Atv3;

public class DivisaoPorZeroException extends Exception {

    public DivisaoPorZeroException(String msg) {
        super(msg);
    }

    public String getErro(){
        return "A divisao por zero não é possivel!";
    }
}
