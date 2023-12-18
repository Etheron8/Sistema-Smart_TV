import java.util.Scanner;
import java.util.Locale;

public class Usuario {
    public static void main(String[] args) {
        // criando objeto Scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.err.println("olá qual é seu nome ?");
        String nome = scanner.next();

        System.err.println("qual sua idade ?");
        int idade = scanner.nextInt();

        System.err.println("qual sua altura ?");
        double altura = scanner.nextDouble();

        System.err.println("Meu Nome é " + nome + " Minha idade é " + idade + " Minha Altura é " + altura);
        /*
         * SmartTv smartTv = new SmartTv();
         * System.err.println("Tv Ligada ?" + smartTv.ligada);
         * smartTv.mudarCanal(26);
         * System.err.println("Canal Atual : " + smartTv.canal);
         * System.err.println("Volume Atual : " + smartTv.volume);
         * 
         * smartTv.ligar();
         * System.err.println("Novo Status  da Tv Ligada ?" + smartTv.ligada);
         * 
         * smartTv.desligar();
         * System.err.println("Novo Status  da Tv Ligada ?" + smartTv.ligada);
         * 
         * smartTv.aumentarVolume();
         * smartTv.aumentarVolume();
         */
    }
}
