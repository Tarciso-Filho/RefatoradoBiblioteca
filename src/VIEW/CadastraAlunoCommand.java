package VIEW;

import BO.AlunoBO;
import DAO.AlunoDAO;
import VO.AlunoVO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author tarcisofilho
 */
public class CadastraAlunoCommand implements Command
{
    Scanner in = new Scanner(System.in);

    @Override
    public void executar() throws IOException, SQLException
    {
        String nome,cpf,endereco,matricula, curso="";
        int anoDeIngresso,opcao;

        System.out.println("-------------Cadastro de Aluno-------------");
        System.out.println("Nome: ");
        nome = in.next();
        while(!AlunoBO.validaNome(nome)){
                System.out.println("Nome: ");
                nome = in.next();
        }
        System.out.println("Cpf: ");
        cpf = in.next();
        while(!AlunoBO.validaCpf(cpf)){
                System.out.println("CPF INV�LIDO. DIGITE NOVMENTE\nCpf: ");
                cpf = in.next();
        }
        System.out.println("Endereço: ");
        endereco = in.next();
        while(!AlunoBO.validaEnderco(endereco)){
                System.out.println("Endereço: ");
                endereco = in.next();
        }
        System.out.println("Matricula: ");
        matricula = in.next();
        while(!AlunoBO.validaMatricula(matricula)){
                System.out.println("Matricula: ");
                endereco = in.next();
        }
        do{
                System.out.println("Curso: ");
                System.out.println("1-Sistema de informação");
                System.out.println("2-Matemática");
                System.out.println("3-Turismo");
                opcao = in.nextInt();
                switch(opcao){
                case 1:
                        curso = "Sistema de informação";
                        break;
                case 2:
                        curso = "Matemática";
                        break;
                case 3:
                        curso = "Turismo";
                        break;
                default:
                        System.out.println("Opção inválida!");
                        break;
                }
        }while(curso=="");


        System.out.println("Ano de ingresso: ");
        anoDeIngresso = in.nextInt();		
        while(!AlunoBO.validaAnoDeIngresso(anoDeIngresso)){
                System.out.println("Ano de ingresso: ");
                anoDeIngresso = in.nextInt();
        }
        AlunoVO alunoVO = new AlunoVO();
        alunoVO.setNome(nome);
        alunoVO.setCpf(cpf);
        alunoVO.setEndereco(endereco);
        alunoVO.setAnoDeIngresso(anoDeIngresso);
        alunoVO.setMatricula(matricula);
        alunoVO.setCurso(curso);
        AlunoDAO alunoDAO = new AlunoDAO();
        if(alunoDAO.insereNovoAluno(alunoVO))
                System.out.println("Aluno cadastrado!");
    }
    
}
