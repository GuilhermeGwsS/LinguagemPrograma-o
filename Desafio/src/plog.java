package desafio;
import java.util.Scanner;
public class plog {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Por favor, apresente um valor para ser analisado:");
		num = ler.nextInt();
		
		if(num % 3 == 0) 			 
			System.out.println("Pling");
		else if(num % 5 == 0) 
			System.out.println("Plang");

		else if(num % 7 ==0) 
			System.out.println("Plong");
			
		else
			System.out.println( + num );
	}

}