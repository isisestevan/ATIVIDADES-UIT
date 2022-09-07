package Time;

public class Time {
    private String nome;
    private char serie;
    private int numJogadores;
    
    public Time(String nome, char serie){
        setNome(nome);
        setSerie(serie);
        numJogadores=11;
    }
    
    public String getNome() {
        return nome;
    }
    public int getNumJogadores() {
        return numJogadores;
    }
    
    public char getSerie() {
        return serie;
    }
    public void setSerie(char serie) {
        this.serie = serie;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
/*– Crie a classe Time que possua o nome do time, a série que ele joga e o
número de jogadores. As séries podem ser de A, B, C, D ouE. O números de
jogadores é no máximo 22. Crie um construtor onde seja obrigatório inserir
no momento da criação da instância o nome e a série do time. Faça o teste
em outra classe cadastrando 2 times.*/