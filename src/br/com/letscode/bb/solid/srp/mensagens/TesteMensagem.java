package br.com.letscode.bb.solid.srp.mensagens;

import br.com.letscode.bb.solid.srp.mensagens.ocp.conversores.ConversorHTML2;
import br.com.letscode.bb.solid.srp.mensagens.ocp.conversores.ConversorJSON2;
import br.com.letscode.bb.solid.srp.mensagens.ocp.conversores.ConversorTEXT2;
import br.com.letscode.bb.solid.srp.mensagens.ocp.conversores.ConversorXML2;

public class TesteMensagem {

    public static void main(String[] args) {
        Mensagem mensagem = new Mensagem();
        mensagem.setAssunto("Assunto da mensagem");
        mensagem.setConteudo("Conteudo da mensagem");
        mensagem.setRemetente("Rementente da mensagem");
        mensagem.setDestinatario("Destinatario da mensagem");
        //mensagem.setFormato(FormatoEnum.JSON.name());
        /*mensagem.enviarMensagem();*/

        ConversorMensagem conversorMensagem = new ConversorMensagem();
        ValidadorMensagem validadorMensagem = new ValidadorMensagem();
        MensagemService mensagemService = new MensagemService(validadorMensagem, conversorMensagem);

        mensagemService.enviar(mensagem, new ConversorJSON2());
    }
}
