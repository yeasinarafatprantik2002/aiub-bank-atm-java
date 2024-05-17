package frontend.withdrawl;

import javax.swing.*;

import backend.atm.AtmFrom;
import backend.user.UserFrom;
import frontend.atm.Atm;
import helpers.GetPathName;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Withdrawl extends JFrame {
    String pin;
    TextField textField;
    Atm atm;
    UserFrom user;

    JButton b1, b2;

    public Withdrawl(UserFrom user, Atm atm) {
        super("WITHDRAWL");
        this.atm = atm;
        this.user = user;

        String path = GetPathName.getPathName();
        ImageIcon i1 = new ImageIcon(path + "/public/images/atm2.png");
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        add(l3);

        JLabel label1 = new JLabel("MAXIMUM WITHDRAWAL IS RS.10,000");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(460, 180, 700, 35);
        l3.add(label1);

        JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(460, 220, 400, 35);
        l3.add(label2);

        textField = new TextField();
        textField.setBackground(new Color(65, 125, 128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460, 260, 320, 25);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.add(textField);

        b1 = new JButton("WITHDRAW");
        b1.setBounds(700, 362, 150, 35);
        b1.setBackground(new Color(65, 125, 128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String amount = textField.getText();
                if (amount.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Withdraw");
                } else {
                    int amount1 = Integer.parseInt(amount);
                    if (amount1 % 100 != 0) {
                        JOptionPane.showMessageDialog(null, "Amount must be multiple of 100");
                    } else if (amount1 > 10000) {
                        JOptionPane.showMessageDialog(null, "Maximum Withdrawal amount is 10,000");
                    } else {
                        new AtmFrom(user).withdraw(amount1);
                        JOptionPane.showMessageDialog(null, "Tk. " + amount1 + " Debited Successfully");
                        new Atm(user).setVisible(true);

                    }
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
