package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class UsuarioDAO {

	Connection conexao;

	UsuarioDAO(Connection conexao) {
		this.conexao = conexao;
	}

	public ArrayList<String> validarLogin(String usuario, String senha) throws SQLException {
		ResultSet rs = null;
		ArrayList<String> usuarioSenha = new ArrayList<String>();
		
		try {
			PreparedStatement pstm = (PreparedStatement) this.conexao.prepareStatement("select usuario, senha from login where usuario ='"+usuario+"'");
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				usuarioSenha.add(rs.getString("usuario"));
				usuarioSenha.add(rs.getString("senha"));
			}
			
			return usuarioSenha;
			
		}catch(SQLException e) {
			throw new SQLException("Erro ao validar login "+e.getMessage());
		}
	}
	
	
	
}
