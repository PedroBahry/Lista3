class numerosIntervalo {
    public int contarNumerosNoIntervalo(double[] numeros, double min, double max) {
        int count = 0;
        for (double numero : numeros) {
            if (numero >= min && numero <= max) {
                count++;
            }
        }
        return count;
    }
}