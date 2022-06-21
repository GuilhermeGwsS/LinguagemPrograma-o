package AV2;
import javax.swing.JOptionPane;
import java.util.*;
public class QuestãoUm 
{
		public static void main(String[] args) 
		{		
		     
		     int i,j = 0;
		     ArrayList<String> lista = new ArrayList();
			
			 do
		     {
		     String menu = JOptionPane.showInputDialog("\n1-Cadastrar Carro - \n2-Listagem Geral  \n3-Mostar Resultado  \n4-Sair");
		     i = Integer.parseInt(menu);
		     
		     switch (i)
		        {
		             case 1:
		                String MARCA = JOptionPane.showInputDialog("Digite A MARCA: ");
		                String MODELO = JOptionPane.showInputDialog("Digite O MODELO: ");
		                String ANO = JOptionPane.showInputDialog("Digite O ANO: ");
		                String VALOR = JOptionPane.showInputDialog("Digite O VALOR: ");
		                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
		                break;
		            
		             case 2:
			             //NAO CONSEGUIR FAZER O FOR PRA MOSTRAR O ARRAYLIST//
		            	 for(i=0; j>0; i++)
		            	 {
		            		    System.out.println(lista.get(i));
		            	 }
		            		    break;
				           //NAO SOUBE FAZER :( //
		             case 3:
		            	 break;
		            	 
		             case 4:
		                 break;
		        }
		     } while (i!=4);
		}
}		