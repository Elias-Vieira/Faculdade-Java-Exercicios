package aula11_tratamento_de_excecoes.Atv8;

/*Implemente uma classe ContaBancaria com um método sacar(double valor)
que lança uma exceção SaldoInsuficienteException se o saldo for menor que
 o valor a ser sacado.*/

import java.util.Scanner;

public class PrincipalConta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(1000);

        System.out.print("Digite o valor a ser sacado: ");
        double valor = entrada.nextDouble();

        try {
            conta.sacar(valor);
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo atual: " + conta.getSaldo());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
