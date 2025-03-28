import java.util.Scanner;

import gui.MenuLogin;
import treatments.Limpeza;


public class Main {
    public static void main (String[] args) throws InterruptedException{
        System.out.println("Bem vindo ao Sistema escolar");
        System.out.println("By Maria Iasmin Clementino da Silva");
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);
        Limpeza.clear();
        MenuLogin.menuLogin(scanner);
        scanner.close();
    }
}
