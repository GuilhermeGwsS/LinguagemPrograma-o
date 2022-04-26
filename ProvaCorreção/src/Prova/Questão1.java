package Prova;

import java.util.Arrays;
import java.util.Scanner;

public class Questão1 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int[] numeros = new int[10];
		
		int DigNota = 0, media = 0, sum = 0;
        int aux;
        
        
        for (int i = 0; i < numeros.length; i++) 
        {
           System.out.println("digite um numero:");
           numeros[i]=ler.nextInt();
           
        	sum+=numeros[i];   
        }
        
        for(int i = 0; i < 10; i++) {
        	for (int j = 0; j<9; j++) {
        		if (numeros [j]> numeros [j+1]) {
        			aux = numeros [j];
        			numeros [j] = numeros [j+1];
        			numeros [j+1] = aux;
        		}
        	}
        }
        media = sum/10;
        
        System.out.println("Maior nota: " + numeros[9]);
        System.out.println("Segunda maior nota: " + numeros[8]);
        System.out.println("Terceira maior nota: " + numeros[7]);
        System.out.println("Menor nota: " + numeros[0]);
        System.out.println("A média das notas foram: " + media);
		
	}

}