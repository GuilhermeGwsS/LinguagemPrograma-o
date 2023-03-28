package Pratica1;
/*
 Faça um programa que leia o tempo gasto numa viagem (em horas), a velocidade média
e o valor km por litro de um veículo. Calcule o consumo final de combustível gasto.
 */

import java.util.Scanner;
public class Viagem_ConsulmoFinal 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		double hora, velocidade, kmLitros, consumoFinal, distancia;
		
		System.out.println("Insira o tempo gasto (em horas) em sua viagem: ");
		hora = ler.nextDouble();
		System.out.println("Insira a velocidade média que o seu veiculo percorreu na viagem: ");
		velocidade = ler.nextDouble();
		System.out.println("Insira quantos km faz o seu veiculo por litros: ");
		kmLitros = ler.nextDouble();
		
		distancia =hora*velocidade;
		consumoFinal=distancia/kmLitros;
		
		System.out.println("Velocidade media: "+velocidade );
		System.out.println("Tempo gasto: "+hora+ " horas");
		System.out.println("Distancia percorrida: "+distancia+" km");
		System.out.println("Quantidade de combustivel consumido: "+consumoFinal+" km/litro");
		
		
	}

}
