public class conversorDolar {

     double cotacaoDolar;
     double qtdDolar;


     public conversorDolar(double cotacaoDolar, double qtdDolar) {
        this.cotacaoDolar  = cotacaoDolar;
        this.qtdDolar = qtdDolar;
     }


     public double real() {
        return (qtdDolar * cotacaoDolar);
     }
}
