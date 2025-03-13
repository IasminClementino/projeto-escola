package repository;

import models.Disciplinas;
import java.util.ArrayList;

public class RepositorioDisciplinas implements interfaces.InterfaceDisciplinas {
    private ArrayList<Disciplinas> disciplinasList;

    public RepositorioDisciplinas() {
        this.disciplinasList = new ArrayList<>();
    }

    public void addDisciplina(Disciplinas disciplina) {
        disciplinasList.add(disciplina);
    }

    public void removeDisciplina(Disciplinas disciplina) {
        disciplinasList.remove(disciplina);
    }

    public ArrayList<Disciplinas> getDisciplinasList() {
        return disciplinasList;
    }

    public Disciplinas findDisciplinaByName(String nome) {
        for (Disciplinas disciplina : disciplinasList) {
            if (disciplina.getNome().equals(nome)) {
                return disciplina;
            }
        }
        return null;
    }

    public Disciplinas findDisciplinaById(int id) {
        for (Disciplinas disciplina : disciplinasList) {
            if (disciplina.getId() == id) {
                return disciplina;
            }
        }
        return null;
    }

    

}
