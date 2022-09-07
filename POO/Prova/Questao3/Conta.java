package Questao3;

public class Conta {
    private String titular;
    private int numero;
    private double saldo;
    
    public Conta(String titular,int numero,double saldo){
        setTitular(titular);
        setNumero(numero);
        setSaldo(saldo);
    }
    
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void showConta(){
        System.out.println("Ola,"+titular);
        System.out.println("\nSeu saldo é:"+saldo);
    }
}
