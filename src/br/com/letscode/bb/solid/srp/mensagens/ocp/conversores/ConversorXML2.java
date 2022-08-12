package br.com.letscode.bb.solid.srp.mensagens.ocp.conversores;

import br.com.letscode.bb.solid.srp.mensagens.Mensagem;

public class ConversorXML2 implements Conversor {
    @Override
    public String converte(Mensagem mensagem) {
        StringBuilder formater = new StringBuilder();

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

        return formater.toString();
    }
}
