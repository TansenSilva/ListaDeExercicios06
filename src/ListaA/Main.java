package ListaA;

import java.nio.charset.CoderResult;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Turma turma1 = new Turma("Turma 1",40);

        Professores professor1 = new Professores("Joao","9888999","001","Docente",1500,"Doutorado","Matemática",30,2);
        Professores professor2 = new Professores("Carlos","1852448","002","Docente",1500,"Mestrado","Portugês",28,2);
        Professores professor3 = new Professores("Antonio","1852448","002","Docente",1500,"Mestrado","Portugês",28,2);
        Professores professor4 = new Professores("José","1852448","002","Docente",1500,"Mestrado","Portugês",28,2);
        Professores professor5 = new Professores("Maria","1852448","002","Docente",1500,"Mestrado","Portugês",28,2);
        Professores professor6 = new Professores("Bruno","1852448","002","Docente",1500,"Mestrado","Portugês",28,2);

        Coordenadores cordenador1 = new Coordenadores("José","2344223","005","Cordenador",3000);
        System.out.println("Cordenador 1");
        cordenador1.adicionarProfessor(professor1);
        cordenador1.adicionarProfessor(professor2);
        cordenador1.adicionarProfessor(professor3);
        cordenador1.adicionarProfessor(professor4);
        cordenador1.adicionarProfessor(professor5);
        cordenador1.adicionarProfessor(professor6);

        //mostra o nome dos professores cordenados
        cordenador1.professoresCoordenados();
        //mostra nome da turma do professor
        professor1.adicionarTurma(turma1);
        professor1.turmasProfessores();

        cordenador1.quantidade();

//        System.out.println();
//        //salario do professor antes do  reajuste
//        System.out.println("Salário professor sem reajuste: "+professor1.getSalario());
//        //salario do professor reajustado
//        System.out.println("Salário professor reajustado: "+professor1.aumentoSalario());
//
//
//        System.out.println();
//        //salario do Coordenador antes do  reajuste
//        System.out.println("Salário coordenador sem reajuste: "+cordenador1.getSalario());
//
//        //salario do Cordenador reajustado
//        System.out.println("Salário coordenador reajustado: "+cordenador1.aumentoSalario());

    }
}
