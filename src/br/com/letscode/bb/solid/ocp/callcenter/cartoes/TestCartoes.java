package br.com.letscode.bb.solid.ocp.callcenter.cartoes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class TestCartoes {

    private Cartao cartaoOuro;
    private CartaoService cartaoService;

    @BeforeEach
    public void antesDeCadaTeste(){
        cartaoService = new CartaoService();
        cartaoOuro = new Cartao(TipoCartoesEnum.OURO, new BigDecimal(2000));
    }

    @Test
    public void cartaoOuroDeveTerLimiteAjustadoCorretamente(){
        cartaoService.ajustaLimite(cartaoOuro, new BigDecimal(4000), new AjustadorLimiteCartaoOuro());

        Assertions.assertEquals(new BigDecimal(4000), cartaoOuro.getLimite());
    }

    @Test
    public void deveLancarExceptionParaCartaoOuroQuandoLimiteSuperiorAoPermitido(){
        Assertions.assertThrows(LimiteInvalidoException.class, () -> {
            cartaoService.ajustaLimite(cartaoOuro, new BigDecimal(6000), new AjustadorLimiteCartaoOuro());
        });
    }

    @Test
    public void deveLancarMensagemCorretaNaExceptionParaCartaoOuroQuandoLimiteSuperiorAoPermitido(){
        LimiteInvalidoException ex = Assertions.assertThrows(LimiteInvalidoException.class, () -> {
            cartaoService.ajustaLimite(cartaoOuro, new BigDecimal(6000), new AjustadorLimiteCartaoOuro());
        });

        Assertions.assertTrue(ex.getMessage().contains("Limite excede o permitido para OURO"));
    }

}
