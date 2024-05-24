package pilares_da_poo;

import pilares_da_poo.app.Facebook;
import pilares_da_poo.app.MSNMessenger;
import pilares_da_poo.app.ServicoMensagemInstantanea;
import pilares_da_poo.app.Telegram;

public class ComputadorTeste {

    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "tlg";

        if(appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fbm")) {
            smi = new Facebook();
        } else if (appEscolhido.equals("tlg")) {
            smi = new Telegram();
        } else {
            System.out.println("Opção Inválida");
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
