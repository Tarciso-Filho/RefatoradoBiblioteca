package VO;

public class EmprestimoVO extends ProdutoVO{

	private String dataDeEntrega = null;
	private int codigoDoEmprestimo;
	
	public void setDataDeEntrega(String dataDeEntrega){
		this.dataDeEntrega = dataDeEntrega;
	}
	
	public String getDataDeEntrega(){
		return this.dataDeEntrega;
	}
	
	public void setCodigoDoEmprestimo(int codigoDoEmprestimo){
		this.codigoDoEmprestimo = codigoDoEmprestimo;
	}
	
	public int getCodigoDoEmprestimo(){
		return this.codigoDoEmprestimo;
	}
	
}
