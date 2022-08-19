package br.com.letscode.bb.solid.dip.conexaoBD;

import java.sql.SQLException;

public interface ConnectionFactoryDataBase {
    Conexao getConnection() throws SQLException;
}
