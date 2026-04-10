package Classes;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class welcome extends JFrame
{

    JFrame f1;
    JPanel p1, p2;
    JLabel l1, l2, l3, l4;
    ImageIcon image1;
    JButton b1, b2, b3, b4, b5;

    public welcome()
    {
        f1 = new JFrame();
        f1.setSize(1366, 768);
        f1.setLocationRelativeTo(null);
        f1.setResizable(false);
        f1.setLayout(null);
        f1.setUndecorated(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p1.setBounds(0, 0, 766, 768);
        p1.setBackground(new Color(79, 117, 68));
        p1.setLayout(null);
        f1.add(p1);

        p2 = new JPanel();
        p2.setBounds(766, 0, 600, 768);
        p2.setBackground(new Color(250, 250, 250));
        p2.setLayout(null);
        f1.add(p2);

        l1 = new JLabel();
        image1 = new ImageIcon("Images/welcome.jpg");
        l1.setIcon(image1);
        l1.setBounds(0, 0, 600, 768);
        p2.add(l1);

        b1 = new JButton("X");
        b1.setBounds(560, 10, 30, 40);
        b1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setFocusPainted(false);
        b1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b1.setContentAreaFilled(false);
        l1.add(b1);

        b2 = new JButton("-");
        b2.setBounds(530, 15, 25, 30);
        b2.setFont(new Font("Segoe UI", Font.BOLD, 40));
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setFocusPainted(false);
        b2.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        b2.setContentAreaFilled(false);
        l1.add(b2);

        l2 = new JLabel("Welcome to TUTOR SEBA");
        l2.setBounds(150, 150, 450, 50);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Segoe UI", Font.BOLD, 35));
        p1.add(l2);

        l3 = new JLabel("Are you a");
        l3.setBounds(300, 250, 450, 50);
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        p1.add(l3);

        b3 = new JButton("TUTOR");
        b3.setBounds(250, 350, 200, 40);
        b3.setFont(new Font("Segoe UI", Font.BOLD, 24));
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.black);
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setFocusPainted(false);
        p1.add(b3);

        l4 = new JLabel("OR");
        l4.setBounds(340, 430, 450, 50);
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        p1.add(l4);

        b4 = new JButton("Student/Guardian");
        b4.setBounds(200, 500, 300, 40);
        b4.setFont(new Font("Segoe UI", Font.BOLD, 24));
        b4.setBackground(Color.WHITE);
        b4.setForeground(Color.black);
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setFocusPainted(false);
        p1.add(b4);
		
		b5 = new JButton("Credit");
        b5.setBounds(200, 700, 300, 40);
        b5.setFont(new Font("Segoe UI", Font.BOLD, 24));
        b5.setBackground(Color.WHITE);
        b5.setForeground(Color.black);
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b5.setFocusPainted(false);
        p1.add(b5);

        f1.setVisible(true);

        b1.addActionListener(new ActionListener() {
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

                if (e.getSource() == b2)
                {
                    f1.setState(Frame.ICONIFIED);
                }
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                if (e.getSource() == b3)
                {
                    f1.setVisible(false);
                    new tlogin();
                }
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                if (e.getSource() == b4)
                {
                    f1.setVisible(false);
                    new Glogin();
                }
            }
        });
		
		b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                if (e.getSource() == b5)
                {
                    //f1.setVisible(false);
                    new credit();
                }
            }
        });

    }

}