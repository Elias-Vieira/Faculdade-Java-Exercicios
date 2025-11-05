package aula11_tratamento_de_excecoes.Atv9;

/*Implemente uma classe Arquivo com um atributo chamado listaArquivos que
será um vetor com nomes de arquivos válidos e um método chamado
lerArquivo(String nome) que lança uma exceção ArquivoNaoEncontradoException se
o arquivo especificado não existir dentro do vetor. */

import java.util.Scanner;

public class PrincipalArquivo {
    public static void main(String[] args) {
        String[] arquivos = {"dados.txt", "relatorio.pdf", "imagem.png"};
        Arquivo sistemaArquivos = new Arquivo(arquivos);

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo que deseja ler: ");
        String nome = entrada.nextLine();

        try {
            sistemaArquivos.lerArquivo(nome);
        } catch (ArquivoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}

