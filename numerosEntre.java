import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        for (int i = 0; i < 80; i++) {
            System.out.println("Digite um número:");
            int numero = scanner.nextInt();
            if (numero >= 10 && numero <= 150) {
                contador++;
            }
        }

        System.out.println("Quantidade de números no intervalo entre 10 e 150: " + contador);

        scanner.close();
    }
}
