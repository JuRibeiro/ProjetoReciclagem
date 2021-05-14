package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import classes.Materiais;
import classes.Metal;
import classes.Papel;
import classes.Plastico;
import classes.Vidro;

public class ProgramaTeste {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		boolean continuar=true;
		char op = ' ';
		double pontosFinais=0;
		
		Papel papel = new Papel();
		Vidro vidro = new Vidro();
		Metal metal = new Metal();
		Plastico plastico = new Plastico();
		
		//Papel papel = new Papel(10, 0.14);
		//System.out.print(papel.Reciclagem());
		
		List<Materiais>  material = new ArrayList<>();
		
		
		System.out.println("PONTOS PELA TERRA");
		System.out.println("Pressione Enter para iniciar :");
		String x = leia.nextLine();
		
		
		System.out.println("Bem vindo ao centro de coleta do PontosPelaTerra");
		
		do {
		System.out.print("Escolha o material que deseja reciclar : \n1-Metal\n2-Papel\n3-Plastico\n4-Vidro\n");
		op = leia.next().charAt(0);
		
		if(op == '1')
		{
			System.out.println("Informe o peso do material que deseja reciclar (em kg): ");
			metal.setPeso(leia.nextDouble());
			
			System.out.printf("Seus pontos em reais acumulados é: %.2f\n" ,metal.Reciclagem());
			metal.Destinacao();
		}
		
		if(op == '2')
		{
			System.out.println("Informe o peso do material que deseja reciclar (em kg): ");
			papel.setPeso(leia.nextDouble());
			
			System.out.printf("Seus pontos em reais acumulados é: %.2f\n" ,papel.Reciclagem());
			papel.Destinacao();
		}
		
		if(op == '3')
		{
			System.out.println("Informe o peso do material que deseja reciclar (em kg): ");
			plastico.setPeso(leia.nextDouble());
			
			System.out.printf("Seus pontos em reais acumulados é: %.2f\n" ,plastico.Reciclagem());
			plastico.Destinacao();
		}
		
		if(op == '4')
		{
			System.out.println("Informe o peso do material que deseja reciclar (em kg): ");
			vidro.setPeso(leia.nextDouble());
			
			System.out.printf("Seus pontos em reais acumulados é: %.2f\n" ,vidro.Reciclagem());
			vidro.Destinacao();
		}
		
		
		
		System.out.println("\nDeseja reciclar mais materiais? 1-Sim | 2-Não");
		continuar = (leia.next().charAt(0)=='1'); // ele pega o valor inserido e analisa se é igual a 1, caso seja continuar recebe true.
		}while(continuar);
		
		
		pontosFinais = metal.Reciclagem() + papel.Reciclagem() + metal.Reciclagem() + vidro.Reciclagem();
		
		System.out.println("Obrigado pela contribuição!!");
		
	}
}
