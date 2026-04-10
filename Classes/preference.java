package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;




public class preference extends JFrame
{
	JFrame f1;
	JPanel p1,p2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l01,l02,l03;
	ImageIcon img;
	JButton b1,b2,b3,b4;
	JComboBox c1,c2,c3,c4,c5,c6;
	JTextField tf1,tf2,tf3;
	
	
	
	
	public preference()
	{
		f1=new JFrame();
		f1.setSize(1366,768);
		f1.setLocationRelativeTo(null);
		f1.setResizable(false);
		f1.setLayout(null);
		f1.setUndecorated(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

        p1 = new JPanel();
        p1.setBounds(650, 0, 800, 768);
        p1.setBackground(new Color(123,50,250));
        p1.setLayout(null);
        f1.add(p1);
        

        p2 = new JPanel();
        p2.setBounds(0, 0, 666, 768);
        p2.setBackground(new Color(252, 255, 255));
        p2.setLayout(null);
        f1.add(p2);
        
        l1 = new JLabel();
        img=new ImageIcon("Images/pref.png");
        l1.setIcon(img);
        l1.setBounds(50,150,img.getIconWidth(),img.getIconHeight());
        p2.add(l1);
        
		b1 = new JButton("X");
        b1.setBounds(675, 4, 30, 40);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);
        p1.add(b1);
        
        b2 = new JButton("-");
        b2.setBounds(645, 10, 25, 30);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 40));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setFocusPainted(false);
        b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b2.setContentAreaFilled(false);
        p1.add(b2);
        
        
        b3 = new JButton();
        b3.setIcon(new ImageIcon("Images/return.png"));
        b3.setBounds(15, 8, 35, 40);
        b3.setForeground(Color.white);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);
        b3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b3.setContentAreaFilled(false);
        p2.add(b3);
        
        
        l1=new JLabel("Tutor Preferences");
        l1.setBounds(200,50,400,50);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Segoe UI", Font.BOLD, 35));
        p1.add(l1);
        
        
        l2 = new JLabel("Category");
        l2.setBounds(70, 150, 300, 60);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Segoe UI", Font.PLAIN, 21));
        p1.add(l2);
        
        
        String[] category = { "....", "Bangla Medium", "English Medium","English Version"};
        c1 = new JComboBox(category);
        c1.setBounds(70, 210, 200, 28);
        c1.setSelectedIndex(0);
        c1.setBackground(Color.white);
        p1.add(c1);
        
        
        l3 = new JLabel("Teaching Platforms");
        l3.setBounds(450, 150, 300, 60);
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 21));
        p1.add(l3);
        
        
        String[] pltfrm = { "....", "Online", "Student Home","Teachers Home"};
        c2 = new JComboBox(pltfrm);
        c2.setBounds(450, 210, 200, 28);
        c2.setSelectedIndex(0);
        c2.setBackground(Color.white);
        p1.add(c2);
        
        
        l4 = new JLabel("Class");
        l4.setBounds(70, 270, 300, 60);
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Segoe UI", Font.PLAIN, 21));
        p1.add(l4);
        
        
        String[] classes = {"....", "1", "2", "3", "4", "5", "6", "7", "8", "9", "SSC", "O-Level", "HSC", "A-LEVEL"};
        c3 = new JComboBox(classes);
        c3.setBounds(70, 330, 200, 28);
        c3.setSelectedIndex(0);
        c3.setBackground(Color.white);
        p1.add(c3);
        
        
        l5 = new JLabel("Subject");
        l5.setBounds(450, 270, 300, 60);
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("Segoe UI", Font.PLAIN, 21));
        p1.add(l5);
        
        
        tf1 = new JTextField();
        tf1.setBounds(450, 325, 180, 30);
        tf1.setForeground(Color.white);
        tf1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        tf1.setCaretColor(Color.white);
        tf1.setBorder(null);
        tf1.setOpaque(false);
        l01 = new JLabel("_________");
        l01.setBounds(450, 330, 230, 40);
        l01.setForeground(Color.white);
        p1.add(tf1);
        p1.add(l01);
        
        
        l6 = new JLabel("City");
        l6.setBounds(70, 380, 300, 60);
        l6.setForeground(Color.WHITE);
        l6.setFont(new Font("Segoe UI", Font.PLAIN, 21));
        p1.add(l6);

        
        String[] city = {"....", "Dhaka", "Chittagong", "Rasjshahi","Barishal","Sylet","Khulna"};
        c4 = new JComboBox(city);
        c4.setBounds(70, 440, 200, 28);
        c4.setSelectedIndex(0);
        c4.setBackground(Color.white);
        p1.add(c4);
        
        l7 = new JLabel("Location");
        l7.setBounds(450, 380, 300, 60);
        l7.setForeground(Color.WHITE);
        l7.setFont(new Font("Segoe UI", Font.PLAIN, 21));
        p1.add(l7);
        
        tf2 = new JTextField();
        tf2.setBounds(450, 435, 180, 30);
        tf2.setForeground(Color.white);
        tf2.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        tf2.setCaretColor(Color.white);
        tf2.setBorder(null);
        tf2.setOpaque(false);
        l02 = new JLabel("_________");
        l02.setBounds(450, 440, 230, 40);
        l02.setForeground(Color.white);
        p1.add(tf2);
        p1.add(l02);
        
        
        
        l8 = new JLabel("Availability");
        l8.setBounds(70, 500, 300, 60);
        l8.setForeground(Color.WHITE);
        l8.setFont(new Font("Segoe UI", Font.PLAIN, 21));
        p1.add(l8);
        
        
        String[] avaialbe = {"....", "2 DAY", "3 DAY" , "4 DAY","5 DAY","6 DAY"};
        c5 = new JComboBox(avaialbe);
        c5.setBounds(70, 560, 200, 28);
        c5.setSelectedIndex(0);
        c5.setBackground(Color.white);
        p1.add(c5);
        
        
        l7 = new JLabel("Salary");
        l7.setBounds(450, 500, 300, 60);
        l7.setForeground(Color.WHITE);
        l7.setFont(new Font("Segoe UI", Font.PLAIN, 21));
        p1.add(l7);
        
        
        tf3 = new JTextField();
        tf3.setBounds(450, 555, 180, 30);
        tf3.setForeground(Color.white);
        tf3.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        tf3.setCaretColor(Color.white);
        tf3.setBorder(null);
        tf3.setOpaque(false);
        l03 = new JLabel("_________");
        l03.setBounds(450, 560, 230, 40);
        l03.setForeground(Color.white);
        p1.add(tf3);
        p1.add(l03);
        
        
        b4 = new JButton("Next");
        b4.setBounds(250, 630, 200, 40);
        b4.setFont(new Font("Segoe UI", Font.BOLD, 24));
        b4.setBackground(Color.WHITE);
        b4.setForeground(Color.black);
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setFocusPainted(false);
        p1.add(b4);
        
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
            	f1.setVisible(false);
				new Gdash();

            }
        });
        
        
        b4.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent e) 
			{
            	if(e.getSource() == b4)
				{
            		String cat = String.valueOf(c1.getSelectedItem());
                	String plat = String.valueOf(c2.getSelectedItem());
                	String cls = String.valueOf(c3.getSelectedItem());
                	String sub = tf1.getText();
                	String city = String.valueOf(c4.getSelectedItem());
                	String location = tf2.getText();
                	String avail = String.valueOf(c5.getSelectedItem());
                	String days = tf3.getText();
					
					if(c1.getSelectedIndex() == 0||c2.getSelectedIndex() == 0||c3.getSelectedIndex() == 0||sub.isEmpty()||c4.getSelectedIndex() == 0||location.isEmpty()||c5.getSelectedIndex() == 0||days.isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!", JOptionPane.WARNING_MESSAGE);
					}
					else
					{
						tprf tp = new tprf(cat, cls, city, avail, plat, sub, location, days);
						tp.preferences();
						
						JOptionPane.showMessageDialog(null, "Job Posted");
						f1.setVisible(false);
						new Gdash();
					}
            	}
            	
            }
        });
     
	}
}