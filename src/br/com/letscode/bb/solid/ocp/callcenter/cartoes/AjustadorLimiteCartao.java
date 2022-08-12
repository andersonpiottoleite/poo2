package br.com.letscode.bb.solid.ocp.callcenter.cartoes;

import java.math.BigDecimal;

public interface AjustadorLimiteCartao {

    void ajustaLimite(Cartao cartao, BigDecimal novoLimite);
}
