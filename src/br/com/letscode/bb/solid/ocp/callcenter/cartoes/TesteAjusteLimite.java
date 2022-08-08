package br.com.letscode.bb.solid.ocp.callcenter.cartoes;

import java.math.BigDecimal;

public class TesteAjusteLimite {

    public static void main(String[] args) {
        Cartao cartaoOuro = new Cartao(TipoCartoesEnum.OURO, new BigDecimal(2000));

        Cartao cartaoPlatinum = new Cartao(TipoCartoesEnum.PLATINUM, new BigDecimal(3000));

        Cartao cartaoBlack = new Cartao(TipoCartoesEnum.BLACK, new BigDecimal(5000));

        CartaoService cartaoService = new CartaoService();

        cartaoService.ajustaLimite(cartaoOuro, new BigDecimal(5000));
        cartaoService.ajustaLimite(cartaoPlatinum, new BigDecimal(10000));
        cartaoService.ajustaLimite(cartaoBlack, new BigDecimal(15000));

        System.out.println(cartaoOuro);
        System.out.println(cartaoPlatinum);
        System.out.println(cartaoBlack);

    }
}
