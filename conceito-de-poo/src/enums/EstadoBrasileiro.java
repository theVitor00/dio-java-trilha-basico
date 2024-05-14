package enums;

public enum EstadoBrasileiro {

    SAO_PAULO("SP", "São Paulo", 11),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 21),
    PIAUI("PI","Piauí",64),
    MARANHAO("MA", "Maranhão", 87),
    BAHIA("BA", "Bahia", 77),
    RIO_GRANDE_DO_SUL("RS", "Rio Grande do Sul",98);

    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.nome = nome;
        this.sigla = sigla;
        this.ibge = ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getIbge() {
        return ibge;
    }

    public void setIbge(int ibge) {
        this.ibge = ibge;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
