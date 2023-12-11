package Swing;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class Registrstion {
 JLabel l1,l2,l3,l4;
 JButton b1,b2,b3;
 JTextField t1,t2,t3;
 
 Registrstion(){
	 JFrame fr =new JFrame("registration");
	 fr.setVisible(true);
	 fr.setSize(500,300);
	 fr.setLayout(null);
	 
	 
	 l1=new JLabel("name:");
	 l1.setBounds(50,30, 50, 10);	
	 fr.add(l1);
	 l2=new JLabel("address:");
	 l2.setBounds(50,60, 50, 10);
	 fr.add(l2);
	 l3=new JLabel("email:");
	 l3.setBounds(50,90, 50, 10);
	 fr.add(l3);
	 l4=new JLabel("password:");
	 l4.setBounds(50,120, 50, 10);
	 fr.add(l4);

	 
	 
 }
 public static void main(String[] args) {
	new  Registrstion();
}
}
