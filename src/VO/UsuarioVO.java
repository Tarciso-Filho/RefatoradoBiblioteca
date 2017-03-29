package VO;

public class UsuarioVO extends PessoaVO{
	
	//private int numeroDeRegistroDoUsuario;
	private String senha = null;
	private String login = null;
    private static String dataUltimoAcesso = null;

	/*static int numeroDeRegistro = 1001;
	
	public UsuarioVO(){
		this.numeroDeRegistroDoUsuario = numeroDeRegistro;
		numeroDeRegistro++;
	}
		
	public int getNumeroDeregistroDoUsuario(){
		return this.numeroDeRegistroDoUsuario;
	}	*/
	
    public static String getDataUltimoAcesso() {
        return dataUltimoAcesso;
    }

    public static void setDataUltimoAcesso(String dataUltimoAcesso) {
        UsuarioVO.dataUltimoAcesso = dataUltimoAcesso;
    }
    
	public void setSenha(String senha){
		this.senha = senha;
	}
	
	public String  getSenha(){
		return this.senha;
	}
	
	
	public void setLogin(String login){
		this.login = login;
	}
	
	public String  getLogin(){
		return this.login;
	}

}