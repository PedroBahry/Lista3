import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nomeAluno = scanner.nextLine();

        System.out.println("Digite as três notas do aluno:");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média do aluno " + nomeAluno + ": " + media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media <= 5) {
            System.out.println("Reprovado!");
        } else {
            System.out.println("Recuperação!");
        }

        scanner.close();
    }
}
