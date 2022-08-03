package br.com.letscode.bb.generics;

public class TesteComObject {

    public static void main(String[] args) {
        Teste teste = new Teste();
        teste.setObjeto("String");
        teste.setObjeto(new Double(10.0));

        Object object = teste.getObject();

        // 1 - não misturar objetos de tipos diferentes
        // 2 - Type SAFETY - Seguranca de tipo

    }

}

class Teste{

    private Object object;
    public void setObjeto(Object object){
        this.object = object;
    }

    public Object getObject() {
        return object;
    }
}

