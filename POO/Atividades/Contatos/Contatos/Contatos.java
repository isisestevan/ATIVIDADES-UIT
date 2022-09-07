package Contatos;
public class Contatos {

    private String nome;
    private int telefone;
    private String cidade;
    private boolean ativo;
    private int idContato;
    public static int qtdidContato = 0;

    public Contatos(String nome, int telefone, String cidade){
        setNome(nome);
        setTelefone(telefone);
        setCidade(cidade);
        ativar();
        idContato=qtdidContato;
        qtdidContato++;
        
    }

    public int getIdContato() {
        return idContato;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void ativar() {
        ativo = true;
    }

    public void bloquear() {
        ativo = false;
    }

    @Override
    public String toString(){
        return idContato+ " - " + "Nome:"+ nome +"\n"+ " Telefone: " + telefone +"\n"+ "Cidade:" + cidade 
        + "\n"+"Está Ativo ? "+ isAtivo() + "\n";
    }
}
/*
 * Agora, criar uma classe Contato, que deverá ter o nome, o telefone e a cidade
 * da pessoa, id autoincremento e também um booleano ativo. Crie uma classe
 * Testa que possui um arrayList de contatos. Crie um menu para adicionar,
 * remover, listar, listar inativos, ativar contato, bloquear contato, buscar
 * por nome, listar por cidade, limpar agenda. Obs. Listar, listar por cidade e
 * listar por nome só devem exibir os ativos.
 */
