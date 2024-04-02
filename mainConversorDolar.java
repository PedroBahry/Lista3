import java.util.Scanner;

public class mainConversorDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.println("Digite quantos dólares você tem na sua carteira: ");
        double qtdDolar = scanner.nextDouble();

        double valorConvertido = qtdDolar * cotacaoDolar;

        System.out.println("O valor em reais é: R$" + valorConvertido);

        scanner.close();
    }
}
