package g;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.Color;

public class Aboutus extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aboutus frame = new Aboutus();
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
	public Aboutus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 450);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Menu(back)");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nammametro namma=new nammametro();
				namma.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(676, 0, 104, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("About us :");
		lblNewLabel_1.setForeground(Color.MAGENTA);
		lblNewLabel_1.setBackground(Color.GREEN);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel_1.setBounds(10, 0, 235, 50);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Aboutus.class.getResource("/g/aqa.png")));
		lblNewLabel_2.setBounds(418, 45, 352, 355);
		contentPane.add(lblNewLabel_2);
		
		JTextPane txtpnBangaloreMetroRail = new JTextPane();
		txtpnBangaloreMetroRail.setBackground(Color.WHITE);
		txtpnBangaloreMetroRail.setForeground(new Color(128, 0, 0));
		txtpnBangaloreMetroRail.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		txtpnBangaloreMetroRail.setText("Bangalore Metro Rail Corporation Limited (BMRCL), a joint venture of Government of India and Government of Karnataka is a Special Purpose Vehicle entrusted with the responsibility of implementation of Bangalore Metro Rail Project. \r\n\r\nBangalore Metro, christened as \"Namma Metro\", not only adds to the beauty of Bangalore skyline, but immensely adds to the comfort level of travel. Besides this, Namma Metro is a major environment friendly addition to the Bangalore City as it significantly contribute to the reduction of carbon emissions.\r\n\r\nThe project has an East-West corridor - 18.10 km long, starting from Baiyappanahalli in the East and terminating at Mysore Road terminal in the West and a 24.20 km North-South corridor commencing at Nagasandra in the North and terminating at Puttenahalli in the South. \r\n\r\nThis is the First Metro rail project in India commissioned with 750V DC Third Rail on Standard Guage.");
		txtpnBangaloreMetroRail.setBounds(0, 45, 423, 366);
		contentPane.add(txtpnBangaloreMetroRail);
	}
}
