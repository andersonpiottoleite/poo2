package br.com.letscode.bb.solid.ocp.callcenter.cartoes;

import java.math.BigDecimal;

public class Cartao {

    private TipoCartoesEnum tipoCartao;
    private BigDecimal limite;

    public Cartao(TipoCartoesEnum tipoCartao, BigDecimal limite){
        this.tipoCartao = tipoCartao;
        this.limite = limite;
    }

    public TipoCartoesEnum getTipoCartao() {
        return tipoCartao;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "tipoCartao=" + tipoCartao +
                ", limite=" + limite +
                '}';
    }
}
