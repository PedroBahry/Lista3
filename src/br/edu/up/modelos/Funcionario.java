
    private double salario;
    private double salarioMin;
    private double totalReajuste;
    private double totalSalarios;

    public Funcionario(double salario, double salarioMin) {
        this.salario = salario;
        this.salarioMin = salarioMin;
        this.totalReajuste = 0;
        this.totalSalarios = 0;
    }

    public void Reajuste() {

        double reajuste;

        if (salario < 3 * salarioMin) {
            reajuste = 0.5 * salario;
        } else if (salario >= 3 * salarioMin && salario <= 10 * salarioMin) {
            reajuste = 0.2 * salario;
        } else if (salario > 10 * salarioMin && salario <= 20 * salarioMin) {
            reajuste = 0.15 * salario;
        } else {
            reajuste = 0.1 * salario;
        }

        totalReajuste += reajuste;
        totalSalarios += salario + reajuste;

    }

    public double getTotalReajuste() {
        return totalReajuste;
    }

    public double getTotalSalarios() {
        return totalSalarios;
    }
}
