package lp3;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class TestarCPF {

	public static void main(String[] args) {
		
        Scanner ler = new Scanner(System.in);
        
        String CPF;
        String nome;

        nome = JOptionPane.showInputDialog("Digite o nome: ");
        CPF = JOptionPane.showInputDialog("Digite o CPF: ");
        JOptionPane.showMessageDialog(null, "Nome: "+nome,"Informação",JOptionPane.INFORMATION_MESSAGE);

        if (ValidaCPF.isCPF(CPF) == true)
        	JOptionPane.showMessageDialog(null, "CPF válido: "+ ValidaCPF.imprimeCPF(CPF));
  
        else 
        	JOptionPane.showMessageDialog(null, "CPF inválido!");
        }
    }