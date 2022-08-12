package br.com.letscode.bb.solid.lsp.isp.transporte;

public class Submarino extends Veiculo implements MeioTranporteSubAquatico{

    private int profundidade;

    @Override
    public void acelera(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public void mergulha(int profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return "Submarino{" +
                "modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                ", profundidade=" + profundidade +
                '}';
    }
}
