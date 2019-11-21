package swingapplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Measurement {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Measurement window = new Measurement();
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
	public Measurement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(47, 79, 79));
		frame.setBounds(100, 100, 451, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBounds(10, 94, 415, 188);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lb1 = new JLabel("Height(m)  :");
		lb1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lb1.setBounds(26, 22, 96, 19);
		panel.add(lb1);
		
		JLabel lb2 = new JLabel("Weight(kg) :");
		lb2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lb2.setBounds(26, 68, 96, 19);
		panel.add(lb2);
		
		tf1 = new JTextField();
		tf1.setBounds(203, 22, 202, 26);
		panel.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(203, 66, 202, 26);
		panel.add(tf2);
		tf2.setColumns(10);
		
		JLabel lb3 = new JLabel("BMI");
		lb3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lb3.setBounds(26, 107, 61, 19);
		panel.add(lb3);
		
		JLabel lb4 = new JLabel("New label");
		lb4.setForeground(new Color(65, 105, 225));
		lb4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb4.setBounds(85, 98, 87, 34);
		panel.add(lb4);
		
		JLabel lb5 = new JLabel("New label");
		lb5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb5.setForeground(new Color(255, 0, 0));
		lb5.setBounds(203, 103, 202, 32);
		panel.add(lb5);
		
		JButton b1 = new JButton("Calculate");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float h=Float.parseFloat(tf1.getText());
				float w=Float.parseFloat(tf2.getText());
				float bmi=(float)w/(h*h);
				lb4.setText(String.valueOf(bmi));
				if(bmi<18.5)
				lb5.setText("UnderWeight");	
				else if(bmi>18.5&&bmi<24.9)
					lb5.setText("Normal Weight");
				else if(bmi>25&&bmi<29.9)
					lb5.setText("Over Weight");
				else 
					lb5.setText("Obese");
				
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		b1.setBounds(10, 143, 130, 34);
		panel.add(b1);
		
		JButton b2 = new JButton("Clear");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf1.setText(" ");
				tf2.setText(" ");
			}
		});
		b2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		b2.setBounds(175, 143, 89, 23);
		panel.add(b2);
		
		JButton b3 = new JButton("Exit");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		b3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		b3.setBounds(301, 143, 89, 23);
		panel.add(b3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 255));
		panel_1.setBounds(10, 293, 415, 106);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"UnderWeight", "Normal Weight", "OverWeight", "Obese"},
				{"<18.5", "18.5 - 24.9", "25 -  29.9", "<30"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(37, 63, 351, 32);
		panel_1.add(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 255));
		panel_2.setBounds(10, 11, 415, 72);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNew = new JLabel("BODY MASS INDEX");
		lblNew.setHorizontalAlignment(JLabel.CENTER);
		lblNew.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNew.setBounds(25, 11, 379, 49);
		panel_2.add(lblNew);
	}
}
