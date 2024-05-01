
public class Abono {

    private String nome;
    private int idade;
    private String sexo;
    private double salarioFix;

    public Abono(String nome, int idade, String sexo, double salarioFix) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salarioFix = salarioFix;
    }

    public double calculoAbono() {
        double abono = 0;
        
        if (idade >= 30 && sexo.equalsIgnoreCase("M")) {
            abono = salarioFix + 100;
        } else if (idade < 30 && sexo.equalsIgnoreCase("M")) {
            abono = salarioFix + 50;
        } else if (idade >= 30 && sexo.equalsIgnoreCase("F")) {
            abono = salarioFix + 200;
        } else if (idade < 30 && sexo.equalsIgnoreCase("F")) {
            abono = salarioFix + 80;
        }

        return abono;
 
    }
    }