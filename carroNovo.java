public class carroNovo {
    
    double custoFabrica;
    double impostos;
    double porcDistribuidor;


    
    public carroNovo (double custoFabrica, double impostos, double porcDistribuidor) {
         
        this.custoFabrica = custoFabrica;
        this.impostos = impostos;
        this.porcDistribuidor = porcDistribuidor;

    }



    public double custoConsumidor() {
        return custoFabrica + impostos + porcDistribuidor;
    }
}
