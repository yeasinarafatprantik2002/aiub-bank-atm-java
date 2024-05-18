package frontend.adminSignup;

import backend.adminForm.AdminForm;
import db.dbConfig.DbConfig;
import frontend.adminLogin.AdminLogin;
import helpers.GetPathName;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminSignup extends JFrame {
    JRadioButton r1, r2, m1, m2, m3;
    JPasswordField textPassword, textCPassword;
    JButton next, cancel;
    JComboBox date, month, year;

    JTextField textName, textFname, textEmail, textAdd, textcity, textState, textPin;

    String data;
    AdminSignup adminSignup = this;

    private String dates[] = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[] = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[] = { "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019", "2020" };

    public AdminSignup() {
        super("ADMIN SIGNUP FORM");
        String path = GetPathName.getPathName();

        ImageIcon i1 = new ImageIcon(
                path + "/public/images/bank.png");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("ADMIN SIGNUP FORM");
        label1.setBounds(200, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label3 = new JLabel("Admin Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100, 390, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);

        JLabel labelPassword = new JLabel("Password :");
        labelPassword.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPassword.setBounds(100, 440, 200, 30);
        add(labelPassword);

        textPassword = new JPasswordField();
        textPassword.setFont(new Font("Raleway", Font.BOLD, 14));
        textPassword.setBounds(300, 440, 400, 30);
        add(textPassword);

        JLabel labelCPassword = new JLabel("Confirm Password :");
        labelCPassword.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCPassword.setBounds(100, 490, 200, 30);
        add(labelCPassword);

        textCPassword = new JPasswordField();
        textCPassword.setFont(new Font("Raleway", Font.BOLD, 14));
        textCPassword.setBounds(310, 490, 390, 30);
        add(textCPassword);

        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        labelG.setBounds(100, 290, 100, 30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(300, 290, 90, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(222, 255, 228));
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(410, 290, 90, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        next = new JButton("Submit");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(300, 710, 100, 30);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textName.getText();
                String email = textEmail.getText();
                String password = textPassword.getText();
                String cpassword = textCPassword.getText();
                String gender = null;
                if (r1.isSelected()) {
                    gender = r1.getText();
                } else if (r2.isSelected()) {
                    gender = r2.getText();
                } else {
                    System.out.println("Please select");
                }

                if (name.equals("") || email.equals("") || password.equals("") || cpassword.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                } else if (!password.equals(cpassword)) {
                    JOptionPane.showMessageDialog(null, "Password does not match");
                } else {
                    AdminForm admin = new AdminForm(name, email, password, gender);
                    new DbConfig(admin).saveAdmin();
                    JOptionPane.showMessageDialog(null, "Admin added successfully");
                    new AdminLogin(email, password);
                    dispose();
                }
            }
        });

        add(next);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(500, 710, 100, 30);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AdminLogin("", "");
                dispose();
            }
        });
        add(cancel);

        getContentPane().setBackground(new Color(222, 255, 228));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);

    }

}