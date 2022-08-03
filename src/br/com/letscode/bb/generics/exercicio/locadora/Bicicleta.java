package br.com.letscode.bb.generics.exercicio.locadora;

public class Bicicleta extends Veiculo{

    private String marca;

    private int quantidadeMarcha;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidadeMarcha() {
        return quantidadeMarcha;
    }

    public void setQuantidadeMarcha(int quantidadeMarcha) {
        this.quantidadeMarcha = quantidadeMarcha;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", quantidadeMarcha=" + quantidadeMarcha +
                '}';
    }
}
