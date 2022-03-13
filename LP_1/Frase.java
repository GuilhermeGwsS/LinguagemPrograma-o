package Frase;
import java.util.Scanner;
public class frase {

		public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
	      
		int vogal;
		String vogais = " ";
		
        System.out.println("Digite uma frase: ");            
        String frase = entrada.nextLine();
        
        //frase = frase.toLowerCase();
        for(int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            if(c == 'A' | c == 'E' | c == 'I' | c == 'O' | c == 'U' | c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u' ){    
            	vogais = vogais + Character.toString(c);
            	System.out.println("Tem: " + vogais);
            }
        }   
            if(vogais.contains("A"));
            	vogal++;
            if(vogais.contains("E"));
            	vogal++;
            if(vogais.contains("I"));
            	vogal++;
            if(vogais.contains("O"));
            	vogal++;
            if(vogais.contains("U"));
            	vogal++;
            	
            if(vogais.contains("a"));
           		vogal++;
            if(vogais.contains("e"));
            	vogal++;
            if(vogais.contains("i"));
            	vogal++;
            if(vogais.contains("o"));
            	vogal++;
            if(vogais.contains("u"));
            	vogal++;
        	
        	System.out.println("Na frase \"" + frase + "\" temos: " + vogal + " vogais.");
        }
	}	