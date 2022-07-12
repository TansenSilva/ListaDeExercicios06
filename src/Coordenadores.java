
import java.util.HashSet;
import java.util.Set;

public class Coordenadores extends Funcionarios{

    private Set<Professores> professoresSupervisionados = new HashSet<>();

    public Coordenadores(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
    }

    public void adicionarProfessor(Professores professor){
        this.professoresSupervisionados.add(professor);
    }

    public void professoresCoordenados() {
        System.out.println("Lista de Professores Coordenados:");
        for(Professores p:professoresSupervisionados){
            System.out.println("Nome do professor supervisionado: " + p.getNome());
        }
    }

    @Override
    public double aumentoSalario() {
        return getSalario()+(getSalario()*0.05);
    }

    @Override
    public void aumento(double salario) {

    }

    public Set<Professores> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(Set<Professores> professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }
}
