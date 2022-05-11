package Projeto;

public class Triangulo
{
		public static void main(String[] args) 
	{
		int ladoA=6, ladoB=6, ladoC=6, x, area;	    
	    
	    x = (ladoA + ladoB + ladoC)/2;
	    area = x * (x-ladoA)*(x-ladoB)*(x-ladoC);
	    
	    if (area > 0) 
	    	System.out.println("É um triângulo!");
	    else
	        System.out.println("Não é triângulo!");
	}
}
