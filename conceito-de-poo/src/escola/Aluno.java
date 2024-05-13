package escola;

public class Aluno {

    private String nome;
    private int idade;
    private String sexo;

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public void setIdade(int newIdade) {
        this.idade = newIdade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }
}
