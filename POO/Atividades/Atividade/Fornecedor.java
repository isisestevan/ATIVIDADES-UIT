public class Fornecedor extends Pessoa{

    private Double limiteCredito;
    private Double valorDivida;

    /*public Fornecedor(){
        this.limiteCredito=0.0;
        this.valorDivida=0.0;
    }
    public Fornecedor(String nome, String endereço, String telefone, Double limiteCredito) {
        super(nome, endereço, telefone);
        this.limiteCredito = limiteCredito;
        this.valorDivida = 0d;
      }*/
      public Double getLimiteCredito() {
        return limiteCredito;
      }
      public void setLimiteCredito(Double limiteCredito) {
        this.limiteCredito = limiteCredito;
        
      }
      public Double getValorDivida() {
        return valorDivida;
      }
      public void setValorDivida(Double valorDivida) {
        this.valorDivida += valorDivida;
      } 

      public void obterSaldoRestante(){
          System.out.println(limiteCredito-=valorDivida);
      }
    
}
