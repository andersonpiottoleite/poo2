package br.com.letscode.bb.solid.lsp.isp.documentos;

import java.util.ArrayList;
import java.util.List;

public class PastaDocumentos {

    private List<Documento> documentos = new ArrayList<>();

    public void guardaDocumento(Documento documento){

        this.documentos.add(documento);
    }

    public void mostraDocumentos(){
        for (Documento documento:  documentos) {
            System.out.println(documento);
        }
    }
}
