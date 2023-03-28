package Pratica1;
/*
 Faça um programa que leia uma frase, calcule e mostre o número de vogais existentes,
sem repetição. 

#VOLTAR NA ATIVIDADE
 */
import java.util.Scanner;
public class FraseCalculoVogais 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int vogal = 0; // Contador
		int cont = 0;
		String vogais = " "; // Esta sendo atribuido o valor " "(nada)
		
        System.out.println("Digite uma frase: ");            
        String frase = ler.nextLine(); // Lendo a frase
        
        //frase = frase.toLowerCase();
        for(int i = 0; i < frase.length(); i++) // Loop para inicializar e definir o tamaho da frase 
        {
        	
            if(frase.charAt(i) == 'A' ||frase.charAt(i) == 'E' ||frase.charAt(i) == 'I' ||frase.charAt(i) == 'O' ||frase.charAt(i) == 'U' ||frase.charAt(i) == 'a' ||frase.charAt(i) == 'e' ||frase.charAt(i) == 'i'||frase.charAt(i) == 'o'||frase.charAt(i) == 'u')
            cont++;  

            System.out.println("total de vogais : " + cont); // se tiver algumas das vogais acima sinalizara que tem vogal
    
                      
        }
	}
}