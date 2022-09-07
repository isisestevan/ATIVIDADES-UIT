package Eleitor;

public class Eleitor {
    private int idade;
    private char sexo;
    private String nome;
    private double titulo;
    
    public Eleitor(String nome, int idade, char sexo, double titulo){
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setTitulo(titulo);
    }
    
    public int getIdade() {
        return idade;
    }
    public double getTitulo() {
        return titulo;
    }
    public void setTitulo(double titulo) {
        this.titulo = titulo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo){
        this.sexo=sexo;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void canIvote(int idade){
        System.out.println("Resultado:\n");
        if(idade>18){
            System.out.println("Voce é obrigado a votar");
        }else
        if(idade<18 && idade>=16){
            System.out.println("Você pode votar, mas não é obrigatório");
        }else{
            System.out.println("Voce não pode votar");
        }
    }
    

    public void showEleitor(){
        System.out.println("Nome:\n"+nome);
        System.out.println("Idade:\n"+idade);
        System.out.println("Sexo:\n"+sexo);
        System.out.println("Numero do titulo:\n"+titulo);
    }
}
/* Crie a classe Eleitor com os atributos idade, sexo, nome e numero do
título. Faça um método que retorne se a pessoa é Obrigada, Desobrigada ou
impedida de votar. Crie outra classe para testar.
*/
