package br.com.letscode.bb.solid.srp.mensagens;

public class ConversorText {

    public void converteParaText(Mensagem mensagem, StringBuilder formater) {
        formater.append(mensagem.getRemetente()+" ")
                .append(" "+ mensagem.getDestinatario()+" ")
                .append(" "+ mensagem.getAssunto()+" ")
                .append(" "+ mensagem.getConteudo()+" ");
    }
}
