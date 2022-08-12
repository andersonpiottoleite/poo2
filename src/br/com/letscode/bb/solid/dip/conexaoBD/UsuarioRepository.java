package br.com.letscode.bb.solid.dip.conexaoBD;

import java.sql.SQLException;

public class UsuarioRepository {


    private ConnectionFactoryOracleDataBase connectionFactoryOracleDataBase;

    public UsuarioRepository(){
        connectionFactoryOracleDataBase = new ConnectionFactoryOracleDataBase();
    }

    public void save(Usuario usuario) throws SQLException {
        Conexao conexao = connectionFactoryOracleDataBase.getConnection();
        conexao.save(usuario);
    }
}
