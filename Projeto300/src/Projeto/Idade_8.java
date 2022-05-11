package Projeto;

import java.util.Scanner;

public class Idade_8
{

	Scanner ler = new Scanner(System.in); 
	
    int idade;

    System.out.println("Digite idade:");
    idade=ler.nextInt();
    	
    if(idade>18 && idade<=65)
    {
    	System.out.println("Eleitor obrigatorio\n");
    }
    else if(idade>=16 && idade<=18 || idade>65)
    {
    	System.out.println("Eleitor facultativo\n");
    }
    else
    
    	System.out.println("Nao eleitor\n");

    System.out.println("pause");
    	}
}