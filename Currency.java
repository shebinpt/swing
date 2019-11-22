package swingapplication;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Currency {

	float val;
	private JFrame frame;
	private JTextField tf1;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Currency window = new Currency();
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
	public Currency() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 610, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInput.setBounds(37, 31, 74, 34);
		frame.getContentPane().add(lblInput);
		
		JLabel lblEnter = new JLabel("Enter");
		lblEnter.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEnter.setBounds(37, 120, 74, 27);
		frame.getContentPane().add(lblEnter);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblOutput.setBounds(37, 196, 74, 19);
		frame.getContentPane().add(lblOutput);
		
		JLabel lblValue = new JLabel("Value");
		lblValue.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblValue.setBounds(37, 258, 80, 19);
		frame.getContentPane().add(lblValue);
		
		tf1 = new JTextField();
		tf1.setBounds(352, 118, 189, 34);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		//exit button
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(215, 314, 89, 23);
		frame.getContentPane().add(btnExit);
		
		//output textfield
		tf = new JTextField();
		tf.setBounds(352, 268, 189, 34);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		
		//input combobox
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"INR", "Dollar", "Euro", "Dhinar"}));
		cb1.setFont(new Font("Tahoma", Font.ITALIC, 12));
		cb1.setBounds(352, 40, 189, 25);
		frame.getContentPane().add(cb1);
		
		//output combo box
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"INR", "Dollar", "Euro", "Dhinar"}));
		cb2.setFont(new Font("Tahoma", Font.ITALIC, 12));
		cb2.setBounds(352, 197, 189, 27);
		frame.getContentPane().add(cb2);
		cb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				if(cb2.getSelectedItem()=="INR")
					convertrupee();
				if(cb2.getSelectedItem()=="Dollar")
					convertdollar();
				if(cb2.getSelectedItem()=="Euro")
					converteuro();
				if(cb2.getSelectedItem()=="Dhinar")
					convertdhinar();
			}

			private void convertrupee() {
				val=Float.parseFloat(tf1.getText());
				if(cb1.getSelectedItem()=="INR")
					tf.setText(String.valueOf(val));
				if(cb1.getSelectedItem()=="Dollar")
					val=(float)(val*71.72);
					tf.setText(String.valueOf(val));
				if(cb1.getSelectedItem()=="Euro")
					val=(float)(val*79.37);
					tf.setText(String.valueOf(val));
				if(cb1.getSelectedItem()=="Dhinar")
						val=(float)(val*236.21);
						tf.setText(String.valueOf(val));
			}
			
			public void convertdollar()
			{
				val=Float.parseFloat(tf1.getText());
				if(cb1.getSelectedItem()=="Dollar")
					tf.setText(String.valueOf(val));
				if(cb1.getSelectedItem()=="INR")
					val=(float)(val*0.014);
					tf.setText(String.valueOf(val));
				if(cb1.getSelectedItem()=="Euro")
					val=(float)(val*1.11);
					tf.setText(String.valueOf(val));
				if(cb1.getSelectedItem()=="Dhinar")
					val=(float)(val*3.29);
					tf.setText(String.valueOf(val));
			}
			
			public void converteuro()
			{
				val=Float.parseFloat(tf1.getText());
				if(cb1.getSelectedItem()=="Euro")
					tf.setText(String.valueOf(val));
				if(cb1.getSelectedItem()=="INR")
					val=(float)(val*0.013);
					tf.setText(String.valueOf(val));
				if(cb1.getSelectedItem()=="Dollar")
					val=(float)(val*0.90);
					tf.setText(String.valueOf(val));
				if(cb1.getSelectedItem()=="Dhinar")
					val=(float)(val*2.98);
					tf.setText(String.valueOf(val));
			}
			
			public void convertdhinar()
			{
				val=Float.parseFloat(tf1.getText());
				if(cb1.getSelectedItem()=="Dhinar")
					tf.setText(String.valueOf(val));
				if(cb1.getSelectedItem()=="INR")
					val=(float)(val*0.0042);
					tf.setText(String.valueOf(val));
				if(cb1.getSelectedItem()=="Dollar")
					val=(float)(val*0.30);
					tf.setText(String.valueOf(val));
				if(cb1.getSelectedItem()=="Euro")
					val=(float)(val*0.34);
					tf.setText(String.valueOf(val));
			}
			
		});
		
			
		
	}
}
