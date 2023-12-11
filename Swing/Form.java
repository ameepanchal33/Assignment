package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class Form implements ActionListener {
 JButton b1,b2;
 JLabel l1,l2;
 JTextField t1, t2;
 

  Form(){
	  JFrame fr =new JFrame("MY App");
	  fr.setVisible(true);
	  fr.setSize(600,500);
	  fr.setLayout(null);
	
	  b1=new JButton("Regstration ");
	  b1.setBounds(150,200,150,20);
	  fr.add(b1);
	  b2=new JButton("Login ");
	  b2.setBounds(320,200,150,20);
	  fr.add(b2);
	  
	  b1.addActionListener(this);
}
  public static void main(String[] args) {
	new Form();
}
  public static Connection createConnection() {
	  Connection conn=null;
	  try{
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/swing ","root","");
		  
	  }catch(Exception e) {
		 e.printStackTrace();
	  }
	  return conn;
  }
@Override
public void actionPerformed(ActionEvent e) {
	
	
}
}
