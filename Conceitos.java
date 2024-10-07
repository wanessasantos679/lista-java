import java.util.Scanner;

public class Conceitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (0 a 100): ");
        double nota = scanner.nextDouble();

        String conceito;

        if (nota > 90) {
            conceito = "A";
        } else if (nota > 80) {
            conceito = "B";
        } else if (nota > 70) {
            conceito = "C";
        } else if (nota > 60) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        System.out.println("O conceito de nota do aluno é: " + conceito);
    }
}