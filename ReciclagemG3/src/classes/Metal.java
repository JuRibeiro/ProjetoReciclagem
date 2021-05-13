package classes;

public class Metal extends Materiais{

	public Metal(double peso, double valorMaterial, double creditoUsuario, String nomeMaterial) {
		super(peso, valorMaterial, creditoUsuario, nomeMaterial);
		// TODO Auto-generated constructor stub
	}

	public Metal(double peso, double valorMaterial) {
		super(peso, valorMaterial);
		// TODO Auto-generated constructor stub
	}
	
	//metodo
		@Override
		public double Reciclagem ()
		{
			super.setValorMaterial(2.20); //por kg 
			
			super.setCreditoUsuario(super.getValorMaterial() * super.getPeso() );
			
			return super.getCreditoUsuario();
		}
		
		@Override
		public void Destinacao ()
		{
			System.out.println(""); //PI
		}
		
		
	

}
