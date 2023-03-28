package Pratica2;

import java.util.Scanner;
public class ArraySomaMedia
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);

		    int tamanho = 7;
		    int x[] = new int[tamanho];
		    int i;
		    
		    for(i=0; i<tamanho; i++) {
		      System.out.printf("%dº item de %d: ", (i+1), tamanho);
		      x[i] = ler.nextInt();
		    }
		    
		    System.out.println();
		    
		    int smT = 0;
		    double mdT;
		    
		    int ctP = 0, smP = 0;
		    double pcP;
		    for(i=0; i<tamanho; i++) {
		      System.out.printf("x[%d] = %d\n", i, x[i]);
		      
		      smT = smT + x[i];
		      
		      if ((x[i] % 2) == 0) {
		         ctP = ctP + 1;
		         smP = smP + x[i];
		      }
		    }
		    
		    System.out.println();
		    System.out.println("Todos:");
		    System.out.printf("Soma  = %d\n", smT);
		    
		    mdT = smT / (double)tamanho;
		    System.out.printf("Média = %.2f\n", mdT);
		    
		    System.out.println();
		    System.out.println("Pares:");
		    System.out.printf("Quantidade  = %d\n", ctP);
		    System.out.printf("Soma        = %d\n", smP);
		    
		    pcP = (ctP / (double)tamanho) * 100;
		    System.out.printf("Porcentagem = %.2f%%\n", pcP);
	}

}