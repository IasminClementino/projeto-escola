package interfaces;

import java.util.ArrayList;
import models.Aluno;

public interface InterfaceAlunos {


    public void addAluno(Aluno aluno);

    public void removeAluno(Aluno aluno);

    public ArrayList<Aluno> getAlunoList() ;

    public Aluno findAlunoByCpf(String Cpf);

    public Aluno findAlunoByMatricula(String matricula);

}
