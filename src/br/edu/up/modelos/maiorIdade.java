class maiorIdade {
    String nome;
    int idade;

    public maiorIdade(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public boolean idadeCalculo() {
        if (idade >= 18) {
            System.out.println("O usuário " + nome + " é maior de idade");
            return true;
        } else {
            System.out.println("O usuário " + nome + " é menor de idade");
            return false;
        }
    }
}
