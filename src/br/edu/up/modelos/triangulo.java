import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os três lados do triângulo:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (verificarTriangulo(a, b, c)) {
            System.out.println("É um triângulo do tipo " + tipoTriangulo(a, b, c));
        } else {
            System.out.println("Não é um triângulo válido.");
        }
        scanner.close();
    }

    public static boolean verificarTriangulo(int a, int b, int c) {
        return (a < b + c && b < a + c && c < a + b);
    }

    public static String tipoTriangulo(int a, int b, int c) {
        if (a == b && b == c) {
            return "Equilátero";
        } else if (a == b || b == c || a == c) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}
