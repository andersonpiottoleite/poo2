package br.com.letscode.bb.solid.srp.mensagens.ocp.conversores;

import br.com.letscode.bb.solid.srp.mensagens.FormatoEnum;
import br.com.letscode.bb.solid.srp.mensagens.Mensagem;

public class ConversorTEXT2 implements Conversor{
    @Override
    public String converte(Mensagem mensagem) {

        /*if (! FormatoEnum.TEXT.name().equals(mensagem.getFormato())){
            throw new
                    IllegalArgumentException("Mensagem com formato inválido para text");
        }*/

        StringBuilder formater = new StringBuilder();

        formater.append(mensagem.getRemetente()+" ")
                .append(" "+ mensagem.getDestinatario()+" ")
                .append(" "+ mensagem.getAssunto()+" ")
                .append(" "+ mensagem.getConteudo()+" ");

        return formater.toString();
    }
}
