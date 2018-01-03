package inventoryManagement;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.color.*;

import javax.swing.*;
import javax.swing.border.Border;

public class Settings  extends JFrame{
	JButton b1,b2,b3;
	JLabel lh1;
	Settings(){
		setSize(700,450);
		setLocation(300,90);
		 setVisible(true);
		 setTitle("Settings");
		 setBackground(Color.BLUE);
		 Container c = getContentPane();
		 setLayout(null);
		 
		 
		 lh1 = new JLabel("Amazon Services Private Limited ");
		 lh1.setBounds(70,0,680,60);
		 lh1.setFont(new Font("Serif ", Font.PLAIN+Font.BOLD, 36));
		 c.add(lh1);
		
		 
		 
		 
		b1= new JButton("Add User");
		b1.setBounds(30,90, 230, 40);
		b1.setFont(new Font("CENTER_BASELINE ", Font.PLAIN+Font.BOLD, 20));
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null,"Permission Not Granted By Super Admin");
			}
		});
		c.add(b1);
		
		
		
		
		b2 = new JButton("Change Username");
		b2.setBounds(30, 170, 230, 40);
		b2.setFont(new Font("CENTER_BASELINE ", Font.PLAIN+Font.BOLD, 20));
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		c.add(b2);
		
		
		
		b3 = new JButton("Change Password");
		b3.setBounds(30, 250, 230,40);
		b3.setFont(new Font("CENTER_BASELINE ", Font.PLAIN+Font.BOLD, 20));
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		c.add(b3);
	}
		public static void main(String args[]){
			new Settings();
		}
}
