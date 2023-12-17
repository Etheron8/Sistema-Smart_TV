public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 14;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {

        volume++;
        System.err.println("Aumentando o volume para: " + volume);
    }

    public void diminuitVolume() {
        volume--;
        System.err.println("Diminuindo o volume para: " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.err.println("voce mudou para o canal :" + canal);
    }

    public void aumentarCanal() {
        canal++;
        System.err.println("voce mudou para o canal :" + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.err.println("voce mudou para o canal :" + canal);
    }
}
