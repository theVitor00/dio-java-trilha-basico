public class ResultadoEscolar2 {

    public static void main(String[] args) {

        int nota = 10;

        if (nota >= 7) {
            System.out.println("APROVADO");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("RECUPERA��O");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
