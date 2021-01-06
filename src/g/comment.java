package g;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import javax.swing.JFormattedTextField;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.border.LineBorder;
import javax.swing.JFormattedTextField;

public class comment extends JFrame {

	private JPanel contentPane;
	private JTextField from;
	private JTextField complaint;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					comment frame = new comment();
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
	public comment() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 462);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("(or email-id)");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setBounds(60, 116, 135, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("From(with phone no.)");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 83, 185, 47);
		contentPane.add(lblNewLabel_1);
		
		complaint = new JTextField();
		complaint.setBounds(193, 151, 496, 164);
		contentPane.add(complaint);
		complaint.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Complaint box");
		lblNewLabel.setForeground(new Color(105, 105, 105));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD | Font.ITALIC, 31));
		lblNewLabel.setBounds(295, 11, 324, 39);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Main Menu\r\n");
		btnNewButton.setBackground(new Color(154, 205, 50));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nammametro n=new nammametro();
				n.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(627, 400, 136, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/metro","root","9182");
					String sql="Insert into  metro.complain values(?,?)";
					PreparedStatement s= con.prepareStatement(sql);
				    s.setString(1,from.getText());
				    s.setString(2,complaint.getText());
				    s.executeUpdate();
				    SaveToDatabase();
				    JOptionPane.showMessageDialog(null,"Your response has been recorded");
					
				} catch(Exception e ){
					System.out.print(e);}
			}
		});
		btnSend.setBackground(new Color(135, 206, 235));
		btnSend.setBounds(0, 400, 74, 23);
		contentPane.add(btnSend);
		
		JLabel lblNewLabel_1_1 = new JLabel("Complaint");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 139));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(29, 139, 136, 33);
		contentPane.add(lblNewLabel_1_1);
		
		from = new JTextField();
		from.setBounds(193, 98, 243, 20);
		contentPane.add(from);
		from.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setIcon(new ImageIcon(comment.class.getResource("/g/asdfg.png")));
		lblNewLabel_2.setBounds(0, 0, 763, 423);
		contentPane.add(lblNewLabel_2);
	}

	protected void SaveToDatabase() {
		// TODO Auto-generated method stub
		
	}
}
