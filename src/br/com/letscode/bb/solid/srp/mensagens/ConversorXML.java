package br.com.letscode.bb.solid.srp.mensagens;

public class ConversorXML {

    public void converteParaXML(Mensagem mensagem, StringBuilder formater) {
        formater.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>")
                .append("<mensagem>")
                .append("<remetente>")
                .append(mensagem.getRemetente())
                .append("</remetente>")
                .append("<destinatario>")
                .append(mensagem.getDestinatario())
                .append("</destinatario>")
                .append("<assunto>")
                .append(mensagem.getAssunto())
                .append("</assunto>")
                .append("<conteudo>")
                .append(mensagem.getConteudo())
                .append("</conteudo>")
                .append("</mensagem>");
    }
}
