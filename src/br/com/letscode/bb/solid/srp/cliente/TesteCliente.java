package br.com.letscode.bb.solid.srp.cliente;

public class TesteCliente {

    public static void main(String[] args) {
        /*Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("Thiago");
        cliente.setDocumento("000.000.000-00");
        cliente.setEmail("thiago@gmail.com");

        cliente.setRua("Rua X");
        cliente.setNumero("200a");
        cliente.setCep("000000-000");
        cliente.setBairro("Bairro X");
        cliente.setCidade("Cidade X");
        cliente.setEstado("Estado X");

        cliente.salvar();
        cliente.alterar();
        cliente.buscarPorId();
        cliente.enviaEmail();

        cliente.deletar();*/

        Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setNome("Thiago");
        cliente.setDocumento("000.000.000-00");
        cliente.setEmail("thiago@gmail.com");

        Endereco endereco = new Endereco();
        endereco.setRua("Rua X");
        endereco.setNumero("200a");
        endereco.setCep("000000-000");
        endereco.setBairro("Bairro X");
        endereco.setCidade("Cidade X");
        endereco.setEstado("Estado X");

        cliente.setEndereco(endereco);

        ClienteRepository clienteRepository = new ClienteRepository();
        clienteRepository.salvar(cliente);
        clienteRepository.alterar(cliente);
        clienteRepository.buscarPorId(cliente.getId());

        EmailService emailService = new EmailService();
        emailService.enviaEmail(cliente);

        clienteRepository.deletarPorId(cliente.getId());
    }
}
