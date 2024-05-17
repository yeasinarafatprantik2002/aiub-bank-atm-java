package frontend.dashboard1;

import javax.swing.*;

import helpers.GetPathName;
import backend.signup.UserFrom;
import frontend.dashboard2.Dashboard2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Dashboard1 extends JFrame {
    JRadioButton r1, r2, m1, m2, m3;
    JButton next;

    JTextField textName, textFname, textEmail, textAdd, textcity, textState, textPin, textGender, textMarital, textDob;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);
    String data;
    Dashboard1 dashboard = this;
    UserFrom user;

    public Dashboard1(UserFrom user) {

        super("DASHBOARD");
        this.user = user;
        boolean flag = false;
        String path = GetPathName.getPathName();

        ImageIcon i1 = new ImageIcon(
                path + "/public/images/bank.png");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("DASHBOARD ACCOUNT NO: " + user.getAccountNumber());
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 30));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        textName = new JTextField(user.getName());
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        textName.setEditable(flag);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelfName.setBounds(100, 240, 200, 30);
        add(labelfName);

        textFname = new JTextField(user.getFname());
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        textFname.setBounds(300, 240, 400, 30);
        textFname.setEditable(flag);
        add(textFname);

        JLabel labelDob = new JLabel("Date of Birth :");
        labelDob.setFont(new Font("Raleway", Font.BOLD, 20));
        labelDob.setBounds(100, 290, 200, 30);
        add(labelDob);

        textDob = new JTextField(user.getDate());
        textDob.setFont(new Font("Raleway", Font.BOLD, 14));
        textDob.setBounds(300, 290, 400, 30);
        textDob.setEditable(flag);
        add(textDob);

        JLabel labelGender = new JLabel("Gender :");
        labelGender.setFont(new Font("Raleway", Font.BOLD, 20));
        labelGender.setBounds(100, 340, 200, 30);
        add(labelGender);

        textGender = new JTextField(user.getGender());
        textGender.setFont(new Font("Raleway", Font.BOLD, 14));
        textGender.setBounds(300, 340, 400, 30);
        textGender.setEditable(flag);
        add(textGender);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100, 390, 200, 30);
        add(labelEmail);

        textEmail = new JTextField(user.getEmail());
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        textEmail.setEditable(flag);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMs.setBounds(100, 440, 200, 30);
        add(labelMs);

        textMarital = new JTextField(user.getMaritalStatus());
        textMarital.setFont(new Font("Raleway", Font.BOLD, 14));
        textMarital.setBounds(300, 440, 400, 30);
        textMarital.setEditable(flag);
        add(textMarital);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAdd.setBounds(100, 490, 200, 30);
        add(labelAdd);

        textAdd = new JTextField(user.getAdd());
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdd.setBounds(300, 490, 400, 30);
        textAdd.setEditable(flag);
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100, 540, 200, 30);
        add(labelCity);

        textcity = new JTextField(user.getCity());
        textcity.setFont(new Font("Raleway", Font.BOLD, 14));
        textcity.setBounds(300, 540, 400, 30);
        textcity.setEditable(flag);
        add(textcity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPin.setBounds(100, 590, 200, 30);
        add(labelPin);

        textPin = new JTextField(user.getPinCode());
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(300, 590, 400, 30);
        textPin.setEditable(flag);
        add(textPin);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Raleway", Font.BOLD, 20));
        labelstate.setBounds(100, 640, 200, 30);
        add(labelstate);

        textState = new JTextField(user.getState());
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300, 640, 400, 30);
        textState.setEditable(flag);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 710, 80, 30);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new Dashboard2(dashboard, flag, user);
                setVisible(false);

            }
        });
        add(next);

        getContentPane().setBackground(new Color(222, 255, 228));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        // setUndecorated(true);
        setVisible(true);

    }

}