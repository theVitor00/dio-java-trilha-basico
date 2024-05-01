public class Operadores3 {

    public static void main (String[] args) {
        // Incremento
        int numero = 5;
        numero = numero + 2;
        System.out.println(numero);

        numero ++;
        System.out.println(numero);

        numero += 3;
        System.out.println(numero);
        System.out.println(numero++);
        System.out.println(++numero);

        // Negação
        boolean variavel = true;
        System.out.println(variavel); // true
        System.out.println(!variavel); // false
    }
}
