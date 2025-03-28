package interfaces;

import java.util.ArrayList;
import models.Atividades;

public interface InterfaceAtividades {

    public void addAtividade(Atividades atividade) ;

    public void removeAtividade(Atividades atividade);
    
    public ArrayList<Atividades> getAtividadesList();    

}
