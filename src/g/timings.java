package g;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;

public class timings extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnPurpleLine;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					timings frame = new timings();
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
	public timings() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 178);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(86, 192, 148, -34);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Green line");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				green green =new green();
				green.setVisible(true);
				timings.super.dispose();
			}
		});
		btnNewButton.setIcon(null);
		btnNewButton.setBounds(10, 29, 138, 30);
		contentPane.add(btnNewButton);
		
		btnPurpleLine = new JButton("Purple  line");
		btnPurpleLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				purple p=new purple();
				p.setVisible(true);
				timings.super.dispose();
			}
		});
		btnPurpleLine.setBackground(Color.MAGENTA);
		btnPurpleLine.setBounds(10, 81, 138, 30);
		contentPane.add(btnPurpleLine);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Monisha Patil\\Pictures\\aaa.png"));
		lblNewLabel.setBounds(153, 29, 65, 30);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(timings.class.getResource("/g/grren.png")));
		lblNewLabel_1.setBounds(133, 81, 72, 30);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnGreenLine = new JTextPane();
		txtpnGreenLine.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		txtpnGreenLine.setForeground(Color.GREEN);
		txtpnGreenLine.setText("Green Line (24 Stops):\r\nNagasandra  to  Yelanchenahalli\r\n");
		txtpnGreenLine.setBounds(215, 15, 318, 44);
		contentPane.add(txtpnGreenLine);
		
		JTextPane txtpnPurpleLine = new JTextPane();
		txtpnPurpleLine.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
		txtpnPurpleLine.setForeground(Color.MAGENTA);
		txtpnPurpleLine.setText("Purple Line (17 Stops) :\r\nBaiyappanahalli   to   Mysore Road\r\n");
		txtpnPurpleLine.setBounds(215, 70, 318, 44);
		contentPane.add(txtpnPurpleLine);
		
		btnNewButton_1 = new JButton("Back to Main Menu....");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nammametro namma=new nammametro();
				namma.setVisible(true);
				
			}
		});
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(357, 116, 171, 23);
		contentPane.add(btnNewButton_1);
	}
}
