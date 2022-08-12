package br.com.letscode.bb.solid.lsp.isp.transporte;

public class Onibus extends Veiculo implements MeioTransporte {

    @Override
    public void acelera(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Onibus{" +
                "modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}
