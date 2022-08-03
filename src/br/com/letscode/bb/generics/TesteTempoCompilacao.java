package br.com.letscode.bb.generics;

import java.util.ArrayList;
import java.util.List;

public class TesteTempoCompilacao {
    public static void main(String[] args) {
        List<String> objetos = new ArrayList<>();
        objetos.add("Objeto 1");
        objetos.add("Objeto 2");

        /*for (String o : objetos) {
            System.out.println(o);
        }*/

        List<String> objetos2 = new ArrayList<>();

        demostracaoTempoCompilacao(objetos, objetos2);
    }

    public static void demostracaoTempoCompilacao(List lista, List<String> lista2){

        for (Object o : lista) {
            String s = (String) o;
            System.out.println(s);
        }

        //lista.add(new Integer(10));

        for (Object o : lista) {
            String s = (String) o;
            System.out.println(s);
        }
    }
}
