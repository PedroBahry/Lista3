public class homemouMulher {
    String nome;
    int genero;

    public homemouMulher(String nome, int genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public boolean generoCalculo() {
        if (genero == 1) {
            System.out.println("O usuário " + nome + " é homem");
            return true;
        } else if (genero == 2) {
            System.out.println("O usuário " + nome + " é mulher");
            return false;
        } else {
            System.out.println("Número incorreto! Digite 1 para homem e 2 para mulher.");
            return false;
        }

    }

}
