package classes;

public class Papel extends Materiais
{
	//construtores
	public Papel(double peso, double valorMaterial, double creditoUsuario, String nomeMaterial) {
		super(peso, valorMaterial, creditoUsuario, nomeMaterial);
		// TODO Auto-generated constructor stub
	}

	public Papel(double peso, double valorMaterial) {
		super(peso, valorMaterial);
		// TODO Auto-generated constructor stub
	}
	
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
