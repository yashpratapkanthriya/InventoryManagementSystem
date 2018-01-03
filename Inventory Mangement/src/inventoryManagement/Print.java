package inventoryManagement;
import inventoryManagement.Sale;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

class Print extends JFrame{
	 JLabel lh1, ld, lin;
	 JLabel lt1,lt2,lt3,lt4; // Label line 1
	 JLabel lb1,lb2,lb3,lb4;// Label line 2
	 JLabel lbr1,lbr2; // label bottom right
	 JLabel lbottom;
	 Border border, border1;
	Print(){
		setSize(720,500);
		setLocation(300, 70);
		 setVisible(true);
		 Container c = getContentPane();
		 setLayout(null);
		 lh1 = new JLabel("Amazon Services Private Limited ");
		 lh1.setBounds(70,0,700,60);
		 lh1.setFont(new Font("Serif ", Font.PLAIN+Font.BOLD, 36));
		 c.add(lh1);
		 
		 
		 ld = new JLabel("Date:"+Sale.t9.getText());
		 ld.setBounds(30,80,200,30);
		 ld.setFont(new Font("Verdana ", Font.PLAIN+Font.BOLD, 22));
		 c.add(ld);
		 
		lin= new JLabel("Invoice no. :"+Sale.t1.getText());
		lin.setBounds(480,80,200,30);
		 lin.setFont(new Font("Verdana ", Font.PLAIN+Font.BOLD, 22));
		 c.add(lin);
		 
		 lt1= new JLabel("    Item           Description           Quantity              Total Amount");
			lt1.setBounds(25,120,645,40);
			lt1.setFont(new Font("Verdana ", Font.PLAIN+Font.BOLD, 20));
			border = (BorderFactory.createLineBorder(Color.BLACK, 2));
			lt1.setBorder(border);
			c.add(lt1);
			
			
			lb1= new JLabel(Sale.t2.getText());
			lb1.setBounds(36,170,100,30);
			lb1.setFont(new Font("Verdana ", Font.PLAIN, 16));
			c.add(lb1);
			
			lb2= new JLabel(Sale.t3.getText());
			lb2.setBounds(180,170,100,30);
			lb2.setFont(new Font("Verdana ", Font.PLAIN, 16));
			c.add(lb2);
			
			lb3= new JLabel(Sale.t7.getText());
			lb3.setBounds(350,170,80,30);
			lb3.setFont(new Font("Verdana ", Font.PLAIN, 16));
			c.add(lb3);
			
			lb4= new JLabel(Sale.t8.getText());
			lb4.setBounds(550,170,140,30);
			lb4.setFont(new Font("Verdana ", Font.PLAIN, 16));
			c.add(lb4);
			
			
			lbr1= new JLabel("Grand Total");
			lbr1.setBounds(440,310,140,30);
			lbr1.setFont(new Font("Verdana ", Font.PLAIN, 16));
			c.add(lbr1);
			
			lbr2= new JLabel("       "+Sale.t8.getText());
			lbr2.setBounds(530,310,140,30);
			lbr2.setFont(new Font("Verdana ", Font.PLAIN, 16));
			border1 = (BorderFactory.createLineBorder(Color.BLACK, 2));
			lbr2.setBorder(border);
			c.add(lbr2);
			
	}
	public  void main(String args[]){
		// temp object
		//new Print();
	}
}