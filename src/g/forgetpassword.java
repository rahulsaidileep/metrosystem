package g;

import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class forgetpassword extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField keyword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					forgetpassword frame = new forgetpassword();
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
	public forgetpassword() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 295);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Forget or change password");
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel.setBounds(90, 11, 321, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("HP Simplified Light", Font.BOLD, 17));
		lblNewLabel_1.setBounds(62, 87, 144, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Keyword");
		lblNewLabel_1_1.setFont(new Font("HP Simplified Light", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(62, 129, 131, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Verify");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/metro","root","9182");
					Statement stmt=con.createStatement();
					String sql="Select * from metro.login where username='"+username.getText()+"' and keyword ='"+keyword.getText()+"'";
				    SaveToDatabase();
				    ResultSet res=stmt.executeQuery(sql);
				    if(res.next()) {
				    	JOptionPane.showMessageDialog(null, "Your username and keyword is correct");
				    	dispose();
				    }
				    else
				    	JOptionPane.showMessageDialog(null, "Username or keyword is incorrect");
				        con.close();
					
				} catch(Exception e ){
					System.out.print(e);}
			}

			private void SaveToDatabase() {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setBounds(119, 190, 239, 23);
		contentPane.add(btnNewButton);
		
		username = new JTextField();
		username.setBounds(216, 94, 226, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		keyword = new JTextField();
		keyword.setColumns(10);
		keyword.setBounds(215, 136, 226, 20);
		contentPane.add(keyword);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				looogo l=new looogo();
				l.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(386, 235, 72, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(forgetpassword.class.getResource("/g/boox.png")));
		lblNewLabel_2.setBounds(0, 0, 500, 258);
		contentPane.add(lblNewLabel_2);
	}
}
