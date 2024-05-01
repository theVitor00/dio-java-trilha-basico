public class Operadores4 {

    public static void main (String[] args) {
        // Operadores ternários
        int a, b;
        a = 6;
        b = 4;
        System.out.println(a > b ? "True" : "False");
        System.out.println( a / b == 0 ? "True" : "False");

        String c = a % b != 0 ? "True" : "False";
        System.out.println(c);
    }
}
