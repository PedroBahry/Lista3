public class Servico {

    private String nome;
    private int idade;
    private String sexo;
    private String saude;

    public void Perfil(String nome, int idade, String sexo, String saude) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.saude = saude;
    }

    public void analisePerfil() {
        if (idade >= 18 && saude.equals("boa")) {
            System.out.println("O usuário " + nome + " é maior de idade e está saudável");
        } else if (idade >= 18 && saude.equals("ruim")) {
            System.out.println("O usuário " + nome + " é maior de idade e está doente");
        } else if (idade < 18 && saude.equals("boa")) {
            System.out.println("O usuário " + nome + " é menor de idade e está saudável");
        } else {
            System.out.println("O usuário " + nome + " é menor de idade e está doente");
        }
    }
}
