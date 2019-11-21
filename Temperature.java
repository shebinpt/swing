package swingapplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Temperature {

	private JFrame frame;
	private JTextField degree;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temperature window = new Temperature();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Temperature() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDegree = new JLabel("Temperature");
		lblDegree.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDegree.setBounds(34, 26, 121, 32);
		frame.getContentPane().add(lblDegree);
		
		degree = new JTextField();
		degree.setBounds(185, 23, 158, 35);
		frame.getContentPane().add(degree);
		degree.setColumns(10);
		
		JLabel dLabel = new JLabel("");
		dLabel.setBackground(Color.PINK);
		dLabel.setBounds(10, 94, 89, 46);
		frame.getContentPane().add(dLabel);
		
		JLabel fLabel = new JLabel("");
		fLabel.setBounds(224, 94, 95, 46);
		frame.getContentPane().add(fLabel);
		
		JButton btnSubmit = new JButton("ToDegre");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
				String farval=degree.getText();
				float far=Float.parseFloat(farval);
				//double tot=(far-32)*(0.5555);
				double tot=far-273;
				String b=String.valueOf(tot);
				dLabel.setText(b);
				
			}
		});
		btnSubmit.setBounds(34, 194, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnNewButton = new JButton("ToFaren");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String degreeval=degree.getText();
				float deg=Float.parseFloat(degreeval);
				double tot=(deg*1.8)-459.67;
				//double tot=(deg*1.8)+32;
				String a=String.valueOf(tot);
				fLabel.setText(a);
				
				
			}
		});
		btnNewButton.setBounds(254, 194, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("C");
		lblNewLabel_1.setBounds(109, 110, 46, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("F");
		lblNewLabel_2.setBounds(354, 110, 46, 30);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
