public class PlanoOperadora {

    public static void main (String[] args) {

        String plano = "T";

        switch (plano) {
            case "T":
                System.out.println("5Gb YouTube");
                break;
            case "M":
                System.out.println("WhatsApp e Instagram gr�tis");
            case "B":
                System.out.println("100 minutos de liga��o");
            default:
                System.out.println("Plano inexistente");
        }

    }
}
