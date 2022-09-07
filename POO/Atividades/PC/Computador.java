public class Computador {
    private double tamhd;
    private double tamram;
    private int numprocessadores;
    private String fabricante;
    private boolean liga;

    public Computador(double tamhd,double tamram,int numprocessadores,String fabricante){
        setTamhd(tamhd);
        setTamram(tamram);
        setNumprocessadores(numprocessadores);
        setFabricante(fabricante);
        desligarPc();
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getNumprocessadores() {
        return numprocessadores;
    }

    public void setNumprocessadores(int numprocessadores) {
        this.numprocessadores = numprocessadores;
    }

    public double getTamram() {
        return tamram;
    }

    public void setTamram(double tamram) {
        this.tamram = tamram;
    }

    public double getTamhd() {
        return tamhd;
    }

    public void setTamhd(double tamhd) {
        this.tamhd = tamhd;
    } 

    public void ligarPc(){
        liga= true;
    }

    public void desligarPc(){
        liga= false;
    }

    public boolean estadoComputador(){
        return liga;
    }

    @Override
    public String toString() {
      return "Nome da Fabricante:"+ fabricante +"Tamanho do HD:"+ tamhd +"Tamanho da RAM:"+ tamram +
          "Numero de Processadores:"+numprocessadores+"Está Ligado?"+ estadoComputador() +".";
    }
    
}
/*Crie uma classe Computador que possua os parâmetros tamanho da HD, tamanho da RAM, número de processadores e fabricante. 
Crie métodos de acesso público e reimplemente o método toString() da classe. Crie um construtor para passar todos os atributos 
durante a criação do objeto.

Crie o atributo booleano ligado e um método para ligar e desligar o computador. Todo computador quando for criado deve estar 
desligado. Crie o método estadoComputador que retorna se ele está ligado ou desligado.

Crie uma classe TestaComputador. Crie nesta classe um array de 3 computadores que irá receber os dados do computador pelo usuário. 
Depois imprima os dados dos computadores que possuem mais que 512Mb de Ram usando o método toString.*/