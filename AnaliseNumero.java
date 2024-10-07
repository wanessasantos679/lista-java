import java.util.Scanner;

public class AnaliseNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifica se o número é par ou ímpar
        String parOuImpar = numero % 2 == 0 ? "par" : "ímpar";

        // Verifica se o número é positivo ou negativo
        String positivoOuNegativo = numero > 0 ? "positivo" : (numero < 0 ? "negativo" : "zero");

        // Verifica se o número é primo
        boolean ehPrimo = true;
        if (numero > 1) {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        // Calcula a raiz quadrada e o cubo
        double raizQuadrada = Math.sqrt(numero);
        int cubo = numero * numero * numero;

        // Exibe os resultados
        System.out.println("O número é: " + parOuImpar);
        System.out.println("O número é: " + positivoOuNegativo);
        System.out.println("O número é primo: " + (ehPrimo ? "sim" : "não"));
        System.out.println("A raiz quadrada do número: " + raizQuadrada);
        System.out.println("O número elevado a 3 é: " + cubo);
    }
}