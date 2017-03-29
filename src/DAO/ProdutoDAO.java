package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import VO.LivroVO;

public class ProdutoDAO extends ConexaoMySQL{

	public static ArrayList<LivroVO> getDadosDosLivro(int tipo) throws SQLException {
        
        String sql = "";
        LivroVO livroVO = null;

        sql = "SELECT * FROM LIVRO WHERE TIPO = '"+tipo+"'";
        
        ResultSet rs = executaQueryConsulta(sql);
        ArrayList <LivroVO> livrosVO = new ArrayList<LivroVO>();
        
        while (rs.next()) {
            livroVO = new LivroVO();
            
            livroVO.setAutor(rs.getString("AUTOR"));
            livroVO.setEditora(rs.getString("EDITORA"));
            livroVO.setAnoDeEdicao(rs.getInt("ANODEEDICAO"));
            livrosVO.add(livroVO);
        }
        
        sql = "SELECT * FROM PRODUTO WHERE TIPO = '"+tipo+"'";
        
        //ArrayList <LivroVO> livrosVO = new ArrayList<LivroVO>();
        /*
        while (rs.next()) {
            livroVO = new LivroVO();
            
            livroVO.setTitulo(rs.getString("TITULO"));
            livroVO.seCodigoDoProduto(rs.getInt("CODIGODOPRODUTO"));
            livroVO.setQtdNaEstante(rs.getInt("QTDNAESTANTE"));
            
            livrosVO.add(livroVO);
        }*/
    
        return livrosVO;        
    }

	public static ResultSet executaQueryConsulta(String consulta) throws SQLException {
        
        PreparedStatement stmt = conexao.prepareStatement(consulta);
        ResultSet rs = stmt.executeQuery();
        
        return rs;
    }
	
}
