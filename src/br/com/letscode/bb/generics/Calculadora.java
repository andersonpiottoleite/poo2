package br.com.letscode.bb.generics;

public class Calculadora implements Somadora<Double, Double>{
    @Override
    public Double soma(Double v1, Double v2) {
        return v1 + v2;
    }
}
