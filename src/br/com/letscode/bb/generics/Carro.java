package br.com.letscode.bb.generics;

public class Carro implements Comparable<Carro>{

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

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
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
