package frontend.balanceEnquriy;

import javax.swing.*;

import backend.atm.AtmFrom;
import backend.user.UserFrom;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import helpers.GetPathName;
import frontend.atm.Atm;

public class BalanceEnquriy extends JFrame {

    String pin;
    JLabel label2;
    JButton b1;
    Atm atm;
    UserFrom user;

    public BalanceEnquriy(UserFrom user, Atm atm) {
        this.atm = atm;
        this.user = user;
        String path = GetPathName.getPathName();
        String balance = new AtmFrom(user).checkBalance();

        ImageIcon i1 = new ImageIcon(path + "/public/images/atm2.png");
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        add(l3);

        JLabel label1 = new JLabel("Your Current Balance is Tk: ");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(430, 180, 700, 35);
        l3.add(label1);

        label2 = new JLabel("Tk. " + balance);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(430, 220, 400, 35);
        l3.add(label2);

        b1 = new JButton("Back");
        b1.setBounds(700, 406, 150, 35);
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atm.setVisible(true);
                setVisible(false);
            }
        });
        l3.add(b1);

        setLayout(null);
        setSize(1550, 830);
        setLocation(90, 150);
        setUndecorated(true);
        setVisible(true);
    }
}
