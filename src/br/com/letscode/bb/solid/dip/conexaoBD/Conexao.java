package br.com.letscode.bb.solid.dip.conexaoBD;

public class Conexao {

    private String url;
    private String usuario;
    private String senha;

    public Conexao(String url, String usuario, String senha) {
        this.url = url;
        this.usuario = usuario;
        this.senha = senha;
    }

    public <T> void save(T t){
        System.out.println("Salvando entidade: "+ t);
    }
}
