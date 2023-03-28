package Pratica2;
/*
Fazer um programa que solicita o total gasto pelo cliente de uma loja, imprime as
opções de pagamento, solicita a opção desejada e em seguida imprime o valor total das
prestações (se houverem) ou o valor à vista. As opções de pagamento são:
1 - À Vista: a vista com 10% de desconto
2- Parcelado 2x: em duas vezes (preço da etiqueta)
3- Parcelado de 3x até 6x: de 3 até 6 vezes com 3% de juros ao mês (somente para
compras acima de R$ 500,00 - inclusive).
No caso da forma de pagamento 3, será solicitado o número de parcelas e testado se o valor da
compra é maior ou igual a R$ 500,00. Caso não seja possível, o programa deverá imprimir a
mensagem: “Escolha nova forma de pagamento”. Em seguida solicitar a nova forma de pagamento.
O programa finaliza quando for digitado o total gasto igual a -1
 */

import java.util.Scanner;
import java.util.Random;
public class Pagamento 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		Random random = new Random();
		
		
		int i=0, ii =0;
		float valor = random.nextFloat(9999);
		float valorTotal = 0, desconto = 0;
		System.out.println("O valor total gasto pelo cliente é de: " + valor);
		
			System.out.println("-- OPÇÕES DE PAGAMENTO--:");
			System.out.println("1 - À Vista: a vista com 10% de desconto\r\n"
					+ "2- Parcelado 2x: em duas vezes (preço da etiqueta)\r\n"
					+ "3- Parcelado de 3x até 6x: de 3 até 6 vezes com 3% de juros ao mês (somente para\r\n"
					+ "compras acima de R$ 500,00 - inclusive)");
			
			i = ler.nextInt();
			
			
			if (i != 0 && i<4) 
			{
			{
				switch(i) 
				{
					case 1:
						System.out.println("-- Á VISTA --:");
						 desconto += valor*0.10;
						 valorTotal+= (valor-desconto);
						 System.out.println("O valor total do seu pagamento será de: " + valorTotal);
					 break;
					case 2:
						System.out.println("-- PARCELADO 2x - PREÇO DA ETIQUETA --:");
						 desconto += valor/2;
						 valorTotal+= desconto;
						 System.out.println("O valor total do seu pagamento será (2x - duas vezes) de: " + valorTotal);		
					 break;
						 				 
					case 3:
						if (valor>500) {		
						System.out.println("-- PARCELADO 3x A 6x - JUROS DE 3% AO MÊS - SELECIONE --:");
						System.out.println("1 - Para deividir 3x com juros de 3% ao mês \r\n"
								+ "2 - Para deividir 4x com juros de 3% ao mês \r\n"
								+ "3 - Para deividir 5x com juros de 3% ao mês \r\n"
								+ "4 - Para deividir 6x com juros de 3% ao mês \r\n");
						
						ii = ler.nextInt();
						
						if(ii == 1)
						{
								System.out.println("-- PARCELADO 3x - JUROS DE 3% AO MÊS --:");
								desconto += (valor/3);
								valorTotal+= (desconto*0.03);
								valorTotal+= desconto;
								
								System.out.println("O valor total do seu pagamento será (3x - três vezes/Juros 3%) de: " + valorTotal);
						}		
								else if (ii == 2)
								{
								System.out.println("-- PARCELADO 4x - JUROS DE 3% AO MÊS --:");
								desconto += (valor/4);
								valorTotal+= (desconto*0.03);
								valorTotal+= desconto;
								
								System.out.println("O valor total do seu pagamento será (4x - Quatro vezes/Juros 3%) de: " + valorTotal);	
								}
								else if(ii == 3)
								{
								System.out.println("-- PARCELADO 5x - JUROS DE 3% AO MÊS --:");
								desconto += (valor/5);
								valorTotal+= (desconto*0.03);
								valorTotal+= desconto;
								
								System.out.println("O valor total do seu pagamento será (5x - Cinco vezes/Juros 3%) de: " + valorTotal);	
								}
								else 
								{
								System.out.println("-- PARCELADO 6x - JUROS DE 3% AO MÊS --:");
								desconto += (valor/6);
								valorTotal+= (desconto*0.03);
								valorTotal+= desconto;
								
								System.out.println("O valor total do seu pagamento será (6x - Seis vezes/Juros 3%) de: " + valorTotal);	
								break;
								}
						}
					}
				}
			}
				
	}		
			
	
}


