package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {

    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONADO LANCHE NATURAL DE HAMBÚRGER NO BALCÃO.");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONADO SUCO NO BALCÃO");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche() {
        System.out.println("PREPARAR LANCHE TIPO HAMBÚERGER");
    }

    private void prepararVitamina() {
        System.out.println("PREPARANDO SUCO");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    public void selecionarIngredientesCombo()  {
        System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
    }

    private void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
    }

    private void baterVitaminaLiquidificador() {
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }

    public void fritarIngredientesLanche() {
        System.out.println("FRITANDO A CARNE E O OVO PARA O HAMBÚRGER");
    }

    /*
    public void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }

     */

    private void pedirParaTrocarGas(Almoxarife almoxarife) {
        almoxarife.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}
