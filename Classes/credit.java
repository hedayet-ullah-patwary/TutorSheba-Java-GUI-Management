package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class credit extends JFrame
{
	JFrame f1;
	JPanel p1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JButton b1,b2;
	

	
	public credit()
	{
		f1=new JFrame();
		f1.setSize(500,700);
		f1.setLocationRelativeTo(null);
		f1.setResizable(false);
		f1.setLayout(null);
		f1.setUndecorated(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(0,0,766,768);
		p1.setBackground(new Color(104,178,255));
		f1.add(p1);
		
		
		
		b1 = new JButton("X");
	    b1.setBounds(450, 5, 30, 40);
	    b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
	    b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    b1.setFocusPainted(false);
	    b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
	    b1.setContentAreaFilled(false);
	    p1.add(b1);
	    
	    b2 = new JButton("-");
	    b2.setBounds(430, 10, 25, 30);
	    b2.setFont(new Font("Segoe UI", Font.BOLD, 40));
	    b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    b2.setFocusPainted(false);
	    b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
	    b2.setContentAreaFilled(false);
	    p1.add(b2);
	    
	    
	  
        
        
        l1=new JLabel("CREDIT");
        l1.setBounds(175,70,400,50);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Segoe UI", Font.BOLD, 38));
        p1.add(l1);
        
        l2=new JLabel("Hedayet Ullah Patwary");
        l2.setBounds(110,150,400,50);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Segoe UI", Font.BOLD,25));
        p1.add(l2);
        
        l9=new JLabel("(22-47904-2)");
        l9.setBounds(170,190,400,50);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Segoe UI", Font.BOLD,25));
        p1.add(l9);
        
        l3=new JLabel("MD Hasan AL Hussain Rifat");
        l3.setBounds(80,250,400,50);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Segoe UI", Font.BOLD,25));
        p1.add(l3); 
        
        
        l4=new JLabel("(22-47536-2)");
        l4.setBounds(170,280,400,50);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Segoe UI", Font.BOLD,25));
        p1.add(l4);
        
        l5=new JLabel("MD Shafkat Manjur Deepto");
        l5.setBounds(80,360,400,50);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Segoe UI", Font.BOLD,25));
        p1.add(l5);
        
        l6=new JLabel("(22-49014-3)");
        l6.setBounds(170,390,400,50);
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Segoe UI", Font.BOLD,25));
        p1.add(l6);
        
        
        l7=new JLabel("MD Sadikul Islam");
        l7.setBounds(140,460,400,50);
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("Segoe UI", Font.BOLD,25));
        p1.add(l7);
        
        
        l8=new JLabel("(22-49036-3)");
        l8.setBounds(170,490,400,50);
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("Segoe UI", Font.BOLD,25));
        p1.add(l8);
                
        

		
        
		f1.setVisible(true);
		
		
		b1.addActionListener(new ActionListener()
		{
	        public void actionPerformed(ActionEvent e) {

	            if (e.getSource() == b1) {
					f1.setVisible(false);
	            }
	        }
	    });
	    
	    b2.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {

	            if (e.getSource() == b2) {
	                f1.setState(Frame.ICONIFIED);
	            }
	        }
	    });
	    
	    
		
	    
	    
	    
	}
}
	
