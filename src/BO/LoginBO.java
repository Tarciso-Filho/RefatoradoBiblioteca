package BO;

import java.sql.SQLException;

import DAO.LoginDAO;
//import VO.UsuarioVO;

public class LoginBO {
	
	public boolean verificaCampoCodigoVazio(String codUsuario){
        return codUsuario != null;
    }
    
    public boolean verificaCampoSenhaVazio(String senhaUsuario){
        return senhaUsuario != null;
    }
    
    public boolean checaSeUsuarioESenhaEstaoNoBanco(String usuario, String senha) throws SQLException {
        LoginDAO loginDAO = new LoginDAO();
        return loginDAO.ChecaUsuarioESenhaDoUsuarioNoBanco(usuario, senha);
    }

}
