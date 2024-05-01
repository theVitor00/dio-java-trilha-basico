public class Operadores5 {

    public static void main(String[] args) {
        // Operadores relacionais
        int numero1 = 1;
        int numero2 = 2;

        System.out.printf("Numero 1: %d | Numero 2: %d%n%n", numero1, numero2);

        boolean simNao = numero1 == numero2;
        System.out.println("Numero 1 == Numero 2: " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero 1 != Numero 2: " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero 1 > Numero 2: " + simNao);

        simNao = numero1 < numero2;
        System.out.println("Numero 1 < Numero 2: " + simNao);

        simNao = numero1 >= numero2;
        System.out.println("Numero 1 >= Numero 2: " + simNao);

        simNao = numero1 <= numero2;
        System.out.println("Numero 1 <= Numero 2: " + simNao);

        // Em caso de texto ou objeto, usamos o metodo .equals()
        String nome1 = "Pablo";
        String nome2 = new String("Pablo");

        System.out.println(nome1.equals(nome2));
        System.out.println(nome1 == nome2);
    }
}