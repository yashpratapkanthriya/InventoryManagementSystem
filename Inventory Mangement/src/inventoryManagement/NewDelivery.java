package inventoryManagement;

import java.awt.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.*;


public class NewDelivery extends JFrame {
	JLabel ll1,ll2,ll3,ll4,ll5,ll6,ll7,ll8,ll9,ll10; //labelleft
	JLabel llh1;//labelleftheader
	JTextField tl1,tl2,tl3,tl4,tl5,tl6,tl7,tl8,tl9,tl10;//textFieldleft
	String sl1,sl2,sl3,sl4,sl5,sl6,sl7,sl8,sl9,sl10; //strings for text field
	JButton b1, b2,b3;// save to stocks and cancel
	int li1,li3,li6; // for normal numbers
	long li2,li7; // till now for dates
	double li8,li9,li10; //for prices
	Border border ;
	Integer i1,i2,i3;
		NewDelivery(){
			 setTitle("New Delivery");
			setVisible(true);
			setLocation(370,30);
			setSize(580,700);
			setLayout(null);
			Container c =getContentPane();
			llh1 = new JLabel("              Item Details");
			llh1.setFont(new Font("serif", Font.BOLD, 45));
			llh1.setBounds(5, 4, 553, 45);
			border = (BorderFactory.createLineBorder(Color.BLACK, 2));
			llh1.setBorder(border);
			ll1= new JLabel("Receiving No. :");
			ll1.setFont(new Font("CENTER_BASELINE ", Font.PLAIN, 19));
			ll1.setBounds(80, 75, 170, 23);
			c.add(ll1);
			tl1= new JTextField();
			tl1.setBounds(270, 75, 170, 23);
			tl1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					sl1=tl1.getText();
					//li1 = Integer.parseInt(sl1); //pass this
				}
			});
			c.add(tl1);
			
			
			ll2= new JLabel("Receiving Date:");
			ll2.setFont(new Font("CENTER_BASELINE ", Font.PLAIN, 19));
			ll2.setBounds(80,115, 170, 23);
			c.add(ll2);
			tl2= new JTextField();
			tl2.setBounds(270, 115, 170, 23);
			tl2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					//sl2=tl2.getText();  //pass this
				}
			});
			c.add(tl2);
			
			ll3= new JLabel("Item No. :");
			ll3.setFont(new Font("CENTER_BASELINE ", Font.PLAIN, 19));
			ll3.setBounds(80, 155, 170, 23);
			c.add(ll3);
			tl3= new JTextField();
			tl3.setBounds(270, 155, 170, 23);
			tl3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					//sl3=tl3.getText();
					//li3 = Integer.parseInt(sl3); //pass this
				}
			});
			c.add(tl3);
			
			
			ll4= new JLabel("Item Name:");
			ll4.setFont(new Font("CENTER_BASELINE ", Font.PLAIN, 19));
			ll4.setBounds(80, 195, 170, 23);
			c.add(ll4);
			tl4= new JTextField();
			tl4.setBounds(270, 195, 170, 23);
			tl4.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					//sl4=tl4.getText(); //pass this
				}
			});
			c.add(tl4);
			
			ll5= new JLabel("Description:");
			ll5.setFont(new Font("CENTER_BASELINE ", Font.PLAIN, 19));
			ll5.setBounds(80, 235, 170, 23);
			c.add(ll5);
			tl5= new JTextField();
			tl5.setBounds(270, 235, 170, 23);
			tl5.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					//sl5=tl5.getText(); //pass this
				}
			});
			c.add(tl5);
			
			ll6= new JLabel("Quantity:");
			ll6.setFont(new Font("CENTER_BASELINE ", Font.PLAIN, 19));
			ll6.setBounds(80, 275, 170, 23);
			c.add(ll6);
			tl6= new JTextField();
			tl6.setBounds(270,275, 170, 23);
			tl6.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					//sl6=tl6.getText(); 
					li6 = Integer.parseInt(sl6); //pass this
				}
			});
			c.add(tl6);
			
			ll7= new JLabel("Mfg. Date:");
			ll7.setFont(new Font("CENTER_BASELINE ", Font.PLAIN, 19));
			ll7.setBounds(80, 315, 170, 23);
			c.add(ll7);
			tl7= new JTextField();
			tl7.setBounds(270, 315, 170, 23);
			tl7.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					//sl7=tl7.getText(); //pass this
				}
			});
			c.add(tl7);
			
			ll8= new JLabel("Buying Price:");
			ll8.setFont(new Font("CENTER_BASELINE ", Font.PLAIN, 19));
			ll8.setBounds(80, 355, 170, 23);
			c.add(ll8);
			tl8= new JTextField();
			tl8.setBounds(270,355, 170, 23);
			tl8.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					//sl8=tl8.getText();
					//li8 = Double.parseDouble(sl8); //pass this
				}
			});
			c.add(tl8);
			
			ll9= new JLabel("Selling Price:");
			ll9.setFont(new Font("CENTER_BASELINE ", Font.PLAIN, 19));
			ll9.setBounds(80, 395, 170, 23);
			c.add(ll9);
			tl9= new JTextField();
			tl9.setBounds(270, 395, 170, 23);
			tl9.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					//sl9=tl9.getText();
					//li9 = Double.parseDouble(sl9); //pass this
				}
			});
			tl9.addFocusListener(new FocusListener() {
				
				@Override
				public void focusLost(FocusEvent e) {
					// TODO Auto-generated method stub
					i1= Integer.parseInt(tl6.getText());
					i2= Integer.parseInt(tl8.getText());
					i3= i1*i2;
					tl10.setText(i3.toString());
					
					
				}
				
				@Override
				public void focusGained(FocusEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			c.add(tl9);
			
			ll10= new JLabel("Total Price:");
			ll10.setFont(new Font("CENTER_BASELINE ", Font.PLAIN, 19));
			ll10.setBounds(80, 435, 170, 23);
			c.add(ll10);
			tl10= new JTextField();
			tl10.setBounds(270,435, 170, 23);
			tl10.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					
				}
			});
			
			c.add(tl10);
			
			b1= new JButton("Cancel");
			b1.setBounds(110, 520, 100, 40);
			b1.addActionListener(new ActionListener(){
				{
			}
				
				@Override
				public void actionPerformed(ActionEvent ae) {
					setVisible(false);
					
				}
			});
			c.add(b1);
			
			b2= new JButton("Save");
			b2.setBounds(340, 520, 100, 40);
			b2.addActionListener(new ActionListener(){
				{
			}
				
				@Override
				public void actionPerformed(ActionEvent ae) {
					//database things
					// Dialog box save successful
					// start here
					try{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanage","root","yashgta5");
						PreparedStatement stmt = con.prepareStatement("insert into stock values(?,?,?,?,?,?,?,?,?,?,?)");
						stmt.setString(1,null);
						stmt.setString(2,tl1.getText());
						stmt.setString(3,tl2.getText());
						stmt.setString(4,tl3.getText());
						stmt.setString(5,tl4.getText());
						stmt.setString(6,tl5.getText());
						stmt.setString(7,tl6.getText());
						stmt.setString(8,tl7.getText());
						stmt.setString(9,tl8.getText());
						stmt.setString(10,tl9.getText());
						stmt.setString(11,tl10.getText());
						stmt.executeUpdate();
						JOptionPane.showMessageDialog(null, "Record Saved");
						setVisible(false);
						
					}
						
					
					catch(Exception e){
					System.out.println(e);}
					
				}
			});
			c.add(b2);
			b3= new JButton("View Stocks");
			b3.setBounds(160, 580, 240, 40);
			b3.addActionListener(new ActionListener(){
				{
			}
				
				@Override
				public void actionPerformed(ActionEvent ae) {
				new Stocks();
					/*try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanage","root","123");
					PreparedStatement stmt = con.prepareStatement("SELECT * FROM stock");
					ResultSet rs = stmt.executeQuery();
					rs.next();
					String x = rs.getString(9);
					int y = Integer.parseInt(x);
					y= y+100;
					JOptionPane.showMessageDialog(null, rs);
					
				}
							
				catch(Exception e){
				System.out.println(e);}
				
					 */
			} });
			c.add(b3);
			
			
			c.add(llh1);
		}
		public static void main(String args[]){
			// temp const
			new NewDelivery();
		}
}
