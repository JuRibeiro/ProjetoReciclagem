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
			metal.setPeso(metal.getPeso() + leia.nextDouble());
			
			System.out.printf("Seus pontos em reais acumulados é: %.2f\n" ,metal.Reciclagem());
			metal.Destinacao();
		}
		
		if(op == '2')
		{
			System.out.println("Informe o peso do material que deseja reciclar (em kg): ");
			papel.setPeso(papel.getPeso() + leia.nextDouble());
			
			System.out.printf("Seus pontos em reais acumulados é: %.2f\n" ,papel.Reciclagem());
			papel.Destinacao();
		}
		
		if(op == '3')
		{
			System.out.println("Informe o peso do material que deseja reciclar (em kg): ");
			plastico.setPeso(plastico.getPeso() +leia.nextDouble());
			
			System.out.printf("Seus pontos em reais acumulados é: %.2f\n" ,plastico.Reciclagem());
			plastico.Destinacao();
		}
		
		if(op == '4')
		{
			System.out.println("Informe o peso do material que deseja reciclar (em kg): ");
			vidro.setPeso(vidro.getPeso() + leia.nextDouble());
			
			System.out.printf("Seus pontos em reais acumulados é: %.2f\n" ,vidro.Reciclagem());
			vidro.Destinacao();
		}
		
		
		
		System.out.println("\nDeseja reciclar mais materiais? 1-Sim | 2-Não");
		continuar = (leia.next().charAt(0)=='1'); // ele pega o valor inserido e analisa se é igual a 1, caso seja continuar recebe true.
		}while(continuar);
		
		
		pontosFinais = metal.Reciclagem() + papel.Reciclagem() + metal.Reciclagem() + vidro.Reciclagem();
		System.out.printf("CENTRAL DE RECICLAGEM - PontosPelaTerra\n");
		System.out.printf("Material: Metal\t\tPeso: %.2f\t Valor: %.2f\n", metal.getPeso(),metal.Reciclagem());
		System.out.printf("Material: Papel\t\tPeso: %.2f\t Valor: %.2f\n", papel.getPeso(),papel.Reciclagem());
		System.out.printf("Material: Plastico\tPeso: %.2f\t Valor: %.2f\n", plastico.getPeso(),plastico.Reciclagem());
		System.out.printf("Material: Vidro\t\tPeso: %.2f\t Valor: %.2f\n", vidro.getPeso(),vidro.Reciclagem());
		System.out.printf("\nVocê ganha 1 ponto para cada 100 reais reciclados.\n");
		System.out.printf("Valor total de reciclagem: %.1f\n",(pontosFinais));
		System.out.printf("Sua pontuação: %.0f",(pontosFinais/100));
		System.out.println("\n\nObrigado pela contribuição!! O planeta agradeçe!");
		
	}
}
