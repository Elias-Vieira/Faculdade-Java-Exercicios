package aula11_tratamento_de_excecoes.Atv7;

/*Crie um programa que solicita ao usuário que insira um número
inteiro e verifique se é primo. Caso o valor não seja primo, lançar
uma exceção chamada NumeroNãoPrimoException.*/

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.print("Digite um numero: ");
            int numero = entrada.nextInt();
            VerificaNumeroPrimo.verificarPrimo(numero);
            System.out.println("O numero eh primo.");
        } catch (NumeroNaoPrimoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Entrada invalida.");
        }
    }
}
