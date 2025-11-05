package aula11_tratamento_de_excecoes.Atv2;

/*Crie um programa Java que permite ao usuário inserir a nota de um aluno. Crie uma exceção personalizada chamada
NotaInvalidaException para lidar com casos em que a nota inserida esteja fora do intervalo válido (O intervalo válido
 é de 0 a 10). */

import java.util.Scanner;

public class Aula11Atv2Principal {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        try {
            System.out.print("Digite a nota do aluno (0 a 10): ");
            double nota = ler.nextDouble();

            verificarNota(nota);

            System.out.println("Nota: " + nota);

        } catch (NotaInvalida e) {

            System.out.println("Ouve um erro: " + e.getMessage());
            System.out.println("Detalhe: " + e.getErro());

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }

    public static void verificarNota(double nota) throws NotaInvalida {
        if (nota < 0 || nota > 10) {
            throw new NotaInvalida("Nota invalida!");
        }
    }
}

