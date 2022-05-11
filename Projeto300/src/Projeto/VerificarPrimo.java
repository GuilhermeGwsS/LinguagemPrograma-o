package Projeto;

import javax.swing.JOptionPane;

public class VerificarPrimo
{     
    public static void main(String[] args) {    
        int n[] = new int[2];    
         
        for (int i = 0; i < n.length; i++) {    
            n[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (1 + i) + "º numero"));    
        }
         
        for (int i = 0; i < n.length; i++) {
            if( ehPrimo(n[i]) )
                System.out.println(n[i] + " é primo. Posição no vetor: " + i);
        }    
    }
     
    private static boolean ehPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
}