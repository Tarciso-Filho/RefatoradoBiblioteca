package VIEW;

import DAO.ProdutoDAO;
import VO.LivroVO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author tarcisofilho
 */
public class EmprestimoLivroCommand implements Command
{

    @Override
    public void executar() throws SQLException
    {
        ArrayList <LivroVO> livrosVO = new ArrayList<LivroVO>();
        livrosVO = ProdutoDAO.getDadosDosLivro(1);
        System.out.println("----------------Livros----------------");
        for(int i=0;i<livrosVO.size();i++)
        {
                System.out.println("Autor: "+livrosVO.get(i).getAutor());
                System.out.println("Editora: "+livrosVO.get(i).getEditora());
                System.out.println("Ano de edição: "+livrosVO.get(i).getAnoDeEdicao());
                //System.out.println("Titulo: "+livrosVO.get(i).getTitulo());
                //System.out.println("Codigo do produto: "+livrosVO.get(i).getCodigoDoProduto());
                //System.out.println("Quantidade na estante: "+livrosVO.get(i).getQtdNaEstante());
                System.out.println("--------------------------------------");
        }
        
    }
    
}
