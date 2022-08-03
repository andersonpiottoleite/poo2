package br.com.letscode.bb.comparacao.heranca.interf;

public interface Interface2 {

    void testeInterface2();

    default void testeInterfaceDefault(){
        System.out.println("TESTE");
    }
}
