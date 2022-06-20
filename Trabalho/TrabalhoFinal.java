package Trabalho;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.nio.file.Paths;
import java.awt.event.ActionEvent;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.nio.file.Files;
public class TrabalhoFinal extends JFrame {

	protected static final String ManipularDados = null;
	private JPanel contentPane;
	private JTextField cadastrarTitulo;
	private JTextField cadastrarObjetivo;
	private JTextField dataInicio;
	private JTextField rua;
	private JTextField numero;
	private JTextField bairro;
	private JTextField uf;
	private JTextField cidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrabalhoFinal frame = new TrabalhoFinal();
					frame.setVisible(true);
					} 
				catch (Exception e) 
					{
					e.printStackTrace();
					}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TrabalhoFinal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1039, 787);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\guilh\\Downloads\\R.png"));
		
		JLabel lblNewLabel_1 = new JLabel("CADASTRAR");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 19));
		
		JLabel lblNewLabel_2 = new JLabel("T\u00CDTULO");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 13));
		
		JLabel lblNewLabel_3 = new JLabel("OBJETIVO");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 13));
		
		JLabel lblNewLabel_4 = new JLabel("DATA DE INICIO");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 13));
		
		cadastrarTitulo = new JTextField();
		cadastrarTitulo.setColumns(10);
		
		cadastrarObjetivo = new JTextField();
		cadastrarObjetivo.setColumns(10);
		
		dataInicio = new JTextField();
		dataInicio.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\guilh\\Downloads\\R (1).png"));
		
		JLabel lblNewLabel_6 = new JLabel("ENDERE\u00C7O");
		lblNewLabel_6.setForeground(Color.BLUE);
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 19));
		
		JLabel lblNewLabel_7 = new JLabel("RUA");
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 13));
		
		rua = new JTextField();
		rua.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("BAIRRO");
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 13));
		
		JLabel lblNewLabel_9 = new JLabel("CIDADE");
		lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 13));
		
		JLabel lblNewLabel_10 = new JLabel("N\u00DAMERO");
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 13));
		
		numero = new JTextField();
		numero.setColumns(10);
		
		bairro = new JTextField();
		bairro.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("UF");
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 13));
		
		uf = new JTextField();
		uf.setColumns(10);
		
		cidade = new JTextField();
		cidade.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\guilh\\Downloads\\loading.gif"));
		
		JLabel lblNewLabel_13 = new JLabel("STATUS");
		lblNewLabel_13.setForeground(Color.BLUE);
		lblNewLabel_13.setFont(new Font("Arial", Font.BOLD, 19));
		
		JRadioButton iniciado = new JRadioButton("INICIADO");
		iniciado.setFont(new Font("Arial", Font.BOLD, 13));
		
		JRadioButton interrompido = new JRadioButton("INTERROMPIDO");
		interrompido.setFont(new Font("Arial", Font.BOLD, 13));
		
		JRadioButton finalizado = new JRadioButton("FINALIZADO");
		finalizado.setFont(new Font("Arial", Font.BOLD, 13));
		
		JButton cadastrar = new JButton("CADASTRAR");
		cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String status = null;
				
				String titulo = cadastrarTitulo.getText();
				String desc = cadastrarObjetivo.getText();
				String data = dataInicio.getText(); 
				
				
				String RUA = rua.getText();
				String NUMERO = numero.getText(); 
				String UF= uf.getText();
				String BAIRRO = bairro.getText();
				String CIDADE = cidade.getText();
					
				ArrayList<String> TrabalhoFinal = new ArrayList();
				
				if(iniciado.isSelected() == true) 
					 {
					 status = "INICIADO"; 
					 } 
				 if(interrompido.isSelected() == true) 
					 {
					 status = "INTERROMPIDO"; 
					 } 
				 if(finalizado.isSelected() == true) 
					 {
					 status = "FINALIZADO"; 
					 }
				 
				 
				 Path caminho = Paths.get("C:\\Users\\guilh\\Desktop\\Caminho.txt"); 
				 String texto = "TITULO: "+titulo +"\n"+"OBJETIVO: "+desc+"\n"+"DATA: "+data+"\n"+"RUA: "+RUA+"\n"+ "NUMERO: "+NUMERO+"\n"+"BAIRRO: "+BAIRRO+"\n"+"CIDADE: "+CIDADE+"\n"+"UF: "+UF+"\n"+	"STATUS: "+status ; 
				 JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
				 byte[] textoBytes = texto.getBytes(); 
				 try { 
					 Files.write(caminho,textoBytes); 
					 } 
				 catch(Exception erro) 
				 { 
				 }
				
			}	
		});
		cadastrar.setForeground(Color.BLUE);
		cadastrar.setFont(new Font("Arial", Font.BOLD, 19));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel panel = new JPanel();
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		
		JPanel panel_1 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(247)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(cadastrarObjetivo, GroupLayout.PREFERRED_SIZE, 408, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(359)
					.addComponent(dataInicio, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(416)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(247)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(319)
					.addComponent(cadastrarTitulo, GroupLayout.PREFERRED_SIZE, 408, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 723, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(20))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(tabbedPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(38))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(76))
						.addComponent(tabbedPane_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(247)
					.addComponent(lblNewLabel_4))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(169)
							.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(rua, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addComponent(numero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(bairro, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
							.addGap(16)
							.addComponent(uf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(cidade, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(184)
							.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addComponent(iniciado, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(interrompido, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
								.addComponent(finalizado, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
							.addGap(290)
							.addComponent(cadastrar, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(47)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(47)
							.addComponent(cadastrarObjetivo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(50)
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(tabbedPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(147)
							.addComponent(dataInicio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(60)
							.addComponent(cadastrarTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(tabbedPane_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(102)
									.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(58)
									.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(145)
									.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)))))
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(226)
							.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(17)
							.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addGap(41)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
								.addComponent(rua, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
								.addComponent(numero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(20)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
								.addComponent(bairro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
								.addComponent(uf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(16)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(3)
									.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
								.addComponent(cidade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(107)
							.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addGap(44)
							.addComponent(iniciado, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addGap(32)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(interrompido, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addGap(34)
									.addComponent(finalizado, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addComponent(cadastrar, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
