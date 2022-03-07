import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	    
	    int placa, ano;
	    System.out.println("Digite a placa de seu veiculo: ");
	    placa = entrada.nextInt();
	    System.out.println("Digite o ano de fabricação de seu veiculo");
	    ano = entrada.nextInt();
	    
	    if (ano<=2010)
	    	System.out.println("Carro Velho");
	    
	    else if (ano>2011 || ano<2021)
	    	System.out.println("Carro semi Novo");
	    else
	    	System.out.println("Carro Novo");
	    
	    System.out.println("A placa é " + placa);
	}

}