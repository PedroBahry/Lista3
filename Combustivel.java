public class Combustivel {
    
    String nomeVeiculo;
    double totalGasto;
    double distancia;
    

    public Combustivel(String nomeVeiculo, double distancia, double totalGasto) {
        this.nomeVeiculo = nomeVeiculo;
        this.totalGasto = totalGasto;
        this.distancia = distancia;
    }

    public double gastoMedio () {
        return (totalGasto / distancia);
    }
}