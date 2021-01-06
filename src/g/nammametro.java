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

public class nammametro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nammametro frame = new nammametro();
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
	public nammametro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 803, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Timings of Metro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				timings t =new timings();
				t.setVisible(true);
				nammametro.super.dispose();
			}
		});
		btnNewButton.setBounds(537, 11, 240, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Route");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				route route=new route();
				route.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(278, 11, 186, 39);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Fare Details");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			fare f=new fare();
			f.setVisible(true);
			dispose();
			}
		});
		btnNewButton_2.setBounds(278, 140, 186, 39);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("About us");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Aboutus about=new Aboutus();
				about.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_3.setBounds(10, 11, 186, 39);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Do's and Don'ts");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dosanddonts t =new dosanddonts();
				t.setVisible(true);
			    dispose();
			}
		});
		btnNewButton_4.setBounds(10, 140, 186, 39);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Login/Smart Card");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			looogo l = new looogo();
			l.setVisible(true);
			dispose();
			}
			
		});
		btnNewButton_5.setBounds(537, 150, 240, 39);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Contact info");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			contactno n =new contactno();
			n.setVisible(true);
			dispose();
			}
		});
		btnNewButton_6.setBounds(537, 335, 240, 39);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Complaint ");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			comment c = new comment();
			c.setVisible(true);
			dispose();}
		});
		btnNewButton_7.setBounds(10, 335, 186, 39);
		contentPane.add(btnNewButton_7);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(nammametro.class.getResource("/g/mem.jpg")));
		lblNewLabel.setBounds(0, 0, 787, 414);
		contentPane.add(lblNewLabel);
	}
}
