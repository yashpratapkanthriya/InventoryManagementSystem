package inventoryManagement;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
	JButton b1,b2;
	JTextField username; JPasswordField password;
	JLabel u,p,t;
	String s1,s2;
	Login(){
		setTitle("Login");
		setSize(680,650);
		setLocation(300, 25);
		setVisible(true);
		setLayout(null);
		Container c = getContentPane();
		//c.setBackground(Color.red);
		t= new JLabel("Welcome to Inventory Management");
		t.setFont(new Font("serif", Font.BOLD+Font.ITALIC, 30));
		u = new JLabel("Username");
		p = new JLabel("Password");
		u.setBounds(100,170,120,40);
		p.setBounds(100,280,120,40);
		u.setFont(new Font("Courier", Font.BOLD, 25));
		p.setFont(new Font("Courier", Font.BOLD, 25));
		u.setVisible(true);
		p.setVisible(true);
		t.setBounds(110,0,600,80);
		username= new JTextField();
		username.setBounds(320,170,200,40);
		password = new JPasswordField();
		password.setEchoChar('*');
		password.setBounds(320,280,200,40);
		b1 = new JButton("Login");
		b2 = new JButton("cancel");
		b1.setBounds(160,400,120,50);
		b2.setBounds(380,400,120,50);
		username.addActionListener(this);
		password.addActionListener(this);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				{ if(username.getText().equals("admin") && password.getText().equals("admin")){
					new HomePage();
					setVisible(false);
				} else{
					JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
				}
				}
				
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				{ setVisible(false);
				}
				
			}
		});
		c.add(u);
		c.add(p);
		c.add(t);
		c.add(b1);
		c.add(b2);
		c.add(username);
		c.add(password);
	}

	public void actionPerformed(ActionEvent ae){
		s1=username.getText();
		s2=password.getText();
		
	}
	public static void main(String args[]){
		// This object is temporary 
	Login l = new Login();
	 l.setVisible(true);
	 l.setTitle("Login Form Example");
	 l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 l.setBounds(100,100,700,500); 
	}

}
