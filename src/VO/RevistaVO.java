package VO;

public class RevistaVO extends ProdutoVO{
    
        private String nome = null;
	private String  editora= null;
	private int edicao;
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setEditora(String editora){
		this.editora = editora;
	}
	
	public String getEditora(){
		return this.editora;
	}
	
	public void setEdicao(int edicao){
		this.edicao = edicao;
	}
	
	public int getEdicao(){
		return this.edicao;
	}
	
}