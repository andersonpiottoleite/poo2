package br.com.letscode.bb.solid.srp.cliente;

import br.com.letscode.bb.solid.srp.cliente.Cliente;

public class ClienteRepository {

    public void salvar(Cliente cliente){
        System.out.println("Salvando cliente: " + cliente.getNome());
    }

    public void alterar(Cliente cliente){
        System.out.println("Alterando cliente: " + cliente.getNome());
    }

    public void deletarPorId(Long id){
        System.out.println("Deletando cliente por Id: " + id);
    }

    public void buscarPorId(Long id){
        System.out.println("Buscando por ID: " + id);
    }
}
