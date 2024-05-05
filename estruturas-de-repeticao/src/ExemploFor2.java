public class ExemploFor2 {

    public static void main (String[] args) {

        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        /* FOR CLASSICO

        for (int cont = 0; cont < alunos.length; cont++) {
            System.out.printf("O aluno no indice %d é %s%n", cont, alunos[cont]);
        }
        */

        // forEach
        for (String aluno : alunos) {
            System.out.printf("O nome do aluno é %s.%n", aluno);
        }

        // Teste individual
        int numeros[] = {1, 2, 3, 4, 5, 6};

        for (int numero: numeros) {
            System.out.printf("O dobre de %d é %d%n", numero, numero * 2);
        }
    }
}
