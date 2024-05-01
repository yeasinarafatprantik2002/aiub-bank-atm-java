package Frontend.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Frontend.signup1.Signup1;
import Frontend.atm.Atm;

public class Login extends JFrame {

        JLabel label1, label2, label3;
        JTextField textField2;
        JPasswordField passwordField3;

        JButton button1, button2, button3, button4;

        public Login() {
                super("Bank Management System");

                ImageIcon i1 = new ImageIcon(
                                "/Users/yaprantik/Developer/code/WorkPlace/java/Aiub Java Project/sonar-bank/src/public/images/bank.png");
                Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
                ImageIcon i3 = new ImageIcon(i2);
                JLabel image = new JLabel(i3);
                image.setBounds(350, 10, 100, 100);
                add(image);

                ImageIcon ii1 = new ImageIcon(
                                "/Users/yaprantik/Developer/code/WorkPlace/java/Aiub Java Project/sonar-bank/src/public/images/card.png");
                Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
                ImageIcon ii3 = new ImageIcon(ii2);
                JLabel iimage = new JLabel(ii3);
                iimage.setBounds(630, 350, 100, 100);
                add(iimage);

                label1 = new JLabel("WELCOME TO ATM");
                label1.setForeground(Color.WHITE);
                label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
                label1.setBounds(230, 125, 450, 40);
                add(label1);

                label2 = new JLabel("Card No:");
                label2.setFont(new Font("Ralway", Font.BOLD, 28));
                label2.setForeground(Color.WHITE);
                label2.setBounds(150, 190, 375, 30);
                add(label2);

                textField2 = new JTextField(15);
                textField2.setBounds(325, 190, 230, 30);
                textField2.setFont(new Font("Arial", Font.BOLD, 14));
                add(textField2);

                label3 = new JLabel("PIN: ");
                label3.setFont(new Font("Ralway", Font.BOLD, 28));
                label3.setForeground(Color.WHITE);
                label3.setBounds(150, 250, 375, 30);
                add(label3);

                passwordField3 = new JPasswordField(15);
                passwordField3.setBounds(325, 250, 230, 30);
                passwordField3.setFont(new Font("Arial", Font.BOLD, 14));
                add(passwordField3);

                button1 = new JButton("SIGN IN");
                button1.setFont(new Font("Arial", Font.BOLD, 14));
                button1.setForeground(Color.WHITE);
                button1.setBackground(Color.BLACK);
                button1.setOpaque(true);
                button1.setBounds(300, 300, 100, 30);
                button1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                // String cardNo = textField2.getText();
                                String pin = passwordField3.getName();
                                new Atm(pin).setVisible(true);
                                setVisible(false);

                        }
                });
                add(button1);

                button2 = new JButton("CLEAR");
                button2.setFont(new Font("Arial", Font.BOLD, 14));
                button2.setForeground(Color.WHITE);
                button2.setBackground(Color.BLACK);
                button2.setOpaque(true);
                button2.setBounds(430, 300, 100, 30);
                button2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                textField2.setText("");
                                passwordField3.setText("");
                        }
                });
                add(button2);

                button3 = new JButton("SIGN UP");
                button3.setFont(new Font("Arial", Font.BOLD, 14));
                button3.setForeground(Color.WHITE);
                button3.setBackground(Color.BLACK);
                button3.setOpaque(true);
                button3.setBounds(300, 350, 230, 30);
                button3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {

                                new Signup1().setVisible(true);
                                setVisible(false);
                        }
                });
                add(button3);

                button4 = new JButton("EXIT");
                button4.setFont(new Font("Arial", Font.BOLD, 14));

                button4.setForeground(Color.WHITE);
                button4.setBackground(Color.BLACK);
                button4.setOpaque(true);
                button4.setBounds(300, 400, 230, 30);
                button4.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                System.exit(0);
                        }
                });
                add(button4);

                ImageIcon iii1 = new ImageIcon(
                                "/Users/yaprantik/Developer/code/WorkPlace/java/Aiub Java Project/sonar-bank/src/public/images/backbg.png");
                Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
                ImageIcon iii3 = new ImageIcon(iii2);
                JLabel iiimage = new JLabel(iii3);
                iiimage.setBounds(0, 0, 850, 480);
                add(iiimage);

                setLayout(null);
                setSize(850, 480);
                setLocation(450, 200);
                // setUndecorated(true);
                setVisible(true);
        }

}