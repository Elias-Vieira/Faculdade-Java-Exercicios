package aula11_tratamento_de_excecoes.Atv7;

public class VerificaNumeroPrimo {
    public static void verificarPrimo(int numero) throws NumeroNaoPrimoException {
        if (numero <= 1) throw new NumeroNaoPrimoException("O número não é primo.");
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) throw new NumeroNaoPrimoException("O número não é primo.");
        }
    }
}
