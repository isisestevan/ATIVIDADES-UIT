import java.util.ArrayList;

public class Sala {
    private String nomeSala;
    private int id;
    private ArrayList<Aluno> alunos;
    private static int count = 1;

    public Sala(String nomeSala) {
        setNomeSala(nomeSala);
        this.alunos = new ArrayList<>();
        setId(count);
        count++;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public String getNomeSala() {
        return nomeSala;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void excluirAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    Aluno melhorAluno = alunos.get(0);
    Double maiorNota = melhorAluno.getNota();
    Double notaAluno = aluno.getNota();

    public Aluno melhorAluno() {
        if (alunos.isEmpty()) {
            System.out.println("Não contem alunos");
            ;
        }

        for (Aluno aluno : alunos) {
            if (notaAluno > maiorNota) {
                melhorAluno = aluno;
            }
        }

        return melhorAluno;
    }

    public int qtdAlunos() {
        return alunos.size();
      }

    public String showSala() {
        return "\nCodigo Sala: " + id + ", nome: " + nomeSala+"Quantidade alunos:"+qtdAlunos();
      }

    public String showAlunos() {
        for (Aluno a : alunos) {
            a.toString();
        }
    }
}
