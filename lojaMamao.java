public class lojaMamao {

    private double valorCompra;



    public lojaMamao(double valorCompra) {
    this.valorCompra = valorCompra;
    }


    public double prestacao() {
        return (valorCompra / 5);
    }


}