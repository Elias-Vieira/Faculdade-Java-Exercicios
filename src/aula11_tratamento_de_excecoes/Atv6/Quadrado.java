package aula11_tratamento_de_excecoes.Atv6;

/*Escreva um programa que solicita ao usuário que insira um número inteiro e imprime o quadrado desse número.
Lide com a exceção de entrada inválida caso o usuário insira algo que não seja um número inteiro.*/

import java.util.Scanner;

public class Quadrado {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        try {

            System.out.print("Digite um número inteiro: ");
            int numero = Integer.parseInt(ler.nextLine());
            System.out.println("O quadrado do número é: " + (numero * numero));

        } catch (NumberFormatException e) {

            System.out.println("Entrada inválida.");
        }
    }
}

