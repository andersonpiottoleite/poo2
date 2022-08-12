package br.com.letscode.bb.solid.lsp.isp.documentos;

import java.util.List;

public class Documento {

    protected String titulo;
    private String conteudo;

    private List<String> assinaturas;
    private int quantidadeMaximaDigitos;
    private Boolean autenticado;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public int getQuantidadeMaximaDigitos() {
        return quantidadeMaximaDigitos;
    }

    public void setQuantidadeMaximaDigitos(int quantidadeMaximaDigitos) {
        this.quantidadeMaximaDigitos = quantidadeMaximaDigitos;
    }

    public Boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(Boolean autenticado) {
        this.autenticado = autenticado;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", assinaturas=" + assinaturas +
                ", quantidadeMaximaDigitos=" + quantidadeMaximaDigitos +
                ", autenticado=" + autenticado +
                '}';
    }
}
