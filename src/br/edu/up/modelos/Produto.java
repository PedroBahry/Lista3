public class Produto {
    double custoProduto;
    double valorVenda;
    double acrescimo;



    public Produto(double custoProduto, double valorVenda) {
        this.custoProduto = custoProduto;
        this.valorVenda = valorVenda;
    }

    public double precoFinal() {
        return (custoProduto + acrescimo);
    }

    public double diferenca() {
        double precoFinal = precoFinal();
        return (precoFinal - valorVenda);
    }
}
