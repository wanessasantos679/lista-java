import java.util.Scanner;

public class Listajava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a entrada do usuário
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Calcula as informações da palavra
        int tamanho = palavra.length();
        char primeiraLetra = palavra.charAt(0);
        char ultimaLetra = palavra.charAt(tamanho - 1);
        char letraCentral = (tamanho % 2 == 0) ? ' ' : palavra.charAt(tamanho / 2); // letra central (espaço se for par)

        // Inverte a palavra
        String palavraReversa = new StringBuilder(palavra).reverse().toString();
        String palavraMaiuscula = palavra.toUpperCase();
        String palavraMinuscula = palavra.toLowerCase();

        // Exibe os resultados
        System.out.println("A palavra digitada foi: " + palavra);
        System.out.println("A palavra tem " + tamanho + " dígitos.");
        System.out.println("A primeira letra é: " + primeiraLetra);
        if (tamanho % 2 == 0) {
            System.out.println("A palavra tem uma letra central: Não existe (palavra com número par de letras).");
        } else {
            System.out.println("A letra central da palavra é: " + letraCentral);
        }
        System.out.println("A última letra é: " + ultimaLetra);
        System.out.println("A palavra escrita ao contrário é: " + palavraReversa);
        System.out.println("A palavra toda em maiúsculo: " + palavraMaiuscula);
        System.out.println("A palavra toda em minúsculo: " + palavraMinuscula);

        // Fecha o scanner
        scanner.close();
    }
}
