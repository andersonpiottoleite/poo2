package br.com.letscode.bb.solid.dip.conexaoBD;

import java.sql.SQLException;

public class ConnectionFactoryOracleDataBase {

    private static final String URL = "jdbc:oracle:thin:@//meuHost:1521/meuBanco";

    private static final String USUARIO = "adm";

    private static final String SENHA = "senha123";

    public Conexao getConnection() throws SQLException {

        System.out.println("Obtendo conxexão ORACLE com ".concat(URL)
                .concat(", Usuario: ")
                .concat(USUARIO).concat(", Senha:")
                .concat(SENHA));

        return new Conexao(URL, USUARIO, SENHA);

    }
}
