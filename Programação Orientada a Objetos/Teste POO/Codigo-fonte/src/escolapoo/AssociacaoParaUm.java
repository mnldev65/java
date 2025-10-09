package escolapoo;

import java.util.Date;

import escola.Aluno;
import escola.Turma;

public class AssociacaoParaUm {
    public static void main(String[] args) {
        
        Turma turma1 = new Turma();
        turma1.setSigla("1A");
        turma1.setAno(1);
    
        Aluno aluno1=new Aluno();
        aluno1.setNome("jão");
        aluno1.setMatricula(123);
        aluno1.setDataNascimento(new Date());
        aluno1.setTurma(turma1);
    
        Aluno aluno2=new Aluno();
        aluno2.setNome("jose");
        aluno2.setMatricula(999);
        aluno2.setDataNascimento(new Date());
        aluno2.setTurma(turma1);
    
        System.out.println("Dados do aluno 1");
        System.out.println(aluno1.getNome());
        System.out.println(aluno.getNome());
        System.out.println(aluno1.getTurma().getSigla());
    }
}
