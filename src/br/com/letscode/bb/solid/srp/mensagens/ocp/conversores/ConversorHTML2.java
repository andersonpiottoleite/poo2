package br.com.letscode.bb.solid.srp.mensagens.ocp.conversores;

import br.com.letscode.bb.solid.srp.mensagens.Mensagem;

public class ConversorHTML2 implements Conversor {
    @Override
    public String converte(Mensagem mensagem) {
        StringBuilder formater = new StringBuilder();

        formater.append("<html>")
                .append("<head>")
                .append("</head>")
                .append("<body>")
                .append("<p>")
                .append(mensagem.getRemetente())
                .append("</p>")
                .append("<p>")
                .append(mensagem.getDestinatario())
                .append("</p>")
                .append("<p>")
                .append(mensagem.getAssunto())
                .append("</p>")
                .append("<p>")
                .append(mensagem.getConteudo())
                .append("</p>")
                .append("</body>")
                .append("</html>");

        return formater.toString();
    }
}
