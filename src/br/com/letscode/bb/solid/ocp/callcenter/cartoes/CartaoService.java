package br.com.letscode.bb.solid.ocp.callcenter.cartoes;

import java.math.BigDecimal;

public class CartaoService {

    public void ajustaLimite(Cartao cartao, BigDecimal novoLimite){
        if (TipoCartoesEnum.OURO.equals(cartao.getTipoCartao())){
            boolean limitePermitido = novoLimite.compareTo(new BigDecimal(5000)) <= 0;

            if (limitePermitido) {
                cartao.setLimite(novoLimite);
            } else {
                throw new LimiteInvalidoEception("Limite excede o permitido para OURO");
            }

        } else if (TipoCartoesEnum.PLATINUM.equals(cartao.getTipoCartao())){
            boolean limitePermitido = novoLimite.compareTo(new BigDecimal(10000)) <= 0;

            if (limitePermitido) {
                cartao.setLimite(novoLimite);
            } else {
                throw new LimiteInvalidoEception("Limite excede o permitido para PLATINUM");
            }

        } else if (TipoCartoesEnum.BLACK.equals(cartao.getTipoCartao())){
            boolean limitePermitido = novoLimite.compareTo(new BigDecimal(15000)) <= 0;

            if (limitePermitido) {
                cartao.setLimite(novoLimite);
            } else {
                throw new LimiteInvalidoEception("Limite excede o permitido para BLACK");
            }

        }
    }
}
