package br.com.letscode.bb.solid.ocp.callcenter.cartoes;

public class LimiteInvalidoEception extends RuntimeException{
    public LimiteInvalidoEception (String msg){
        super(msg);
    }
}
