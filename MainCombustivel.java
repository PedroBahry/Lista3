import java.util.Scanner;

public class MainCombustivel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do veicúlo:");
        String nomeVeiculo = scanner.nextLine();

        System.out.println("Digite a quantia gasta de combustível na viagem em litros:");
        double totalGasto = scanner.nextDouble();

        System.out.println("Digite a quilometragem percorrida na viagem:");
        double distancia = scanner.nextDouble();

            Combustivel combustivel = new Combustivel(nomeVeiculo, distancia, totalGasto);

            double gasto = combustivel.gastoMedio();
            System.out.println("O veiculo " + nomeVeiculo + " teve o gasto médio de " + gasto + " por km/h!!");


        

        scanner.close();
    }
}
