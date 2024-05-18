package frontend.home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import frontend.adminLogin.AdminLogin;
import frontend.adminProfile.AdminProfile;
import frontend.atmLogin.AtmLogin;
import frontend.dashboardLogin.DashboardLogin;
import backend.adminForm.AdminForm;
import db.dbConfig.DbConfig;

public class Home extends JFrame {
    JLabel name, imgLabel;
    JButton login, adminLogin, atmButton, exit;
    ImageIcon image;

    public Home() {
        super("Bank Management System");

        String path = System.getProperty("user.dir");

        image = new ImageIcon(path + "/public/images/bank.png");
        Image image2 = image.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        imgLabel = new JLabel(image3);
        imgLabel.setBounds(350, 10, 100, 100);
        add(imgLabel);

        name = new JLabel("WELCOME TO SONAR BANK");
        name.setBounds(150, 125, 700, 40);
        name.setFont(new Font("AvantGarde", Font.BOLD, 38));
        add(name);

        login = new JButton("Login");
        login.setBounds(300, 200, 200, 40);
        login.setFont(new Font("Arial", Font.BOLD, 20));
        login.setBackground(new Color(222, 255, 228));
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new DashboardLogin("", "").setVisible(true);
                setVisible(false);
            }
        });
        add(login);

        adminLogin = new JButton("Admin Login");
        adminLogin.setBounds(300, 250, 200, 40);
        adminLogin.setFont(new Font("Arial", Font.BOLD, 20));
        adminLogin.setBackground(new Color(222, 255, 228));
        adminLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AdminLogin("", "").setVisible(true);
                setVisible(false);
            }
        });
        add(adminLogin);
        

        atmButton = new JButton("ATM");
        atmButton.setBounds(300, 300, 200, 40);
        atmButton.setFont(new Font("Arial", Font.BOLD, 20));
        atmButton.setBackground(new Color(222, 255, 228));
        atmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AtmLogin("", "").setVisible(true);
                setVisible(false);
            }
        });
        add(atmButton);

        exit = new JButton("Exit");
        exit.setBounds(300, 350, 200, 40);
        exit.setFont(new Font("Arial", Font.BOLD, 20));
        exit.setBackground(new Color(222, 255, 228));
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exit);

        getContentPane().setBackground(new Color(122, 255, 228));
        setLayout(null);
        setSize(850, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
