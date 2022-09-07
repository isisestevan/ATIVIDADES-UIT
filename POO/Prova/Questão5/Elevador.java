package Questão5;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int qtdPessoas;

    public Elevador(int capacidade, int totalAndares) {
        andarAtual = 0;
        qtdPessoas = 0;
        setTotalAndares(totalAndares);
        setCapacidade(capacidade);

    }

    public int getCapacidade() {
        return capacidade;
    }

    private void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    private void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares - 1;
    }

    public int getqtdPessoas() {
        return qtdPessoas;
    }

    public void setqtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void entra() {
        if (qtdPessoas + 1 <= capacidade) {
            qtdPessoas++;
        }
    }
    public void entra(int qtdpessoa) {
        if (qtdPessoas + 1 <= capacidade) {
            qtdPessoas+=qtdpessoa;
        }
    }

    public void sai() {
        if (qtdPessoas > 0) {
            qtdPessoas--;
        }
    }
    public void sai(int qtdpessoa) {
        if (qtdPessoas > 0) {
            qtdPessoas-=qtdpessoa;
        }
    }

    public void sobe() {
        if (qtdPessoas > 0) {
            if (andarAtual < totalAndares) {
                andarAtual++;
            } else {
                System.out.println("Você já chegou ao ultimo andar");
            }
        }
    }
    public void sobe(int andar) {
        if (qtdPessoas > 0) {
            if (andarAtual < totalAndares) {
                andarAtual+=andar;
            } else {
                System.out.println("Você já chegou ao ultimo andar");
            }
        }
    }

    public void desce() {
        if (qtdPessoas > 0) {
            if (andarAtual > 0) {
                andarAtual--;
            } else {
                System.out.println("O andar já se encontra no terreo");
            }
        }
    }
    public void desce(int andar) {
        if (qtdPessoas > 0) {
            if (andarAtual > 0) {
                andarAtual-=andar;
            } else {
                System.out.println("O andar já se encontra no terreo");
            }
        }
    }

    @Override
    public String toString() {
        return "Elevador [andarAtual=" + andarAtual + ", qtdPessoas=" + qtdPessoas + "]";
    }

}
/*- Crie uma classe denominada Elevador para armazenar as informações de um
elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares
no prédio, excluindo o térreo, capacidade do elevador, e quantas pessoas estão presentes nele. A
classe deve também disponibilizar os seguintes métodos:
Inicializa(Construtor): que deve receber como parâmetros a capacidade do elevador e o total de
andares no prédio (os elevadores sempre começam no térreo e vazio);
Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
Sobe: para subir um andar (não deve subir se já estiver no último andar);
Desce: para descer um andar (não deve descer se já estiver no térreo);
Encapsular todos os atributos da classe (criar os métodos set e get).*/
