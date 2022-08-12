package br.com.letscode.bb.solid.lsp.isp.documentos;

import java.util.ArrayList;
import java.util.List;

public class ContratoLocacao extends Documento implements DocumentoAssinavel{

    private static int countContratoLocacao;
    private List<String> assinaturas = new ArrayList<>();

    public ContratoLocacao(){
        super();
        countContratoLocacao++;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = "Contrato de Locacao N°"
                .concat(String.valueOf(countContratoLocacao))
                .concat(" ")
                .concat(titulo);
    }

    @Override
    public List<String> getAssinaturas() {
        return this.assinaturas;
    }

    @Override
    public void setAssinaturas(List<String> assinaturas) {
        this.assinaturas = assinaturas;
    }
}
