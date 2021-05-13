package classes;

public class Vidro extends Materiais
{

	public Vidro(double peso, double valorMaterial, double creditoUsuario, String nomeMaterial) {
		super(peso, valorMaterial, creditoUsuario, nomeMaterial);
		// TODO Auto-generated constructor stub
	}

	public Vidro(double peso, double valorMaterial) {
		super(peso, valorMaterial);
		// TODO Auto-generated constructor stub
	}
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
