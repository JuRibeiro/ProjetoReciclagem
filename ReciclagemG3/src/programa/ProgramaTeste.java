package programa;

import classes.Papel;

public class ProgramaTeste 
{
	public static void main(String[] args) 
	{
		Papel papel = new Papel (2, 0.14, 0, "Papel");
				//double peso, double valorMaterial, double creditoUsuario, String nomeMaterial
		
		System.out.println(papel.Reciclagem());
	
	}

}
