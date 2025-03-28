package services;

import gui.MenuLogin;
import treatments.Limpeza;
import repository.RepositorioAlunos;
import models.Aluno;
import java.util.Scanner;
import gui.MenuAluno;

public class LoginAluno {
        public static void login(Scanner sc) throws InterruptedException {
            Limpeza.clear();
            System.out.println("Login do Aluno\n");
            Thread.sleep(1000);

            System.out.println("Insira as informações de login");

            System.out.println("Digite o seu email:");
            String email = sc.nextLine();

            System.out.println("Digite a sua senha:");
            String senha = sc.nextLine();

            RepositorioAlunos repositorio = new RepositorioAlunos();
            boolean loginSuccessful = false;
            for (Aluno aluno : repositorio.getAlunoList()) {
                if (aluno.getEmail().equals(email) && aluno.getSenha().equals(senha)) {
                System.out.println("Login realizado com sucesso!");
                loginSuccessful = true;
                MenuAluno.menuAluno(aluno, sc);
                break;
                }
            }
            if (!loginSuccessful) {
                System.out.println("Email ou senha incorretos. Tente novamente.");
                MenuLogin.menuLogin(sc);
            }
        }
}
