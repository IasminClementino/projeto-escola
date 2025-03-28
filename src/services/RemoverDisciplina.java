package services;

import repository.RepositorioDisciplinas;
import models.Disciplinas;
import java.util.Scanner;
import treatments.Exceptions;

public class RemoverDisciplina {
    private RepositorioDisciplinas repositorio;

    public RemoverDisciplina(RepositorioDisciplinas repositorio) {
        this.repositorio = repositorio;
    }

    public void remover(Scanner sc) throws InterruptedException{
        System.out.println("Digite o ID da disciplina que deseja remover: ");

        int idDisciplinaRemover = 0;
        try{
            idDisciplinaRemover = sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            Exceptions.valorInvalido();
            return;
        }

        Disciplinas disciplinaRemover = repositorio.findDisciplinaById(idDisciplinaRemover);
        if (disciplinaRemover != null) {
            repositorio.removeDisciplina(disciplinaRemover);
            System.out.println("Disciplina removida com sucesso!");  
        } else {
            System.out.println("Disciplina não encontrada.");
        }

    }

}
