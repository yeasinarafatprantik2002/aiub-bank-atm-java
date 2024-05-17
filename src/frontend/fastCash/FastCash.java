package frontend.fastCash;

import javax.swing.*;

import backend.atmFrom.AtmFrom;
import backend.signup.UserFrom;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import helpers.GetPathName;
import frontend.atm.Atm;

public class FastCash extends JFrame {
    JButton b1, b2, b3, b4, b5, b6, b7, b8;
    String pin;
    Atm atm;
    UserFrom user;

    public FastCash(UserFrom user, Atm atm) {
        this.atm = atm;
        this.user = user;
        String path = GetPathName.getPathName();

        ImageIcon i1 = new ImageIcon(path + "/public/images/atm2.png");
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        add(l3);

        JLabel label = new JLabel("SELECT WITHDRAWL AMOUNT");
        label.setBounds(445, 180, 700, 35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System", Font.BOLD, 23));
        l3.add(label);

        b1 = new JButton("Tk. 100");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65, 125, 128));
        b1.setBounds(410, 274, 150, 35);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (new AtmFrom(user).withdraw(100)) {
                    JOptionPane.showMessageDialog(null, "Tk. 100 Debited Successfully");
                    new Atm(user).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                }
            }
        });
        l3.add(b1);

        b2 = new JButton("Tk. 500");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65, 125, 128));
        b2.setBounds(700, 274, 150, 35);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (new AtmFrom(user).withdraw(500)) {
                    JOptionPane.showMessageDialog(null, "Tk. 500 Debited Successfully");
                    new Atm(user).setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                }

            }
        });
        l3.add(b2);

        b3 = new JButton("Tk. 1000");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65, 125, 128));
        b3.setBounds(410, 318, 150, 35);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (new AtmFrom(user).withdraw(1000)) {
                    JOptionPane.showMessageDialog(null, "Tk. 1000 Debited Successfully");
                    new Atm(user).setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                }

            }
        });
        l3.add(b3);

        b4 = new JButton("Tk. 2000");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65, 125, 128));
        b4.setBounds(700, 318, 150, 35);
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (new AtmFrom(user).withdraw(2000)) {
                    JOptionPane.showMessageDialog(null, "Tk. 2000 Debited Successfully");
                    new Atm(user).setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                }

            }
        });
        l3.add(b4);

        b5 = new JButton("Tk. 5000");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65, 125, 128));
        b5.setBounds(410, 362, 150, 35);
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (new AtmFrom(user).withdraw(5000)) {
                    JOptionPane.showMessageDialog(null, "Tk. 5000 Debited Successfully");
                    new Atm(user).setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                }

            }
        });
        l3.add(b5);

        b6 = new JButton("Tk. 10000");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65, 125, 128));
        b6.setBounds(700, 362, 150, 35);
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (new AtmFrom(user).withdraw(10000)) {
                    JOptionPane.showMessageDialog(null, "Tk. 10000 Debited Successfully");
                    new Atm(user).setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");

                }
            }
        });

        l3.add(b6);

        b8 = new JButton("Tk. 20000");
        b8.setForeground(Color.WHITE);
        b8.setBackground(new Color(65, 125, 128));
        b8.setBounds(410, 406, 150, 35);
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (new AtmFrom(user).withdraw(20000)) {
                    JOptionPane.showMessageDialog(null, "Tk. 20000 Debited Successfully");
                    new Atm(user).setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");

                }
            }
        });
        l3.add(b8);

        b7 = new JButton("BACK");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(65, 125, 128));
        b7.setBounds(700, 406, 150, 35);
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atm.setVisible(true);
                setVisible(false);
            }
        });
        l3.add(b7);

        setLayout(null);
        setSize(1550, 830);
        setLocation(90, 150);
        setUndecorated(true);
        setVisible(true);

    }

}
