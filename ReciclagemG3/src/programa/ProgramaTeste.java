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
		boolean continuar=true;
		
		//Papel papel = new Papel(10, 0.14);
		//System.out.print(papel.Reciclagem());
		
		List<Materiais>  material = new ArrayList<>();
		
		
		System.out.println("PONTOS PELA TERRA");
		System.out.println("Pressione Enter para iniciar :");
		String x = leia.nextLine();
		
		
		System.out.println("Bem vindo ao centro de coleta do PontosPelaTerra");
		
		do {
		System.out.print("Escolha o material que deseja reciclar : \n1-Metal\n2-Papel\n3-Plastico\n4-Vidro\n");
		//if para escolha do material
		
		
		
		System.out.println("Deseja reciclar mais materiais? 1-Sim | 2-Não");
		continuar = (leia.next().charAt(0)=='1'); // ele pega o valor inserido e analisa se é igual a 1, caso seja continuar recebe true.
		}while(continuar);
		
		System.out.println("Obrigado pela contribuição!!");
		
	}
}
