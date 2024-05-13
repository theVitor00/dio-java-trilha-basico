package lanchonete.atendimento;

public class Atendente {

    public void servindoMesa() {
        pegarLancheCozinha();
        System.out.println("SERVINDO A MESA");
    }

    private void pegarLancheCozinha() {
        System.out.println("PEGANDO LANCHE NA COZINHA");
    }

    public void receberPagamento() {
        System.out.println("RECEBENDO PAGAMENTO");
    }

    void trocarGas() {
        System.out.println("ATENDENTE TROCANDO G�S");
    }

    private void pegarPedidoBalcao() {
        System.out.println("PEGANDO O PEDIDO NO BALC�O");
    }
}
