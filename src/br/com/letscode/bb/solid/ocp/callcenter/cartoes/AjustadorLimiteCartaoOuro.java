package br.com.letscode.bb.solid.ocp.callcenter.cartoes;

import java.math.BigDecimal;

public class AjustadorLimiteCartaoOuro implements AjustadorLimiteCartao{
    @Override
    public void ajustaLimite(Cartao cartao, BigDecimal novoLimite) {
        boolean limitePermitido = novoLimite.compareTo(new BigDecimal(5000)) <= 0;

        if (limitePermitido) {
            cartao.setLimite(novoLimite);
        } else {
            throw new LimiteInvalidoException("Limite excede o permitido para OURO");
        }
    }
}
