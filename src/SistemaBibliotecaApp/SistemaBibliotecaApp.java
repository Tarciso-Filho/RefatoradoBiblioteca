package SistemaBibliotecaApp;

//import java.sql.Connection;
//import java.sql.SQLException;
import java.util.Scanner;

import DAO.ConexaoMySQL;
import VIEW.SistemaBibliotecaMenu;

public class SistemaBibliotecaApp {

	private static Scanner ler;

	public static void main(String[] args) throws Exception {
		
		int opcao = 0;
				
		do{
			System.out.println("Escolha uma opção:");
			System.out.println("1 - LOGIN");
			System.out.println("0 - SAIR");
			
			ler = new Scanner(System.in);
			opcao = ler.nextInt();
			
			switch(opcao){
			    case 1:
			    	//Login();
			    	
			    	int opcao2 = -1; 
			       // UsuarioVO usuarioVO = null;
			        SistemaBibliotecaAppLogin login= null;
			        
			        while (opcao2 != 0) {            
			                    
			            switch (opcao2){
			                case -1:
			                    login = (login == null) ? new SistemaBibliotecaAppLogin() : login;
			                    
			                    //usuarioVO = login.EfetuarLogin();
			                    if(login.EfetuarLogin()){
			                    	System.out.println("Login efetuado!");

			                    	SistemaBibliotecaMenu menuBiblioteca = new SistemaBibliotecaMenu();
			                        menuBiblioteca.exibeMenu();
			                    	
			                    }else{
			                    	System.out.println("Erro no login!");
			                    }
			                    
			                    opcao2=0;
			                    break;
			            }
			        }

			    	break;
			    case 0: 
			    	break;
			    default:
			    	System.out.println("Opção inválida!");
			    		break;
			    		
			}

	        ConexaoMySQL.fecharConexao();				
		}while(opcao!=0);

		System.out.println("*****PROGRAMA ENCERRADO******");
	}

}