package classes;

public abstract class Materiais 
{
	
	//atributos
	private double peso;
	private double valorMaterial;
	private double creditoUsuario;
	private String nomeMaterial;

	
	//encapsulamento 

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getValorMaterial() {
		return valorMaterial;
	}

	public void setValorMaterial(double valorMaterial) {
		this.valorMaterial = valorMaterial;
	}

	public double getCreditoUsuario() {
		return creditoUsuario;
	}

	public void setCreditoUsuario(double creditoUsuario) {
		this.creditoUsuario = creditoUsuario;
	}

	public String getNomeMaterial() {
		return nomeMaterial;
	}

	public void setNomeMaterial(String nomeMaterial) {
		this.nomeMaterial = nomeMaterial;
	}
	
	//metodos
	public double Reciclagem ()
	{
		creditoUsuario = valorMaterial * peso ;
		
		return creditoUsuario;
	}
	
	public abstract void Destinacao ();
	
	
}
