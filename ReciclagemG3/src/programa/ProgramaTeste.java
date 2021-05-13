package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import classes.Materiais;
import classes.Papel;

public class ProgramaTeste {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		//Papel papel = new Papel(10, 0.14);
		//System.out.print(papel.Reciclagem());
		
		List<Materiais>  material = new ArrayList<>();
		
		
		System.out.println("PONTOS PELA TERRA");
		System.out.println("Pressione Enter para iniciar :");
		String x =leia.nextLine();
		
		
		System.out.println("Bem vindo ao centro de coleta do PontosPelaTerra");
		
		
	}
}
