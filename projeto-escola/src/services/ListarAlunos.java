package services;

import repository.RepositorioAlunos;

import java.util.Scanner;

public class ListarAlunos {
    private RepositorioAlunos repositorio;

    public ListarAlunos(RepositorioAlunos repositorio) {
        this.repositorio = repositorio;
    }

    public void listar(Scanner sc) throws InterruptedException{
        System.out.println("Lista de Alunos\n");
        Thread.sleep(1000);
        repositorio.getAlunoList().forEach(aluno ->{
            System.out.println("Nome:" + aluno.getNome());
            System.out.println("Email:" + aluno.getEmail());
            System.out.println("Telefone:" + aluno.getTelefone());
            System.out.println("Rua:" + aluno.getRua());
            System.out.println("Bairro:" + aluno.getBairro());
            System.out.println("CPF:" + aluno.getCpf());
            System.out.println("Matricula:" + aluno.getMatricula());
            System.out.println("-----------------------------------");
        });
        System.out.print("\n Pressione Enter para voltar ao menu.");
        sc.nextLine();
    }

}
