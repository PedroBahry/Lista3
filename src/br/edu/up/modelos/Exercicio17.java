import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario: ");
        String nomeFunc = scanner.next();

        System.out.println("Insira o salário do funcionário: ");
        double salario = scanner.nextDouble();

        System.out.println("Insira o salário mínimo (R$1300,0): ");
        double salarioMinimo = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(salario, salarioMinimo, nomeFunc);
        funcionario.Reajuste();

        double totalReajuste = funcionario.getTotalReajuste();
        double totalSalarios = funcionario.getTotalSalarios();

        System.out.println("O funcionario " + nomeFunc + " teve o total reajuste de " + totalReajuste);
        System.out.println("E um total salário de R$ " + totalSalarios);

        scanner.close();
    }
}