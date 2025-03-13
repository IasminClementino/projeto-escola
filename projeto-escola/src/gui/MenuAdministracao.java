package gui;

import java.util.Scanner;
import treatments.Limpeza;
import repository.RepositorioDisciplinas;
import repository.RepositorioAlunos;
import services.AdicionarDisciplinas;
import services.RemoverDisciplina;
import services.ListarDisciplinas;
import services.RemoverAluno;
import services.ListarAlunos;

public class MenuAdministracao {
    public static void administracao(Scanner sc) throws InterruptedException{
    Limpeza.clear();
    RepositorioDisciplinas repositorio = new RepositorioDisciplinas();
    AdicionarDisciplinas adicionarDisciplinas = new AdicionarDisciplinas(repositorio);
    RemoverDisciplina removerDisciplina = new RemoverDisciplina(repositorio);
    ListarDisciplinas listarDisciplinas = new ListarDisciplinas(repositorio);
    RepositorioAlunos repositorioAlunos = new RepositorioAlunos();
    RemoverAluno removerAluno = new RemoverAluno(repositorioAlunos);
    ListarAlunos listarAlunos = new ListarAlunos(repositorioAlunos);

    System.out.println("Bem vindo ao menu de administração");
    System.out.println("1 - Adicionar disciplina");
    System.out.println("2 - Remover disciplina");
    System.out.println("3 - Listar disciplinas");
    System.out.println("4 - Remover aluno");
    System.out.println("5 - Listar alunos");
    System.out.println("6 - Retornar ao menu login");
    System.out.println("7 - Sair");

    String opcao = sc.nextLine();

        switch(opcao){
            case "1":
                adicionarDisciplinas.adicionar(sc);
                administracao(sc);
                break;
            case "2":
                removerDisciplina.remover(sc);
                administracao(sc);
                break;
            case "3":
                listarDisciplinas.listar(sc);
                administracao(sc);
                break;
            case "4":
                removerAluno.remover(sc);
                administracao(sc);
                break;
            case "5":
                listarAlunos.listar(sc);
                administracao(sc);
                break;
            case "6":
                MenuLogin.menuLogin(sc);
                break;
            case "7":
                System.out.println("Saindo do sistema...");
                Thread.sleep(2000);
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida");
                Thread.sleep(2000);
                administracao(sc);
                break;
        }
        sc.close();
    }
}
