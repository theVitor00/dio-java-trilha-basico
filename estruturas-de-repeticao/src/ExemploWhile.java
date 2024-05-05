import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    public static void main (String[] args) {

        double mesada = 50.0;
        int docesComprados = 0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada) valorDoce = mesada;

            System.out.println("Valor do Doce: " + valorDoce);
            mesada -= valorDoce;
            docesComprados++;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("João gastou toda a sua mesada em doces");
        System.out.println("Total de doces comprados: " + docesComprados);

    }

    private static double valorAleatorio () {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
