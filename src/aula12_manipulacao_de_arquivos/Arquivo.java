package aula12_manipulacao_de_arquivos;

/* Criar um programa em Java que contenha uma classe chamada Arquivo que realize
as seguintes funções:
a. Uma função para criar um arquivo em .txt. O nome do arquivo será
informado pelo usuário usando a classe Scanner. O arquivo deverá ser criado
na raiz do projeto.
b. Ler o conteúdo de um arquivo. O nome do arquivo a ser lido deverá ser
informado pelo usuário usando a classe Scanner.

OBS.: Caso o usuário não informe a extensão do arquivo, deverá ser adicionado antes de realizar a
leitura ou criação do arquivo. */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo: ");
        String nome = ler.nextLine();

        nome = garantirExtensaoTxt(nome);

        criarArquivo(nome);

        System.out.println("\nLendo o conteudo do arquivo...");
        lerConteudo(nome);

        ler.close();
    }

    public static String garantirExtensaoTxt(String nome) {
        if (!nome.endsWith(".txt")) {
            nome = nome + ".txt";
        }
        return nome;
    }

    public static void criarArquivo(String nome) {

        try {
            FileWriter fw = new FileWriter(nome);
            fw.write("Arquivos teste");
            fw.close();
            System.out.println("Arquivo criado com sucesso: " + nome);
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
        }
    }

    public static void lerConteudo(String nome) {

        try {
            File file = new File(nome);
            Scanner leitorArquivo = new Scanner(file);

            System.out.println("Conteudo do arquivo:");
            while (leitorArquivo.hasNextLine()) {
                String linha = leitorArquivo.nextLine();
                System.out.println(linha);
            }

            leitorArquivo.close();
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}
