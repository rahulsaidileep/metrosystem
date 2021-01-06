package g;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class loginsuccesful extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginsuccesful frame = new loginsuccesful();
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
	public loginsuccesful() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 351);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Main Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nammametro n=new nammametro();
				n.setVisible(true);
				loginsuccesful.super.dispose();
			}
		});
		btnNewButton.setBounds(379, 0, 138, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loginsuccesful.super.dispose();
				looogo g=new looogo();
				g.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(379, 22, 138, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("For Complaint registry(click the button):");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(0, 0, 436, 38);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Click to watch videos of metro");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Desktop browser=Desktop.getDesktop();
					browser.browse(new URI("https://www.youtube.com/watch?v=3R1rEdi5rOw&t=2s"));;
				}catch(Exception err) {}
			}

		});
		btnNewButton_2.setBounds(0, 289, 244, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Pay or Recharge:");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(148, 101, 288, 32);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnFromUpixxx = new JTextPane();
		txtpnFromUpixxx.setText("From UPI:\r\n 9182855XXX\r\n 9353724XXX\r\nBank Acoount Details:\r\n 37486265XXXXX\r\n 52485155XXXXX\r\n");
		txtpnFromUpixxx.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtpnFromUpixxx.setBounds(162, 121, 197, 156);
		contentPane.add(txtpnFromUpixxx);
		
		JLabel lblNewLabel_3 = new JLabel("Provide necessary details by calling the upi phone numbers");
		lblNewLabel_3.setForeground(new Color(255, 69, 0));
		lblNewLabel_3.setFont(new Font("Algerian", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(10, 274, 426, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(loginsuccesful.class.getResource("/g/aaaaaaaaaaaaaaa.png")));
		lblNewLabel_2.setBounds(0, 11, 546, 388);
		contentPane.add(lblNewLabel_2);
	}
}
