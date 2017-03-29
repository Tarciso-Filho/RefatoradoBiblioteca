package VO;

public class AlunoVO extends PessoaVO{

	private String matricula = null;
	private String curso;
	private int anoDeIngresso;
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public String getMatricula(){
		return this.matricula;
	}
	
	public void setCurso(String curso){
		this.curso = curso;
	}
	
	public String getCurso(){
		return this.curso;
	}
	
	public void setAnoDeIngresso(int anoDeIngresso){
		this.anoDeIngresso = anoDeIngresso;
	}
	
	public int getAnoDeIngresso(){
		return this.anoDeIngresso;
	}
	
}
