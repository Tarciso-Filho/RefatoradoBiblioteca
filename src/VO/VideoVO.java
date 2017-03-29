package VO;

public class VideoVO extends ProdutoVO{
    
        private String nome = null;
	private String produtora = null;
        private String tema = null;
	private int classificacao;
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setProdutora(String produtora){
		this.produtora = produtora;
	}
	
	public String getProdutora(){
		return this.produtora;
	}
	
	public void setTema(String tema){
		this.tema = tema;
	}
	
        
        public String getTema(){
	    return this.tema;
	}
        
	public int getClassificacao(){
		return this.classificacao;
	}
        
        public void setClassificacao(int classificacao){
		this.classificacao = classificacao;
	}
	
		
}