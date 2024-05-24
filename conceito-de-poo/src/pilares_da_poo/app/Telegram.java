package pilares_da_poo.app;

public class Telegram extends ServicoMensagemInstantanea {

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Mensagem enviada pelo Telegram");
    }

    public void receberMensagem() {
        System.out.println("Mensagem recebida pelo Telegram");
    }
}
