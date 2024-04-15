import java.util.Scanner;

public class MainMaiorIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Digite o nome do usuário: ");
            String nome = scanner.next();

            System.out.println("Digite a idade do usuário: ");
            int idade = scanner.nextInt();

            maiorIdade usuario = new maiorIdade(nome, idade);
            usuario.idadeCalculo();
        }

        scanner.close();
    }
}
