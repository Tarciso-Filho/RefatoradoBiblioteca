package VIEW;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import BO.AlunoBO;
import BO.LivroBO;
import DAO.AlunoDAO;
import DAO.LivroDAO;
import DAO.ProdutoDAO;
import VO.AlunoVO;
import VO.LivroVO;

public class SistemaBibliotecaMenu {

	private Scanner in;

	public 	void exibeMenu() throws IOException, SQLException{
		int opcao;
		do{
			System.out.println("-------------MENU-------------");
			System.out.println("1 - Emprestimo");
			System.out.println("2 - Cadatrar Aluno");	
			System.out.println("3 - Cadatrar Livro");	
			System.out.println("0 - Logout");	
		
		
			in = new Scanner(System.in);
			opcao = in.nextInt();
		
			switch(opcao){
				case 1:
					exibirMenuEmprestimo();
					break;
				case 2:
					cadastraAluno();
					break;
				case 3:
					cadastraLivro();
					break;
				case 0:
					break;
				default:
					System.out.println("Opção inválida!");
					
			}
		}while(opcao!=0);
	}

	private void cadastraLivro() throws IOException, SQLException {
			String titulo,autor,editora;
			int anoDeEdicao,tipo=1,qtdNaEstante;
			
			System.out.println("-------------Cadastro de Livro-------------");
			System.out.println("Titulo: ");
			titulo = in.next();
			while(!LivroBO.validaString(titulo)){
				System.out.println("Titulo: ");
				titulo = in.next();
			}
			System.out.println("Autor: ");
			autor = in.next();
			while(!LivroBO.validaString(titulo)){
				System.out.println("Autor: ");
				autor = in.next();
			}
			System.out.println("Editora: ");
			editora = in.next();
			while(!LivroBO.validaString(editora)){
				System.out.println("Editora: ");
				editora = in.next();
			}
			System.out.println("Ano de Edição: ");
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

	private void exibirMenuEmprestimo() throws SQLException {
		
		int opcao;
		System.out.println("-------------EMPRESTIMO-------------");
		System.out.println("1 - Livro");
		System.out.println("2 - Revista");	
		System.out.println("3 - Video");
		opcao = in.nextInt();
		switch(opcao){
			case 1:
		        ArrayList <LivroVO> livrosVO = new ArrayList<LivroVO>();
				livrosVO = ProdutoDAO.getDadosDosLivro(1);
				listarLivros(livrosVO);
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				System.out.println("Opção inválida!");
		}
		
	}

	private void listarLivros(ArrayList<LivroVO> livrosVO) {
		System.out.println("----------------Livros----------------");
		for(int i=0;i<livrosVO.size();i++){
			System.out.println("Autor: "+livrosVO.get(i).getAutor());
			System.out.println("Editora: "+livrosVO.get(i).getEditora());
			System.out.println("Ano de edição: "+livrosVO.get(i).getAnoDeEdicao());
			//System.out.println("Titulo: "+livrosVO.get(i).getTitulo());
			//System.out.println("Codigo do produto: "+livrosVO.get(i).getCodigoDoProduto());
			//System.out.println("Quantidade na estante: "+livrosVO.get(i).getQtdNaEstante());
			System.out.println("--------------------------------------");


		}
		
	}

	private void cadastraAluno() throws IOException, SQLException {
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
			System.out.println("CPF INVÁLIDO. DIGITE NOVMENTE\nCpf: ");
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
				System.out.println("Opção iválida!");
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
