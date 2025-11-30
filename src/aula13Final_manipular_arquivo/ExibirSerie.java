package aula13Final_manipular_arquivo;

/* Dado o arquivo “escola_DB.txt”, que contém informações dos alunos, como: nome,
matrícula, série, nota 1, nota 2 e nota 3. Crie em Java uma classe chamada CalculaNota que
calcule a média de todos os alunos e salve o nome, a série e a média em um novo arquivo,
chamado “media_2025.txt”. Após isso, crie uma nova classe chamada ExibirSerie onde o
usuário deverá informar o número da série(entre 1 e 5) e exibir o nome e a média de todos
os alunos dessa série informada. */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ExibirSerie {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Informe a serie (1 a 5): ");
            int serieEscolhida = sc.nextInt();

            BufferedReader br = new BufferedReader(new FileReader("media_2025.txt"));
            String linha = "";

            System.out.println("\nAlunos da serie " + serieEscolhida + ":\n");

            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                String nome = dados[0];
                int serie = Integer.parseInt(dados[1]);
                double media = Double.parseDouble(dados[2].replace(",", "."));

                if (serie == serieEscolhida) {
                    System.out.println("Nome: " + nome + " | Media: " + media);
                }
            }

            br.close();
            sc.close();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

