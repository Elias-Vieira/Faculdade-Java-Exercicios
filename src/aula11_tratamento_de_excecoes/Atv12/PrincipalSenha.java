package aula11_tratamento_de_excecoes.Atv12;

/*Crie uma classe ValidadorDeSenha com um método validarSenha(String senha) que verifica
se a senha atende aos seguintes critérios
comprimento mínimo de 8 caracteres,
pelo menos uma letra maiúscula (utilizar a função Character.isUpperCase(letra))
contenha pelo menos 1 dos seguintes caracteres especiais: !@#$%*&( )-_=+
Lance uma exceção de SenhaFracaException caso uma das condições não seja atendida.*/

import java.util.Scanner;

public class PrincipalSenha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ValidadorDeSenha validador = new ValidadorDeSenha();

        System.out.print("Digite a senha: ");
        String senha = entrada.nextLine();

        try {
            validador.validarSenha(senha);
        } catch (SenhaFracaException e) {
            System.out.println(e.getMessage());
        }

        entrada.close();
    }
}

