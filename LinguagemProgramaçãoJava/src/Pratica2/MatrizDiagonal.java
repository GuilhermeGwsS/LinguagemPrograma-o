package Pratica2;
/*
 Escreva um programa que declare uma matriz 50x50 de inteiros.
Inicialize a matriz com zeros. Em seguida preencher a matriz com números impares e
imprimir o resultado da diagonal principal na tela.

 */
import java.util.Random;
import java.util.Scanner;
public class MatrizDiagonal 
{
  public static void main(String[] args) 
  {
	  Scanner ler = new Scanner(System.in);
	  Random gerador = new Random();
	  
	  int colunas = 50, linhas = 50;
	  int[][] matriz = new int [linhas][colunas];
	  int i, j, diagonal = 0;
	  
	 
	  
		  for(i = 0; i<linhas;i++)    // ENTRADA 
		  {		  
			  for(j=0; j<colunas;j++) 
			  {		
				 
				  matriz[i][j] = gerador.nextInt(99);// GERANDO NUMEROS ALEATORIOS (Descobrir como gerar apenas impar)
				  
			  }
		  } 
	  	System.out.println();    // quebra de linha
	  	
	  for(i = 0; i<linhas;i++)    // PROCESSAMENTO DA MATRIZ
	  {
		  for(j=0; j<colunas;j++) 
		  {
			  System.out.printf("[%d] ", matriz[i][j] ); // Imprimindo as linhas e matriz
		  }
		  System.out.println();  // quebra de linha
		  
	  }
	  for(i = 0; i<linhas;i++)    // IMPRIMINDO A DIAGONAL
	  {
		  for(j=0; j<colunas;j++) 
		  {
			 if(i == j)
			 {
				 diagonal = diagonal + matriz[i][j];
				 
			 } 
		  }  
	  }
	  System.out.println("Diagonal Principal: " + diagonal);
  }
}
	  
	  