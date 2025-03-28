package treatments;

public class Exceptions {
    public static void valorInvalido() throws InterruptedException{
        System.out.println("Valor inválido, tente novamente.");
        Thread.sleep(2000);
    }

}
