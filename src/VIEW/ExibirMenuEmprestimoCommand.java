package VIEW;


import DAO.ProdutoDAO;
import VO.LivroVO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tarcisofilho
 */

public class ExibirMenuEmprestimoCommand implements Command 
{

    @Override
    public void executar() throws SQLException
    {
        int opcao;
        Scanner in = new Scanner(System.in);
	System.out.println("-------------EMPRESTIMO-------------");
	System.out.println("1 - Livro");
	System.out.println("2 - Revista");	
        System.out.println("3 - Video");
        opcao = in.nextInt();
        switch(opcao){
                case 1:
                ArrayList <LivroVO> livrosVO = new ArrayList<LivroVO>();
                livrosVO = ProdutoDAO.getDadosDosLivro(1);
                System.out.println("----------------Livros----------------");
                for(int i=0;i<livrosVO.size();i++)
                {
                    /*System.out.println("Autor: "+livrosVO.get(i).getAutor());
                    System.out.println("Editora: "+livrosVO.get(i).getEditora());
                    System.out.println("Ano de edição: "+livrosVO.get(i).getAnoDeEdicao());
                    System.out.println("Titulo: "+livrosVO.get(i).getTitulo());
                    System.out.println("Codigo do produto: "+livrosVO.get(i).getCodigoDoProduto());
                    System.out.println("Quantidade na estante: "+livrosVO.get(i).getQtdNaEstante());*/
                    System.out.print(livrosVO.toString());
                    System.out.println("Quantidade na estante: "+livrosVO.get(i).getQtdNaEstante());
                    System.out.println("--------------------------------------");
                }
                        break;
                case 2:
                        break;
                case 3:
                        break;
                default:
                        System.out.println("Opção inválida!");
        }
    }
    
}