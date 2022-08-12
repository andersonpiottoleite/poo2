package br.com.letscode.bb.solid.srp.mensagens;

import br.com.letscode.bb.solid.srp.mensagens.ocp.conversores.Conversor;

public class ConversorMensagem {

    /*public String converte(Mensagem mensagem){

        StringBuilder formater = new StringBuilder();

        if (FormatoEnum.XML.name().equals(mensagem.getFormato())){
            new ConversorXML().converteParaXML(mensagem, formater);

        } else if (FormatoEnum.JSON.name().equals(mensagem.getFormato())){
            new ConversorJSON().converteParaJSON(mensagem, formater);

        } else if (FormatoEnum.HTML.name().equals(mensagem.getFormato())){
            new ConversorHTML().converteParaHTML(mensagem, formater);

        } else if (FormatoEnum.TEXT.name().equals(mensagem.getFormato())){
            new ConversorText().converteParaText(mensagem, formater);
        }

        return formater.toString();

    }*/

    public String converte(Mensagem mensagem, Conversor conversor){
        return conversor.converte(mensagem);
    }
}
