package frontend.atm;

import javax.swing.*;

import backend.signup.UserFrom;
import frontend.atmLogin.AtmLogin;
import frontend.balanceEnquriy.BalanceEnquriy;
import frontend.dashboardLogin.DashboardLogin;
import frontend.deposit.Deposit;
import frontend.fastCash.FastCash;
import frontend.pin.Pin;
import frontend.withdrawl.Withdrawl;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Atm extends JFrame {
    JButton b1, b2, b3, b4, b5, b6, b7, b8;
    String pin;
    Atm atm = this;
    UserFrom user;

    public Atm(UserFrom user) {
        super("ATM");
        this.user = user;

        ImageIcon i1 = new ImageIcon(
                "/Users/yaprantik/Developer/code/WorkPlace/java/Aiub Java Project/sonar-bank/src/public/images/atm2.png");
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        add(l3);

        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(410, 180, 700, 35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System", Font.BOLD, 28));
        l3.add(label);

        b1 = new JButton("DEPOSIT");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65, 125, 128));
        b1.setBounds(410, 274, 150, 35);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Deposit(user, atm).setVisible(true);
                setVisible(false);
            }
        });
        l3.add(b1);

        b2 = new JButton("CASH WITHDRAWL");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65, 125, 128));
        b2.setBounds(700, 274, 150, 35);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Withdrawl(user, atm).setVisible(true);
                setVisible(false);
            }
        });
        l3.add(b2);

        b3 = new JButton("FAST CASH");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65, 125, 128));
        b3.setBounds(410, 318, 150, 35);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new FastCash(user,atm).setVisible(true);
                setVisible(false);

            }
        });
        l3.add(b3);

        b5 = new JButton("PIN CHANGE");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65, 125, 128));
        b5.setBounds(410, 362, 150, 35);
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Pin(user,atm).setVisible(true);
                setVisible(false);
            }
        });
        l3.add(b5);

        b8 = new JButton("DASHBOARD");
        b8.setForeground(Color.WHITE);
        b8.setBackground(new Color(65, 125, 128));
        b8.setBounds(410, 406, 150, 35);
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new DashboardLogin("", "").setVisible(true);
                setVisible(false);
            }
        });
        l3.add(b8);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65, 125, 128));
        b6.setBounds(700, 318, 150, 35);
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new BalanceEnquriy(user,atm).setVisible(true);
                setVisible(false);
            }
        });
        l3.add(b6);

        b7 = new JButton("EXIT");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(65, 125, 128));
        b7.setBounds(700, 406, 150, 35);
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        l3.add(b7);

        b4 = new JButton("SIGN OUT");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65, 125, 128));
        b4.setBounds(700, 362, 150, 35);
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AtmLogin("", "").setVisible(true);
                setVisible(false);
            }
        });
        l3.add(b4);

        setLayout(null);
        setSize(1550, 830);
        setLocation(90, 150);
        setUndecorated(true);
        setVisible(true);

    }

}