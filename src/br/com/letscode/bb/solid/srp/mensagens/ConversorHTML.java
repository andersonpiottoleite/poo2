package br.com.letscode.bb.solid.srp.mensagens;

public class ConversorHTML {

    public void converteParaHTML(Mensagem mensagem, StringBuilder formater) {
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
    }
}
