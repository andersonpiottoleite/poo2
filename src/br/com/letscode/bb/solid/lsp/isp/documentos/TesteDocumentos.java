package br.com.letscode.bb.solid.lsp.isp.documentos;

import java.util.List;

public class TesteDocumentos {

    public static void main(String[] args) {

        ContratoLocacao contratoLocacao = new ContratoLocacao();
        contratoLocacao.setTitulo("Contrato de locacao de imóvel");
        contratoLocacao.setConteudo("conteudo do contrato, clausulas, etc");
        List<String> assinaturasContratoLocacao = List.of("Assinatura Locatario", "Assinatura locador");
        contratoLocacao.setAssinaturas(assinaturasContratoLocacao);
        contratoLocacao.setQuantidadeMaximaDigitos(5000);
        contratoLocacao.setAutenticado(true);

        Documento contaDeLuz = new ContaDeLuz();

        contaDeLuz.setTitulo("Conta de Luz Enel");
        contaDeLuz.setConteudo("conteudo da conta, taxas, etc");
        contaDeLuz.setQuantidadeMaximaDigitos(5000);
        contaDeLuz.setAutenticado(false);

        PastaDocumentos pastaDocumentos = new PastaDocumentos();
        pastaDocumentos.guardaDocumento(contratoLocacao);
        pastaDocumentos.guardaDocumento(contaDeLuz);
        pastaDocumentos.mostraDocumentos();

        Documento contaDeLuz2 = new ContaDeLuz();

        contaDeLuz2.setTitulo("Conta de Luz Enel 2");
        contaDeLuz2.setConteudo("conteudo da conta, taxas, etc");
        contaDeLuz2.setQuantidadeMaximaDigitos(5000);
        contaDeLuz2.setAutenticado(false);

        pastaDocumentos.guardaDocumento(contaDeLuz2);
        pastaDocumentos.mostraDocumentos();
    }
}
