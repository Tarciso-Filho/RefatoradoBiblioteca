package BO;

public class LivroBO {
    
    Verificador teste = new Verificador();

	public static boolean validaString(String string){
		teste.verificarString(string);
	}
	
	public static boolean validaAnoDeEdicao(int anoDeEdicao){
		if(anoDeEdicao  < 2015){
			return true;
		}else
			System.out.println("Ano de edi��o inv�lido!!");
			return false;
	}
	
	public static boolean validaQuantidadeNaEstatnte(int qtdNaEstatne){
		if(qtdNaEstatne  > 0 ){
			return true;
		}else
			System.out.println("Dado inv�lido(menor que 1)!");
			return false;
	}
	
}
