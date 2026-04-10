package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class tsignup extends JFrame {
    JFrame f1;
	JPanel p1,p2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JLabel l01,l02,l03,l04,l05,l06;
	ImageIcon i1;
	JButton b1,b2,b3,b4,b5,b6;
	JTextField t1,t2,t3,t4;
	JPasswordField pass1;
    JRadioButton Box1,Box2;
    ButtonGroup bg;

	
	public tsignup ()
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
		p1.setBackground(new Color(255,255,204));
		f1.add(p1);
		
		p2=new JPanel();
		p2.setLayout(null);
		p2.setBounds(766,0,600,768);
		p2.setBackground(new Color(255,255,255));
		f1.add(p2);

        l1=new JLabel();
		i1= new ImageIcon("Images/treg.jpg");
		l1.setIcon(i1);
		l1.setBounds(0,0,i1.getIconWidth(),i1.getIconHeight());
		p2.add(l1);
		
		b1 = new JButton("X");
	    b1.setBounds(560, 5, 30, 40);
	    b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
	    b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    b1.setFocusPainted(false);
	    b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
	    b1.setContentAreaFilled(false);
	    l1.add(b1);
	    
	    
	    b2 = new JButton("-");
	    b2.setBounds(535, 10, 25, 30);
	    b2.setFont(new Font("Segoe UI", Font.BOLD, 40));
	    b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    b2.setFocusPainted(false);
	    b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
	    b2.setContentAreaFilled(false);
	    l1.add(b2);
	    
	    
	    b3 = new JButton();
        b3.setIcon(new ImageIcon("image/return.png"));
        b3.setBounds(15, 8, 35, 40);
        b3.setForeground(Color.white);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);
        b3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b3.setContentAreaFilled(false);
        p1.add(b3);
        
        
        l2=new JLabel("Registration (Tutor)");
        l2.setBounds(200,100,400,50);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Segoe UI", Font.BOLD, 38));
        p1.add(l2);
        
        
        l3 = new JLabel("Username");
        l3.setBounds(100, 250, 300, 60);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        p1.add(l3);
        
        
        t1 = new JTextField();
        t1.setBounds(300, 265, 300, 30);
        t1.setForeground(Color.BLACK);
        t1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        t1.setCaretColor(Color.BLACK);
        t1.setBorder(null);
        t1.setOpaque(false);
        
		l01 = new JLabel("___________________");
        l01.setBounds(300, 270, 300, 40);
        l01.setForeground(Color.BLACK);
        p1.add(t1);
        p1.add(l01);
        
        
        l5 = new JLabel("Phone");
        l5.setBounds(100, 300, 300, 60);
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        p1.add(l5);
        
        
        t2 = new JTextField();
        t2.setBounds(300, 310, 300, 30);
        t2.setForeground(Color.BLACK);
        t2.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        t2.setCaretColor(Color.BLACK);
        t2.setBorder(null);
        t2.setOpaque(false);
        
		l02 = new JLabel("___________________");
        l02.setBounds(300, 315, 300, 40);
        l02.setForeground(Color.BLACK);
        p1.add(t2);
        p1.add(l02);
        
        
        l6 = new JLabel("Email");
        l6.setBounds(100, 350, 300, 60);
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        p1.add(l6);
        
        
        t3 = new JTextField();
        t3.setBounds(300, 370, 300, 30);
        t3.setForeground(Color.BLACK);
        t3.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        t3.setCaretColor(Color.BLACK);
        t3.setBorder(null);
        t3.setOpaque(false);
        
		l03 = new JLabel("___________________");
        l03.setBounds(300, 375, 300, 40);
        l03.setForeground(Color.BLACK);
        p1.add(t3);
        p1.add(l03);
        
        
        l6 = new JLabel("Password");
        l6.setBounds(100, 520, 300, 60);
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        p1.add(l6);
        
        
        pass1 = new JPasswordField();
        pass1.setBounds(300, 530, 300, 30);
        pass1.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        pass1.setForeground(Color.BLACK);
        pass1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        pass1.setCaretColor(Color.BLACK);
        pass1.setBorder(null);
        pass1.setOpaque(false);
        
		l04 = new JLabel("___________________");
        l04.setBounds(300, 535, 300, 40);
        l04.setForeground(Color.BLACK);
        p1.add(pass1);
        p1.add(l04);
        
        
        b5 = new JButton("SIGN UP");
        b5.setBounds(250, 630, 250, 40);
        b5.setFont(new Font("Segoe UI", Font.BOLD, 23));
        b5.setBackground(Color.WHITE);
        b5.setForeground(Color.black);
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b5.setFocusPainted(false);
        p1.add(b5);
        
        
		l6 = new JLabel("Already have an Account?");
        l6.setBounds(200, 680, 300, 60);
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("Segoe UI", Font.PLAIN, 23));
        p1.add(l6);
        
        b6 = new JButton("Log in");
        b6.setBounds(440, 690, 150, 40);
        b6.setForeground(Color.BLACK);
        b6.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b6.setForeground(Color.BLACK);
        b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6.setFocusPainted(false);
        b6.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6.setContentAreaFilled(false);
		p1.add(b6);
        
        

        
        
        
	    
		
		
		
		
		

		
        
		f1.setVisible(true);
		
		
		b1.addActionListener(new ActionListener()
		{
	        public void actionPerformed(ActionEvent e) {

	            if (e.getSource() == b1) {
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
		        		new tlogin();
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
		        	String name=t1.getText();
				    String phone=t2.getText();
				    String email=t3.getText();
				    String pass=pass1.getText();
				
				if(name.isEmpty()||phone.isEmpty()||email.isEmpty()||pass.isEmpty())
				{
					JOptionPane.showMessageDialog(null,"Fill ALL");
				}
				else
                {
					
					taccount account= new taccount(name,phone,email,pass);
					account.addTaccount();
					
					JOptionPane.showMessageDialog(null,"Added");
					
					t1.setText("");
					t2.setText("");
					t3.setText("");
					pass1.setText("");
					
				tlogin t1=new tlogin();
				t1.setVisible(true);
				f1.setVisible(false);
				}
		         }

	         }
	     });
	    

		b6.addActionListener(new ActionListener()
		{
	        public void actionPerformed(ActionEvent e) {

	            if (e.getSource() == b6) {
	            	new tlogin();
	            	f1.setVisible(false);
	            }
	        }
	    });
	    
	    
	    
	}
	
}
