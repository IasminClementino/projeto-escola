package gui;

import java.util.Scanner;
import treatments.Limpeza;
import models.Aluno;
import services.DadosdoAluno;
import services.ListarDisciplinas;
import repository.RepositorioDisciplinas;
import services.VerAtividades;
import repository.RepositorioAtividades;

public class MenuAluno {
    public static void menuAluno(Aluno aluno, Scanner sc) throws InterruptedException {
        Limpeza.clear();

        System.out.println("Bem vindo ao menu do aluno\n");
        System.out.println("1 - ver disciplinas");
        System.out.println("2 - ver atividades");
        System.out.println("3 - ver dados do aluno");
        System.out.println("4 - Retornar ao menu de login");
        System.out.println("5 - Sair");

        String opcao = sc.nextLine();

        Limpeza.clear();

        ListarDisciplinas listarDisciplinas = new ListarDisciplinas(new RepositorioDisciplinas());
        RepositorioAtividades repositorioAtividades = new RepositorioAtividades();
        VerAtividades verAtividades = new VerAtividades(repositorioAtividades);

        switch (opcao){
            case "1":
                listarDisciplinas.listar(sc);
               Thread.sleep(1000);
                menuAluno(aluno, sc);
                break;
            case "2":
                verAtividades.verAtividades(aluno, sc);
                Thread.sleep(1000);
                menuAluno(aluno, sc);
                break;
            case "3":
                DadosdoAluno.DadosDoAluno(aluno, sc);
                break;
            case "4":
                MenuLogin.menuLogin(sc);
                return;
            case "5":
                System.out.println("Saindo do sistema...");
                Thread.sleep(1000);
                sc.close();
                System.exit(0);
                return;
            default:
                System.out.println("Opção inválida");
                Thread.sleep(1000);
                menuAluno(aluno, sc);
                break;
        }
    }

}
