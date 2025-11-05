package aula11_tratamento_de_excecoes.Atv4;

/*Crie uma classe chamada ValidadorDeIdade que contenha um método chamado
verificarIdade que aceita uma idade como parâmetro. Use throw para lançar uma exceção
IdadeInvalidaException se a idade for menor que 0. Escreva um programa principal que
chama esse método e lida com a exceção.*/

public class ValidadorDeIdade {

    public static void main(String[] args) {

        int idade = -2;

        try {

            validarIdade(idade);
            System.out.println("idade valida!");

        } catch (IdadeInvalidaException e){
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Detalhe: " + e.getErro());
        }

    }

    public static void validarIdade(int idade) throws IdadeInvalidaException{

        if (idade <= 0) {
            throw new IdadeInvalidaException("Idade invalida!");
        }

    }
}
