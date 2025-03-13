package services;

import repository.RepositorioDisciplinas;
import models.Disciplinas;
import java.util.Scanner;

public class ListarDisciplinas {
    private RepositorioDisciplinas repositorio;

    public ListarDisciplinas(RepositorioDisciplinas repositorio) {
        this.repositorio = repositorio;
    }

    public void listar(Scanner sc) {
        System.out.println("Disciplinas cadastradas: ");
        for (Disciplinas disciplina : repositorio.getDisciplinasList()) {
            System.out.println(disciplina);
        }

        System.out.print("\n Pressione Enter para voltar ao menu.");
        sc.nextLine();
    }

}
