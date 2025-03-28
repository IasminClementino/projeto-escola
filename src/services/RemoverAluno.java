package services;

import repository.RepositorioAlunos;
import models.Aluno;
import java.util.Scanner;

public class RemoverAluno {
    private RepositorioAlunos repositorio;

    public RemoverAluno(RepositorioAlunos repositorio) {
        this.repositorio = repositorio;
    }

    public void remover(Scanner sc){
        System.out.println("Digite o CPF do aluno que deseja remover: ");
        String cpf = sc.nextLine();

        Aluno aluno = repositorio.findAlunoByCpf(cpf);

        if (aluno != null) {
            repositorio.removeAluno(aluno);
            System.out.println("Aluno removido com Sucesso. ");
            } else {
                System.out.println("Aluno não encontrado. ");
            }
    }
}
