package g;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.JEditorPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

public class dosanddonts extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dosanddonts frame = new dosanddonts();
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
	public dosanddonts() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 428);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Platform");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dplatform p=new dplatform();
				p.setVisible(true);
				dosanddonts.super.dispose();
			}
		});
		btnNewButton.setBounds(527, 70, 156, 33);
		contentPane.add(btnNewButton);
		
		JButton btnInsidetrain = new JButton("InsideTrain");
		btnInsidetrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dinsidetrain a=new dinsidetrain();
				a.setVisible(true);
				dosanddonts.super.dispose();
			}
		});
		btnInsidetrain.setBounds(527, 147, 156, 33);
		contentPane.add(btnInsidetrain);
		
		JButton btnNewButton_1_1 = new JButton("AFC Gates");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dafcgates s=new dafcgates();
				s.setVisible(true);
				dosanddonts.super.dispose();
			}
		});
		btnNewButton_1_1.setBounds(527, 309, 156, 33);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Escalator");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			descalator d =new descalator();
			d.setVisible(true);
			dosanddonts.super.dispose();
			}
		});
		btnNewButton_1_1_1.setBounds(527, 229, 156, 33);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1 = new JButton("Main Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nammametro n=new nammametro();
				n.setVisible(true);
				dosanddonts.super.dispose();}
		});
		btnNewButton_1.setBounds(607, 3, 109, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Do's ");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(0, 3, 61, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("and");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(58, 3, 61, 44);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Don'ts :");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2.setBounds(106, 3, 97, 44);
		contentPane.add(lblNewLabel_2);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		desktopPane.setBackground(Color.YELLOW);
		desktopPane.setBounds(510, 58, 188, 320);
		contentPane.add(desktopPane);
		
		JTextPane txtpnThereAreSome = new JTextPane();
		txtpnThereAreSome.setFont(new Font("Tahoma", Font.ITALIC, 18));
		txtpnThereAreSome.setText("There are some rules which are to be followed in metro stations in platforms,inside the train,escalotors and AFC gates for the safety of citizens.\r\nPlease read the safety guidelines carefully and follow them.");
		txtpnThereAreSome.setBounds(10, 58, 490, 94);
		contentPane.add(txtpnThereAreSome);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(dosanddonts.class.getResource("/g/safety.png")));
		lblNewLabel_3.setBounds(58, 156, 365, 222);
		contentPane.add(lblNewLabel_3);
	}
}
