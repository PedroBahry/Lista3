
public class carangoVelho {

    double valorDesconto;
    double valoraPagar;
    int anoFabricacao;

    public carangoVelho(double valorDesconto, double valoraPagar) {
        this.valorDesconto = valorDesconto;
        this.valoraPagar = valoraPagar;
    }

    public void descontoCalculo() {

        if (anoFabricacao > 2000) {
            valorDesconto = valoraPagar * 0.07;
            valoraPagar = valoraPagar - valorDesconto;
            System.out.println(
                    "O valor do desconto é de R$ " + valorDesconto + " e o valor a pagar é de R$ " + valoraPagar);
        } else if (anoFabricacao <= 2000) {
            valorDesconto = valoraPagar * 0.12;
            valoraPagar = valoraPagar - valorDesconto;
            System.out.println(
                    "O valor do desconto é de R$ " + valorDesconto + " e o valor a pagar é de R$ " + valoraPagar);
        }

    }
}