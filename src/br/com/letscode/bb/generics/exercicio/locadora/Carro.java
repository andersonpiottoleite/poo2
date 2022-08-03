package br.com.letscode.bb.generics.exercicio.locadora;

public class Carro extends Veiculo implements Comparable<Carro>{

    private String marca;
    private String nome;
    private int velocidadeMaxima;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", nome='" + nome + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }

    @Override
    public int compareTo(Carro outroCarro) {
        if(this.velocidadeMaxima > outroCarro.getVelocidadeMaxima()){
            return 1;
        } else if(this.velocidadeMaxima < outroCarro.getVelocidadeMaxima()){
            return -1;
        }
        return 0;
    }
}
