package aula11_tratamento_de_excecoes.Atv1;

public class Principal {
    public static void main(String[] args) {

        try {

            Pessoa p1 = new Pessoa();
            p1.setNome("João");
            p1.setAnoNascimento(1990);

            int idade = 2023 - p1.getAnoNascimento();

            System.out.println("Nome: " + p1.getNome());
            System.out.println("Idade: " + idade);

        } catch (IllegalArgumentException e) {

            System.out.println("Ocorreu um erro: " + e.getMessage());

        } catch (NullPointerException e) {

            System.out.println("Ocorreu um erro: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
