
package frontend.adminProfile;

import javax.swing.*;

import backend.adminForm.AdminForm;
import db.dbConfig.DbConfig;
import frontend.adminPanel.AdminPanel;
import helpers.GetPathName;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminProfile extends JFrame {
    JRadioButton r1, r2, m1, m2, m3;
    JPasswordField textPassword, textCPassword;
    JButton next, cancel;
    JComboBox date, month, year;

    JTextField textName, textFname, textEmail, textAdd, textcity, textState, textPin;

    String data;
    AdminProfile adminProfile = this;
    AdminForm adminForm;
    AdminPanel adminPanel;

    public AdminProfile(AdminForm admin, AdminPanel adminPanel) {
        super("ADMIN Profile");
        this.adminForm = admin;
        this.adminPanel = adminPanel;
        String path = GetPathName.getPathName();

        ImageIcon i1 = new ImageIcon(
                path + "/public/images/bank.png");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("ADMIN Profile");
        label1.setBounds(200, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label3 = new JLabel("AdminProfile Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        textName = new JTextField(admin.getName());
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100, 390, 200, 30);
        add(labelEmail);

        textEmail = new JTextField(admin.getEmail());
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);

        JLabel labelPassword = new JLabel("Change Password :");
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

        next = new JButton("Update");
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
                    AdminForm adminForm = new AdminForm(name, email, password, gender);
                    new DbConfig(admin).updateAdmin();
                    JOptionPane.showMessageDialog(null, "Profile Updated Successfully");
                    adminPanel.setVisible(true);
                    adminProfile.dispose();

                }
            }
        });

        add(next);

        cancel = new JButton("Back");
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(500, 710, 100, 30);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adminPanel.setVisible(true);
                adminProfile.dispose();
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
