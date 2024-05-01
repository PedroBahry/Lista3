import java.util.Scanner;

public class mainCarango {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        do {

            for (int i = 0; i < 10; i++) {

                System.out.println("Digite o ano de fabricação do carro (Digite 0 para o fim da operação): ");
                int anoFabricacao = scanner.nextInt();

                System.out.println("Digite o valor do carro (Digite 0 para o fim da operação): ");
                double valoraPagar = scanner.nextDouble();

                carangoVelho carro = new carangoVelho(valoraPagar, anoFabricacao);
                carro.descontoCalculo();

                contador++;

                System.out.println("Operação número " + contador);
            }

        } while (scanner.nextInt() != 0);

        scanner.close();
    }

}
