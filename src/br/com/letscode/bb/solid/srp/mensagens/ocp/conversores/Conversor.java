package br.com.letscode.bb.solid.srp.mensagens.ocp.conversores;

import br.com.letscode.bb.solid.srp.mensagens.Mensagem;

public interface Conversor {

    String converte(Mensagem mensagem);
}
