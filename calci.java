package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calci {

	private JFrame frame;
	private JTextField textField;
	
	double a,b,result;
	String operation,answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
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
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 392, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setBounds(10, 11, 358, 62);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn_clear = new JButton("AC");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btn_clear.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_clear.setBounds(10, 90, 82, 62);
		frame.getContentPane().add(btn_clear);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_7.getText();
				textField.setText(number);
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_7.setBounds(10, 163, 82, 62);
		frame.getContentPane().add(btn_7);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_4.getText();
				textField.setText(number);
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_4.setBounds(10, 236, 82, 62);
		frame.getContentPane().add(btn_4);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_1.getText();
				textField.setText(number);
			}
		});
		btn_1.setBackground(new Color(240, 240, 240));
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_1.setBounds(10, 309, 82, 62);
		frame.getContentPane().add(btn_1);
		
		JButton btn_00 = new JButton("00");
		btn_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_00.getText();
				textField.setText(number);
			}
		});
		btn_00.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_00.setBounds(10, 382, 82, 62);
		frame.getContentPane().add(btn_00);
		
		JButton btn_back = new JButton("\uF0E7");
		btn_back.setFont(new Font("wingdings", Font.BOLD, 30));
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String back = null;
				if(textField.getText().length()>0)
				{
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					back = str.toString();
					textField.setText(back);
				}
			}
		});
		btn_back.setBounds(102, 90, 82, 62);
		frame.getContentPane().add(btn_back);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_8.getText();
				textField.setText(number);
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_8.setBounds(102, 163, 82, 62);
		frame.getContentPane().add(btn_8);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_5.getText();
				textField.setText(number);
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_5.setBounds(102, 236, 82, 62);
		frame.getContentPane().add(btn_5);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_2.getText();
				textField.setText(number);
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_2.setBounds(102, 308, 82, 62);
		frame.getContentPane().add(btn_2);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_0.getText();
				textField.setText(number);
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_0.setBounds(102, 382, 82, 62);
		frame.getContentPane().add(btn_0);
		
		JButton btn_per = new JButton("%");
		btn_per.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation = "%";
			}
		});
		btn_per.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_per.setBounds(194, 90, 82, 62);
		frame.getContentPane().add(btn_per);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_9.getText();
				textField.setText(number);
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_9.setBounds(194, 163, 82, 62);
		frame.getContentPane().add(btn_9);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_6.getText();
				textField.setText(number);
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_6.setBounds(194, 236, 82, 62);
		frame.getContentPane().add(btn_6);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_3.getText();
				textField.setText(number);
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_3.setBounds(194, 309, 82, 62);
		frame.getContentPane().add(btn_3);
		
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_dot.getText();
				textField.setText(number);
			}
		});
		btn_dot.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_dot.setBounds(194, 382, 82, 62);
		frame.getContentPane().add(btn_dot);
		
		JButton btn_division = new JButton("/");
		btn_division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation = "/";
			}
		});
		btn_division.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_division.setBounds(286, 90, 82, 62);
		frame.getContentPane().add(btn_division);
		
		JButton btn_multiple = new JButton("*");
		btn_multiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation = "*";
			}
		});
		btn_multiple.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_multiple.setBounds(286, 163, 82, 62);
		frame.getContentPane().add(btn_multiple);
		
		JButton btn_sub = new JButton("-");
		btn_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation = "-";
			}
		});
		btn_sub.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_sub.setBounds(286, 236, 82, 62);
		frame.getContentPane().add(btn_sub);
		
		JButton btn_add = new JButton("+");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation = "+";
				
			}
		});
		btn_add.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_add.setBounds(286, 309, 82, 62);
		frame.getContentPane().add(btn_add);
		
		JButton btn_equal = new JButton("=");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b= Double.parseDouble(textField.getText());
				
				if (operation== "+")
				{
					result = a + b;
					answer=String.format("%.2f" , result);
					textField.setText(answer);
				}
				else if (operation== "-")
				{
					result = a - b;
					answer=String.format("%.2f" , result);
					textField.setText(answer);
				}
				else if (operation== "*")
				{
					result = a * b;
					answer=String.format("%.2f" , result);
					textField.setText(answer);
				}
				else if (operation== "/")
				{
					result = a / b;
					answer=String.format("%.2f" , result);
					textField.setText(answer);
				}
				if (operation== "%")
				{
					result = a % b;
					answer=String.format("%.2f" , result);
					textField.setText(answer);
				}
				
				
			}
		});
		btn_equal.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn_equal.setBounds(286, 382, 82, 62);
		frame.getContentPane().add(btn_equal);
	}
}
