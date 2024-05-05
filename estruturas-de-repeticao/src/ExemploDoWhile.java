import java.util.Random;

public class ExemploDoWhile {

    public static void main (String[] args) {
        int toques = 1;
        System.out.println("Discando...\n");

        do {
            System.out.printf("Telefone tocando %d%n", toques);
            toques++;
        } while (tocando());

        System.out.println("Alô!!!");
        System.out.printf("Atendeu depois de %d toques.", toques - 1);
    }

    private static boolean tocando () {

        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu: " + atendeu);
        return !atendeu;
    }
}
