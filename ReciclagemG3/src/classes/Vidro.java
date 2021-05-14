package classes;

public class Vidro extends Materiais
{

	//metodo
	@Override
	public double Reciclagem ()
	{
		super.setValorMaterial(0.05); //por kg 
		
		super.setCreditoUsuario(super.getValorMaterial() * super.getPeso() );
		
		return super.getCreditoUsuario();
	}
	
	@Override
	public void Destinacao ()
	{
		System.out.println("Material Vidro. Destino: Massfix Comércio de Sucata de Vidros"); //MG
	}

}
