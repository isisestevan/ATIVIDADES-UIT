package Mochila;

public class Mochila {
    private String nome;
    private int qtdItensAtual;
    private int qtdMax;
    private double pesoAtual;
    private double pesoMax;

    public Mochila(String nome,int qtdMax,double pesoMax){

    }
    public String getNome() {
        return nome;
    }
    public double getPesoMax() {
        return pesoMax;
    }
    public void setPesoMax(double pesoMax) {
        this.pesoMax = pesoMax;
    }
    public double getPesoAtual() {
        return pesoAtual;
    }
    public void setPesoAtual(double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }
    public int getQtdMax() {
        return qtdMax;
    }
    public void setQtdMax(int qtdMax) {
        this.qtdMax = qtdMax;
    }
    public int getQtdItensAtual() {
        return qtdItensAtual;
    }
    public void setQtdItensAtual(int qtdItensAtual) {
        this.qtdItensAtual = qtdItensAtual;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void insereItem(double peso){
        if((pesoAtual+peso)<pesoMax && (qtdItensAtual+1)<qtdMax){
        qtdItensAtual++;
        }else{
            System.out.println("Mochila não suporta");
        }
    }

    public void showMochila(){
        System.out.println("Quantidade de itens:\n"+qtdItensAtual);
        System.out.println("Peso atual:\n"+pesoAtual);
    }
    
}
/*Crie a classe mochila que possui os atributos nome,
quantidadeItensAtual, quantidadeItensMaxima, pesoAtual, pesoMaximo.
Criar um construtor onde é necessário passar o nome da mochila e o peso e
quantidade de itens que ela suporta. Deverá existir um método inserir itens
onde é passado o peso do item que está sendo inserido. Também deverá ter
um método que retorna a situação da atual da mochila. Criar uma classe de
teste e testar tentando inserir vários itens na mochila.*/
