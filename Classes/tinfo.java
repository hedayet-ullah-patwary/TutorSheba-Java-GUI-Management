package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class tinfo extends JFrame
{
	JFrame f1;
	JPanel p1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l01,l02,l03,l04,l05,l06,l07,l08,l09,l010,l011,l012,l013,l001;
	ImageIcon img;
	JButton b1,b2,b3,b4;
	JComboBox c1,c2,c3,c4,c5,c6;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf010;
	
	public tinfo()
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
		p1.setBounds(0,0,1366,768);
		p1.setBackground(new Color(255,153,51));
		f1.add(p1);
		
		l1=new JLabel();
		img= new ImageIcon("Images/pf.jpg");
		l1.setIcon(img);
		l1.setBounds(770,0,img.getIconWidth(),img.getIconHeight());
		p1.add(l1);
		
		b1 = new JButton("X");
        b1.setBounds(560, 4, 30, 40);
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
        b3.setIcon(new ImageIcon("Images/return.png"));
        b3.setBounds(15, 8, 35, 40);
        b3.setForeground(Color.white);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);
        b3.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b3.setContentAreaFilled(false);
        p1.add(b3);
        
        
        l1=new JLabel("Tutor Information");
        l1.setBounds(220,25,400,50);
        l1.setForeground(Color.BLACK);
        l1.setFont(new Font("Segoe UI", Font.BOLD, 35));
        p1.add(l1);
        
        l2 = new JLabel("First Name");
        l2.setBounds(70, 90, 300, 60);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p1.add(l2);
        
        tf1 = new JTextField();
        tf1.setBounds(70, 130, 180, 30);
        tf1.setForeground(Color.white);
        tf1.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        tf1.setCaretColor(Color.BLACK);
        tf1.setBorder(null);
        tf1.setOpaque(false);
        l01 = new JLabel("_________");
        l01.setBounds(70, 135, 230, 40);
        l01.setForeground(Color.white);
        p1.add(tf1);
        p1.add(l01);
        
        l3 = new JLabel("Last Name");
        l3.setBounds(450, 90, 300, 60);
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p1.add(l3);
        
        tf2 = new JTextField();
        tf2.setBounds(450, 130, 180, 30);
        tf2.setForeground(Color.BLACK);
        tf2.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        tf2.setCaretColor(Color.BLACK);
        tf2.setBorder(null);
        tf2.setOpaque(false);
        l02 = new JLabel("_________");
        l02.setBounds(450, 135, 230, 40);
        l02.setForeground(Color.white);
        p1.add(tf2);
        p1.add(l02);
        
        
        l3 = new JLabel("ID Type");
        l3.setBounds(70, 170, 300, 60);
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p1.add(l3);
        
        String[] itype = {"....", "National Id", "Passport ","Birth Cirtificate"};
        c1 = new JComboBox(itype);
        c1.setBounds(70, 220, 200, 28);
        c1.setSelectedIndex(0);
        c1.setBackground(Color.white);
        p1.add(c1);
        
        l4 = new JLabel("ID Number");
        l4.setBounds(450, 170, 300, 60);
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p1.add(l4);
        
        tf3 = new JTextField();
        tf3.setBounds(450, 210, 180, 30);
        tf3.setForeground(Color.BLACK);
        tf3.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        tf3.setCaretColor(Color.BLACK);
        tf3.setBorder(null);
        tf3.setOpaque(false);
        l03 = new JLabel("_________");
        l03.setBounds(450, 215, 230, 40);
        l03.setForeground(Color.white);
        p1.add(tf3);
        p1.add(l03);
        
        
        l5 = new JLabel("Religion");
        l5.setBounds(70,250, 300, 60);
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p1.add(l5);
        
        String[] religion = {"....", "Muslim", "Hindu","Christian", "Buddhist"};
        c2 = new JComboBox(religion);
        c2.setBounds(70, 300, 200, 28);
        c2.setSelectedIndex(0);
        c2.setBackground(Color.white);
        p1.add(c2);
        
        
        l6 = new JLabel("Date Of Birth");
        l6.setBounds(450,250, 300, 60);
        l6.setForeground(Color.WHITE);
        l6.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p1.add(l6);
        
        tf4 = new JTextField();
        tf4.setBounds(450, 290, 180, 30);
        tf4.setForeground(Color.BLACK);
        tf4.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        tf4.setCaretColor(Color.BLACK);
        tf4.setBorder(null);
        tf4.setOpaque(false);
        l04 = new JLabel("_________");
        l04.setBounds(450, 295, 230, 40);
        l04.setForeground(Color.white);
        p1.add(tf4);
        p1.add(l04);
        
        l7 = new JLabel("Guardian Name");
        l7.setBounds(70,335, 300, 60);
        l7.setForeground(Color.WHITE);
        l7.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p1.add(l7);
        
        
        tf5 = new JTextField();
        tf5.setBounds(70, 375, 180, 30);
        tf5.setForeground(Color.BLACK);
        tf5.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        tf5.setCaretColor(Color.BLACK);
        tf5.setBorder(null);
        tf5.setOpaque(false);
        l05 = new JLabel("_________");
        l05.setBounds(70, 380, 230, 40);
        l05.setForeground(Color.white);
        p1.add(tf5);
        p1.add(l05);
        
        
        l8 = new JLabel("Relation with Guardian");
        l8.setBounds(450,335, 300, 60);
        l8.setForeground(Color.WHITE);
        l8.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p1.add(l8);
        
        
        tf6 = new JTextField();
        tf6.setBounds(450, 375, 180, 30);
        tf6.setForeground(Color.BLACK);
        tf6.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        tf6.setCaretColor(Color.BLACK);
        tf6.setBorder(null);
        tf6.setOpaque(false);
        l06 = new JLabel("_________");
        l06.setBounds(450, 380, 230, 40);
        l06.setForeground(Color.white);
        p1.add(tf6);
        p1.add(l06);
        
        l9=new JLabel("Educational Information");
        l9.setBounds(200,420,400,50);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Segoe UI", Font.BOLD, 30));
        p1.add(l9);
        
        
        l010 = new JLabel("Degree Title");
        l010.setBounds(70,455, 300, 60);
        l010.setForeground(Color.WHITE);
        l010.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p1.add(l010);
        
        
        tf7 = new JTextField();
        tf7.setBounds(70, 495, 180, 30);
        tf7.setForeground(Color.BLACK);
        tf7.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        tf7.setCaretColor(Color.BLACK);
        tf7.setBorder(null);
        tf7.setOpaque(false);
        l07 = new JLabel("_________");
        l07.setBounds(70, 500, 230, 40);
        l07.setForeground(Color.white);
        p1.add(tf7);
        p1.add(l07);
        
        
        l011 = new JLabel("Level");
        l011.setBounds(450,455, 300, 60);
        l011.setForeground(Color.WHITE);
        l011.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p1.add(l011);
        
        
        String[] level = {"....", "Secondary", "Higher Secondary","Diploma", "Bachelor", "Honors","MBBS"};
        c3 = new JComboBox(level);
        c3.setBounds(450, 500, 200, 28);
        c3.setSelectedIndex(0);
        c3.setBackground(Color.white);
        p1.add(c3);
        
        
        l011 = new JLabel("Concentration/Major/Group");
        l011.setBounds(70,530, 300, 60);
        l011.setForeground(Color.WHITE);
        l011.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p1.add(l011);
        
        
        tf8 = new JTextField();
        tf8.setBounds(70, 570, 180, 30);
        tf8.setForeground(Color.BLACK);
        tf8.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        tf8.setCaretColor(Color.BLACK);
        tf8.setBorder(null);
        tf8.setOpaque(false);
        l08 = new JLabel("_________");
        l08.setBounds(70, 575, 230, 40);
        l08.setForeground(Color.white);
        p1.add(tf8);
        p1.add(l08);
        
        
        l011 = new JLabel("Institute");
        l011.setBounds(450,530, 300, 60);
        l011.setForeground(Color.WHITE);
        l011.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p1.add(l011);
        
        tf9 = new JTextField();
        tf9.setBounds(450, 570, 180, 30);
        tf9.setForeground(Color.BLACK);
        tf9.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        tf9.setCaretColor(Color.BLACK);
        tf9.setBorder(null);
        tf9.setOpaque(false);
        l09 = new JLabel("_________");
        l09.setBounds(450, 575, 230, 40);
        l09.setForeground(Color.white);
        p1.add(tf9);
        p1.add(l09);
        
        l012 = new JLabel("Institute Id Number");
        l012.setBounds(70,620, 300, 60);
        l012.setForeground(Color.WHITE);
        l012.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        p1.add(l012);
        
        
        tf010 = new JTextField();
        tf010.setBounds(70, 665, 180, 30);
        tf010.setForeground(Color.BLACK);
        tf010.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        tf010.setCaretColor(Color.BLACK);
        tf010.setBorder(null);
        tf010.setOpaque(false);
        l001 = new JLabel("_________");
        l001.setBounds(70, 670, 230, 40);
        l001.setForeground(Color.white);
        p1.add(tf010);
        p1.add(l001);
        
        
        b4 = new JButton("CONFIRM");
        b4.setBounds(450, 650, 200, 40);
        b4.setFont(new Font("Segoe UI", Font.BOLD, 24));
        b4.setBackground(Color.WHITE);
        b4.setForeground(Color.black);
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setFocusPainted(false);
        p1.add(b4);
        
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
        
        b2.addActionListener(new ActionListener() {
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
                    new tsetting();
                    f1.setVisible(false);
                }
            }
        });
        
		b4.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent e)
			{
                if (e.getSource() == b4)
				{
                    String fname = tf1.getText();
                	String lname = tf2.getText();
                	String idtype = String.valueOf(c1.getSelectedItem());
                	String idno = tf3.getText();
					String religion = String.valueOf(c2.getSelectedItem());
                	String dob = tf4.getText();
                	String gdname = tf5.getText();
                	String relation = tf6.getText();
					String degree = tf7.getText();
					String lvl = String.valueOf(c3.getSelectedItem());
					String major = tf8.getText();
					String institute = tf9.getText();
					String instid = tf010.getText();
                	
					if(c1.getSelectedIndex() == 0||c2.getSelectedIndex() == 0||c3.getSelectedIndex() == 0||fname.isEmpty()||lname.isEmpty()||idtype.isEmpty()||idno.isEmpty()||dob.isEmpty()||gdname.isEmpty()||relation.isEmpty()||degree.isEmpty()||major.isEmpty()||institute.isEmpty()||instid.isEmpty())
					{
						JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!", JOptionPane.WARNING_MESSAGE);
					}
					else
					{
						tprf tp = new tprf(fname, lname, idtype, idno, religion, dob, gdname, relation, degree, lvl, major, institute, instid);
						tp.info();
						
						c1.setSelectedItem("");
						c2.setSelectedItem("");
						c3.setSelectedItem("");
						tf1.setText("");
						tf2.setText("");
						tf3.setText("");
						tf4.setText("");
						tf5.setText("");
						tf6.setText("");
						tf7.setText("");
						tf8.setText("");
						tf9.setText("");
						tf010.setText("");
						
						JOptionPane.showMessageDialog(null, "Added Info");
						f1.setVisible(false);
						new tdash();
					
					}
				
				}
			}
		
		});
	}
	
	
}