package Pratica2;
import java.util.RandomAccess;
/*
 Escreva um programa para um balcão de uma operadora aérea. O programa deve imprimir um menu contendo as
seguintes opções:
1 - Cadastrar Passageiro
2 -Check in
3 - Cancelar Voo
4 - Sair
Opção 1: Solicitar ao passageiro o Nome, CPF, data do voo e horário.
Mostrar na tela a mensagem Cadastro Efetuado com Sucesso e um número randômico do voo com 3 caracteres.
Opção 2: Solicitar ao passageiro CPF e número do voo
Mostrar a mensagem Check in realizado com sucesso.
Opção 3: Solicitar ao passageiro CPF e número do voo
Mostrar a mensagem Voo Cancelado com sucesso.
 */
import java.util.Scanner;
import java.util.Random;
public class AtualizaçãoOperadoraAérea 
{

	public static void main(String[] args) 
	{
		Random random = new Random();
		Scanner ler = new Scanner(System.in);
		

		int opcao;
		String nome = null, CPF, data, hora, nVoo;
		int poltronaLiberada = 0, poltrona = 0;
		int vetor[] = new int[100];
		int ticket = random.nextInt(999);
		
		do 
		{
			System.out.println("COMPANHIA AÉREA\r\n"	
					+ "Seja Bem Vindo(a)\r\n"
					+ "1 - Cadastrar Passageiro\r\n"
					+ "2 - Check in\r\n"
					+ "3 - Cancelar Voo\r\n"
					+ "4 - Sair");
			opcao = ler.nextInt();
		
			switch(opcao) 
			{
					case 1:
						
						System.out.println("--CADASTRO DE PASSAGEIROS--");
						System.out.println("Nome do passageiro: ");
						nome = ler.next();
						
						new Scanner(System.in);
						System.out.println("CPF: ");
						CPF = ler.next();
						System.out.println("Data do vôo: ");
						data = ler.next();
						System.out.println("Hora do vôo: ");
						hora = ler.next();
					
						System.out.println("--CADASTRO EFETUADO COM SUCESSO--");
						System.out.println("Nome do passageiro: " + nome);
						System.out.println("CPF do passageiro: " + CPF	);
						System.out.println("Data do Vôo: " + data);
						System.out.println("Hora do Vôo: " + hora);
						System.out.println("Ticket de embarque é: " + ticket); 
						break;
						
					case 2:	
						System.out.println("--CHECK IN--");
						System.out.println("Insrira seu CPF: ");
						CPF = ler.next();
						System.out.println("Insrira o número do seu Voo: ");
						nVoo = ler.next();
						System.out.println("Insrira o número da sua poltrona: ");
						poltrona = ler.nextInt();
						
						if(poltrona<=100) 
						{
							vetor[poltronaLiberada] = poltrona;
							for(int i=0; i<1;i++)
							{
								if(vetor[poltronaLiberada] == poltrona) 
								{
									System.out.println("--CHECK IN EFETUADO COM SUCESSO--");
									System.out.println("Nome: " + nome + " Número do Voo: "+nVoo+" Número da poltrona: "+vetor[poltrona]);	
								}
								else
								{	
									System.out.println("Essa poltrona já esta ocupada: ");
								} 
							}
							
						}
						
						else 
							System.out.println("Essa poltrona não existe");
						
						break;
					case 3:
						System.out.println("--CANCELAR VOO--");
						System.out.println("Insrira seu CPF: ");
						CPF = ler.next();
						System.out.println("Insrira o número do seu Voo: ");
						nVoo = ler.next();
						
						vetor[poltrona] = vetor[poltrona] - poltrona;
						System.out.println("--VOO CANCELADO COM SUCESSO--");
						System.out.println("Nome: " + nome + " Número do Voo: "+nVoo);
						
					case 4:
						System.out.println("Finalizando!");break;
					case 5:
						System.out.println("Por Favor, digite uma opção válida!"); break;
			}
		}
		while(opcao != 4);	
		
	}

}