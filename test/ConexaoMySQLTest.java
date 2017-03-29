import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import DAO.ConexaoMySQL;
import DAO.IConexao;

public class ConexaoMySQLTest {

	@Test
	public void testNaoDeveriaConectarSeDadosInformadosIncorretamente() throws Exception {
		IConexao biblioteca = new ConexaoMySQL();
		Connection conexao = null;
		try {
			conexao = biblioteca.desconectar();
			conexao = biblioteca.getConexao("jdbc:mysql","localhost","bibliotecass","usuario","senha");
		}catch(SQLException e) {
			assertNull(conexao);
			//throw new SQLException(e.getMessage());
		}
	}
	
	@Test
	public void	testDeveriaConectarSeDadosInformadosCorretamente() throws	SQLException {
		IConexao biblioteca = new ConexaoMySQL();
		Connection conexao = null;
		try {
			conexao = biblioteca.getConexao("jdbc:mysql","localhost","biblioteca","usuario","senha");
		}catch(SQLException e) {
			assertNull(conexao);
			throw new SQLException(e.getMessage());
		}
	}
	
}
