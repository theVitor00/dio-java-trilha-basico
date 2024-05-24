package pilares_da_poo.app;

public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet() {
        System.out.println("Validadno se est� conectado � internet...");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o hist�rico de mensagens...");
    }

}
