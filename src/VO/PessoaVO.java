package VO;

public class PessoaVO {

	private String nome = null;
	private String cpf = null;
	private char sexo;
	private String endereco = null;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public String getCpf(){
		return this.cpf;
	}
	
	public void setSexo(char sexo){
		this.sexo = sexo;
	}
	
	public char getSexo(){
		return this.sexo;
	}
	
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public String getEndereco(){
		return this.endereco;
	}
	
}
