import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o salário do funcionário: ");
        double salario = scanner.nextDouble();

        System.out.println("Insira o salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(salario, salarioMinimo);
        funcionario.Reajuste();

        double totalReajuste = funcionario.getTotalReajuste();
        double totalSalarios = funcionario.getTotalSalarios();

        System.out.println("Total de reajuste concedido: R$ " + totalReajuste);
        System.out.println("Total de salários pagos (com reajuste): R$ " + totalSalarios);

        scanner.close();
    }
}
