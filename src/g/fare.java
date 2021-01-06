package g;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class fare extends JFrame {
    
public  JComboBox comboBox;
	private JPanel contentPane;
public JComboBox comboBox_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fare frame = new fare();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public fare() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fare Details");
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 28));
		lblNewLabel.setBounds(95, 11, 248, 53);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("From");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 23));
		lblNewLabel_1.setBounds(10, 103, 148, 42);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("To");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 23));
		lblNewLabel_1_1.setBounds(10, 187, 148, 42);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Fare");
		btnNewButton.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent arg0) {
			if(comboBox.getSelectedItem()=="Banashankari" && comboBox_1.getSelectedItem()=="Majestic")
			JOptionPane.showMessageDialog(null, "Fare=Rs.26\n Platform=1 ");
			if(comboBox.getSelectedItem()=="Majestic" && comboBox_1.getSelectedItem()=="Banashankari")
				JOptionPane.showMessageDialog(null, "Fare=Rs.26\n Platform=2");
			if(comboBox.getSelectedItem()=="Banashankari" && comboBox_1.getSelectedItem()=="Yeshwantpur")
				JOptionPane.showMessageDialog(null, "Fare=Rs.23	\n Platform=1 ");
				if(comboBox.getSelectedItem()=="Banashankari" && comboBox_1.getSelectedItem()=="Yeshwantpur")
					JOptionPane.showMessageDialog(null, "Fare=Rs.23	\n Platform=1 ");
				if(comboBox.getSelectedItem()=="Majestic" && comboBox_1.getSelectedItem()=="JP Nagar")
					JOptionPane.showMessageDialog(null, "Fare=Rs.23	\n Platform=1 ");

	          if(comboBox.getSelectedItem()=="JP Nagar" && comboBox_1.getSelectedItem()=="KR market")
				JOptionPane.showMessageDialog(null, "Fare=Rs.23\n Platform=1 ");
			  if(comboBox.getSelectedItem()=="KR market" && comboBox_1.getSelectedItem()=="JP Nagar")
					JOptionPane.showMessageDialog(null, "Fare=Rs.23\n Platform=2");
				if(comboBox.getSelectedItem()=="JP Nagar" && comboBox_1.getSelectedItem()=="Yeshwantpur")
					JOptionPane.showMessageDialog(null, "Fare=Rs.42	\n Platform=1 ");
                if(comboBox.getSelectedItem()=="Yelachenahalli" && comboBox_1.getSelectedItem()=="Majestic")
	 			JOptionPane.showMessageDialog(null, "Fare=Rs.33\n Platform=1 ");
				if(comboBox.getSelectedItem()=="Majestic" && comboBox_1.getSelectedItem()=="Yelachenahalli")
					JOptionPane.showMessageDialog(null, "Fare=Rs.33\n Platform=2");
				if(comboBox.getSelectedItem()=="Yelachenahalli" && comboBox_1.getSelectedItem()=="Yeshwantpur")
					JOptionPane.showMessageDialog(null, "Fare=Rs.42	\n Platform=1 ");

	if(comboBox.getSelectedItem()=="Mysore road" && comboBox_1.getSelectedItem()=="Majestic")
				JOptionPane.showMessageDialog(null, "Fare=Rs.20\n Platform=1 ");
				if(comboBox.getSelectedItem()=="Majestic" && comboBox_1.getSelectedItem()=="Mysore road")
					JOptionPane.showMessageDialog(null, "Fare=Rs.20\n Platform=2");
				if(comboBox.getSelectedItem()=="Mysore road" && comboBox_1.getSelectedItem()=="Yeshwantpur")
					JOptionPane.showMessageDialog(null, "Fare=Rs.38	\n Platform=1 ");

	if(comboBox.getSelectedItem()=="Nagasandra" && comboBox_1.getSelectedItem()=="Majestic")
				JOptionPane.showMessageDialog(null, "Fare=Rs.38\n Platform=1 ");
				if(comboBox.getSelectedItem()=="Majestic" && comboBox_1.getSelectedItem()=="Nagasandra")
					JOptionPane.showMessageDialog(null, "Fare=Rs.38\n Platform=2");
				if(comboBox.getSelectedItem()=="Nagasandra" && comboBox_1.getSelectedItem()=="Yeshwantpur")
					JOptionPane.showMessageDialog(null, "Fare=Rs.20	\n Platform=1 ");

	if(comboBox.getSelectedItem()=="Baiyappanahalli" && comboBox_1.getSelectedItem()=="Majestic")
				JOptionPane.showMessageDialog(null, "Fare=Rs.28\n Platform=1 ");
				if(comboBox.getSelectedItem()=="Majestic" && comboBox_1.getSelectedItem()=="Baiyappanahalli")
					JOptionPane.showMessageDialog(null, "Fare=Rs.28\n Platform=2");
				if(comboBox.getSelectedItem()=="Baiyappanahalli" && comboBox_1.getSelectedItem()=="Yeshwantpur")
					JOptionPane.showMessageDialog(null, "Fare=Rs.42	\n Platform=1 ");


	if(comboBox.getSelectedItem()=="Indiranagar" && comboBox_1.getSelectedItem()=="Majestic")
				JOptionPane.showMessageDialog(null, "Fare=Rs.26\n Platform=1 ");
				if(comboBox.getSelectedItem()=="Majestic" && comboBox_1.getSelectedItem()=="Indiranagar")
					JOptionPane.showMessageDialog(null, "Fare=Rs.26\n Platform=2");
				if(comboBox.getSelectedItem()=="Indiranagar" && comboBox_1.getSelectedItem()=="Yeshwantpur")
					JOptionPane.showMessageDialog(null, "Fare=Rs.38	\n Platform=1 ");
}
		});
		btnNewButton.setBounds(161, 269, 89, 23);
		contentPane.add(btnNewButton);
		
	    comboBox = new JComboBox();
		comboBox.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		comboBox.setForeground(new Color(255, 105, 180));
		comboBox.setBounds(122, 117, 221, 22);
		comboBox.addItem("Source");
		comboBox.addItem("Banashankari");
		comboBox.addItem("Majestic");
		comboBox.addItem("Yeshwantpur");
		comboBox.addItem("JP Nagar");
		comboBox.addItem("KR market");
		comboBox.addItem("Yelachenahalli");
		comboBox.addItem("Mysore road");
		comboBox.addItem("Nagasandra");
		comboBox.addItem("Baiyappanahalli ");
		comboBox.addItem("Indiranagar");
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 16));
		comboBox_1.setForeground(new Color(255, 105, 180));
		comboBox_1.setMaximumRowCount(15);
		comboBox_1.setBounds(122, 201, 221, 22);
		comboBox_1.addItem("Destination");
		comboBox_1.addItem("Banashankari");
		comboBox_1.addItem("Majestic");
		comboBox_1.addItem("Yeshwantpur");
		comboBox_1.addItem("JP Nagar");
		comboBox_1.addItem("KR market");
		comboBox_1.addItem("Yelachenahalli");
		comboBox_1.addItem("Mysore road");
		comboBox_1.addItem("Nagasandra");
		comboBox_1.addItem("Baiyappanahalli ");
		comboBox_1.addItem("Indiranagar");
		contentPane.add(comboBox_1);
		
		JButton btnNewButton_1 = new JButton("Main Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nammametro n=new nammametro();
				n.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(0, 302, 117, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(fare.class.getResource("/g/aaaa.png")));
		lblNewLabel_2.setBounds(0, 0, 429, 325);
		contentPane.add(lblNewLabel_2);
	}
}
