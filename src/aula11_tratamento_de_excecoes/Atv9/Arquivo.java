package aula11_tratamento_de_excecoes.Atv9;


public class Arquivo {
    private String[] listaArquivos;

    public Arquivo(String[] listaArquivos) {
        this.listaArquivos = listaArquivos;
    }

    public void lerArquivo(String nome) throws ArquivoNaoEncontradoException {
        boolean encontrado = false;
        for (String arquivo : listaArquivos) {
            if (arquivo.equals(nome)) {
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            throw new ArquivoNaoEncontradoException("Arquivo não encontrado: " + nome);
        }
        System.out.println("Arquivo " + nome + " lido com sucesso.");
    }
}

