package pilares_da_poo;

public class Carro extends Veiculo {

    public void ligar() {
        confereCombustivel();
        confereCambioEmP();
        System.out.println("CARRO LIGADO");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo Combust�vel");
    }

    private void confereCambioEmP() {
        System.out.println("Conferindo cambio em P");
    }
}
