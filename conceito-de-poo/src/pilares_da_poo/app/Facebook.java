package pilares_da_poo.app;

public class Facebook extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        System.out.println("Mensagem enviada pelo Facebook");
    }

    public void receberMensagem() {
        System.out.println("Mensagem recebida pelo Facebook");
    }
}
