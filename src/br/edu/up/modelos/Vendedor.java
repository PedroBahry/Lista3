public class Vendedor {

    String nome;
    double salarioFixo;
    int totalVendas;

    public Vendedor(String nome, double salarioFixo, int totalVendas) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.totalVendas = totalVendas;
    }

    public double salarioFinal() {
        return (salarioFixo + (totalVendas * 0.15));
    }
}