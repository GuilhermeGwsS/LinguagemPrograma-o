package Prova;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Questão3 {

	public static void main(String[] args) {
		
        Scanner ler = new Scanner(System.in);
        
        String buscarItens;
        String pedido;
        String sair;
        

        pedido = JOptionPane.showInputDialog("Cadastrar Pedido");
        buscarItens = JOptionPane.showInputDialog("Digite o Iten: ");
        sair = JOptionPane.showInputDialog("Digite o Iten: ");

        if (ValidaCPF.isCPF(CPF) == true)
        	JOptionPane.showMessageDialog(null, "CPF válido: "+ ValidaCPF.imprimeCPF(CPF));
  
        else 
        	JOptionPane.showMessageDialog(null, "CPF inválido!");
        }
    }