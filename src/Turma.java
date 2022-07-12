public class Turma {
    private String nome;
    private int quantidadeDeAlunos;

    public Turma(String nome, int quantidadeDeAlunos) {
        this.nome = nome;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }
}
