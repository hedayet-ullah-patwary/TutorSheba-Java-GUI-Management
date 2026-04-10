package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Glogin extends JFrame{

    JFrame f1;
	JPanel p1,p2;
	JLabel l1,l2,l3,l5,l6;
	JLabel l01,l02,l03,l05,l06;
	ImageIcon i1;
	JButton b1,b2,b3,b4,b5,b6;
	JTextField t1,t3,t4;
	JPasswordField pass1;
	
	
	
	
	
	public Glogin()
	{
		f1=new JFrame();
		f1.setSize(1366,768);
		f1.setLocationRelativeTo(null);
		f1.setResizable(false);
		f1.setLayout(null);
		f1.setUndecorated(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(0,0,766,768);
		p1.setBackground(new Color(102,178,255));
		f1.add(p1);
		
		p2=new JPanel();
		p2.setLayout(null);
		p2.setBounds(768,0,600,768);
		p2.setBackground(new Color(255,255,255));
		f1.add(p2);
		
		
		b1 = new JButton("X");
	    b1.setBounds(560, 5, 30, 40);
	    b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
	    b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    b1.setFocusPainted(false);
	    b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
	    b1.setContentAreaFilled(false);
	    p2.add(b1);
	    
	    
	    b2 = new JButton("-");
	    b2.setBounds(530, 10, 25, 30);
	    b2.setFont(new Font("Segoe UI", Font.BOLD, 40));
	    b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    b2.setFocusPainted(false);
	    b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
	    b2.setContentAreaFilled(false);
	    p2.add(b2);
	    
	    l1=new JLabel();
		i1= new ImageIcon("Images/slog.jpg");
		l1.setIcon(i1);
		l1.setBounds(0,0,i1.getIconWidth(),i1.getIconHeight());
		p2.add(l1);
		
	    
	    b3 = new JButton();
        b3.setIcon(new ImageIcon("Images/return.png"));
        b3.setBounds(15, 8, 35, 40);
        b3.setForeground(Color.white);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);
        b3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b3.setContentAreaFilled(false);
        p1.add(b3);
	    
        
        l2=new JLabel("Welcome, Guardian!");
        l2.setBounds(190,100,400,50);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Segoe UI", Font.BOLD, 38));
        p1.add(l2);
        
        
        l3 = new JLabel("Name");
        l3.setBounds(100, 230, 300, 60);
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        p1.add(l3);
        
        
        t1 = new JTextField();
        t1.setBounds(227, 235, 352, 30);
        t1.setForeground(Color.white);
        t1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        t1.setCaretColor(Color.white);
        t1.setBorder(null);
        t1.setOpaque(false);
        l01 = new JLabel("_______________________________________________________");
        l01.setBounds(227, 240, 352, 40);
        l01.setForeground(Color.white);
        p1.add(t1);
        p1.add(l01);
        
        
        
        
        
        
        l5 = new JLabel("Password");
        l5.setBounds(100, 320, 300, 60);
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        p1.add(l5);
        
        
        pass1 = new JPasswordField();
        pass1.setBounds(230, 325, 350, 30);
        pass1.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        pass1.setForeground(Color.white);
        pass1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        pass1.setCaretColor(Color.white);
        pass1.setBorder(null);
        pass1.setOpaque(false);
        l03 = new JLabel("______________________________________________");
        l03.setBounds(230, 330, 350, 40);
        l03.setForeground(Color.white);
        p1.add(pass1);
        p1.add(l03);
        
        
        
        
        b5 = new JButton("Log In");
        b5.setBounds(220, 450, 250, 40);
        b5.setFont(new Font("Segoe UI", Font.BOLD, 23));
        b5.setBackground(Color.WHITE);
        b5.setForeground(Color.black);
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b5.setFocusPainted(false);
        p1.add(b5);
		
		l6 = new JLabel("Don't have an Account?");
        l6.setBounds(150, 550, 300, 60);
        l6.setForeground(Color.WHITE);
        l6.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        p1.add(l6);
		
        b6 = new JButton("Sign Up");
        b6.setBounds(390, 559, 150, 40);
        b6.setForeground(Color.white);
        b6.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b6.setForeground(new Color(255, 255, 255));
        b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6.setFocusPainted(false);
        b6.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6.setContentAreaFilled(false);
		p1.add(b6);
		
        
		f1.setVisible(true);
		
		
		b1.addActionListener(new ActionListener()
		{
	        public void actionPerformed(ActionEvent e)
			{

	            if (e.getSource() == b1)
				{
	            	System.exit(0);
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
	    
	    b3.addActionListener(new ActionListener()
	    {
	         public void actionPerformed(ActionEvent e)
	         {
		         if (e.getSource() == b3)
		         {
		        	 new welcome();
		        	 f1.setVisible(false);
		         }

	         }
	     });
		 
		b5.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
		        if (e.getSource() == b5)
		        {
		        	String name = t1.getText();
					String pass = pass1.getText();
					
					gaccount ga = new gaccount();
					if(ga.getGaccount(name, pass)==true)
					{
						JOptionPane.showMessageDialog(null, "Login successful");
						new Gdash();
						f1.setVisible(false);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Incorrect username or password");
					}
		        }

	        }
	    }); 
		
	    b6.addActionListener(new ActionListener()
	    {
	        public void actionPerformed(ActionEvent e)
	        {
		        if (e.getSource() == b6)
		        {
		        	new Gsignup();
		        	f1.setVisible(false);
		        }

	         }
	     });
	    
	    
    }
    
}
