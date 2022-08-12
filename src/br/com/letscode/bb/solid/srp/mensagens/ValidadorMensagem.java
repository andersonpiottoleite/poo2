package br.com.letscode.bb.solid.srp.mensagens;

import java.util.Objects;

public class ValidadorMensagem {

    public boolean valida(Mensagem mensagem){
        if (Objects.isNull(mensagem.getRemetente()) || mensagem.getRemetente().isEmpty()){
            return false;
        }

        if (Objects.isNull(mensagem.getDestinatario()) || mensagem.getDestinatario().isEmpty()){
            return false;
        }

        if (Objects.isNull(mensagem.getAssunto()) || mensagem.getAssunto().isEmpty()){
            return false;
        }

        if (Objects.isNull(mensagem.getConteudo()) || mensagem.getConteudo().isEmpty()){
            return false;
        }

        /*if (Objects.isNull(mensagem.getFormato()) || mensagem.getFormato().isEmpty()){
            return false;
        }*/

        return true;
    }
}
