package g;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class register extends JFrame {

	protected static final AbstractButton Other = null;
	private JPanel contentPane;
	private JTextField first;
	private JTextField email;
	private JTextField phone;
	private JTextField username;
	private JPasswordField password;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	protected AbstractButton Female;
	private JTextField aadhar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register frame = new register();
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
	public register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 441);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Already have a account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			looogo l=new looogo();
			l.setVisible(true);
			dispose();
			}
		});
		
		aadhar = new JTextField();
		aadhar.setBounds(252, 78, 196, 20);
		contentPane.add(aadhar);
		aadhar.setColumns(10);
		
		JLabel lblLastName = new JLabel("Aadhar card no.\r\n");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Verdana", Font.ITALIC, 19));
		lblLastName.setBounds(10, 73, 195, 23);
		contentPane.add(lblLastName);
		btnNewButton.setBounds(129, 335, 195, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSignUp = new JButton("Sign UP");
		btnSignUp.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/metro","root","9182");
					String sql="Insert into  metro.register values(?,?,?,?,?,?)";
					PreparedStatement s= con.prepareStatement(sql);
				    s.setString(1,first.getText());
				    s.setString(2,aadhar.getText());
				    s.setString(3,email.getText());
				    s.setString(4,phone.getText());
				    s.setString(5,username.getText());
				    s.setString(6,password.getText());
				    s.executeUpdate();
				    SaveToDatabase();
				    JOptionPane.showMessageDialog(null,"success");
					
				} catch(Exception e ){
					System.out.print(e);}
			}

			private void SaveToDatabase() {
				// TODO Auto-generated method stub
				
			}	
		});
		btnSignUp.setBounds(153, 369, 155, 23);
		contentPane.add(btnSignUp);
		
		JLabel lblNewLabel = new JLabel("Full Name");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 19));
		lblNewLabel.setBounds(10, 29, 167, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblEmailid = new JLabel("Email-ID");
		lblEmailid.setForeground(Color.WHITE);
		lblEmailid.setFont(new Font("Verdana", Font.ITALIC, 19));
		lblEmailid.setBounds(10, 128, 167, 23);
		contentPane.add(lblEmailid);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setForeground(Color.WHITE);
		lblPhoneNumber.setFont(new Font("Verdana", Font.ITALIC, 19));
		lblPhoneNumber.setBounds(10, 183, 167, 23);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblUsername = new JLabel("Username\r\n");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Verdana", Font.ITALIC, 19));
		lblUsername.setBounds(10, 233, 167, 23);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Verdana", Font.ITALIC, 19));
		lblPassword.setBounds(10, 288, 167, 23);
		contentPane.add(lblPassword);
		
		first = new JTextField();
		first.setBounds(252, 30, 196, 20);
		contentPane.add(first);
		first.setColumns(10);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(252, 129, 196, 20);
		contentPane.add(email);
		
		phone = new JTextField();
		phone.setColumns(10);
		phone.setBounds(252, 184, 196, 20);
		contentPane.add(phone);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(252, 234, 196, 20);
		contentPane.add(username);
		
		password = new JPasswordField();
		password.setBounds(252, 280, 196, 20);
		contentPane.add(password);
		
		JLabel lblNewLabel_1 = new JLabel("REGISTER");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Algerian", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(147, 0, 177, 34);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setIcon(new ImageIcon(register.class.getResource("/g/world.png")));
		lblNewLabel_2.setBounds(39, 45, 434, 319);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Main Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nammametro n=new nammametro();
				n.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_1.setBounds(380, 0, 103, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Remember not to forget username and password");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(107, 311, 376, 36);
		contentPane.add(lblNewLabel_3);
	}
}
