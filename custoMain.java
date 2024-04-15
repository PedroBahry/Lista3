import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do carro:");
        double custoFabrica = scanner.nextDouble();

        double percentualDistribuidor = 0.28;
        double impostos = 0.45;

        double custoConsumidor = custoFabrica + (custoFabrica * impostos) + ((custoFabrica + (custoFabrica * impostos)) * percentualDistribuidor);

        System.out.println("O custo ao consumidor é: R$" + custoConsumidor);

        scanner.close();
    }
}