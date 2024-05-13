package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {

    public static void main(String[] args) {

        Cozinheiro cozinheiro = new Cozinheiro();
        // a��es que n�o precisam estar dispon�veis para toda a aplica��o

        /*
        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
        cozinheiro.prepararCombo(); */

        // a��es que o estabelecimento precisa ter ci�ncia
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        //Almoxarife almoxarife = new Almoxarife();
        // a��es que n�o precisam estar dispon�veis para toda a aplica��o
        //almoxarife.controlarEntrada();
        //almoxarife.controlarSaida();
        // a��es que somente o seu pacote cozinha precisa conhecer (default)
        //almoxarife.entregarIngredientes();
        //almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        //atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        // a��o que somente o seu pacote cozinha precisa conhecer (default)
        //atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        // n�o deveria, mas o estabelecimento ainda n�o definiu as normas de atendimento
        //cliente.pegarPedidoBalcao();

        // esta a��o � muito siginlosa e deveria ser privada
        //cliente.consultarSaldoAplicativo();

        // j� pensou os clientes ouvindo que o g�s acabou?
        //cozinheiro.pedirParaTrocarGas(atendente);
        //cozinheiro.pedirParaTrocarGas(almoxarife);
    }
}
