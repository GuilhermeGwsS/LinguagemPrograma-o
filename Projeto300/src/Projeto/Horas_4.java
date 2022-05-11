package Projeto;

public class Horas_4
{

public static void main(String[] args) {

	int Seconds = 120 ;
	int Minutes = 0 ;                                  //Este programa converte um valor de segundos em minutos e horas
	int Hours = 0 ;

	if ( Seconds>=60 )  Minutes = Minutes+1 ;
	if ( Minutes > 0 )   Seconds = Seconds-60 ;
	if ( Minutes>=60) Hours = Hours+1 ;                //Quando insiro um número maior que 119 fica segs=60/61...
	if (Hours >0) Minutes=Minutes-60; 


	System.out.printf("O número de horas é %d, de minutos é %d e de segundos é %d",Hours, Minutes, Seconds) ;
 }
}