package repository;

import models.Atividades;
import java.util.ArrayList;

public class RepositorioAtividades implements interfaces.InterfaceAtividades {
    private ArrayList<Atividades> atividadesList;

    public RepositorioAtividades() {
        this.atividadesList = new ArrayList<>();
    }

    public void addAtividade(Atividades atividade) {
        atividadesList.add(atividade);
    }

    public void removeAtividade(Atividades atividade) {
        atividadesList.remove(atividade);
    }

    public ArrayList<Atividades> getAtividadesList() {
        return atividadesList;
    }

    
    }


