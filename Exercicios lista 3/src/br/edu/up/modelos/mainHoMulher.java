import java.util.Scanner;

public class mainHoMulher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome da pessoa: ");
            String nome = scanner.next();

            System.out.println("Digite o sexo da pessoa (1 para homens / 2 para mulheres): ");
            int sexo = scanner.nextInt();

            homemouMulher pessoa = new homemouMulher(nome, sexo);
            pessoa.generoCalculo();
        }

        scanner.close();
    }
}
