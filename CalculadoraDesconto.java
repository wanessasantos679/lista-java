import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o valor cheio da compra
        System.out.print("Digite o valor cheio da compra: R$ ");
        double valorCheio = scanner.nextDouble();

        // Lendo o valor do desconto (em porcentagem)
        System.out.print("Digite o valor do desconto (em %): ");
        double percentualDesconto = scanner.nextDouble();

        // Calculando o valor do desconto em reais
        double valorDesconto = valorCheio * (percentualDesconto / 100);

        // Calculando o novo valor da compra
        double novoValor = valorCheio - valorDesconto;

        // Exibindo os resultados
        System.out.println("\nO valor cheio é: R$ " + valorCheio);
        System.out.println("O valor do desconto: R$ " + valorDesconto);
        System.out.println("O novo valor é: R$ " + novoValor);
    }
}