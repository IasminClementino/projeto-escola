package repository;

import models.Aluno;
import java.util.ArrayList;
import interfaces.InterfaceAlunos;

public class RepositorioAlunos implements InterfaceAlunos {
    private ArrayList<Aluno> alunoList;

    public RepositorioAlunos() {
        this.alunoList = new ArrayList<>();
    }

    public void addAluno(Aluno aluno) {
        alunoList.add(aluno);
    }

    public void removeAluno(Aluno aluno) {
        alunoList.remove(aluno);
    }

    public ArrayList<Aluno> getAlunoList() {
        return alunoList;
    }

    public Aluno findAlunoByCpf(String Cpf) {
        for (Aluno aluno : alunoList) {
            if (aluno.getCpf().equals(Cpf)) {
                return aluno;
            }
        }
        return null;
    }
    public Aluno findAlunoByMatricula(String matricula) {
        for (Aluno aluno : alunoList) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }
}
