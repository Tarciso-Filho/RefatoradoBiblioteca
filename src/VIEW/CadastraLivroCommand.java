package VIEW;

import BO.LivroBO;
import DAO.LivroDAO;
import VO.LivroVO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author tarcisofilho
 */
public class CadastraLivroCommand implements Command
{
    Scanner in = new Scanner(System.in);

    @Override
    public void executar() throws IOException, SQLException
    {
        String titulo,autor,editora;
        int anoDeEdicao,tipo=1,qtdNaEstante;

        System.out.println("-------------Cadastro de Livro-------------");
        System.out.println("Titulo: ");
        titulo = in.next();
        while(!LivroBO.validaString(titulo))
        {
                System.out.println("Titulo: ");
                titulo = in.next();
        }
        
        System.out.println("Autor: ");
        autor = in.next();
        while(!LivroBO.validaString(titulo))
        {
                System.out.println("Autor: ");
                autor = in.next();
        }
        
        System.out.println("Editora: ");
        editora = in.next();
        while(!LivroBO.validaString(editora))
        {
                System.out.println("Editora: ");
                editora = in.next();
        }
        
        System.out.println("Ano de Edi��o: ");
        anoDeEdicao = in.nextInt();
        while(!LivroBO.validaAnoDeEdicao(anoDeEdicao)){
                System.out.println("Ano de Edicao: ");
                anoDeEdicao = in.nextInt();
        }System.out.println("Quantidade na estante: ");
        qtdNaEstante = in.nextInt();
        while(!LivroBO.validaQuantidadeNaEstatnte(qtdNaEstante)){
                System.out.println("Quantidade na estante: ");
                qtdNaEstante = in.nextInt();
        }
        LivroVO livroVO = new LivroVO();
        livroVO.setTitulo(titulo);
        livroVO.setAutor(autor);
        livroVO.setEditora(editora);
        livroVO.setAnoDeEdicao(anoDeEdicao);
        livroVO.setQtdNaEstante(qtdNaEstante);
        livroVO.setTipo(tipo);
        LivroDAO livroDAO = new LivroDAO();
        if(livroDAO.insereNovoLivro(livroVO))
                System.out.println("Livro cadastrado!");
    }
    
}
