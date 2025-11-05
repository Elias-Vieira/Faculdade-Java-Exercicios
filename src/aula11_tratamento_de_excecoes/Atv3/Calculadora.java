package aula11_tratamento_de_excecoes.Atv3;

/*Crie uma classe chamada Calculadora que contenha um método dividir que aceita dois
números como parâmetros e divide o primeiro pelo segundo. Use throws para indicar que esse
método pode lançar uma exceção personalizada chamada DivisaoPorZeroException se o
denominador for zero. Escreva um programa principal que chama esse método e lida com a
exceção.*/

import java.util.Scanner;

public class Calculadora {

    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        System.out.println(dividir(ler.nextInt(), ler.nextInt()));
    }

    public static double dividir(double a, double b){

        try {
            verificarDenominador(b);
            return a / b;
        } catch (DivisaoPorZeroException e) {

            System.out.println("Erro: " + e.getMessage());
            System.out.println("Detalhe: " + e.getErro());

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());
        }

        return a / b;
    }

    public static void verificarDenominador(double b) throws DivisaoPorZeroException {
        if(b==0){

            throw new DivisaoPorZeroException("Denominador invalido!");

        }
    }
}
