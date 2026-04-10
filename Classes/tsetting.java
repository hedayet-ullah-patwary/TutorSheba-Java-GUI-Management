package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tsetting extends JFrame {
	
	JFrame f1;
	JPanel p1,p2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JLabel l01,l02,l03,l04,l05,l06;
	ImageIcon i1;
	JButton b1,b2,b3,b4,b5,b6,b7;
	JTextField t1,t2,t3,t4;
	JPasswordField pass1,pass2;
	
	
	
	
	
	public tsetting() {
		f1=new JFrame();
		f1.setSize(1366,768);
		f1.setLocationRelativeTo(null);
		f1.setResizable(false);
		f1.setLayout(null);
		f1.setUndecorated(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(0,0,600,768);
		p1.setBackground(new Color(101,152,145));
		f1.add(p1);
		
		
		l1=new JLabel();
		i1= new ImageIcon("Images/t1.jpg");
		l1.setIcon(i1);
		l1.setBounds(0,0,i1.getIconWidth(),i1.getIconHeight());
		p1.add(l1);
		
		
		p2=new JPanel();
		p2.setLayout(null);
		p2.setBounds(600,0,766,768);
		p2.setBackground(new Color(101,152,145));
		f1.add(p2);
		
		
		
		b1 = new JButton("X");
	    b1.setBounds(720, 5, 30, 40);
	    b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
	    b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    b1.setFocusPainted(false);
	    b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
	    b1.setContentAreaFilled(false);
	    p2.add(b1);
	    
	    
	    b2 = new JButton("-");
	    b2.setBounds(695, 10, 25, 30);
	    b2.setFont(new Font("Segoe UI", Font.BOLD, 40));
	    b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    b2.setFocusPainted(false);
	    b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
	    b2.setContentAreaFilled(false);
	    p2.add(b2);
	    
	    
	    b3 = new JButton();
        b3.setIcon(new ImageIcon("Images/return.png"));
        b3.setBounds(15, 8, 35, 40);
        b3.setForeground(Color.white);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);
        b3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b3.setContentAreaFilled(false);
        l1.add(b3);
	    
        
        l2=new JLabel("Setting");
        l2.setBounds(300,50,400,50);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Segoe UI", Font.BOLD, 38));
        p2.add(l2);
        
        
        l3 = new JLabel("Name");
        l3.setBounds(100, 170, 300, 60);
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        p2.add(l3);
        
        
        t1 = new JTextField();
        t1.setBounds(250, 180, 350, 30);
        t1.setForeground(Color.white);
        t1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        t1.setCaretColor(Color.white);
        t1.setBorder(null);
        t1.setOpaque(false);
        l01 = new JLabel("______________________________________________");
        l01.setBounds(250, 185, 350, 40);
        l01.setForeground(Color.white);
        p2.add(t1);
        p2.add(l01);
        
        
        l4 = new JLabel("Phone");
        l4.setBounds(100, 250, 300, 60);
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        p2.add(l4);
        
        
        t2 = new JTextField();
        t2.setBounds(250, 260, 156, 30);
        t2.setForeground(Color.white);
        t2.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        t2.setCaretColor(Color.white);
        t2.setBorder(null);
        t2.setOpaque(false);
        l02 = new JLabel("______________________________________________");
        l02.setBounds(250, 265, 350, 40);
        l02.setForeground(Color.white);
        p2.add(t2);
        p2.add(l02);
        
        
        l5 = new JLabel("Current Password");
        l5.setBounds(100, 320, 300, 60);
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        p2.add(l5);
        
        
        pass1 = new JPasswordField();
        pass1.setBounds(300, 330, 220, 30);
        pass1.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        pass1.setForeground(Color.white);
        pass1.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        pass1.setCaretColor(Color.white);
        pass1.setBorder(null);
        pass1.setOpaque(false);
        l03 = new JLabel("______________________________________________");
        l03.setBounds(300, 335, 350, 40);
        l03.setForeground(Color.white);
        p2.add(pass1);
        p2.add(l03);
        
        
        l6 = new JLabel("New Password");
        l6.setBounds(100, 390, 300, 60);
        l6.setForeground(Color.WHITE);
        l6.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        p2.add(l6);
        
        
        pass2 = new JPasswordField();
        pass2.setBounds(300, 410, 220, 30);
        pass2.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        pass2.setForeground(Color.white);
        pass2.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        pass2.setCaretColor(Color.white);
        pass2.setBorder(null);
        pass2.setOpaque(false);
        l04 = new JLabel("______________________________________________");
        l04.setBounds(300, 415, 350, 40);
        l04.setForeground(Color.white);
        p2.add(pass2);
        p2.add(l04);
        
        
        b4 = new JButton("Update");
        b4.setBounds(250, 500, 250, 40);
        b4.setFont(new Font("Segoe UI", Font.BOLD, 23));
        b4.setBackground(Color.WHITE);
        b4.setForeground(Color.black);
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setFocusPainted(false);
        p2.add(b4);
        
        
        b5 = new JButton("Log out");
        b5.setBounds(100, 600, 250, 40);
        b5.setFont(new Font("Segoe UI", Font.BOLD, 23));
        b5.setBackground(Color.WHITE);
        b5.setForeground(Color.black);
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b5.setFocusPainted(false);
        p2.add(b5);
        
        
        
        b6 = new JButton("Delete Account");
        b6.setBounds(400 , 600, 250, 40);
        b6.setFont(new Font("Segoe UI", Font.BOLD, 23));
        b6.setBackground(Color.WHITE);
        b6.setForeground(Color.black);
        b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6.setFocusPainted(false);
        p2.add(b6);
        
        b7 = new JButton("Add Info");
        b7.setBounds(250, 700, 250, 40);
        b7.setFont(new Font("Segoe UI", Font.BOLD, 23));
        b7.setBackground(Color.WHITE);
        b7.setForeground(Color.black);
        b7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b7.setFocusPainted(false);
        p2.add(b7);
        
		
		f1.setVisible(true);
		
		
		b1.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {

	            if (e.getSource() == b1) {
	            	System.exit(0);
	            }
	        }
	    });
	    
	    b2.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {

	            if (e.getSource() == b2) {
	                f1.setState(Frame.ICONIFIED);
	            }
	        }
	    });
	    
	    b3.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == b3) {
		            f1.setVisible(false);
		           	new tdash();
		        }

	        }
	    });
	   
	   b5.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == b5) {
		            f1.setVisible(false);
		           	new tlogin();
		        }

	        }
	    });
	   
	   b7.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
				
				if (e.getSource() == b7) {
		            f1.setVisible(false);
		           	new tinfo();
		        }

	        }
	    });
	    
	    
	    
	}
	
}