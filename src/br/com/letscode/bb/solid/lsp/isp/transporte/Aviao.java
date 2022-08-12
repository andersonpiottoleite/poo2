package br.com.letscode.bb.solid.lsp.isp.transporte;

public class Aviao extends Veiculo implements MeioTransporteAereo{

    private int altura;

    @Override
    public void acelera(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public void decola(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                ", altura=" + altura +
                '}';
    }
}
