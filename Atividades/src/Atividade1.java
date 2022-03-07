import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	    
	    int tempo, velocidade, litro, distancia, resultado;
	    System.out.println("Digite o tempo gasto na viagem: ");
	    tempo = entrada.nextInt();
	    System.out.println("Digite a velocidade media na viagem: ");
	    velocidade = entrada.nextInt();
	    System.out.println("Digite o valor de litros de combustivel por km: ");
	    litro = entrada.nextInt();
	    
	    distancia = tempo*velocidade;
	    resultado=distancia*litro;		
	    System.out.println("O valor de combustivel gasto é : " + resultado );
	    
	}

}