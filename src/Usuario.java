public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        System.err.println("Tv Ligada ?" + smartTv.ligada);
        smartTv.mudarCanal(26);
        System.err.println("Canal Atual : " + smartTv.canal);
        System.err.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.err.println("Novo Status  da Tv Ligada ?" + smartTv.ligada);

        smartTv.desligar();
        System.err.println("Novo Status  da Tv Ligada ?" + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

    }
}
