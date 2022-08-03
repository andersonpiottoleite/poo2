package br.com.letscode.bb.generics;

import br.com.letscode.bb.generics.exercicio.locadora.Carro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TesteGenericsComoCriterioInterface {

    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();

        Carro carro1 = new Carro();
        carro1.setNome("Fusca");
        carro1.setVelocidadeMaxima(112);

        Carro carro2 = new Carro();
        carro2.setNome("Porche");
        carro2.setVelocidadeMaxima(300);

        Carro carro3 = new Carro();
        carro3.setNome("Palio");
        carro3.setVelocidadeMaxima(220);

        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);

        for (Carro carro : carros) {
            System.out.println(carro);
        }
        System.out.println("--------------------------");
        Collections.sort(carros);

        for (Carro carro : carros) {
            System.out.println(carro);
        }

        Calculadora calculadora = new Calculadora();

        int resultadoComparacao = recebeAlgoQueImplementeComparable(carro1, carro2);
        System.out.println(resultadoComparacao);


        List objects = new ArrayList();
        objects.add(new Object());

        recebeCarroOuPai(carros);
        recebeCarroOuPai(objects);

        Carrinho carrinho = new Carrinho();
        List<Carrinho> carrinhos = new ArrayList<>();
        // recebeCarroOuPai(carrinhos); não compila. não é pai de carro

        recebeFilhoCarro(carrinho);
        recebeFilhoCarro(carro1);

        soCarro(carro1);
        soCarro(carrinho);
    }

    public static <T extends Comparable> int recebeAlgoQueImplementeComparable(T t, T outro){
        return t.compareTo(outro);
    }

    public static int recebeCarroOuPai(Collection<? super Carro> paisDeCarro){
        return 0;
    }

    public static <T extends Carro> void recebeFilhoCarro(T t){

    }

    public static void soCarro(Carro carro){

    }


}
