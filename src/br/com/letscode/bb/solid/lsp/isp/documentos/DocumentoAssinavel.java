package br.com.letscode.bb.solid.lsp.isp.documentos;

import java.util.List;

public interface DocumentoAssinavel {

    List<String> getAssinaturas();

    void setAssinaturas(List<String> assinaturas);
}
