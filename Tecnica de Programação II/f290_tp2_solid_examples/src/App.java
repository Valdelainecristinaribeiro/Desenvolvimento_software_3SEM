import java.util.Arrays;
import java.util.List;

import domain.Aluno;
import domain.Curso;
import domain.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        var curso = new Curso("Desenvolvimento de Sistemas Multiplataforma", 
        Arrays.asList("CI/CD", "TDD", "DDD", "Mobo Development", "UI/UX"));
        var curso2 = new Curso("Gestão Empresarial", 
        Arrays.asList("Logistica", "Administração", "Finanças"));

        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("José");

        List<Aluno> alunos = Arrays.asList(a1, a3);

        Professor professor = new Professor(alunos);
        professor.ensina(curso);

        professor.setAlunos(Arrays.asList(a2));
        professor.ensina(curso2);
    }
}


