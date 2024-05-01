public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void avancarCanal() {
        canal++;
    }

    public void retornarCanal() {
        canal--;
    }

    public void canalEspecifico(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}
