package inventoryManagement;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.Border;

import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;

public class Stocks extends JFrame{
	JLabel l1,lh1;
	Border border ;
	
	Stocks(){
		setSize(800,450);
		 setLocation(0,0);
		 setVisible(true);
		 Container c = getContentPane();
		 setLayout(null);
		 setTitle("Amazon Stocks");
		 setLocation(260,70);
		 
		 
		 lh1 = new JLabel("   Amazon Services Private Limited ");
		 lh1.setBounds(70,0,780,60);
		 lh1.setFont(new Font("Serif ", Font.PLAIN+Font.BOLD, 36));
		 c.add(lh1);
		 
		 
		 
		 l1= new JLabel("   ID                 RecNo          RecDate          ItemNo         ItemName     Desc            Quantity        MfgDate        B.Price         S.Price         T.Price");
		 l1.setBounds(5,70,780,30);
		 border = (BorderFactory.createLineBorder(Color.BLACK, 2));
		 l1.setBorder(border);
		 l1.setFont(new Font("Verdana ", Font.PLAIN+Font.BOLD, 12));
		 c.add(l1);
		 
		 
		ArrayList columnNames = new ArrayList();
        ArrayList data = new ArrayList();
        try{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanage","root","yashgta5");
			java.sql.Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM stock");
			java.sql.ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
            for (int i = 1; i <= columns; i++)
            {
                columnNames.add( md.getColumnName(i) );
            }
            while (rs.next())
            {
                ArrayList row = new ArrayList(columns);

                for (int i = 1; i <= columns; i++)
                {
                    row.add( rs.getObject(i) );
                }

                data.add( row );
            }
	}catch(Exception e){
		System.out.println(e);
	}
        Vector columnNamesVector = new Vector();
        Vector dataVector = new Vector();
        for (int i = 0; i < data.size(); i++)
        {
            ArrayList subArray = (ArrayList)data.get(i);
            Vector subVector = new Vector();
            for (int j = 0; j < subArray.size(); j++)
            {
                subVector.add(subArray.get(j));
            }
            dataVector.add(subVector);
        }
        for (int i = 0; i < columnNames.size(); i++ )
            columnNamesVector.add(columnNames.get(i));
        JTable table = new JTable(dataVector, columnNamesVector)
        {
            public Class getColumnClass(int column)
            {
                for (int row = 0; row < getRowCount(); row++)
                {
                    Object o = getValueAt(row, column);

                    if (o != null)
                    {
                        return o.getClass();
                    }
                }

                return Object.class;
            }
        };

        JScrollPane scrollPane = new JScrollPane( table );
        table.setBounds(0,102,780,430);
        c.add(table);
}
	public static void main(String args[]){
		new Stocks();
	}
}