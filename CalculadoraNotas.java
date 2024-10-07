import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        // Lendo as notas dos alunos
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i+1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Encontrando a maior nota
        double maiorNota = notas[0];
        for (double nota : notas) {
            if (nota > maiorNota) {
                maiorNota = nota;
            }
        }

        // Encontrando a menor nota
        double menorNota = notas[0];
        for (double nota : notas) {
            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        // Calculando a média
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;

        // Exibindo os resultados
        System.out.println("\nMaior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Média da turma: " + media);
    }
}