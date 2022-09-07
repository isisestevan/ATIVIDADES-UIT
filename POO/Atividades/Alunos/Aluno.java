public class Aluno {
    private Sexo sexo;
    private String nome;
    private Double nota;

    public Aluno(Sexo sexo,String nome,Double nota){
        setSexo(sexo);
        setNome(nome);
        setNota(nota);
    }

    public void setSexo(Sexo sexo){
        this.sexo=sexo;
    } 

    public Sexo getSexo(){
        return sexo;
    } 

    public void setNome(String nome){
          this.nome=nome;
    } 

    public String getNome(){
        return nome;
    } 

    public void setNota(Double nota){
        this.nota=nota;
    } 

    public Double getNota(){
        return nota;
    } 

    @Override
    public String toString() {
      return  "Nome: " + nome+ "\n sexo: " + sexo.printSexo() + "\n nota: " + nota;
    }
  


}
