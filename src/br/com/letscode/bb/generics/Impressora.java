package br.com.letscode.bb.generics;

public class Impressora <T>  {
    public <T> void imprime(T t){
        System.out.println(t);
    }

    public static <T> void imprimeDeModoEstatico(T t){
        System.out.println(t);
    }

    public static <T, K> void imprimeDeModoEstatico(T t, K k){
        System.out.println(t + " - " + k);
    }
}
