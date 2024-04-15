import java.util.Scanner;

public class MainVendedor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o total de vendas do vendedor: ");
        int totalVendas = scanner.nextInt();

        Vendedor vendedor = new Vendedor(nome, salarioFixo, totalVendas);

        double salario = vendedor.salarioFinal();
        System.out.println("o vendedor " + nome + " teve o salário final de " + salario + "!!");

        scanner.close();
    }
}