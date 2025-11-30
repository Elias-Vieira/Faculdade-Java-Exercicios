package aula13Final_manipular_arquivo;

/* Dado o arquivo “escola_DB.txt”, que contém informações dos alunos, como: nome,
matrícula, série, nota 1, nota 2 e nota 3. Crie em Java uma classe chamada CalculaNota que
calcule a média de todos os alunos e salve o nome, a série e a média em um novo arquivo,
chamado “media_2025.txt”. Após isso, crie uma nova classe chamada ExibirSerie onde o
usuário deverá informar o número da série(entre 1 e 5) e exibir o nome e a média de todos
os alunos dessa série informada. */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class CalculaNota {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("escola_DB.txt"));
            String linha = "";

            ArrayList<String[]> conteudoList = new ArrayList<>();

            while ((linha = br.readLine()) != null) {
                conteudoList.add(linha.split(","));
            }

            br.close();

            String[][] conteudo = new String[conteudoList.size()][];
            for (int i = 0; i < conteudoList.size(); i++) {
                conteudo[i] = conteudoList.get(i);
            }

            FileWriter fw = new FileWriter("media_2025.txt");

            for (int i = 1; i < conteudo.length; i++) {
                String nome = conteudo[i][0];
                int serie = Integer.parseInt(conteudo[i][2]);

                double n1 = Double.parseDouble(conteudo[i][3]);
                double n2 = Double.parseDouble(conteudo[i][4]);
                double n3 = Double.parseDouble(conteudo[i][5]);

                double media = (n1 + n2 + n3) / 3;

                fw.write(nome + "," + serie + "," + String.format("%.2f", media) + "\n");
            }

            fw.close();
            System.out.println("Arquivo media_2025.txt gerado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

