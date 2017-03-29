package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import SistemaBibliotecaApp.SistemaBibliotecaAppMySQL;
import VO.UsuarioVO;

public class LoginDAO extends SistemaBibliotecaAppMySQL{
	    
	    UsuarioVO usuarioVO = null;
	    
	    public LoginDAO() throws SQLException {
	    }
	   
	    public UsuarioVO getDadosDoUsuarioByNomeDoUsuario(String nomeUsuario) throws SQLException {
	        String sql = "";
	        UsuarioVO usuarioVO = null;
	        
	        sql = "SELECT * FROM USUARIO WHERE USUARIO = '" +nomeUsuario+ "' LIMIT 20";
	        
	        ResultSet rs = executaQueryConsulta(sql);
	        
	        if (rs.next()) {
	            usuarioVO = new UsuarioVO();
	            //usuarioVO.setCodigo(rs.getInt("CODIGO"));
	            usuarioVO.setCpf(rs.getString("CPF"));
	            usuarioVO.setNome(rs.getString("NOME"));
	            
	            return usuarioVO;
	        }else    
	            return usuarioVO;
	    }
	    

        public boolean ChecaUsuarioESenhaDoUsuarioNoBanco(String usuario, String senha) throws SQLException{
	        
	        String sql = "";
	        //sql = "SELECT * FROM usuario WHERE usuario = '"+usuario+"' and SENHA = md8 ("+senha+") LIMIT 1";
	        sql = "SELECT * FROM usuario WHERE usuario ='"+usuario+"' and SENHA ='"+senha+"'";
	        
	        ResultSet rs = executaQueryConsulta(sql);
	        
	        if (rs.next()) {
    	            return true;
	        }else
	            return false;
        }
	
}
