package frontend.dashboard3;

import javax.swing.*;

import backend.userForm.UserForm;
import frontend.atmLogin.AtmLogin;
import frontend.dashboard2.Dashboard2;
import frontend.dashboardLogin.DashboardLogin;
import frontend.update1.Update1;
import helpers.GetPathName;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard3 extends JFrame {

    JTextField textAccountType, textCardNumber, textBalance, textPin;
    JButton s, c, b, atm;
    String formno;
    String data;
    Dashboard2 dashboard2;
    boolean flag;
    UserForm user;

    public Dashboard3(UserForm user, Dashboard2 dashboard2, boolean flag) {
        super("DASHBOARD");
        this.dashboard2 = dashboard2;
        this.flag = flag;
        this.user = user;

        String path = GetPathName.getPathName();

        ImageIcon i1 = new ImageIcon(path + "/public/images/bank.png");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        JLabel l1 = new JLabel("Page 3:");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(280, 70, 400, 40);
        add(l2);

        JLabel l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 140, 200, 30);
        add(l3);

        textAccountType = new JTextField(user.getAccountType());
        textAccountType.setFont(new Font("Raleway", Font.BOLD, 18));
        textAccountType.setBounds(350, 140, 320, 30);
        textAccountType.setEditable(flag);
        add(textAccountType);

        JLabel l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 300, 200, 30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        l5.setBounds(100, 330, 200, 20);
        add(l5);

        textCardNumber = new JTextField(user.getCardNo());
        textCardNumber.setFont(new Font("Raleway", Font.BOLD, 18));
        textCardNumber.setBounds(350, 300, 320, 30);
        textCardNumber.setEditable(flag);
        add(textCardNumber);

        JLabel l6 = new JLabel("PIN:");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(100, 370, 200, 30);
        add(l6);

        textPin = new JTextField(user.getPinNumber());
        textPin.setFont(new Font("Raleway", Font.BOLD, 18));
        textPin.setBounds(350, 370, 320, 30);
        textPin.setEditable(flag);
        add(textPin);

        JLabel l8 = new JLabel("Balance:");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 440, 200, 30);
        add(l8);

        JLabel l9 = new JLabel("Tk. " + user.getBalance());
        l9.setFont(new Font("Raleway", Font.BOLD, 30));
        l9.setBounds(330, 440, 200, 30);
        add(l9);

        JLabel l12 = new JLabel("Account No : ");
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        l12.setBounds(600, 10, 200, 30);
        add(l12);

        JLabel l13 = new JLabel(user.getAccountNumber());
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        l13.setBounds(760, 10, 60, 30);
        add(l13);

        atm = new JButton("GO TO ATM");
        atm.setFont(new Font("Raleway", Font.BOLD, 14));
        atm.setBackground(Color.BLACK);
        atm.setForeground(Color.WHITE);
        atm.setBounds(350, 510, 200, 30);
        atm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AtmLogin(user.getCardNo(), user.getPinNumber()).setVisible(true);
                setVisible(false);
            }
        });
        add(atm);

        s = new JButton("Request Update Details");
        s.setFont(new Font("Raleway", Font.BOLD, 14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(150, 720, 300, 30);
        s.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Update1(user).setVisible(true);
                setVisible(false);

            }

        });
        add(s);

        b = new JButton("Back");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(500, 720, 100, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dashboard2.setVisible(true);
            }
        });
        add(b);

        c = new JButton("Log out");
        c.setFont(new Font("Raleway", Font.BOLD, 14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(600, 720, 100, 30);
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new DashboardLogin("", "").setVisible(true);

            }
        });
        add(c);

        getContentPane().setBackground(new Color(215, 252, 252));
        setSize(850, 800);
        setLayout(null);
        setLocation(400, 20);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }

}
