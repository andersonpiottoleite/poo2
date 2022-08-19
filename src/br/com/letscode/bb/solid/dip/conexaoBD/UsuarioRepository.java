package br.com.letscode.bb.solid.dip.conexaoBD;

import java.sql.SQLException;

public class UsuarioRepository {


    private ConnectionFactoryDataBase connectionFactoryDataBase;

    // IC inverse of Control
    public UsuarioRepository(ConnectionFactoryDataBase connectionFactoryDataBase){
        this.connectionFactoryDataBase = connectionFactoryDataBase;
    }

    public void save(Usuario usuario) throws SQLException {
        Conexao conexao = connectionFactoryDataBase.getConnection();
        conexao.save(usuario);
    }
}
