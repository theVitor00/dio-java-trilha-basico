import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {

    public static void main (String[] args) {

        try {
            // Number valor = Double.valueOf("a1.75");
            Number valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            System.out.println("ERRO DETECTADO");
            e.printStackTrace();
        }
    }
}
