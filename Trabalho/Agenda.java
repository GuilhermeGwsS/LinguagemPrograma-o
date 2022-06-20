package Trabalho;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import Trabalho.ManipularDados;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.DropMode;

public class Agenda extends JFrame {

	private JPanel contentPane;
	private JTextField TextDesc;
	private JTextField textData;
	private JTextField textHora;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda frame = new Agenda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public Agenda() throws Exception {
		setTitle("CADASTRO AGENDA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 409);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel DATA1 = new JLabel("DATA");
		DATA1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel HORA = new JLabel("HORA");
		HORA.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel DESCRIÇÃO = new JLabel("DESCRI\u00C7\u00C3O");
		DESCRIÇÃO.setFont(new Font("Tahoma", Font.BOLD, 12));{
		
		TextDesc = new JTextField();
		TextDesc.setColumns(10);
		
		JLabel STATUS = new JLabel("STATUS");
		STATUS.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JRadioButton EXECUTANDO = new JRadioButton("EXECUTANDO");
		EXECUTANDO.setBackground(Color.LIGHT_GRAY);
		
		JRadioButton PARALISADO = new JRadioButton("PARALISADO");
		PARALISADO.setBackground(Color.LIGHT_GRAY);
		
		JRadioButton CONCLUIDO = new JRadioButton("CONCLUIDO");
		CONCLUIDO.setBackground(Color.LIGHT_GRAY);
		
		
		JTextField textData = new JFormattedTextField(new MaskFormatter("##/##/####"));
		textData.setColumns(10);
		
		JTextField textHora = new JFormattedTextField(new MaskFormatter("##:##"));
		textHora.setColumns(10);
		
		JButton SALVAR = new JButton("AGENDAR");
		SALVAR.setBackground(new Color(255, 255, 51));
		SALVAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				String STATUS = null;
				//data, hora, descrição
				String DATA = textData.getText();	
				String HORA = textHora.getText();	
				String DESC = TextDesc.getText();

				//ArrayList
				ArrayList<String> cadastroProj = new ArrayList();
				
	            //se selecionar o JRadio mostrar o status
	            if(EXECUTANDO.isSelected() == true) 
	            {
	            	STATUS = "EXECUTANDO";
				}
				if(PARALISADO.isSelected() == true) 
				{
					STATUS = "PARALISADO";
				}
				if(CONCLUIDO.isSelected() == true) 
				{
					STATUS = "CONCLUIDO";
				}
				 Path caminho = Paths.get("C:\\Users\\guilh\\Desktop\\Caminho.txt"); 
				 String texto = "AGENDAMENTOO:"+"\n"+DATA+"\n"+HORA+"\n"+DESC+"\n"+STATUS;
				 JOptionPane.showMessageDialog(null, "AGENDADO!");
				 byte[] textoBytes = texto.getBytes(); 
				 try { 
					 Files.write(caminho,textoBytes); 
					 } 
				 catch(Exception erro) 
				 { 
				 }
	            			
			}
			});
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(CONCLUIDO)
							.addContainerGap())
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(EXECUTANDO, GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
									.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(DATA1)
											.addComponent(HORA)
											.addComponent(DESCRIÇÃO))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(TextDesc, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE)
											.addComponent(textHora, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
											.addComponent(textData, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))))
								.addContainerGap())
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(PARALISADO)
								.addContainerGap()))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(258)
					.addComponent(STATUS, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(210, Short.MAX_VALUE)
					.addComponent(SALVAR, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
					.addGap(205))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(DATA1)
						.addComponent(textData, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(HORA)
						.addComponent(textHora, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(DESCRIÇÃO)
						.addComponent(TextDesc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(STATUS)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(EXECUTANDO)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(PARALISADO)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(CONCLUIDO)
					.addPreferredGap(ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
					.addComponent(SALVAR, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}

	private Object setMascara(String string) {
		// TODO Auto-generated method stub
		return null;
	}	
}