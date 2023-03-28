package Pratica2;

import java.util.Scanner;
public class ArrayList 
{
		public static void main(String[] args) 
		{
			 Scanner ler = new Scanner(System.in);
			    
			    int n = 5; // tamanho do vetor
			    int x[] = new int[n]; // declaração e instanciação do array "x" para armazenar "n" nros inteiros
			    int i; // índice (individualiza os itens do vetor)
			    
			    for(i=0; i<n; i++) 
			    {
			      System.out.printf("%dº item de %d: ", (i+1), n);
			      x[i] = ler.nextInt();
			    }
			    
			    System.out.println();
			    
			    for(i=0; i<n; i++) 
			    {
			      System.out.printf("x[%d] = %d\n", i, x[i]);  
			    }
		}
	}

