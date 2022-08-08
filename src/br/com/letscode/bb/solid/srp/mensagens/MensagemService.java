package br.com.letscode.bb.solid.srp.mensagens;

public class MensagemService {

    private ValidadorMensagem validadorMensagem;

    private ConversorMensagem conversorMensagem;

    public MensagemService(ValidadorMensagem validadorMensagem, ConversorMensagem conversorMensagem){
        this.validadorMensagem = validadorMensagem;
        this.conversorMensagem = conversorMensagem;
    }
    public MensagemService(){
    }

    public void enviar(Mensagem mensagem){
        if(! validadorMensagem.valida(mensagem)){
            throw new IllegalArgumentException("Mensagem inválida, preencha todos os campos");
        }

        String mensagemConvertida = conversorMensagem.converte(mensagem);

        System.out.println("enviando a mensagem: " + mensagemConvertida);
    }

}
