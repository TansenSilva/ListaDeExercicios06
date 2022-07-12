package ListaA;

import java.util.HashSet;
import java.util.Set;

public class Coordenadores extends Funcionarios{

    private Set<Professores> professoresSupervisionados = new HashSet<>();

    public Coordenadores(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
    }

    public void adicionarProfessor(Professores professor){
        if (this.professoresSupervisionados.size()<5){
            this.professoresSupervisionados.add(professor);
        }else{
            System.out.println("Quantidade máxima de professores atingida");
        }


    }




    public int quantidade(){
        System.out.println(professoresSupervisionados.size());
        return professoresSupervisionados.size();
    }

    public void professoresCoordenados() {
        System.out.println("Lista de Professores Coordenados:");
        for(Professores p:professoresSupervisionados){
            System.out.println("Nome do professor supervisionado: " + p.getNome());
        }
    }

    @Override
    public double aumentoSalario() {
        this.setSalario(this.getSalario()+(this.getSalario()*0.05));
        return this.getSalario();
    }

    public Set<Professores> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(Set<Professores> professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }
}
