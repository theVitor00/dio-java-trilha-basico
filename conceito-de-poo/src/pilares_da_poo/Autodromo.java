package pilares_da_poo;

public class Autodromo {

    public static void main(String[] args) {

        Carro jeep = new Carro();
        jeep.setChassi("123456");
        jeep.ligar();
        System.out.println("Chassi do carro: " + jeep.getChassi());

        Moto biz = new Moto();
        biz.ligar();
        biz.setChassi("987654321-0");
        System.out.println("Chassi da moto: " + biz.getChassi());

        Veiculo coringa = jeep;
        coringa.ligar();

        Veiculo coringa2 = biz;
        coringa2.ligar();

    }
}
