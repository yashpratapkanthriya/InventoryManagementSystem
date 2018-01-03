package inventoryManagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WelcomePage1 extends JFrame implements ActionListener{
	JLabel j1,j2;
	JButton b1,b2;
	ImageIcon i1;
	WelcomePage1(){
		setTitle("Welcome to Inventory Management");
		setResizable(true);
		setLocation(300, 25);
		setSize(680,700);
		setVisible(true);
		setLayout(null);
		Container c= getContentPane();
		i1 = new ImageIcon("C:/java/JavaPoject/Images/WelcomeImage.jpg");
		j1 = new JLabel(i1);
		j1.setBounds(8,0,650,580);
		//j2 = new JLabel("Welcome to Inventory Management System");
		//j2.setBounds(0,0,670,40);
		b1 = new JButton("Login");
		b1.setBounds(160,600,120,50);
		b1.addActionListener(this);
		b2= new JButton ("Cancel");
		b2.setBounds(380,600,120,50);
		b2.addActionListener(this);
		//b2 = new JButton("Register");
		//j2.setFont(new Font("Courier", Font.BOLD,30));
		//j1.add(j2);
		c.add(b1);
		c.add(b2);
		c.add(j1);

		
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b1){
			new Login();
			setVisible(false);
		}
		if(ae.getSource()==b2){
			setVisible(false);
		}
	}
	public static void main(String args[]){
		new WelcomePage1();
	}

}
