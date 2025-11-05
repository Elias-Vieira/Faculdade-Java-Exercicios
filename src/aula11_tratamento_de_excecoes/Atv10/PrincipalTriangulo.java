package aula11_tratamento_de_excecoes.Atv10;

/*Crie uma classe Triangulo com atributos ladoA, ladoB e ladoC. Implemente um
método verificarTriangulo() que lança uma exceção TrianguloInvalidoException se
os lados não formarem um triângulo válido. Para verificar se é possível formar um
triângulo, basta fazer a soma entre os dois lados menores. Se a soma entre eles for
maior que o terceiro lado então será um triângulo*/

import java.util.Scanner;

public class PrincipalTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        double a = entrada.nextDouble();

        System.out.print("Digite o lado B: ");
        double b = entrada.nextDouble();

        System.out.print("Digite o lado C: ");
        double c = entrada.nextDouble();

        Triangulo t = new Triangulo(a, b, c);

        try {
            t.verificarTriangulo();
        } catch (TrianguloInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}

