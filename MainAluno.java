import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite a nota da primeira prova:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da segunda prova:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota da terceira prova:");
        double nota3 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        double media = aluno.calcularMedia();
        System.out.println("Nome do aluno: " + aluno.nome);
        System.out.println("Média: " + media);

        scanner.close();
    }
}
