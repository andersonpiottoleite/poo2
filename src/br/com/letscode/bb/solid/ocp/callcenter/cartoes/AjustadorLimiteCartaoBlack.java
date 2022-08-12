package br.com.letscode.bb.solid.ocp.callcenter.cartoes;

import java.math.BigDecimal;

public class AjustadorLimiteCartaoBlack implements AjustadorLimiteCartao{
    @Override
    public void ajustaLimite(Cartao cartao, BigDecimal novoLimite) {
        boolean limitePermitido = novoLimite.compareTo(new BigDecimal(15000)) <= 0;

        if (limitePermitido) {
            cartao.setLimite(novoLimite);
        } else {
            throw new LimiteInvalidoException("Limite excede o permitido para BLACK");
        }
    }
}
