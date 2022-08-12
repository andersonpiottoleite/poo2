package br.com.letscode.bb.solid.dip.conexaoBD;

import java.sql.SQLException;

public class TesteSaveUsuario {

    public static void main(String[] args) throws SQLException {
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        Usuario usuario = new Usuario();
        usuario.setUsuario("anderson.piotto");
        usuario.setSenha("benetonn1000");
        usuarioRepository.save(usuario);
    }
}
