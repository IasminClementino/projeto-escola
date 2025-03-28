package interfaces;

import java.util.ArrayList;
import models.Disciplinas;

public interface InterfaceDisciplinas {

    public void addDisciplina(Disciplinas disciplina);

    public void removeDisciplina(Disciplinas disciplina);

    public ArrayList<Disciplinas> getDisciplinasList();

    public Disciplinas findDisciplinaByName(String nome);

    public Disciplinas findDisciplinaById(int id);

}
