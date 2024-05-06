public class FormatadorCep {

    public static void main (String[] args) {
        try {
            String cepFormatado = formatarCep("23.765-064");
            System.out.println(cepFormatado);
        } catch  (CepInvalidoException e) {
            System.out.println("O CEP informado não está de acordo com as regras de negócio");
            e.printStackTrace();
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) throw new CepInvalidoException();

        //simulando um  cep formatado
        return "23.765-064";
    }
}
