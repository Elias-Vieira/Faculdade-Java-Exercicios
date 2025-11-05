package aula10_exercicio_baralho;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Baralho {

    private ArrayList<Carta> cartas = new ArrayList<>();
    private String[] nipes = {"Ouro", "Espadas", "Copas", "Paus"};

    public void montarBaralho() {
        Set<String> cartasUnicas = new HashSet<>();
        Random random = new Random();

        while (cartas.size() < 10) {
            int cartaAleatoria = random.nextInt(10) + 1;
            int indiceNipe = random.nextInt(nipes.length);

            String identificador = cartaAleatoria + "-" + nipes[indiceNipe];

            if (!cartasUnicas.contains(identificador)) {
                cartasUnicas.add(identificador);
                cartas.add(new Carta(cartaAleatoria, nipes[indiceNipe]));
            }
        }
    }

    public void imprimirCartas() {
        for (Carta carta : cartas) {
            System.out.println("Número da carta: " + carta.getNumero());
            System.out.println("Naipe: " + carta.getNaipe());
            System.out.println("-------------------------");
        }
    }
}
