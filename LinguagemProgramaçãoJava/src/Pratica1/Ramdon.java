package Pratica1;

import java.util.Random;

public class Ramdon {
	public static void main(String[] args) 
	{
		Random random = new Random();
		
		int i;
		int ticket = random.nextInt(9999);
		
		for(i = 0; i<=50; i++)
		System.out.println("ticket: "+ ticket);
	}

}
