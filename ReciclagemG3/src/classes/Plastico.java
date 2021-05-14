package classes;

public class Plastico extends Materiais{

	
	//metodo
	@Override
	public double Reciclagem ()
	{
		super.setValorMaterial(0.40); //por kg 
		
		super.setCreditoUsuario(super.getValorMaterial() * super.getPeso() );
		
		return super.getCreditoUsuario();
	}
	
	@Override
	public void Destinacao ()
	{
		System.out.println("Material Plastico. Destino: CERCAP - Centro Brasileiro de Reciclagem e Capacitação Profissional"); //PE
	}
	
	

}
