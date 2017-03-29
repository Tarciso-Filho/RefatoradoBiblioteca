package SistemaBibliotecaApp;

import java.sql.SQLException;
import java.util.Scanner;
import BO.LoginBO;


public class SistemaBibliotecaAppLogin {
	
	private String senha = null;
	private String usuario = null;
	private Scanner in;
    
    public boolean EfetuarLogin() throws SQLException{
        in = new Scanner (System.in);
        
        System.out.print("Usuario: ");
        usuario = in.next();
        System.out.print("Senha: ");
        senha = in.next();
            
       LoginBO loginBO = new LoginBO();
        if(!loginBO.verificaCampoCodigoVazio(usuario)){
            System.out.println("Informe o usuário!!");
        }else{
            if (!loginBO.verificaCampoSenhaVazio(senha)) {
                System.out.println("Informe a Senha!!");
            }else{
                boolean result = loginBO.checaSeUsuarioESenhaEstaoNoBanco(usuario, senha);
                return result;
            }
        }
        return false;
    }  
        
}