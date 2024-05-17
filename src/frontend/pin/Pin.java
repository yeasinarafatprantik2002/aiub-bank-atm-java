package frontend.pin;

import javax.swing.*;

import backend.atm.AtmFrom;
import backend.user.UserFrom;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import helpers.GetPathName;
import frontend.atm.Atm;

public class Pin extends JFrame {

    JButton b1, b2;
    JPasswordField p1, p2;
    String pin;
    Atm atm;
    UserFrom user;

    public Pin(UserFrom user, Atm atm) {
        this.atm = atm;
        this.user = user;
        String path = GetPathName.getPathName();
        ImageIcon i1 = new ImageIcon(path + "/public/images/atm2.png");
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        add(l3);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(430, 180, 400, 35);
        l3.add(label1);

        JLabel label2 = new JLabel("New PIN: ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(430, 220, 150, 35);
        l3.add(label2);

        p1 = new JPasswordField();
        p1.setBackground(new Color(65, 125, 128));
        p1.setForeground(Color.WHITE);
        p1.setBounds(600, 220, 180, 25);
        p1.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.add(p1);

        JLabel label3 = new JLabel("Re-Enter New PIN: ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("System", Font.BOLD, 16));
        label3.setBounds(430, 250, 400, 35);
        l3.add(label3);

        p2 = new JPasswordField();
        p2.setBackground(new Color(65, 125, 128));
        p2.setForeground(Color.WHITE);
        p2.setBounds(600, 255, 180, 25);
        p2.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.add(p2);

        b1 = new JButton("CHANGE");
        b1.setBounds(700, 362, 150, 35);
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pin1 = p1.getText();
                String pin2 = p2.getText();

                if (pin1.equals(pin2)) {

                    if (pin1.length() != 4) {

                        if (new AtmFrom(user).changePin(pin1)) {
                            JOptionPane.showMessageDialog(null, "PIN changed successfully");
                            atm.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "PIN change failed");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "PIN must contain 4 digits");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "PIN entered does not match!");
                }
            }
        });
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700, 406, 150, 35);
        b2.setBackground(new Color(65, 125, 128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atm.setVisible(true);
                setVisible(false);
            }
        });
        l3.add(b2);

        setLayout(null);
        setSize(1550, 830);
        setLocation(90, 150);
        setUndecorated(true);
        setVisible(true);
    }

}
