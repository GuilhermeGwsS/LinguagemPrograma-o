	package Trabalho;

public class Desafio 
{
		public static void main(String[] args) 
		{
			int i;
			for(i=1; i<=20; i++)
			{
				System.out.println(fib(i));
			}
			
		
		}
		public static int fib(int n) 
		{
			if(n==1)
			return(0);
			
			if(n==2)
				return(1);
			
			int i, F=0, F1=0, F2=1;
			for(i=3; i<=n; i++) 
			{
				F = F1+F2;
				F1= F2;
				F2=F;
			}
			
			return(F);
		}
}
