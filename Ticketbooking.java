package swingapplication;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.awt.SystemColor;
import javax.swing.UIManager;
public class Ticketbooking {
	private JFrame frame;
	private JTextField name;
	private JTextField taxval;
	private JTextField subtotal;
	private JTextField totalval;
	private JTextField name1;
	private JTextField from;
	private JTextField to;
	private JTextField date;
	private JTextField time;
	private JTextField ticketno;
	private JTextField price;
	private JTextField route;
	private JTable table;
	/**
	 * Launch the application.
	 */
	float a;
	 String t;
	int eno=12437;
	public static void main(String[] args) {
			
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticketbooking window = new Ticketbooking();
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
	public Ticketbooking() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 984, 588);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 153, 204));
		panel.setBounds(461, 78, 497, 325);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Ticket Booking", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblName_1.setBounds(29, 28, 111, 24);
		panel.add(lblName_1);
		name1 = new JTextField();
		name1.setBounds(166, 31, 276, 24);
		panel.add(name1);
		name1.setColumns(10);
		JLabel lblNewLabel_3 = new JLabel("From");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(29, 89, 90, 24);
		panel.add(lblNewLabel_3);
		JLabel lblNewLabel_4 = new JLabel("To");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(29, 138, 90, 24);
		panel.add(lblNewLabel_4);
		JLabel lblNewLabel_5 = new JLabel("Date");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(29, 192, 90, 24);
		panel.add(lblNewLabel_5);
		JLabel lblNewLabel_6 = new JLabel("Time");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(29, 244, 90, 24);
		panel.add(lblNewLabel_6);
		from = new JTextField();
		from.setBounds(129, 92, 120, 24);
		panel.add(from);
		from.setColumns(10);
		to = new JTextField();
		to.setBounds(129, 141, 120, 24);
		panel.add(to);
		to.setColumns(10);
		date = new JTextField();
		date.setBounds(129, 195, 120, 24);
		panel.add(date);
		date.setColumns(10);
		time = new JTextField();
		time.setBounds(129, 247, 120, 24);
		panel.add(time);
		time.setColumns(10);
		JLabel lblNewLabel_7 = new JLabel("Ticket No");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(359, 83, 103, 19);
		panel.add(lblNewLabel_7);
		ticketno = new JTextField();
		ticketno.setBounds(369, 113, 103, 24);
		panel.add(ticketno);
		ticketno.setColumns(10);
		JLabel lblNewLabel_8 = new JLabel("Price");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(359, 138, 103, 24);
		panel.add(lblNewLabel_8);
		price = new JTextField();
		price.setBounds(369, 179, 103, 24);
		panel.add(price);
		price.setColumns(10);
		JLabel lblNewLabel_9 = new JLabel("Route");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_9.setBounds(359, 211, 103, 24);
		panel.add(lblNewLabel_9);
		route = new JTextField();
		route.setBounds(369, 247, 103, 24);
		panel.add(route);
		route.setColumns(10);
	
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 128));
		panel_1.setBounds(10, 424, 948, 115);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No:of Seats", "Time", "Date", "AC/NON AC", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(10, 11, 928, 93);
		panel_1.add(table);
		JLabel label = new JLabel("");
		label.setBounds(194, 11, 46, 14);
		frame.getContentPane().add(label);
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 128));
		panel_2.setBounds(10, 0, 948, 67);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		JLabel lblTicketBorder = new JLabel("Ticket Booking");
		lblTicketBorder.setForeground(new Color(255, 255, 255));
		lblTicketBorder.setBackground(SystemColor.textHighlight);
		lblTicketBorder.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTicketBorder.setHorizontalAlignment(SwingConstants.CENTER);
		lblTicketBorder.setBounds(41, 11, 379, 40);
		panel_2.add(lblTicketBorder);
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 137, 416, 14);
		frame.getContentPane().add(separator);
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBackground(Color.BLACK);
		separator_1.setForeground(Color.GRAY);
		separator_1.setBounds(429, 137, 2, 244);
		frame.getContentPane().add(separator_1);
		ButtonGroup button=new ButtonGroup();
		ButtonGroup but=new ButtonGroup();
		
		
		
		JButton exit = new JButton("Exit");
		exit.setForeground(new Color(255, 255, 255));
		exit.setBackground(new Color(255, 0, 0));
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		exit.setBounds(286, 390, 89, 23);
		frame.getContentPane().add(exit);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(0, 153, 204));
		panel2.setBounds(10, 75, 426, 306);
		frame.getContentPane().add(panel2);
		panel2.setLayout(null);
		JRadioButton adult = new JRadioButton("Adult");
		adult.setBounds(127, 73, 57, 25);
		panel2.add(adult);
		adult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.add(adult);
		name = new JTextField();
		name.setBounds(167, 21, 194, 24);
		panel2.add(name);
		name.setColumns(10);
		JRadioButton ac = new JRadioButton("A/c");
		ac.setBounds(250, 118, 45, 25);
		panel2.add(ac);
		ac.setFont(new Font("Tahoma", Font.PLAIN, 14));
		but.add(ac);
		JRadioButton child = new JRadioButton("Child");
		child.setBounds(250, 73, 55, 25);
		panel2.add(child);
		child.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.add(child);
		JRadioButton sleeper = new JRadioButton("Sleeper");
		sleeper.setBounds(115, 118, 69, 25);
		panel2.add(sleeper);
		sleeper.setFont(new Font("Tahoma", Font.PLAIN, 14));
		but.add(sleeper);
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(28, 161, 94, 22);
		panel2.add(comboBox);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Kozhikodu", "Malapuram", "Eranakulam"}));
		JRadioButton fc = new JRadioButton("First Class");
		fc.setBounds(6, 118, 85, 25);
		panel2.add(fc);
		fc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		but.add(fc);
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(190, 161, 94, 22);
		panel2.add(comboBox_1);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Kozhikodu", "Malapuram", "Eranakulam"}));
		JRadioButton std = new JRadioButton("Standard");
		std.setBounds(328, 118, 81, 25);
		panel2.add(std);
		std.setFont(new Font("Tahoma", Font.PLAIN, 14));
		but.add(std);
		JLabel stotal = new JLabel("Sub Total");
		stotal.setBounds(28, 244, 76, 22);
		panel2.add(stotal);
		stotal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		JLabel tf = new JLabel("Tax");
		tf.setBounds(28, 211, 29, 22);
		panel2.add(tf);
		tf.setFont(new Font("Tahoma", Font.PLAIN, 18));
		totalval = new JTextField();
		totalval.setBounds(149, 280, 86, 20);
		panel2.add(totalval);
		totalval.setColumns(10);
		subtotal = new JTextField();
		subtotal.setBounds(149, 248, 86, 20);
		panel2.add(subtotal);
		subtotal.setColumns(10);
		taxval = new JTextField();
		taxval.setBounds(149, 215, 86, 20);
		panel2.add(taxval);
		taxval.setColumns(10);
		JLabel lblNewLabel_2 = new JLabel("Total");
		lblNewLabel_2.setBounds(28, 276, 40, 22);
		panel2.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(44, 21, 45, 22);
		panel2.add(lblName);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		JComboBox number = new JComboBox();
		number.setBounds(361, 160, 36, 23);
		panel2.add(number);
		number.setFont(new Font("Tahoma", Font.PLAIN, 14));
		number.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(281, 102, 0, 2);
		panel2.add(separator_2);
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 198, 409, 2);
		panel2.add(separator_3);
		
		JButton totalbutton = new JButton("Total");
		totalbutton.setForeground(new Color(255, 255, 255));
		totalbutton.setBackground(new Color(0, 0, 128));
		totalbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n=name.getText();
				name1.setText(n);
				from.setText((String)comboBox.getSelectedItem());
				to.setText((String)comboBox_1.getSelectedItem());
				route.setText("Any");
				//ticketno.setText(String.valueOf(eno++));
				//date class declaration
				Date now=new Date(0);
				time.setText(DateFormat.getTimeInstance().format(now));
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				 LocalDateTime now1 = LocalDateTime.now();
				date.setText(dtf.format(now1));
				//calculation part remeez
				if((!button.isSelected(null)) && (!but.isSelected(null)))
				{
				String a=(String)comboBox.getSelectedItem();
				String b=(String)comboBox_1.getSelectedItem();
				
				float c=Float.parseFloat((String)number.getSelectedItem());
				button.getSelection();
				String age="";
				String st="";
				float tax=0;
		         float total=0;
		         float fa=0;
		         if((a.equals("Kozhikodu")) && (b.equals("Eranakulam"))||(a.equals("Eranakulam")) && (b.equals("Kozhikodu")))
					{
			         fa=290f;
					}
					if((a.equals("Kozhikodu")) && (b.equals("Malapuram"))||(a.equals("Malapuram")) && (b.equals("Kozhikodu")))
					{
			         fa=45f;
					}
					if((a.equals("Eranakulam")) && (b.equals("Malapuram"))||(a.equals("Malapuram")) && (b.equals("Eranakulam")))
					{
			         fa=248f;
					}
					
					if(adult.isSelected())
					{
					 
					if(std.isSelected())
						{
						  t="Standared";
						  fa=fa;
						  tax=fa*5/100;
						  total=(fa+tax)*c;
						}
						else if(ac.isSelected())
						{
							 t="Ac";
						  fa=fa*150/100;
						  tax=fa*10/100;
						  total=(fa+tax)*c;
						}
						else if(sleeper.isSelected())
						{
							 t="Sleeper";
						 fa=fa*130/100;
						 tax=fa*7/100;
						 total=(fa+tax)*c;
						}
						else if(fc.isSelected())
						{
							 t="FirstClass";
						  fa=fa*180/100;
						  tax=fa*15/100;
						  total=(fa+tax)*c;
						}
					}
					else
					{
						String t;
						if(std.isSelected())
						{
							 t="Standared";
						  fa=fa*50/100;
						  tax=fa*2/100;
						  total=(fa+tax)*c;
						}
						else if(ac.isSelected())
						{
							 t="Ac";
						  fa=(fa*50/100)*50/100;
						  tax=fa*5/100;
						  total=(fa+tax)*c;
						}
						else if(sleeper.isSelected())
						{
							 t="Sleeper";
						 fa=(fa*50/100)*30/100;
						  tax=fa*3/100;
						  total=(fa+tax)*c;
						}
						else if(fc.isSelected())
						{
							 t="First Class";
						  fa=(fa*50/100)*80/100;
						  tax=fa*10/100;
						  total=(fa+tax)*c;
						}
					}
				
					taxval.setText(String.valueOf(tax));
			         subtotal.setText(String.valueOf(fa));
			         totalval.setText(String.valueOf(total));
			         Random rand = new Random();
			         int rand_int1 = rand.nextInt(10000);
			         ticketno.setText(String.valueOf(rand_int1));
			         price.setText(String.valueOf(total));
			         /*textField_4.setText(textField.getText());
			         textField_5.setText((String)comboBox.getSelectedItem());
			         textField_6.setText((String)comboBox_1.getSelectedItem());*/
				}
				
			}
		});
		totalbutton.setFont(new Font("Tahoma", Font.BOLD, 18));
		totalbutton.setBounds(29, 390, 89, 23);
		frame.getContentPane().add(totalbutton);
		
		//reset 
		JButton reset = new JButton("Reset");
		reset.setForeground(new Color(230, 230, 250));
		reset.setBackground(new Color(0, 0, 128));
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button.clearSelection();
				but.clearSelection();
				JTextField temp=null;
				for(Component c:panel.getComponents()) {
					if(c.getClass().toString().contains("javax.swing.JTextField")) {
						System.out.println(c.getClass().toString().contains("javax.swing.JTextField"));
					temp=(JTextField)c;
					temp.setText("");
				}
				}
				for(Component c:panel2.getComponents()) {
					if(c.getClass().toString().contains("javax.swing.JTextField")) {
						System.out.println(c.getClass().toString().contains("javax.swing.JTextField"));
					temp=(JTextField)c;
					temp.setText("");
				}
				}
			}
		});
		reset.setFont(new Font("Tahoma", Font.BOLD, 18));
		reset.setBounds(151, 390, 89, 23);
		frame.getContentPane().add(reset);
		
		//confirm
		JButton confirm = new JButton("Confirm");
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.addRow(new String[]
						{
								name.getText(),
								ticketno.getText(),
								from.getText(),
								to.getText(),
								(String)number.getSelectedItem(),
								time.getText(),
								date.getText(),
								t,
								price.getText()
						});
			}
		});
		confirm.setBackground(new Color(176, 196, 222));
		confirm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		confirm.setBounds(253, 280, 111, 34);
		panel.add(confirm);
	}
}