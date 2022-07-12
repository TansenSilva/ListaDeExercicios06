package ListaA;

public class Main {
    public static void main(String[] args) {

        Turma turma1 = new Turma("Turma 1",40);

        Professores professor1 = new Professores("Joao","9888999","001","Docente",1500,"Doutorado","Matemática",30,2);
        Professores professor2 = new Professores("Carlos","1852448","002","Docente",1500,"Mestrado","Portugês",28,2);

        Coordenadores cordenador1 = new Coordenadores("José","2344223","005","Cordenador",3000);
        System.out.println("Cordenador 1");
        cordenador1.adicionarProfessor(professor1);
        cordenador1.adicionarProfessor(professor2);
        //mostra o nome dos professores cordenados
        cordenador1.professoresCoordenados();
        //mostra nome da turma do professor
        professor1.adicionarTurma(turma1);
        professor1.turmasProfessores();
        System.out.println();
        //salario do professor antes do  reajuste
        System.out.println("Salário professor sem reajuste: "+professor1.getSalario());
        //salario do professor reajustado
        System.out.println("Salário professor reajustado: "+professor1.aumentoSalario());
        //teste de outro método de reajuste
        professor1.aumento(1500);
        System.out.println();
        //salario do Coordenador antes do  reajuste
        System.out.println("Salário coordenador sem reajuste: "+cordenador1.getSalario());

        //salario do Cordenador reajustado
        System.out.println("Salário coordenador reajustado: "+cordenador1.aumentoSalario());

    }
}
