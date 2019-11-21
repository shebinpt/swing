package swingapplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;

public class Calculator {

	float a,b,c=0f;
	int dt=0;
	float d=0f;
	String o;
	private JFrame frame;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 728, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf = new JTextField();
		tf.setEditable(false);
		tf.setBounds(10, 11, 676, 45);
		frame.getContentPane().add(tf);
		tf.setColumns(10);
		
		JButton sqrt = new JButton("sqrt");
		sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			a=Float.parseFloat(tf.getText());
			d=(float)Math.sqrt(a);
			tf.setText(String.valueOf(d));
			}
		});
		sqrt.setFont(new Font("Tahoma", Font.BOLD, 15));
		sqrt.setBounds(10, 99, 89, 45);
		frame.getContentPane().add(sqrt);
		
		JButton mod = new JButton("%");
		mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(tf.getText());
				tf.setText(" ");
				o="%";
				
			}
		});
		mod.setFont(new Font("Tahoma", Font.BOLD, 15));
		mod.setBounds(10, 172, 89, 45);
		frame.getContentPane().add(mod);
		
		JButton xy = new JButton("x^y");
		xy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(tf.getText());
				o="^";
				tf.setText(" ");
			}
		});
		xy.setFont(new Font("Tahoma", Font.BOLD, 15));
		xy.setBounds(10, 247, 89, 45);
		frame.getContentPane().add(xy);
		
		JButton xtwo = new JButton("x^2");
		xtwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(tf.getText());
				d=(float)(a*a);
				tf.setText(String.valueOf(d));
			}
		});
		xtwo.setFont(new Font("Tahoma", Font.BOLD, 15));
		xtwo.setBounds(10, 320, 89, 45);
		frame.getContentPane().add(xtwo);
		
		JButton btnNewButton_4 = new JButton("1/x");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(tf.getText());
				d=(float)(1/a);
				tf.setText(String.valueOf(d));
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.setBounds(109, 99, 89, 45);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton exp = new JButton("Exp");
		exp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(tf.getText());
				float radian=(float)Math.toRadians(a);
				
				d=(float)Math.exp(radian);
				tf.setText(String.valueOf(d));
			}
		});
		exp.setFont(new Font("Tahoma", Font.BOLD, 15));
		exp.setBounds(109, 172, 89, 45);
		frame.getContentPane().add(exp);
		
		JButton ln = new JButton("ln");
		ln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(tf.getText());
				float radian=(float)Math.toRadians(a);
				
				d=(float)Math.log(radian);
				tf.setText(String.valueOf(d));
			}
		});
		ln.setFont(new Font("Tahoma", Font.BOLD, 15));
		ln.setBounds(109, 247, 89, 45);
		frame.getContentPane().add(ln);
		
		JButton nf = new JButton("n!");
		nf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(tf.getText());
				d=1;
				for(int i=1;i<=a;i++)
				{
				d=(float)(d*i);
				tf.setText(String.valueOf(d));
				}
			}
		});
		nf.setFont(new Font("Tahoma", Font.BOLD, 15));
		nf.setBounds(109, 320, 89, 45);
		frame.getContentPane().add(nf);
		
		JButton sin = new JButton("sin");
		sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(tf.getText());
				float radian=(float)Math.toRadians(a);
				
				d=(float)Math.sin(radian);
				tf.setText(String.valueOf(d));
			}
		});
		sin.setFont(new Font("Tahoma", Font.BOLD, 15));
		sin.setBounds(208, 99, 89, 45);
		frame.getContentPane().add(sin);
		
		JButton cos = new JButton("cos");
		cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(tf.getText());
				float radian=(float)Math.toRadians(a);
				
				d=(float)Math.cos(radian);
				tf.setText(String.valueOf(d));
			}
		});
		cos.setFont(new Font("Tahoma", Font.BOLD, 15));
		cos.setBounds(208, 172, 89, 45);
		frame.getContentPane().add(cos);
		
		JButton tan = new JButton("tan");
		tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(tf.getText());
				float radian=(float)Math.toRadians(a);
				
				d=(float)Math.tan(radian);
				tf.setText(String.valueOf(d));
			}
		});
		tan.setFont(new Font("Tahoma", Font.BOLD, 15));
		tan.setBounds(208, 247, 89, 45);
		frame.getContentPane().add(tan);
		
		JButton sec = new JButton("sec");
		sec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(tf.getText());
				float radian=(float)Math.toRadians(a);
				
				d=(float)(1/Math.cos(radian));
				tf.setText(String.valueOf(d));
			}
		});
		sec.setFont(new Font("Tahoma", Font.BOLD, 15));
		sec.setBounds(208, 320, 89, 45);
		frame.getContentPane().add(sec);
		
		JButton b7 = new JButton("7");
		b7.setFont(new Font("Tahoma", Font.BOLD, 15));
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b7.getText()));
			}
		});
		b7.setBounds(320, 99, 76, 45);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		b8.setFont(new Font("Tahoma", Font.BOLD, 15));
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b8.getText()));
			}
		});
		b8.setBounds(416, 99, 76, 45);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		b9.setFont(new Font("Tahoma", Font.BOLD, 15));
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b9.getText()));
			}
		});
		b9.setBounds(514, 99, 76, 45);
		frame.getContentPane().add(b9);
		
		JButton bdiv = new JButton("/");
		bdiv.setFont(new Font("Tahoma", Font.ITALIC, 18));
		bdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dt=0;
				a=Float.parseFloat(tf.getText());
				tf.setText(" ");
				o="/";
			}
		});
		bdiv.setBounds(610, 99, 76, 45);
		frame.getContentPane().add(bdiv);
		
		JButton b4 = new JButton("4");
		b4.setFont(new Font("Tahoma", Font.BOLD, 15));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b4.getText()));
			}
		});
		b4.setBounds(320, 172, 76, 45);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		b5.setFont(new Font("Tahoma", Font.BOLD, 15));
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b5.getText()));
			}
		});
		b5.setBounds(416, 171, 76, 46);
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("6");
		b6.setFont(new Font("Tahoma", Font.BOLD, 15));
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b6.getText()));
			}
		});
		b6.setBounds(515, 172, 75, 45);
		frame.getContentPane().add(b6);
		
		JButton bmul = new JButton("*");
		bmul.setFont(new Font("Tahoma", Font.ITALIC, 18));
		bmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dt=0;
				a=Float.parseFloat(tf.getText());
				tf.setText(" ");
				o="*";
			}
		});
		bmul.setBounds(610, 171, 76, 46);
		frame.getContentPane().add(bmul);
		
		JButton b1 = new JButton("1");
		b1.setFont(new Font("Tahoma", Font.BOLD, 15));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b1.getText()));
			}
		});
		b1.setBounds(321, 247, 76, 45);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("2");
		b2.setFont(new Font("Tahoma", Font.BOLD, 15));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b2.getText()));
			}
		});
		b2.setBounds(416, 247, 76, 45);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("3");
		b3.setFont(new Font("Tahoma", Font.BOLD, 15));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b3.getText()));
			}
		});
		b3.setBounds(514, 247, 76, 45);
		frame.getContentPane().add(b3);
		
		JButton bmin = new JButton("-");
		bmin.setFont(new Font("Tahoma", Font.ITALIC, 18));
		bmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dt=0;
				a=Float.parseFloat(tf.getText());
				tf.setText(" ");
				o="-";
			}
		});
		bmin.setBounds(610, 247, 76, 45);
		frame.getContentPane().add(bmin);
		
		JButton b0 = new JButton("0");
		b0.setFont(new Font("Tahoma", Font.BOLD, 15));
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText().concat(b0.getText()));
			}
		});
		b0.setBounds(320, 320, 76, 45);
		frame.getContentPane().add(b0);
		
		JButton bdot = new JButton(".");
		bdot.setFont(new Font("Tahoma", Font.BOLD, 17));
		bdot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(dt==0) {
				tf.setText(tf.getText().concat(bdot.getText()));
				dt=1;}
			}
		});
		bdot.setBounds(417, 320, 75, 45);
		frame.getContentPane().add(bdot);
		
		JButton bequal = new JButton("=");
		bequal.setFont(new Font("Tahoma", Font.BOLD, 18));
		bequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b=Float.parseFloat(tf.getText());
				d=0f;
				//equal operation here:
				switch(o)
				{
				case "/":
					d=(a/b);
					String tot=String.valueOf(d);
					tf.setText(tot);
					break;
				case "*":
					d=(a*b);
					 tot=String.valueOf(d);
					tf.setText(tot);
					break;
				case "-":
					d=a-b;
					 tot=String.valueOf(d);
					tf.setText(tot);
					break;
				case "+":
					d=a+b;
					 tot=String.valueOf(d);
					tf.setText(tot);break;
				case "%":
					d=(a/100)*b;
					 tot=String.valueOf(d);
					tf.setText(tot);break;
				case "^":
					d=(float)Math.pow(a, b);
					 tot=String.valueOf(d);
					tf.setText(tot);break;	
				}
			}
		});
		bequal.setBounds(514, 320, 76, 45);
		frame.getContentPane().add(bequal);
		
		JButton badd = new JButton("+");
		badd.setFont(new Font("Tahoma", Font.ITALIC, 18));
		badd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Float.parseFloat(tf.getText());
				dt=0;
				tf.setText(" ");
				o="+";
				
			}
		});
		badd.setBounds(610, 318, 76, 47);
		frame.getContentPane().add(badd);
		
		JButton clear = new JButton("CLEAR");
		clear.setBackground(Color.GRAY);
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(" ");
			}
		});
		clear.setFont(new Font("Tahoma", Font.BOLD, 12));
		clear.setBounds(258, 67, 134, 23);
		frame.getContentPane().add(clear);
		
		JLabel lblScientific = new JLabel("Scientific");
		lblScientific.setForeground(Color.LIGHT_GRAY);
		lblScientific.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblScientific.setBounds(10, 67, 89, 21);
		frame.getContentPane().add(lblScientific);
		
		JLabel lblStandard = new JLabel("Standard");
		lblStandard.setForeground(Color.LIGHT_GRAY);
		lblStandard.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblStandard.setBounds(588, 67, 98, 21);
		frame.getContentPane().add(lblStandard);
		
		JLabel lblDevelopedByLastbenchtechnologies = new JLabel("developed by LastBenchTechnologies");
		lblDevelopedByLastbenchtechnologies.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDevelopedByLastbenchtechnologies.setBounds(109, 376, 236, 24);
		frame.getContentPane().add(lblDevelopedByLastbenchtechnologies);
		
		JLabel lblAllRightsReserved = new JLabel("all rights reserved");
		lblAllRightsReserved.setBounds(416, 376, 140, 19);
		frame.getContentPane().add(lblAllRightsReserved);
	}

}
