package gui;

import java.util.Scanner;
import services.LoginAluno;
import services.RegistroAluno;
import treatments.Limpeza;

public class MenuLogin {
    public static void menuLogin(Scanner sc) throws InterruptedException{
        Limpeza.clear();

        System.out.println("Bem vindo ao Sistema Escolar\n");
        Thread.sleep(1000);
        System.out.println("Selecione a opção desejada:");
        System.out.println("1 - Login");
    System.out.println("2 - Cadastro");
    System.out.println("3 - menu de administração");
    System.out.println("4 - Sair\n");

    String opcao = sc.nextLine();

    switch(opcao){
        case "1":
            LoginAluno.login(sc);
            break;
        case "2":
            RegistroAluno.registro(sc);
            break;
        case "3":
            MenuAdministracao.administracao(sc);
            break;
        case "4":
            System.out.println("Volte sempre!");
            Thread.sleep(1000); 
            sc.close();
            System.out.println("Saindo do sistema...");
            System.exit(0);
            break;
        default:
            System.out.println("Opção inválida");
            Thread.sleep(1000);
            menuLogin(sc);
            break;
    }
    }
}
