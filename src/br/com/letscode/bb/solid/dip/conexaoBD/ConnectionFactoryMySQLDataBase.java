package br.com.letscode.bb.solid.dip.conexaoBD;

import java.sql.SQLException;

public class ConnectionFactoryMySQLDataBase implements ConnectionFactoryDataBase{

    private static final String URL = "jdbc:mySQL:thin:@//meuHost:1521/meuBanco";

    private static final String USUARIO = "adm";

    private static final String SENHA = "senha123";

    @Override
    public Conexao getConnection(){

        System.out.println("[ConnectionFactoryMySQLDataBase]: Obtendo conxexão MYSQL com ".concat(URL)
                .concat(", Usuario: ")
                .concat(USUARIO).concat(", Senha:")
                .concat(SENHA));

        return new Conexao(URL, USUARIO, SENHA);

    }



}
