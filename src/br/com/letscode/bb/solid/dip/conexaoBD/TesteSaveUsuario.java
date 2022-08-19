package br.com.letscode.bb.solid.dip.conexaoBD;

import java.sql.SQLException;

public class TesteSaveUsuario {

    public static void main(String[] args) throws SQLException {

        // DI Dependence Injection
        UsuarioRepository usuarioRepository = new UsuarioRepository(new ConnectionFactoryOracleDataBase());

        Usuario usuario = new Usuario();
        usuario.setUsuario("anderson.piotto");
        usuario.setSenha("benetonn1000");

        usuarioRepository.save(usuario);
    }
}
