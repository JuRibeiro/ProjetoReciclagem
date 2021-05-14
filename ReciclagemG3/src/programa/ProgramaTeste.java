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
		
		
		//List<Materiais>  material = new ArrayList<>();
		
		
		System.out.println("PONTOS PELA TERRA");
		System.out.println("Pressione Enter para iniciar :");
		String x = leia.nextLine();
		
		
		System.out.println("Bem vindo ao centro de coleta do PontosPelaTerra");
		
		do {
		System.out.print("Escolha o material que deseja reciclar : \n1-Metal\n2-Papel\n3-Plastico\n4-Vidro\n5-Finalizar");
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
		if(op == '5') {
			break;
		}
		
		
		System.out.println("\nDeseja reciclar mais materiais? 1-Sim | 2-Não");
		continuar = (leia.next().charAt(0)=='1'); // ele pega o valor inserido e analisa se é igual a 1, caso seja continuar recebe true.
		}while(continuar);
		
		
		pontosFinais = metal.Reciclagem() + papel.Reciclagem() + metal.Reciclagem() + vidro.Reciclagem();
		System.out.printf("CENTRAL DE RECICLAGEM - PontosPelaTerra\n");
		System.out.printf("Matrial: Metal\t\tPeso: %.2f\t Valor: %.2f\n", metal.getPeso(),metal.Reciclagem());
		System.out.printf("Matrial: Palpel\t\tPeso: %.2f\t Valor: %.2f\n", papel.getPeso(),papel.Reciclagem());
		System.out.printf("Matrial: Plastico\tPeso: %.2f\t Valor: %.2f\n", plastico.getPeso(),plastico.Reciclagem());
		System.out.printf("Matrial: Vidro\tPeso: %.2f\t Valor: %.2f\n", vidro.getPeso(),vidro.Reciclagem());
		System.out.printf("=================================\n");
		System.out.printf("Você recebera R$ %.2f pelos materiais reciclados.\n", pontosFinais);
		System.out.printf("Você ganha 1 ponto para cada 100 reais reciclados.\n");
		System.out.printf("Sua pontuação: %.0f\n",(pontosFinais/100));

		System.out.println("Obrigado pela contribuição!!");
		
	}
}
