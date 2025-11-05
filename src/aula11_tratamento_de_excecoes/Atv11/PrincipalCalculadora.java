package aula11_tratamento_de_excecoes.Atv11;

/*Desenvolva uma classe Calculadora com métodos para operações matemáticas de divisao,
raiz quadrada e exponenciação. Lide com exceções de operações inválidas, que serão:
dividir por zero
tentar extrair a raiz quadrada de um número negativo.
quando a base e o expoente forem 0.
*/

import java.util.Scanner;

public class PrincipalCalculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Escolha a operacao:\n1-Divisao\n2-Raiz Quadrada\n3-Exponenciacao");
        System.out.println("Sua resposta: ");
        int opcao = entrada.nextInt();

        try {
            switch (opcao) {
                case 1:
                    System.out.print("Digite o dividendo: ");
                    double a = entrada.nextDouble();
                    System.out.print("Digite o divisor: ");
                    double b = entrada.nextDouble();
                    System.out.println("Resultado: " + calc.dividir(a, b));
                    break;
                case 2:
                    System.out.print("Digite o numero: ");
                    double n = entrada.nextDouble();
                    System.out.println("Resultado: " + calc.raizQuadrada(n));
                    break;
                case 3:
                    System.out.print("Digite a base: ");
                    double base = entrada.nextDouble();
                    System.out.print("Digite o expoente: ");
                    double exp = entrada.nextDouble();
                    System.out.println("Resultado: " + calc.exponenciacao(base, exp));
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } catch (OperacaoInvalidaException e) {
            System.out.println(e.getMessage());
        }

        entrada.close();
    }
}

