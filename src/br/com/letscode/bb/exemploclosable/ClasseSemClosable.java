package br.com.letscode.bb.exemploclosable;

import java.io.Closeable;
import java.io.IOException;

public class ClasseSemClosable {

    public ClasseSemClosable(){
        System.out.println("Criando Objeto");
    }

    public void metodo(){
        System.out.println("Chamando metodo");
    }

    public void close() throws IOException {
        System.out.println("Fechando Recurso");
    }
}
