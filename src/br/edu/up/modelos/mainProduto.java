import java.util.Scanner;

public class mainProduto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço de custo do produto:");
        double custoProduto = scanner.nextDouble();

        System.out.println("Digite o preço de venda do produto:");
        double valorVenda = scanner.nextDouble();

        Produto produto = new Produto(custoProduto, valorVenda);

        System.out.println("O preço final do produto é: R$" + produto.precoFinal());
        System.out.println("A diferença entre o preço final e o preço de venda é: R$" + produto.diferenca());
    }
}
