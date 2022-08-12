package br.com.letscode.bb.solid.ocp.callcenter.cartoes;

public class LimiteInvalidoException extends RuntimeException{
    public LimiteInvalidoException(String msg){
        super(msg);
    }
}
