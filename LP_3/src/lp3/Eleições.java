package lp3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.Group;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class EntradaVotos extends JFrame {

	private JPanel contentPane;
	private JTextField txtVoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntradaVotos frame = new EntradaVotos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EntradaVotos() {
		setTitle("ELEI\u00C7\u00D5ES L\u00CDDER DE TURMA");
		setBackground(new Color(245, 222, 179));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("20 - MARIA");
		
		JLabel lblNewLabel_1 = new JLabel("30 - PEDRO");
		
		JLabel lblNewLabel_2 = new JLabel("1 - NULO");
		
		JLabel lblNewLabel_3 = new JLabel("2 - BRANCO");
		
		JLabel lblNewLabel_4 = new JLabel("SEU VOTO:");
		
		JButton Votar = new JButton("VOTAR");
		Votar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
				{
				int voto = Integer.parseInt(txtVoto.getText());
				int CandMaria = 0, CandPedro = 0, VotoNulo = 0, VotoBranco = 0, total = 0, total1 = 0, total2 = 0, totalvotos = 0;
				
				switch (voto)
				{
					case 20: 
						CandMaria++;break;
					case 30:
						CandPedro++;break;
					case 01: 
						VotoNulo++;break;
					case 02: 
						VotoBranco++;break;
					case -1: 
						//JOptionPane.showMessageDialog(null, "Encerrado pelo usuário!", null,JOptionPane.INFORMATION_MESSAGE);
						
						if (CandMaria > CandPedro);
							total = CandMaria/voto*100;
							total1 = VotoNulo/voto*100;
							total2 = VotoBranco/voto*100;
							totalvotos = voto;
							JOptionPane.showMessageDialog(null,"Candidata MARIA é a vencedora com"+total, null,JOptionPane.INFORMATION_MESSAGE);
						if (CandPedro > CandMaria);
							total = CandPedro/voto*100;
							total1 = VotoNulo/voto*100;
							total2 = VotoBranco/voto*100;
							totalvotos = voto;
							JOptionPane.showMessageDialog(null, "Candidato PEDRO é a vencedora!"+total, null,JOptionPane.INFORMATION_MESSAGE);
						if (CandPedro == CandMaria);
							JOptionPane.showMessageDialog(null, "EMPATE!", null,JOptionPane.INFORMATION_MESSAGE);
						break;
						default:
				}
			}
		});
		Votar.setBackground(Color.YELLOW);
		
		JButton Cancelar = new JButton("CANCELAR");
		Cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
				{
					System.exit(0);
				}
		});
		Cancelar.setBackground(Color.RED);
		
		txtVoto = new JTextField();
		txtVoto.setColumns(10);
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(79)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_4)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtVoto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(116))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(Votar)
							.addPreferredGap(ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
							.addComponent(Cancelar)
							.addGap(78))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(189)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_3))
					.addContainerGap(171, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1)
					.addGap(23)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3)
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtVoto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4))
					.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(Votar)
						.addComponent(Cancelar))
					.addGap(26))
		);
		contentPane.setLayout(gl_contentPane);
	}
}