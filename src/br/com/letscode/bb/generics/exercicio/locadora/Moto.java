package br.com.letscode.bb.generics.exercicio.locadora;

public class Moto extends Veiculo{

    private String marca;

    private int velocidadeMaxima;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + marca + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }
}
