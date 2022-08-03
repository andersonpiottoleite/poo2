package br.com.letscode.bb.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Classe com a responsabilidade de Testar logicas com Generics
 * @author Anderson Piotto
 * @since 01/08/2022
 * @version 1.0.0
 */
public class TesteGenerics {

    //E - Element (used extensively by the Java Collections Framework)
    //K - Key
    //N - Number
    //T - Type
    //V - Value
   // S,U,V etc. - 2nd, 3rd, 4th types

    public static void main(String[] args) {

        List lista = new ArrayList();
        lista.add("Palavra");
        lista.add(new Integer(10));
        lista.add(new Double(5.5));

        List listaString = new ArrayList();
        listaString.add("fsdf");
        listaString.add("gfdgdf");

        //lerObjetosIndividualmente(lista);
        //lerObjetosIndividualmenteDeManeiraEspecifica(lista);
        //lerObjetosIndividualmenteEmLaco(lista);

        // generics usado em list
        List<String> listaFortementeTipada = new ArrayList<>();
        listaFortementeTipada.add("Palavra 1");
        listaFortementeTipada.add("Palavra 2");

        // generics usado em map
        Map<String, Integer> map = new HashMap<>();
        map.put("chave1", new Integer(10));

        Impressora impressora = new Impressora();
        //impressora.imprime("Carta com selo");

        //Impressora<Integer> impressoraMultiFuncional = new Impressora();
        //impressoraMultiFuncional.imprime(new Integer(10));

        Impressora<Double> impressoraMultiFuncional2 = new Impressora();
        //impressoraMultiFuncional2.imprime(new Double(5.5));
        //Impressora.imprimeDeModoEstatico("Teste estatico");
        //Impressora.imprimeDeModoEstatico(new Double(50.7));
        //Impressora.imprimeDeModoEstatico("Teste", new Double(50.7));

        Calculadora calculadora = new Calculadora();
        Double resultadoSoma = calculadora.soma(1.5, 2.0);
        System.out.println(resultadoSoma);


    }

    /**
     *
     * @param lista - uma List de objects
     */
    private static void lerObjetosIndividualmenteEmLaco(List lista) {
        for (Object objeto : lista) {
            if(objeto instanceof String){
                String palavra = (String) objeto;
                palavra = palavra.replace("a", "*");
                System.out.println(palavra);

            } else  if(objeto instanceof Integer){
                Integer numero = (Integer)objeto;
                System.out.println(numero.intValue());

            } else  if(objeto instanceof Double){
                Double numeroDecimal = (Double)objeto;
                System.out.println(numeroDecimal.doubleValue());
            }

        }
    }

    private static void lerObjetosIndividualmenteDeManeiraEspecifica(List lista) {
        String palavra = (String)lista.get(0);
        palavra = palavra.replace("a", "*");
        System.out.println(palavra);

        Integer numero = (Integer)lista.get(1);
        System.out.println(numero.intValue());

        Double numeroDecimal = (Double)lista.get(2);
        System.out.println(numeroDecimal.doubleValue());
    }

    private static void lerObjetosIndividualmente(List lista) {
        Object objeto1 = lista.get(0);
        System.out.println(objeto1);

        Object objeto2 = lista.get(1);
        System.out.println(objeto2);

        Object objeto3 = lista.get(2);
        System.out.println(objeto3);
    }

    /**  metodo que recebe um double e retorna uma string
     *
     * @param valor - um valor double
     * @return uma String
     */
    public String metodoTeste(double valor){
        return String.valueOf(valor);
    }
}
