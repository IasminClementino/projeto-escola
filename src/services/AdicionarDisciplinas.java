package services;

import gui.MenuAdministracao;
import repository.RepositorioDisciplinas;
import models.Disciplinas;
import treatments.Exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AdicionarDisciplinas {
    private RepositorioDisciplinas repositorio;
    private static int nextId = 1;

    public AdicionarDisciplinas(RepositorioDisciplinas repositorio) {
        this.repositorio = repositorio;
    }

    public void adicionar(Scanner sc) throws InputMismatchException, InterruptedException {
            System.out.println("Digite o nome da disciplina: ");
            String nomeDisciplina = sc.nextLine();
            System.out.println("Digite o nome do professor: ");
            String nomeProfessor = sc.nextLine();
            System.out.println("Digite a descrição da disciplina: ");
            String descricaoDisciplina = sc.nextLine();
                System.out.println("Digite a carga horária da disciplina: ");           
                int cargaHoraria = 0;

            try {
                cargaHoraria = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                Exceptions.valorInvalido();
                Thread.sleep(1000);
                MenuAdministracao.administracao(sc);
                return;
            }

            Disciplinas novaDisciplina = new Disciplinas(nextId++, nomeDisciplina, nomeProfessor, descricaoDisciplina, cargaHoraria);
            repositorio.addDisciplina(novaDisciplina);
            System.out.println("Disciplina adicionada com sucesso!");
    }
}
