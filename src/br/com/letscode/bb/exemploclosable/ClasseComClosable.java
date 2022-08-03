package br.com.letscode.bb.exemploclosable;

import java.io.Closeable;
import java.io.IOException;

public class ClasseComClosable implements Closeable {

    public ClasseComClosable(){
        System.out.println("Criando Objeto");
    }

    public void metodo(){
        System.out.println("Chamando metodo");
    }


    @Override
    public void close() throws IOException {
        System.out.println("Fechando Recurso");
    }
}
