package br.com.letscode.bb.solid.lsp.isp;

public class TestePolimorfismo {

    public static void main(String[] args) {

        // em tempo de compilação é respeitado o tipo da variavel
        // em tempo de execução olhar para a classe depois do new

        ClasseA a = new ClasseA();
        ClasseA b = new ClasseB();

        System.out.println(a.getValor());
        System.out.println(b.getValor());

    }
}
