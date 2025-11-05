package aula10_exercicio_baralho;

public class Carta {

    private int numero;
    private String naipe;

    public Carta(int numero, String naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public String getNaipe() {
        return naipe;
    }

    public int getNumero() {
        return numero;
    }
}
