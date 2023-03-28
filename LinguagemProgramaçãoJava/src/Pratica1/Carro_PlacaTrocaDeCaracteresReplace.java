package Pratica1;
/*
 Faça um programa que leia a placa de um carro e o ano de fabricação. Em seguida,
validar a situação do carro:
Se o ano for menor que 2010 imprimir: Carro Velho
Se o ano estiver entre 2011 e 2021 imprimir: Carro Semi novo
Se o ano for igual a 2022 imprimir: Carro Novo
O programa deverá substituir as vogais (a, e, i o e u maiúscula e minúscula) da placa
pelo caractere *, e posteriormente imprimir a placa.
 */
import java.util.Scanner;
public class Carro_PlacaTrocaDeCaracteresReplace 
{
	public static void main(String[] args) // Atalho:  
	{
		Scanner ler = new Scanner(System.in);
		
		String placa, subsplaca;
		short ano; // SHORT NO LUGAR DE INT , POIS OCUPA MENOS BYTES 
		
		System.out.println("Insira a placa do veiculo: ");
		placa = ler.nextLine();
		

		System.out.println("Insira a o ano do veiculo: ");
		ano = ler.nextShort();
		
		subsplaca = placa         // SUBSTITUIR LETRAS PELA CARACTER *
				.replace("a", "*")
				.replace("e", "*")
				.replace("i", "*")
				.replace("o", "*")
				.replace("u", "*")
				.replace("A", "*")
				.replace("E", "*")
				.replace("I", "*")
				.replace("O", "*")
				.replace("U", "*");
		
		System.out.println("A placa do carro é: " + subsplaca);
		if (ano <= 2010)
		{
		System.out.println("Carro velho");
		}
		else if (ano <= 2021)
		{
		System.out.println("Carro Semi Novo");
		}
		else if (ano <= 2023)
		{
		System.out.println("Carro Novo");
		}
		else
		System.out.println("Digite um ano válido até 2023");
		}
		
		
}

