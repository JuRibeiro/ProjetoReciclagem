package classes;

public class Metal extends Materiais{


	
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
			System.out.println("Material Metalico. Destino: Lumavale Recuperação de Metais"); //PI
		}
		
		
	

}
