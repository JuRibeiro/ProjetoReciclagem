package classes;

public class Papel extends Materiais
{

	
	//metodo
	@Override
	public double Reciclagem ()
	{
		super.setValorMaterial(0.14); //por kg 
		
		super.setCreditoUsuario(super.getValorMaterial() * super.getPeso() );
		
		return super.getCreditoUsuario();
	}
	
	@Override
	public void Destinacao ()
	{
		System.out.println("Material Papel. Destino: CBS Aparas");
	}
	
	
	
}
