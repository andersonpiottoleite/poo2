package br.com.letscode.bb.solid.srp.mensagens;

public class ConversorJSON {

    public void converteParaJSON(Mensagem mensagem, StringBuilder formater) {
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
    }
}
