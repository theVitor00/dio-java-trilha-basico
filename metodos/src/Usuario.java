public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Alterando status");

        smartTv.ligar();
        System.out.println("LIGAR -> TV ligada: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("DESLIGAR -> TV ligada: " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println(("AUMENTANDO VOLUME -> 2 vezes: " + smartTv.volume));

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("DIMINUINDO O VOLUME -> 5 vezes: " + smartTv.volume);

        smartTv.avancarCanal();
        System.out.println("AVAÇAR CANAL -> 1 vez: " + smartTv.canal);

        smartTv.retornarCanal();
        System.out.println("RETORNAR CANAL -> 1 vez: " + smartTv.canal);

        smartTv.canalEspecifico(11);
        System.out.println("CANAL ESPECÍFICO: " + smartTv.canal);

        smartTv.retornarCanal();
        smartTv.retornarCanal();
        smartTv.retornarCanal();
        smartTv.retornarCanal();
        smartTv.retornarCanal();
        System.out.println("Canal atual: " + smartTv.canal);

    }
}
