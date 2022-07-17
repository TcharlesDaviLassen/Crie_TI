package aula6;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Tela1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 frame = new Tela1();
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
	public Tela1() {
		getContentPane().setLayout(null);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnSoma.setBounds(151, 216, 49, 23);
		getContentPane().add(btnSoma);
		
		
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSub.setBounds(210, 216, 49, 23);
		getContentPane().add(btnSub);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMult.setBounds(269, 216, 49, 23);
		getContentPane().add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDiv.setBounds(328, 216, 49, 23);
		getContentPane().add(btnDiv);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(210, 89, 108, 30);
		getContentPane().add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(210, 145, 108, 30);
		getContentPane().add(txtNum2);
		txtNum2.setColumns(10);
		
		txtResult = new JTextField();
		txtResult.setBounds(210, 262, 108, 30);
		getContentPane().add(txtResult);
		txtResult.setColumns(10);
	}
}
