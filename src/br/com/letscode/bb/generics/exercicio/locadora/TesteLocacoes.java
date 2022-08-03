package br.com.letscode.bb.generics.exercicio.locadora;

import java.util.ArrayList;
import java.util.List;

public class TesteLocacoes {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.setMarca("FIAT");
        carro1.setNome("Uno");
        carro1.setVelocidadeMaxima(220);

        Carro carro2 = new Carro();
        carro2.setMarca("Chevrolet");
        carro2.setNome("Corsa");
        carro2.setVelocidadeMaxima(220);

        List<Carro> carros = new ArrayList<>(List.of(carro1, carro2));

        GerenciadorLocacoesVeiculos<Carro> gerenciadorLocacoesCarro = new GerenciadorLocacoesVeiculos<>(carros);

        gerenciadorLocacoesCarro.exibirVeiculosDisponiveis();
        gerenciadorLocacoesCarro.alugaVeiculo(carro1);
        gerenciadorLocacoesCarro.exibirVeiculosDisponiveis();
        gerenciadorLocacoesCarro.devolveVeiculo(carro1);
        gerenciadorLocacoesCarro.exibirVeiculosDisponiveis();

        System.out.println("-------------------------------------------");

        Moto moto1 = new Moto();
        moto1.setMarca("Yamaha");
        moto1.setVelocidadeMaxima(300);

        Moto moto2 = new Moto();
        moto2.setMarca("TENERE");
        moto2.setVelocidadeMaxima(290);

        List<Moto> motos = new ArrayList<>(List.of(moto1, moto2));

        GerenciadorLocacoesVeiculos<Moto> gerenciadorLocacoesMotos = new GerenciadorLocacoesVeiculos<>(motos);

        gerenciadorLocacoesMotos.exibirVeiculosDisponiveis();
        gerenciadorLocacoesMotos.alugaVeiculo(moto1);
        gerenciadorLocacoesMotos.exibirVeiculosDisponiveis();
        gerenciadorLocacoesMotos.devolveVeiculo(moto1);
        gerenciadorLocacoesMotos.exibirVeiculosDisponiveis();

        System.out.println("------------------------------------------");

        Bicicleta bicicleta1 = new Bicicleta();
        bicicleta1.setMarca("Caloi");
        bicicleta1.setQuantidadeMarcha(18);

        Bicicleta bicicleta2 = new Bicicleta();
        bicicleta2.setMarca("Top Bike");
        bicicleta2.setQuantidadeMarcha(18);

        List<Bicicleta> bicicletas = new ArrayList<>(List.of(bicicleta1, bicicleta2));

        GerenciadorLocacoesVeiculos<Bicicleta> gerenciadorLocacoesBicicleta = new GerenciadorLocacoesVeiculos<>(bicicletas);
        gerenciadorLocacoesBicicleta.exibirVeiculosDisponiveis();
        gerenciadorLocacoesBicicleta.alugaVeiculo(bicicleta2);
        gerenciadorLocacoesBicicleta.exibirVeiculosDisponiveis();
        gerenciadorLocacoesBicicleta.devolveVeiculo(bicicleta2);
        gerenciadorLocacoesBicicleta.exibirVeiculosDisponiveis();


        /* Não compila pois a secretaria não é subclasse de Veiculo <T extends Veiculo>

        Secretaria secretaria = new Secretaria();
        secretaria.setNome("Patricia");

        List<Secretaria> secretarias = new ArrayList<>(List.of(secretaria));

        GerenciadorLocacoesVeiculos<Secretaria> gerenciadorLocacoesSecretaria = new GerenciadorLocacoesVeiculos<>(secretarias);
        gerenciadorLocacoesSecretaria.alugaVeiculo(secretaria);*/

        /* Não compila pois o veiculo dfoi definido como abstract

        Veiculo veiculo = new Veiculo();

        List<Veiculo> veiculos = new ArrayList<>(List.of(veiculo));

        GerenciadorLocacoesVeiculos<Veiculo> gerenciadorLocacoesVeiculos = new GerenciadorLocacoesVeiculos<>(veiculos);
        gerenciadorLocacoesVeiculos.exibirVeiculosDisponiveis();
        gerenciadorLocacoesVeiculos.alugaVeiculo(veiculo);
        gerenciadorLocacoesVeiculos.devolveVeiculo(veiculo);*/
    }
}
