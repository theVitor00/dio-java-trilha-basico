import java.util.Scanner;
import java.util.Locale;

public class AboutMe1 {

    public static void main(String[] args) {
        // Criando o Objeto scan
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scan.next();

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        // Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
    }
}
