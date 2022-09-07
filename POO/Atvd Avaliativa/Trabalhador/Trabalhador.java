package Trabalhador;
public class Trabalhador{
 private int matricula;
 private String nome;
 private double salario;
public Trabalhador(String nome, int matricula, double salario){
    setNome(nome);
    setMatricula(matricula);
    setSalario(salario);
}

 public int getMatricula() {
    return matricula;
}
public double getSalario() {
    return salario;
}
public void setSalario(double salario) {
    if(salario<1.100){
    this.salario = salario;
    }else{
        System.out.println("Valor não permitido");
    }
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public void setMatricula(int matricula) {
    this.matricula = matricula;
}
}
/*Crie a classe Trabalhador com os atributos matrícula, nome e salário.
Crie uma outra classe com o método main e peça ao usuário para cadastrar
3 trabalhadores. Lembre-se que ninguém pode ganhar menos que um
salário mínimo.*/