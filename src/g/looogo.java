package g;

import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;

public class looogo extends JFrame {
	private JTextField user;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					looogo frame = new looogo();
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
	public looogo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 342);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setForeground(new Color(255, 69, 0));
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_1.setBounds(10, 33, 162, 41);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 112, 125, 31);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password\r\n");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(10, 167, 125, 31);
		getContentPane().add(lblNewLabel_2_1);
		
		user = new JTextField();
		user.setBounds(134, 117, 154, 20);
		getContentPane().add(user);
		user.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(134, 172, 154, 20);
		getContentPane().add(pass);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			user.setText(null);
			pass.setText(null);
			
			
			}
		});
		btnNewButton.setBounds(199, 254, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306","root","9182");
				Statement stmt=con.createStatement();
				String sql="Select * from metro.register where username='"+user.getText()+"' and password ='"+pass.getText()+"'";
			    ResultSet res=stmt.executeQuery(sql);
			    if(res.next()) {
			    	JOptionPane.showMessageDialog(null, "You are Scuccessfully logged in");
			    	loginsuccesful l = new loginsuccesful();
			    	l.setVisible(true);
			    	looogo.super.dispose();
			    }
			    else
			    	JOptionPane.showMessageDialog(null, "Username or Password is incorrect");
			        con.close();
				
			} catch(Exception e ){
				System.out.print(e);}
			}
		});
		btnNewButton_1.setBounds(115, 209, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sign up");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			register r =new register();
			r.setVisible(true);
			dispose();
			}
		});
		btnNewButton_2.setBounds(25, 254, 89, 23);
		getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(looogo.class.getResource("/g/pass.png")));
		lblNewLabel.setBounds(294, 167, 30, 31);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(looogo.class.getResource("/g/c.png")));
		lblNewLabel_3.setBounds(294, 112, 30, 31);
		getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(looogo.class.getResource("/g/asd.png")));
		lblNewLabel_4.setBounds(35, 44, 279, 238);
		getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_3 = new JButton("Main Menu");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			nammametro n=new nammametro();
			n.setVisible(true);
			dispose();
			}
		});
		btnNewButton_3.setBounds(216, 0, 108, 23);
		getContentPane().add(btnNewButton_3);
	}
}
