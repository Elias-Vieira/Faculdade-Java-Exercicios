package aula11_tratamento_de_excecoes.Atv6;

/*Escreva um programa que solicita ao usuário que insira uma idade e verifique se é
 maior que 18 anos. Lide com a exceção de entrada inválida caso o usuário insira uma idade não numérica.*/

import java.util.Scanner;

public class VerificarIdade {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        try {

            System.out.print("Digite sua idade: ");
            int idade = Integer.parseInt(ler.nextLine());
            if (idade > 18) {
                System.out.println("Você é maior de 18 anos.");
            } else {
                System.out.println("Você não é maior de 18 anos.");
            }

        } catch (NumberFormatException e) {

            System.out.println("Entrada inválida. Digite um número inteiro para a idade.");
        }
    }
}

