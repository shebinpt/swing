package swingapplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Helloworld {

	private JFrame frame;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Helloworld window = new Helloworld();
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
	public Helloworld() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf = new JTextField();
		tf.setBounds(62, 11, 307, 48);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		JLabel lb = new JLabel("");
		lb.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lb.setBounds(73, 169, 296, 48);
		frame.getContentPane().add(lb);
		
		JButton b1 = new JButton("Submit");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=tf.getText();
				lb.setText(str);
			}
		});
		b1.setBounds(152, 102, 89, 23);
		frame.getContentPane().add(b1);
		
		
	}

}
