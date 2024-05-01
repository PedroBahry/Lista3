import java.util.Scanner;

public class MainIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[80];

        for (int i = 0; i < 80; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
        scanner.close();

        numerosIntervalo verificador = new numerosIntervalo();
        int numerosNoIntervalo = verificador.contarNumerosNoIntervalo(numeros, 10, 150);

        System.out.println("Quantidade de números no intervalo [10, 150]: " + numerosNoIntervalo);
    }
}
