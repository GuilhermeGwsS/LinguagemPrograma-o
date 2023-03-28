package Pratica2;
import java.util.Arrays;
/*
Criar um programa que leia um vetor de 10 posições e realize a ordenação crescente. Em
seguida mostre na tela o vetor ordenado.
 */
import java.util.Random;
import java.util.Scanner;
public class OrdenaçãoEmVetor 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		Random gerador = new Random();
		
		int tamanho = 10;
		int [] vetor = new int [tamanho];
		int i = 0;
		
		for(i = 0; i<tamanho; i++) 
		{
		System.out.println("Digite os valores do seu Vetor:");
		vetor[i] = ler.nextInt();
		}
		
		Arrays.sort(vetor); //ORDENANDO DE FORMA CRESCENTE
		
		for(i = 0; i<tamanho; i++) 
		{
			System.out.println(Arrays.asList(vetor[i])); // CONVERTE EM LISTA 
			
		}
		System.out.println();
		
	}
}	