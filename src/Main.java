import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Turma turma1 = new Turma("Turma 1",40);

        Professores professor1 = new Professores("Joao","9888999","001","Docente",1500,"Doutorado","Matemática",30,2);
        Professores professor2 = new Professores("Carlos","1852448","002","Docente",1500,"Mestrado","Portugês",28,2);

        Coordenadores cordenador1 = new Coordenadores("José","2344223","005","Cordenador",3000);

        cordenador1.adicionarProfessor(professor1);
        cordenador1.adicionarProfessor(professor2);

        cordenador1.professoresCoordenados();

        professor1.adicionarTurma(turma1);

        //salario do professor antes do  reajuste
        System.out.println(professor1.getSalario());

        //salario do professor reajustado
        System.out.println(professor1.aumentoSalario());
        //teste de outro método de reajuste
        professor1.aumento(1500);

    }
}
