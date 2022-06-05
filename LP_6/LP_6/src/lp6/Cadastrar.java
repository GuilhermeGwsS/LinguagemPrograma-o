package lp6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Cadastrar {

	
	public static void main(String args[]) throws IOException {

		ArrayList<String> cadastro = new ArrayList();
			ArrayList<String> proj = new ArrayList();
			Scanner ler = new Scanner(System.in);
			
			int opcional=0;
			int num, data;
			
			String doc="", nome, projeto;
			String titulo, objetivo, status, endereço;
			do {
			System.out.println("PROJETO SOCIAL");
			System.out.println("1 - Arquivar");
			System.out.println("2 - Cadastrar projeto");
			System.out.println("3 - Abrir arquivo do projeto");
			System.out.println("4 - Sair");			
			opcional=ler.nextInt();
			
			switch(opcional) {	
			case 1:
				System.out.println("Informe o seu nome de usuário: ");
				nome = ler.next();
				System.out.println("Informe o nome com que deseja que o arquivo seja salvo: ");
				doc = ler.next();
				cadastro.add(nome+";"+doc);
				System.out.println("Cadastro efetuado com sucesso: Nome: "+nome+";Arquivo: "+doc+".");
				break;
			
			case 2:
				System.out.println("Digite o titulo do projeto: ");
				titulo=ler.next();
				System.out.println("Digite do objetivo do projeto: ");
				objetivo=ler.next();
				System.out.println("Digite o endereço: ");
				endereço=ler.next();
				System.out.println("Digite o status: ");
				status=ler.next();
				System.out.println("Digite a data de inicio do seu projeto:");
				data=ler.nextInt();
				
				projeto = titulo+";"+objetivo+";"+endereço+";"+";"+data+";"+status;
				proj.add(projeto);
				ManipuladorArquivo.escritor(doc,projeto);
				System.out.println("Projeto cadastrado!");
				break;
				
			case 3:
				System.out.println("Informe o nome arquivo desejado: ");
				ManipuladorArquivo.leitor(doc);	 
		   	 break;
		   	 
			case 4:
				System.out.println("FInalizando");		
				break;	
			}
			}while (opcional!=4);
		}	
	}