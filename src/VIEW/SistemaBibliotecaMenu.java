package VIEW;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;


public class SistemaBibliotecaMenu
{

    private Scanner in;
    private Command proximaTela;
    private ExibirMenuEmprestimoCommand tela1;
    private CadastraAlunoCommand tela2;
    private CadastraLivroCommand tela3;

    public void exibeMenu() throws IOException, SQLException,Exception
    {
        int opcao;
        do
        {
            System.out.println("-------------MENU-------------");
            System.out.println("1 - Emprestimo");
            System.out.println("2 - Cadastrar Aluno");	
            System.out.println("3 - Cadastrar Livro");	
            System.out.println("0 - Logout");	


            in = new Scanner(System.in);
            opcao = in.nextInt();

            switch(opcao)
            {
                case 1:
                        proximaTela = tela1;
                        break;
                case 2:
                        proximaTela = tela2;
                        break;
                case 3:
                        proximaTela = tela3;
                        break;
                case 0:
                        break;
                default:
                        System.out.println("Opção inválida!");

            }
            
            proximaTela.executar();
            
        }while(opcao!=0);
    }
}
