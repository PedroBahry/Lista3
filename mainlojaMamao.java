import java.util.Scanner;

public class mainlojaMamao {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();


        lojaMamao lojaMamao = new lojaMamao(valorCompra);

        double valorPrestacao = lojaMamao.prestacao();

        System.out.println("O valor das prestações são: R$" + valorPrestacao);

    }

}
