import java.util.ArrayList;

public class Loja {
    public Loja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
        produtos=new ArrayList<>();
    }

    public String nomeLoja;
    public ArrayList<Produto> produtos; 

    

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    } 
    public void removeProduto(String nomeProduto) {
        for (Produto p : produtos) {
          if (p.getNome().equalsIgnoreCase(nomeProduto)) {
            produtos.remove(p);
            return;
          }
        }
      }
    //mostra a quantidade de todos os produtos
    public void mostraQuantidadeProdutos() {
        for (Produto p : produtos) {
            System.out.println(p.toString());
        }
    }
    //mostra a quantidade de um produto selecionado
    public void mostraQuantidadeProdutos(String name) {
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(name)) {
                System.out.println(p.toString());
            }
        }

        
    }

    public void mostraProdutosAbaixoDoMinimo() {
        for (Produto p : produtos) {
            if (p.getQtdAtual() < p.qtdMinima) {
               System.out.println( p.toString());
            }
        }
    }

    public void totalProdutos() {
        System.out.println("Total"+produtos.size());

    }
}