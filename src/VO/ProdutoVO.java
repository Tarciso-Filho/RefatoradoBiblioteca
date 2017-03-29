package VO;

public class ProdutoVO {

	private int tipo;      /*1-livro,2-revista,3-video*/
	private String titulo = null;
	private int qtdNaEstante = 0;
	static private int codigoDoProduto = 0;	
	
	public ProdutoVO(){
		ProdutoVO.codigoDoProduto++;
	}
	
	public void setTipo(int tipo){
		this.tipo = tipo;
	}
	
	public int getTipo(){
		return this.tipo;
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public String getTitulo(){
		return this.titulo;
	}
		
	public void setQtdNaEstante(int qtdNaEstante){
		this.qtdNaEstante = qtdNaEstante;
	}
	
	public int getQtdNaEstante(){
		return this.qtdNaEstante;
	}
	
	//public void seCodigoDoProduto(int codigoDoProduto){
	//	this.codigoDoProduto = codigoDoProduto;
	//}
	
	public int getCodigoDoProduto(){
		return ProdutoVO.codigoDoProduto;
	}

}
