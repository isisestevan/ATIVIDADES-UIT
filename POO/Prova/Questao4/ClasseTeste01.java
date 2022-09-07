package Questao4;

public class ClasseTeste01 {
    private String nome;
    private int idade;

    public void m(String nome,int idade){
        System.out.println("Olá "+nome+",voce tem "+idade+" anos");
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
