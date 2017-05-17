package BO;

public class Verificador implements Strategy
{
    public Verificador()
    {}
    
    @Override
    public boolean verificarString(String str)
    {
        if(str == "")
        {
            System.out.println("O campo não pode ficar em branco!");
        }
        
        return str.equals("");
			
    }
    
}
