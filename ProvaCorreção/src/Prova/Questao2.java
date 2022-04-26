package Prova;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Questao2 extends JFrame {

	private JPanel txtquant;
	private JTextField txtVal;
	private JTextField textField_1;
	/**
	 * @wbp.nonvisual location=61,-21
	 */
	private final JTable table = new JTable();
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Questao2 frame = new Questao2();
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
	public Questao2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		txtquant = new JPanel();
		txtquant.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(txtquant);
		
		txtVal = new JTextField();
		txtVal.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton Calcular = new JButton("Calcular");
		Calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int Quantidade = Integer.parseInt(textField_1.getText());
				int Total = 0;
				int valor = Integer.parseInt(txtVal.getText());
				
				Total = valor*Quantidade;
				
				JOptionPane.showMessageDialog(null, "O valor total a pagar é R$ "+Total +",00", null,JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		
		JLabel lblNewLabel = new JLabel("Valor do @");
		
		lblNewLabel_1 = new JLabel("Quantidade do @");
		GroupLayout gl_txtquant = new GroupLayout(txtquant);
		gl_txtquant.setHorizontalGroup(
			gl_txtquant.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_txtquant.createSequentialGroup()
					.addGroup(gl_txtquant.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_txtquant.createSequentialGroup()
							.addGap(68)
							.addGroup(gl_txtquant.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1))
							.addGap(28)
							.addGroup(gl_txtquant.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(textField_1, Alignment.LEADING)
								.addComponent(txtVal, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
						.addGroup(gl_txtquant.createSequentialGroup()
							.addGap(159)
							.addComponent(Calcular)))
					.addContainerGap(86, Short.MAX_VALUE))
		);
		gl_txtquant.setVerticalGroup(
			gl_txtquant.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_txtquant.createSequentialGroup()
					.addGap(54)
					.addGroup(gl_txtquant.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtVal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(30)
					.addGroup(gl_txtquant.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
					.addComponent(Calcular)
					.addGap(36))
		);
		txtquant.setLayout(gl_txtquant);
	}
}
