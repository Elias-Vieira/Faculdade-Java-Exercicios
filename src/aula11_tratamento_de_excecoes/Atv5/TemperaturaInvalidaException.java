package aula11_tratamento_de_excecoes.Atv5;

public class TemperaturaInvalidaException extends Exception {

    public TemperaturaInvalidaException(String msg) {
        super(msg);
    }

    public String getErro(){
        return "Temperatura abaixo de -273.15!";
    }
}
