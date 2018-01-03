package inventoryManagement;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.border.Border;
public class Sale extends JFrame {
	JButton b1,b2,b3;
	public static JTextField t1, t2,t3,t4,t5,t6,t7,t8;
	public static JTextField t9;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JLabel lh1;
	Border border;
	String s1,s2;
	ResultSet rs,rs1;
	Integer i1,i2,i3;
	 Sale(){
		 setSize(480,600);
		 setLocation(400, 40);
		 setVisible(true);
		 Container c = getContentPane();
		 setLayout(null);
		 setTitle("Sale");
		 
		 lh1 = new JLabel("      Product Sale Window");
		 lh1.setBounds(6, 4, 450, 35);
		 lh1.setFont(new Font("serif", Font.BOLD, 35));
		 border = (BorderFactory.createLineBorder(Color.BLACK, 2));
		 lh1.setBorder(border);
		 c.add(lh1);
		 
		 l1 = new JLabel("Item No. :");
		 l1.setBounds(80, 90, 100,32);
		 l1.setFont(new Font("CENTER_BASELINE ", Font.PLAIN+Font.BOLD, 22));
		 c.add(l1);
		 t1= new JTextField();
		 t1.setBounds(185,90,200,32);
		 /*
		  * add focus event method to get things from the table and set text on the upcoming text fields
		  */
		 t1.addActionListener(new ActionListener(){
		@Override
			public void actionPerformed(ActionEvent ae) {
				// TODO Auto-generated method stub
		/*	try{
				s1= t1.getText();
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanage","root","root");
				PreparedStatement stmt = con.prepareStatement("SELECT * FROM stock where itemno = ");
				
			}
		
		
		
				catch(Exception e){
				System.out.println(e);}
		
		}*/
		}
		 }

		);
		 t1.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent fe) {
				// TODO Auto-generated method stub
				if(t1.getText().length()!=0)
				{
				try{
					s1= t1.getText();
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanage","root","yashgta5");
					PreparedStatement stmt = con.prepareStatement("SELECT * FROM stock where itemno = '"+s1+"'");
					rs=stmt.executeQuery();
					if(rs.next()){
						t2.setText(rs.getString(5));
						t3.setText(rs.getString(6));
						t4.setText(rs.getString(8));
						t5.setText(rs.getString(7));
						t6.setText(rs.getString(10));
					}
					
				}
					catch(Exception e){
					System.out.println(e);}
			
			}
				
			
			
			
		}

			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				
			}}); 
		 c.add(t1);
		 
		 
		 
		 l2 = new JLabel("Item Name:");
		 l2.setBounds(60, 125, 130,32);
		 l2.setFont(new Font("CENTER_BASELINE ", Font.PLAIN+Font.BOLD, 22));
		 c.add(l2);
		 t2= new JTextField();
		 t2.setBounds(185,125,200,32);
		 t2.addActionListener(new ActionListener(){
				@Override
					public void actionPerformed(ActionEvent ae) {
						// TODO Auto-generated method stub
						
					}
				});
		 c.add(t2);
		 
		 
		 l3 = new JLabel("Description:");
		 l3.setBounds(60, 160, 130,32);
		 l3.setFont(new Font("CENTER_BASELINE ", Font.PLAIN+Font.BOLD, 22));
		 c.add(l3);
		 t3= new JTextField();
		 t3.setBounds(185,160,200,32);
		 t3.addActionListener(new ActionListener(){
			 @Override
			 public void actionPerformed(ActionEvent ae) {
				 // TODO Auto-generated method stub
								
			 }
		 });
		 c.add(t3);
		 
		 

		 l4 = new JLabel("MFG. Date:");
		 l4.setBounds(60, 195, 130,32);
		 l4.setFont(new Font("CENTER_BASELINE ", Font.PLAIN+Font.BOLD, 22));
		 c.add(l4);
		 t4= new JTextField();
		 t4.setBounds(185,195,200,32);
		 t4.addActionListener(new ActionListener(){
			 @Override
			 public void actionPerformed(ActionEvent ae) {
				 // TODO Auto-generated method stub
				 
			 }
		 });
		 c.add(t4);

		 
		 
		 l5 = new JLabel("Available Quantity:");
		 l5.setBounds(10, 230, 200,32);
		 l5.setFont(new Font("CENTER_BASELINE ", Font.PLAIN+Font.BOLD, 22));
		 c.add(l5);
		 t5= new JTextField();
		 t5.setBounds(210,230,174,32);
		 t5.addActionListener(new ActionListener(){
			 @Override
			 public void actionPerformed(ActionEvent ae) {
				 // TODO Auto-generated method stub
				 
			 }
		 });
		 c.add(t5);
		 
		 
		 
		 l6 = new JLabel("Selling Price:");
		 l6.setBounds(50, 265, 150,32);
		 l6.setFont(new Font("CENTER_BASELINE ", Font.PLAIN+Font.BOLD, 22));
		 c.add(l6);
		 t6= new JTextField();
		 t6.setBounds(185,265,200,32);
		 t6.addActionListener(new ActionListener(){
			 @Override
			 public void actionPerformed(ActionEvent ae) {
				 // TODO Auto-generated method stub
				 
			 }
		 });
		 c.add(t6);
		 
		 
		 /*l7 = new JLabel("Total Price:");
		 l7.setBounds(60, 300, 130,32);
		 l7.setFont(new Font("CENTER_BASELINE ", Font.PLAIN+Font.BOLD, 22));
		 c.add(l7);
		 t7= new JTextField();
		 t7.setBounds(185,300,200,32);
		 t7.addActionListener(new ActionListener(){
			 @Override
			 public void actionPerformed(ActionEvent ae) {
				 // TODO Auto-generated method stub
				 
			 }
		 });
		 c.add(t7);
		 */
		 
		 
		
		 l7 = new JLabel("Quantity Required:");
		 l7.setBounds(30, 335, 200,32);
		 l7.setFont(new Font("CENTER_BASELINE ", Font.PLAIN+Font.BOLD, 22));
		 c.add(l7);
		 t7= new JTextField();
		 t7.setBounds(235,335,150,32);
		 t7.addActionListener(new ActionListener(){
			 @Override
			 public void actionPerformed(ActionEvent ae) {
				 // TODO Auto-generated method stub
				 // get this quantity calculate total show it in amount due label
				 // focus event
				 
			 }
		 });
		 t7.addFocusListener(new FocusListener() {
				
				@Override
				public void focusLost(FocusEvent fe) {
					// TODO Auto-generated method stub
					if(t1.getText().length()!=0)
					{
					try{
						//s1= t1.getText();
						i2 = Integer.parseInt(t7.getText());
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanage","root","yashgta5");
						PreparedStatement stmt = con.prepareStatement("SELECT * FROM stock where itemno = '"+t1.getText()+"'");
						rs1=stmt.executeQuery();
						if(rs1.next()){
							s2= rs1.getString(10);
							i1 = Integer.parseInt(s2);
							i3 = i1*i2;
							
							t8.setText(i3.toString());
							
						}
						
					}
						catch(Exception e){
						System.out.println(e);}
				
				}
					
				
				
				
			}

				@Override
				public void focusGained(FocusEvent arg0) {
					// TODO Auto-generated method stub
					
				}}); 
		 c.add(t7);
		 
		
		 
		 l8 = new JLabel("Amount Due:");
		 l8.setBounds(25,370, 150,32);
		 l8.setFont(new Font("CENTER_BASELINE ", Font.PLAIN+Font.BOLD, 22));
		 c.add(l8);
		 t8= new JTextField();
		 t8.setBounds(215,370,170,32);
		 t8.addActionListener(new ActionListener(){
			 @Override
			 public void actionPerformed(ActionEvent ae) {
				 // TODO Auto-generated method stub
				 
				 
			 }
		 });
		 c.add(t8);
		 
		 // Remember before using this it is Textfield no 9
		 l9 = new JLabel("Invoice Date:");
		 l9.setBounds(40, 300, 200,32);
		 l9.setFont(new Font("CENTER_BASELINE ", Font.PLAIN+Font.BOLD, 22));
		 c.add(l9);
		 t9= new JTextField();
		 t9.setBounds(204,300,180,32);
		 t9.addActionListener(new ActionListener(){
			 @Override
			 public void actionPerformed(ActionEvent ae) {
				 // TODO Auto-generated method stub
				 
				 
			 }
		 });
		 c.add(t9);
		 
		 
		
		
			
		 
		 b1= new JButton("Item List");
		 b1.setBounds(75, 420, 145, 35);
		 b1.setFont(new Font("Serif ", Font.PLAIN+Font.BOLD, 12));
		 b1.addActionListener(new ActionListener(){
				 @Override
				 public void actionPerformed(ActionEvent ae){
					 new Stocks();
					 
			 }
			
			
		});
		 c.add(b1);
		 
		 
		 b2= new JButton("Cancel");
		 b2.setBounds(145, 480, 180, 40);
		 b2.setFont(new Font("Serif ", Font.PLAIN+Font.BOLD, 12));
		 b2.addActionListener(new ActionListener(){
				 @Override
				 public void actionPerformed(ActionEvent ae){
					 
					 setVisible(false);
			 }
			
			
		});
		 c.add(b2);
		 
		 
		 b3= new JButton("Print Invoice");
		 b3.setBounds(250, 420, 140, 35);
		 b3.setFont(new Font("Serif ", Font.PLAIN+Font.BOLD, 12));
		 b3.addActionListener(new ActionListener(){
			 @Override
			 public void actionPerformed(ActionEvent ae){
				 new Print();
				 setVisible(false);
				 // cut here if anything goes wrong
				// new Print();
				// Print a = new Print();
				 /*
				 class Print extends JFrame{
					 JLabel lh1, ld, lin;
					 JLabel lt1,lt2,lt3,lt4; // Label line 1
					 JLabel lb1,lb2,lb3,lb4;// Label line 2
					 JLabel lbr1,lbr2; // label bottom right
					 JLabel lbottom;
					 Border border, border1;
					Print(){
						setSize(720,500);
						 setVisible(true);
						 Container c = getContentPane();
						 setLayout(null);
						 lh1 = new JLabel("Amazon Services Private Limited ");
						 lh1.setBounds(70,0,700,60);
						 lh1.setFont(new Font("Serif ", Font.PLAIN+Font.BOLD, 36));
						 c.add(lh1);
						 
						 
						 ld = new JLabel("Date:"+t9.getText());
						 ld.setBounds(30,80,200,30);
						 ld.setFont(new Font("Verdana ", Font.PLAIN+Font.BOLD, 22));
						 c.add(ld);
						 
						lin= new JLabel("Invoice no. :"+t1.getText());
						lin.setBounds(480,80,200,30);
						 lin.setFont(new Font("Verdana ", Font.PLAIN+Font.BOLD, 22));
						 c.add(lin);
						 
						 lt1= new JLabel("    Item           Description           Quantity              Total Amount");
							lt1.setBounds(25,120,645,40);
							lt1.setFont(new Font("Verdana ", Font.PLAIN+Font.BOLD, 20));
							border = (BorderFactory.createLineBorder(Color.BLACK, 2));
							lt1.setBorder(border);
							c.add(lt1);
							
							
							lb1= new JLabel(t2.getText());
							lb1.setBounds(36,170,80,30);
							lb1.setFont(new Font("Verdana ", Font.PLAIN, 16));
							c.add(lb1);
							
							lb2= new JLabel(t3.getText());
							lb2.setBounds(180,170,80,30);
							lb2.setFont(new Font("Verdana ", Font.PLAIN, 16));
							c.add(lb2);
							
							lb3= new JLabel(t7.getText());
							lb3.setBounds(350,170,80,30);
							lb3.setFont(new Font("Verdana ", Font.PLAIN, 16));
							c.add(lb3);
							
							lb4= new JLabel(t8.getText());
							lb4.setBounds(550,170,140,30);
							lb4.setFont(new Font("Verdana ", Font.PLAIN, 16));
							c.add(lb4);
							
							
							lbr1= new JLabel("Grand Total");
							lbr1.setBounds(440,310,140,30);
							lbr1.setFont(new Font("Verdana ", Font.PLAIN, 16));
							c.add(lbr1);
							
							lbr2= new JLabel("       "+t8.getText());
							lbr2.setBounds(530,310,140,30);
							lbr2.setFont(new Font("Verdana ", Font.PLAIN, 16));
							border1 = (BorderFactory.createLineBorder(Color.BLACK, 2));
							lbr2.setBorder(border);
							c.add(lbr2);
							
					}
					@SuppressWarnings("unused")
					public  void main(String args[]){
						new Print();
					}
				 }
				 */
				 // upto here 
				//temp statement
				 //setVisible(false);
				 // new Print();
		 }
		 });
		 c.add(b3);
		 
		 // c.add(lh1);
		 // add all the components to the container
	 }
	 	public static void main(String args[]){
	 			// temp object
	 		new Sale();
}
}
