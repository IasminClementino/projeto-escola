package services;

import java.util.Scanner;
import gui.MenuAluno;
import models.Aluno;

public class DadosdoAluno {
    public static void DadosDoAluno(Aluno aluno, Scanner sc) throws InterruptedException{
        System.out.println("Dados do Aluno");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Email: " + aluno.getEmail());
        System.out.println("Telefone: " + aluno.getTelefone());
        System.out.println("Rua: " + aluno.getRua());
        System.out.println("Bairro: " + aluno.getBairro());
        System.out.println("CPF: " + aluno.getCpf());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("\n Pesione Enter para voltar ao menu.");
        sc.nextLine();
        MenuAluno.menuAluno(aluno, sc);
    }
}
