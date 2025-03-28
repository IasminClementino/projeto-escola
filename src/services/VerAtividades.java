package services;

import repository.RepositorioAtividades;
import models.Atividades;
import java.util.Scanner;
import models.Aluno;
import gui.MenuAluno;

public class VerAtividades {
    private RepositorioAtividades repositorioAtividades;

    public VerAtividades(RepositorioAtividades repositorioAtividades) {
        this.repositorioAtividades = repositorioAtividades;
    }

    public void verAtividades(Aluno aluno, Scanner sc) throws InterruptedException {
        System.out.println("Atividades Disponíveis");
        for (Atividades atividade : repositorioAtividades.getAtividadesList()) {
            System.out.println("Nome: " + atividade.getNome());
            System.out.println("Descrição: " + atividade.getDescricao());
            System.out.println("Data de Entrega: " + atividade.getDataEntrega());
            System.out.println("Nota: " + atividade.getNota());
            System.out.println("\n");
        }
        System.out.println("\n Presione Enter para voltar ao menu.");
        sc.nextLine();
        MenuAluno.menuAluno(aluno, sc);
    }

}
