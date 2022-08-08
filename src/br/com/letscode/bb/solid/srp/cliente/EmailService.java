package br.com.letscode.bb.solid.srp.cliente;

import br.com.letscode.bb.solid.srp.cliente.Cliente;

public class EmailService {

    public void enviaEmail(Cliente cliente){
        System.out.println("Enviando email para :" + cliente.getEmail());
    }
}
