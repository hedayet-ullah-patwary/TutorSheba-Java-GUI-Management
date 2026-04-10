package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tdash extends JFrame
{
	
	JFrame f1;
	JPanel p1;
	JLabel l1;
	ImageIcon img;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	
	
	public tdash(){
	f1=new JFrame();
	f1.setSize(1366,768);
	f1.setLocationRelativeTo(null);
	f1.setResizable(false);
	f1.setLayout(null);
	f1.setUndecorated(true);
	f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	p1=new JPanel();
	p1.setLayout(null);
	p1.setBounds(0,0,1366,768);
	p1.setBackground(new Color(201,165,225));
	f1.add(p1);
	
	
	l1=new JLabel();
	img= new ImageIcon("Images/dash.jpg");
	l1.setIcon(img);
	l1.setBounds(770,0,img.getIconWidth(),img.getIconHeight());
	p1.add(l1);
	
	
	b1 = new JButton("X");
    b1.setBounds(555, 5, 30, 40);
    b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
    b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    b1.setFocusPainted(false);
    b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    b1.setContentAreaFilled(false);
    l1.add(b1);
    
    
    b2 = new JButton("-");
    b2.setBounds(530, 12, 25, 30);
    b2.setFont(new Font("Segoe UI", Font.BOLD, 40));
    b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    b2.setFocusPainted(false);
    b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    b2.setContentAreaFilled(false);
    l1.add(b2);
	
	b8 = new JButton();
    b8.setIcon(new ImageIcon("Images/return.png"));
    b8.setBounds(15, 8, 35, 40);
    b8.setForeground(Color.white);
    b8.setFont(new Font("Segoe UI", Font.BOLD, 25));
    b8.setCursor(new Cursor(Cursor.HAND_CURSOR));
    b8.setFocusPainted(false);
    b8.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    b8.setContentAreaFilled(false);
    p1.add(b8);
    
    
    l1=new JLabel("Tutor Dashboard");
    l1.setBounds(250,50,400,50);
    l1.setForeground(Color.BLACK);
    l1.setFont(new Font("Segoe UI", Font.BOLD, 35));
    p1.add(l1);
    
    
    b3 = new JButton("Applied Jobs");
    b3.setBounds(70, 250, 250, 40);
    b3.setFont(new Font("Segoe UI", Font.BOLD, 24));
    b3.setBackground(Color.WHITE);
    b3.setForeground(Color.black);
    b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
    b3.setFocusPainted(false);
    p1.add(b3);
    
    
    b4 = new JButton("Confirmed Jobs");
    b4.setBounds(450, 250, 250, 40);
    b4.setFont(new Font("Segoe UI", Font.BOLD, 23));
    b4.setBackground(Color.WHITE);
    b4.setForeground(Color.black);
    b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
    b4.setFocusPainted(false);
    p1.add(b4);
    
    
    b5 = new JButton("Cancelled Jobs");
    b5.setBounds(70, 400, 250, 40);
    b5.setFont(new Font("Segoe UI", Font.BOLD, 23));
    b5.setBackground(Color.WHITE);
    b5.setForeground(Color.black);
    b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
    b5.setFocusPainted(false);
    p1.add(b5);
    
    
    b6 = new JButton("Job Board");
    b6.setBounds(450, 400, 250, 40);
    b6.setFont(new Font("Segoe UI", Font.BOLD, 23));
    b6.setBackground(Color.WHITE);
    b6.setForeground(Color.black);
    b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
    b6.setFocusPainted(false);
    p1.add(b6);
    
    
    b7 = new JButton("Settings");
    b7.setBounds(250, 550, 250, 40);
    b7.setFont(new Font("Segoe UI", Font.BOLD, 23));
    b7.setBackground(Color.WHITE);
    b7.setForeground(Color.black);
    b7.setCursor(new Cursor(Cursor.HAND_CURSOR));
    b7.setFocusPainted(false);
    p1.add(b7);
    
	
	
	
	
	
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
    
    
    b7.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == b7) {
                new tsetting();
                f1.setVisible(false);
            }
        }
    });
	}
	
}