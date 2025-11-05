package aula11_tratamento_de_excecoes.Atv12;

public class ValidadorDeSenha {
    public void validarSenha(String senha) throws SenhaFracaException {
        if (senha.length() < 8) {
            throw new SenhaFracaException("A senha deve ter pelo menos 8 caracteres.");
        }

        boolean temMaiuscula = false;
        boolean temEspecial = false;
        String especiais = "!@#$%*()_-=+.";

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            }
            if (especiais.contains(String.valueOf(c))) {
                temEspecial = true;
            }
        }

        if (!temMaiuscula) {
            throw new SenhaFracaException("A senha deve conter pelo menos uma letra maiuscula.");
        }

        if (!temEspecial) {
            throw new SenhaFracaException("A senha deve conter pelo menos um caractere especial: !@#$%*()_-=+");
        }

        System.out.println("Senha valida.");
    }
}
