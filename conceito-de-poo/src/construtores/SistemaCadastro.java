package construtores;

public class SistemaCadastro {

    public static void main(String[] args) {

        Pessoa pablo = new Pessoa("065.051.446-91", "Pablo Vitor");
        pablo.setEndereco("RUA DAS ANTAS");

        System.out.println(pablo.getNome() + " " + pablo.getCpf());
        System.out.println(pablo.getEndereco());
    }
}
