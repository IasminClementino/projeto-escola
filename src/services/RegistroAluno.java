package services;

import java.util.Scanner;
import gui.MenuAluno;
import models.Aluno;
import treatments.Limpeza;
import repository.RepositorioAlunos;

public class RegistroAluno {
    public static void registro(Scanner sc) throws InterruptedException {
        Limpeza.clear();
        
        System.out.println("Registro de Aluno\n");
        Thread.sleep(1000);

        System.out.println("Insira as informações de registro");

        System.out.println("Digite o seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite o seu email:");
        String email = sc.nextLine();

        System.out.println("Digite a sua senha:");
        String senha = sc.nextLine();

        System.out.println("Digite o seu telefone:");
        String telefone = sc.nextLine();

        System.out.println("Digite a sua rua:");
        String rua = sc.nextLine();

        System.out.println("Digite o seu bairro:");
        String bairro = sc.nextLine();

        System.out.println("Digite o seu CPF:");
        String cpf = sc.nextLine();

        System.out.println("Digite a sua matrícula:");
        String matricula = sc.nextLine();

        Aluno aluno = new Aluno(nome, email, senha, telefone, rua, bairro, cpf, matricula);
        RepositorioAlunos repositorio = new RepositorioAlunos();
        repositorio.addAluno(aluno);

        System.out.println("Registro realizado com sucesso!");
        Thread.sleep(1000);
        MenuAluno.menuAluno(aluno, sc); 
    }

}
