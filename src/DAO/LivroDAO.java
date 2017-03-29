package DAO;

import java.sql.SQLException;
import com.mysql.jdbc.Statement;

import VO.LivroVO;

public class LivroDAO extends ConexaoMySQL {
	
	public LivroDAO() {
		
	}
	
    public boolean insereNovoLivro(LivroVO livro) throws SQLException{
        
        String sql = "",sql2 = "";        
        sql = "INSERT INTO PRODUTO(TITULO,QTDNAESTANTE,TIPO,CODIGODOPRODUTO) VALUES('"+livro.getTitulo()+"','"+livro.getQtdNaEstante()+"','"+livro.getTipo()+"','"+livro.getCodigoDoProduto()+"')";
        executaQuery(sql);
        sql2 = "INSERT INTO LIVRO(ANODEEDICAO, AUTOR, CODIGO,EDITORA,TIPO) VALUES('"+livro.getAnoDeEdicao()+"','"+livro.getAutor()+"','"+livro.getCodigoDoProduto()+"','"+livro.getEditora()+"','"+livro.getTipo()+"')";
        executaQuery(sql2);
        return true;
    }
	public static boolean executaQuery(String sql){
        
	    Statement stmt = null;

	    try{
	        stmt = (Statement) conexao.createStatement();
	        stmt.executeUpdate(sql);     
	    }
	    catch(Exception e){
	        System.out.println("Erro = "+e.getMessage());
	        return false;
	    }
	    return true;
	    }
	
}
