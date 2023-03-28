package Pratica2;

import java.util.Scanner;
public class Matriz {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int l = 3, c = 2;
		int[][] matriz = new int [l][c];
		int i, j;
		
		for(i=0; i<l; i++) 
		{
			for(j=0; j<c; j++) 
			{
				System.out.println("Insira 5 numeros, para sua matriz");	
				
				matriz[i][j] = ler.nextInt();
			}	
		}
		
			System.out.println();
		for(i=0; i<l; i++) 
		{
			for(j=0; j<c; j++) 
			{
				System.out.printf("[%d]", matriz[i][j]);
			
			}	
			System.out.println();
		}
			

	}

}
