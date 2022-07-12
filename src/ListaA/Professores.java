package ListaA;

import java.util.HashSet;
import java.util.Set;

public class Professores extends Funcionarios {

    private String nivelDeGraduacao;
    private String disciplinaMinistrada;
    private int quantidadeDeAlunos;
    private int quantidadeDeTurmas;

    private Set<Turma> turma = new HashSet<>();


    public Professores(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String disciplinaMinistrada, int quantidadeDeAlunos, int quantidadeDeTurmas) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.nivelDeGraduacao = nivelDeGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }

    @Override
    public double aumentoSalario() {
        this.setSalario(this.getSalario()+(this.getSalario()*0.1));
        return this.getSalario();
    }


    public void adicionarTurma(Turma turma){
        this.turma.add(turma);
    }

    public void turmasProfessores() {
        System.out.println("Lista de Turmas:");
        for(Turma t:turma){
            System.out.println("Turma do professor: " + t.getNome());
        }
    }

    public String getNivelDeGraduacao() {
        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(String nivelDeGraduacao) {
        this.nivelDeGraduacao = nivelDeGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public int getQuantidadeDeTurmas() {
        return quantidadeDeTurmas;
    }

    public void setQuantidadeDeTurmas(int quantidadeDeTurmas) {
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }

}
