import java.util.Scanner;

public class mainCarroNovo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do automóvel: ");
        double custoFabrica = scanner.nextDouble();

        System.out.println("Digite os impostos aplicados: ");
        double impostos = scanner.nextDouble();

        System.out.println("Digite a porcentagem do distribuidor: ");
        double porcDistribuidor = scanner.nextDouble();

        carroNovo carroNovo = new carroNovo(custoFabrica, custoFabrica, porcDistribuidor);


        System.out.println("O valor do carro comercial é de R$" + carroNovo.custoConsumidor());
    }

}
