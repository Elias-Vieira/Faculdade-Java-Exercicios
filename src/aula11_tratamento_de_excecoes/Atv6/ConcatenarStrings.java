package aula11_tratamento_de_excecoes.Atv6;

/*Crie um programa que recebe duas Strings do usuário e concatena-as. Lide com a exceção de entradas inválidas.*/

import java.util.Scanner;

public class ConcatenarStrings {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        try {

            System.out.print("Digite o primeiro texto: ");
            String str1 = ler.nextLine();
            System.out.print("Digite o segundo texto: ");
            String str2 = ler.nextLine();
            System.out.println("Strings concatenadas: " + str1 + str2);

        } catch (Exception e) {

            System.out.println("Entrada inválida.");
        }
    }
}

