

public class Pessoa {
    private int id;
    private String nome;
    private double altura;
    private double peso;
    private double imc;

    Pessoa() {
        id = 0;
        nome = " ";
        altura = 0;
        peso = 0;
    }

    Pessoa(int id, String nome, double altura, double peso) {
        setId(id);
        setNome(nome);
        setAltura(altura);
        setPeso(peso);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public double calculaImc(double altura, double peso) {
        imc = peso / (altura * altura); 
        return imc;
    }

    @Override
    public String toString() {
        return "Pessoa [altura=" + altura + ", id=" + id + ", imc=" + imc + ", nome=" + nome + ", peso=" + peso + "]";
    }

  
  
}
