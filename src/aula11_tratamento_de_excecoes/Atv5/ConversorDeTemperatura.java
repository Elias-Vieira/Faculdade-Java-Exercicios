package aula11_tratamento_de_excecoes.Atv5;

/*Crie uma classe chamada ConversorDeTemperatura que contenha um método
converterCelsiusParaFahrenheit que aceita uma temperatura em graus Celsius como parâmetro
e retorna a temperatura equivalente em graus Fahrenheit. Use throws para indicar que esse
método pode lançar uma exceção personalizada chamada TemperaturaInvalidaException se
a temperatura em graus Celsius for menor que -273.15 (zero absoluto). Use throw para lançar
essa exceção se a condição for atendida. Escreva um programa principal que chama esse
método e lida com a exceção. A conversão é dada pela fórmula: F = (°C × 9/5) + 32.*/

public class ConversorDeTemperatura {



    public static void main(String[] args) {

        int temperatura = -274;
        System.out.println(converterCelsiusParaFahrenheit(temperatura));

    }

    public static double converterCelsiusParaFahrenheit(double temperatura) {

        try {

            verificarZeroAbsoluto(temperatura);
            return temperatura * 1.8 + 32;

        } catch (TemperaturaInvalidaException e) {

            System.out.println("Erro: " + e.getMessage());
            System.out.println("Detalhe: " + e.getErro());

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());
        }

        return temperatura * 1.8 + 32;
    }

    public static void verificarZeroAbsoluto(double temperatura) throws TemperaturaInvalidaException{
        if (temperatura < -273.15) {
            throw new TemperaturaInvalidaException("Temperatura invalida!");
        }
    }
}
