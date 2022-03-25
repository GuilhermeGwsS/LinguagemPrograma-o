package vetor;
import java.util.Arrays;
public class vetor {
	
	public static void main(String[] args) {
		
		int[] numeros = new int[]{200, 2, 8, 19, 100, 5, 11, 6, 131, 58};

        Arrays.sort(numeros);

        System.out.println("Números ordenados:");
        for(int numero : numeros)
            System.out.println(numero);
        System.out.println();

		}
}