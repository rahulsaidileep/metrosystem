package g;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class contactno extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contactno frame = new contactno();
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
	public contactno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 373);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contact Info");
		lblNewLabel.setForeground(new Color(102, 205, 170));
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 32));
		lblNewLabel.setBounds(183, 11, 304, 52);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Main Menu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			nammametro n=new nammametro();
			n.setVisible(true);
			dispose();
			}
		});
		btnNewButton.setBounds(537, 311, 131, 23);
		contentPane.add(btnNewButton);
		
		JTextPane txtpnAdministrationPalguniP = new JTextPane();
		txtpnAdministrationPalguniP.setBackground(new Color(245, 245, 245));
		txtpnAdministrationPalguniP.setForeground(new Color(160, 82, 45));
		txtpnAdministrationPalguniP.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		txtpnAdministrationPalguniP.setText("Administration: Palguni R H ,94419421XX\r\nLogin And Route Information : P R Sai Rahul,91828550XX\r\nRecharge and payment of metro and metro cards: Nishant ,94418421XX\r\nOther quieres and compliant: Omkar,91828551XX\r\n\r\nEmail-id:\r\nnammametro123@gmail.com\r\nbangaloremetro@gmail.com\r\n\r\n\r\n\r\n");
		txtpnAdministrationPalguniP.setBounds(159, 86, 509, 188);
		contentPane.add(txtpnAdministrationPalguniP);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(contactno.class.getResource("/g/asdfg.png")));
		lblNewLabel_1.setBounds(0, 0, 668, 334);
		contentPane.add(lblNewLabel_1);
	}

}
