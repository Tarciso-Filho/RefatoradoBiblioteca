package DAO;

import java.sql.SQLException;
import com.mysql.jdbc.Statement;
import VO.AlunoVO;

public class AlunoDAO extends ConexaoMySQL {
	
	public AlunoDAO() {
		
	}
	
    public boolean insereNovoAluno(AlunoVO aluno) throws SQLException{
        
        String sql = "",sql2 = "";        
        sql = "INSERT INTO PESSOA(CPF,ENDERECO,NOME) VALUES('"+aluno.getCpf()+"','"+aluno.getEndereco()+"','"+aluno.getNome()+"')";
        executaQuery(sql);
        sql2 = "INSERT INTO ALUNO(MATRICULA, CURSO, ANODEINGRESSO,CPF) VALUES('"+aluno.getMatricula()+"','"+aluno.getCurso()+"','"+aluno.getAnoDeIngresso()+"','"+aluno.getCpf()+"')";
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
/*
	public void alterar(String usuario, String novaSenha) throws SQLException {
		Statement stmt;
		try {
			stmt = this.conexao.createStatement();
			stmt.executeUpdate("UPDATE LOGIN SET senha='"+novaSenha+"' WHERE usuario='"+usuario+"'");
		} catch (SQLException e) {
			throw new SQLException("Erro ao alterar usuário - "+e.getMessage());
		}	
	}

	public int excluir(String nomeUsuario) throws SQLException {
		Statement stmt;
		
		try {
			stmt = this.conexao.createStatement();
			int i = stmt.executeUpdate("DELETE FROM login WHERE usuario='"+nomeUsuario+"'");
			return i;
		} catch(SQLException e) {
			throw new SQLException("Erro ao excluir usuário - "+e.getMessage());
		}
	}

*/
	
}
