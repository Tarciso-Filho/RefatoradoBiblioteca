package VO;

public class LivroVO extends ProdutoVO{

	private String autor = null;
	private String editora = null;
	private int anoDeEdicao;
	
	public String getAutor(){
		return this.autor;
	}
	
	public void setAutor(String autor){
		this.autor = autor;
	}
	
	public void setEditora(String editora){
		this.editora = editora;
	}
	
	public String getEditora(){
		return this.editora;
	}
	
	public void setAnoDeEdicao(int anoDeEdicao){
		this.anoDeEdicao = anoDeEdicao;
	}
	
	public int getAnoDeEdicao(){
		return this.anoDeEdicao;
	}
	
}
