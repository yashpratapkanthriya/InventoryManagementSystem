package inventoryManagement;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class HomePage extends JFrame {
	JButton b1,b2,b3,b4;
	ImageIcon i1,i2,i3,i4;// for buttons images
	JLabel l1,l2,l3,l4;//for buttons
	JLabel li1,li2;//for two big images
	JLabel lu1,lu2,lu3,lu4,lh1;// for top label adds (2 images  and  2 text) 
	ImageIcon iu11,iu12;//for top two small images
	ImageIcon iu1,iu2; // for top and right bottom
	HomePage(){
		setSize(1300,735);
		setVisible(true);
		setLayout(null);
		Container c = getContentPane();
		 
		 
		 
		l1=new JLabel("New Delivery");
		l2=new JLabel("Sale");
		l3=new JLabel("Stocks");
		l4=new JLabel("Setting");
		iu1= new ImageIcon("C:/java/JavaPoject/Images/H1.jpg");
		li1 = new JLabel(iu1);
		li1.setBounds(0, 0, 1280, 160);
		iu11=new ImageIcon("C:/java/JavaPoject/Images/H2.jpg");
		lu1= new JLabel(iu11);
		lu1.setBounds(20,15,312,114);
		li1.add(lu1);
		iu12 = new ImageIcon("C:/java/JavaPoject/Images/H3.jpg");
		lu2 =new JLabel(iu12);
		lu2.setBounds(1140, 15, 112, 112);
		li1.add(lu2);
		lu4=new JLabel("Admin");
		lu4.setFont(new Font("Courier", Font.BOLD, 20));
		lu4.setForeground(Color.white);
		lu4.setBounds(1170,130,60,20);
		li1.add(lu4);
		lu3 = new JLabel("Inventory and Sale Control");
		lu3.setBounds(30, 130, 450, 30);
		lu3.setFont(new Font("Serif", Font.BOLD+Font.ITALIC, 25));
		lu3.setForeground(Color.white);
		li1.add(lu3);
		i1 = new ImageIcon("C:/java/JavaPoject/Images/L1.jpg");
		b1 =  new JButton("New Delivery",i1);
		b1.setVerticalTextPosition(SwingConstants.BOTTOM);
	    b1.setHorizontalTextPosition(SwingConstants.CENTER);
	    b1.setFont(new Font("Arial", Font.PLAIN, 20));
		b1.setBounds(215, 200, 224, 215);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				// constructor for new delivery page
				 new NewDelivery();
				// setVisible(false);
			}
		});
		c.add(b1);
		i2 = new ImageIcon("C:/java/JavaPoject/Images/L2.jpg");
		b2 = new JButton("Sale",i2);
		b2.setVerticalTextPosition(SwingConstants.BOTTOM);
	    b2.setHorizontalTextPosition(SwingConstants.CENTER);
	    b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				// constructor for new delivery page
				new Sale();
				
				// setVisible(false);
			}
		});
	    b2.setFont(new Font("Arial", Font.PLAIN, 20));
	    b2.setBounds(845, 200, 224, 215);
	    c.add(b2);
	    i3 = new ImageIcon("C:/java/JavaPoject/Images/L3.jpg");
	    b3 = new JButton("Stocks",i3);
	    b3.setVerticalTextPosition(SwingConstants.BOTTOM);
	    b3.setHorizontalTextPosition(SwingConstants.CENTER);
	    b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				// constructor for new delivery page
				new Stocks();
				// setVisible(false);
			}
		});
	    b3.setFont(new Font("Arial", Font.PLAIN, 20));
	    b3.setBounds(215, 450, 224, 215);
	    c.add(b3);
	    i4 = new ImageIcon("C:/java/JavaPoject/Images/L4.jpg");
	    b4= new JButton("Setting", i4);
	    b4.setVerticalTextPosition(SwingConstants.BOTTOM);
	    b4.setHorizontalTextPosition(SwingConstants.CENTER);
	    b4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				// constructor for new delivery page
				new Settings();
				// setVisible(false);
			}
		});
	    b4.setFont(new Font("Arial", Font.PLAIN, 20));
	    b4.setBounds(845, 450, 224, 215);
	    c.add(b4);
		
		//c.setBackground(Color.lightGray);
		c.add(li1);
	}
	public static void main(String args[]){
	// temp
		new HomePage(); 
	}
}
