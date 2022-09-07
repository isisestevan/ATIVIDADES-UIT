package Boleto;

public class Boleto {
    private double vencimento;
    private double valor;
    private double desconto;
    private boolean pago;
    private String nome;

    public Boleto(double vencimento,double valor,double desconto,String nome){
        setVencimento(vencimento);
        setValor(valor);
        setDesconto(desconto);
        pago=false;
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getVencimento() {
        return vencimento;
    }

    public void setVencimento(double vencimento) {
        this.vencimento = vencimento;
    }

    public void pagar(){
      pago=true;
    }

    public double getValLiquido(){
        return valor - desconto;
    }
}
/*Crie a classe Boleto com os atributos vencimento, valor, desconto, um
booleano se está pago e nome do cliente. Crie um construtor para que todos
dados sejam passados no momento da instanciação dos objetos. Crie um
método que retorne o valor líquido do boleto. Crie também um método
pagar que altera o boleto para pago.*/
