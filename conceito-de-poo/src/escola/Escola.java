package escola;

public class Escola {

    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(8);
        felipe.setSexo("M");

        System.out.println("Sexo: " + felipe.getSexo());
        System.out.println("O aluno " + felipe.getNome()  + " tem " + felipe.getIdade() + " anos.");
    }
}
