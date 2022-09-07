public class Produto {
    public String nome;
    public int qtdAtual;
    public int qtdMinima;

    Produto(){
       nome= "";
       qtdAtual=0;
       qtdMinima=0;
    } 

    Produto(String nome, int qtdAtual, int qtdMinima){
       
       setNome(nome);
       setQtdAtual(qtdAtual);
       setQtdMinima(qtdMinima);
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }

    public void setQtdAtual(int qtdAtual){
        this.qtdAtual=qtdAtual;
    }
    public int getQtdAtual(){
        return qtdAtual;
    }

    public void setQtdMinima(int qtdMinima){
        this.qtdMinima=qtdMinima;
    }
    public int getQtdMinima(){
        return qtdMinima;
    }

    public void repoe(int qtd){
        qtdAtual+=qtd;
    }

    @Override
    public String toString() {
      return  "Nome: " + nome+ "\n quantidade Atual: " + qtdAtual + "\n quantidade minima: " + qtdMinima;
    }
}
