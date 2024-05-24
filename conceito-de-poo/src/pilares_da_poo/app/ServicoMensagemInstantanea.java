package pilares_da_poo.app;

public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet() {
        System.out.println("Validadno se está conectado à internet...");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico de mensagens...");
    }

}
