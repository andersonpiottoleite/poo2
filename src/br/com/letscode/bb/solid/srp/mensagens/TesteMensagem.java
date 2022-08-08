package br.com.letscode.bb.solid.srp.mensagens;

public class TesteMensagem {

    public static void main(String[] args) {
        Mensagem mensagem = new Mensagem();
        mensagem.setAssunto("Assunto da mensagem");
        mensagem.setConteudo("Conteudo da mensagem");
        mensagem.setRemetente("Rementente da mensagem");
        mensagem.setDestinatario("Destinatario da mensagem");
        mensagem.setFormato(FormatoEnum.TEXT.name());
        /*mensagem.enviarMensagem();*/

        ConversorMensagem conversorMensagem = new ConversorMensagem();
        ValidadorMensagem validadorMensagem = new ValidadorMensagem();
        MensagemService mensagemService = new MensagemService(validadorMensagem, conversorMensagem);

        mensagemService.enviar(mensagem);
    }
}
