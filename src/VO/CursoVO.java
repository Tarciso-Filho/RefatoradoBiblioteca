package VO;

public class CursoVO {
	
	private String nome = null;
	private int codigoDoCurso = 0;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setCodigoDoCurso(int codigoDoCurso){
		this.codigoDoCurso = codigoDoCurso;
	}
	
	public int getCodigoDoCurso(){
		return this.codigoDoCurso;
	}
}
