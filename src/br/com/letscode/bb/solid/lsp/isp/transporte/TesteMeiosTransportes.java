package br.com.letscode.bb.solid.lsp.isp.transporte;

public class TesteMeiosTransportes {

    public static void main(String[] args) {

        Onibus onibus = new Onibus();
        onibus.setModelo("Onibus de viagem");
        onibus.acelera(60);

        System.out.println(onibus);

        Aviao aviao = new Aviao();
        aviao.setModelo("AIR BUS 747");
        aviao.acelera(250);
        aviao.decola(2500);

        System.out.println(aviao);

        Submarino submarino = new Submarino();
        submarino.setModelo("Tubarao X");
        submarino.acelera(200);
        submarino.mergulha(500);

        System.out.println(submarino);


    }
}
