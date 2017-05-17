package VO;

public class LivroVO extends ProdutoVO
{

    private String autor = null;
    private String editora = null;
    private int anoDeEdicao;

    public String getAutor(){
            return this.autor;
    }

    public void setAutor(String autor){
            this.autor = autor;
    }

    public void setEditora(String editora){
            this.editora = editora;
    }

    public String getEditora(){
            return this.editora;
    }

    public void setAnoDeEdicao(int anoDeEdicao){
            this.anoDeEdicao = anoDeEdicao;
    }

    public int getAnoDeEdicao(){
            return this.anoDeEdicao;
    }
    
    private String escreverlinha1()
    {
        return "Livro " + this.getCodigoDoProduto() + "/n";
    }
    
    private String escreverlinha2()
    {
        return this.getAutor() + ". (" + this.getAnoDeEdicao() + "). ";
    }
    
    private String escreverlinha3()
    {
        return this.getTitulo()+ ". " + this.getEditora()+ "./n";
    }
    
    private String escreverReferencia()
    {
        return (this.escreverlinha1() + this.escreverlinha2() + this.escreverlinha3());
    }
    
    @Override
    public String toString()
    {
        return this.escreverReferencia();
    }
}
