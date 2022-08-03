package br.com.letscode.bb.generics.exercicio.locadora;

import java.util.List;

public class GerenciadorLocacoesVeiculos<T extends Veiculo> {

    private List<T> veiculosDisponiveis;

    public GerenciadorLocacoesVeiculos(List<T> veiculosDisponiveis){
        this.veiculosDisponiveis = veiculosDisponiveis;
    }

    public void exibirVeiculosDisponiveis(){
        System.out.println("Veiculos disponiveis: " + this.veiculosDisponiveis);
    }

    public void alugaVeiculo(T t){
        this.veiculosDisponiveis.remove(t);
        System.out.println("Veiculo alugado: " + t);
    }

    public void devolveVeiculo(T t){
        this.veiculosDisponiveis.add(t);
        System.out.println("Devolvendo veiculo: " + t);
    }
}
