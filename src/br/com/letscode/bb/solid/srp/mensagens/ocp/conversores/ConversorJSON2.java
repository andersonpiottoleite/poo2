package br.com.letscode.bb.solid.srp.mensagens.ocp.conversores;

import br.com.letscode.bb.solid.srp.mensagens.Mensagem;

public class ConversorJSON2 implements Conversor {
    @Override
    public String converte(Mensagem mensagem) {
        StringBuilder formater = new StringBuilder();

        formater.append("{")
                .append("\"remetente\":")
                .append("\""+ mensagem.getRemetente()+"\",")
                .append("\"destinatario\":")
                .append("\""+ mensagem.getDestinatario()+"\",")
                .append("\"assunto\":")
                .append("\""+ mensagem.getAssunto()+"\",")
                .append("\"conteudo\":")
                .append("\""+ mensagem.getConteudo()+"\"")
                .append("}");

        return formater.toString();
    }
}
