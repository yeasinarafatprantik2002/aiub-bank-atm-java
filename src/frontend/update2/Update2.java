package frontend.update2;

import javax.swing.*;

import backend.userForm.UserForm;
import frontend.update1.Update1;
import frontend.update3.Update3;
import frontend.dashboardLogin.DashboardLogin;
import helpers.GetPathName;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Update2 extends JFrame {
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAadhar;
    JRadioButton r1, r2, e1, e2;
    JButton next, cancel, back;
    String accountNumber;
    String name;
    String fname;
    String email;
    String add;
    String city;
    String state;
    String pinCode;
    String gender;
    String ms;
    String dob;
    Update1 update1;
    Update2 update2 = this;
    UserForm user;

    public Update2(String accountNumber, String name, String fname, String email, String add, String city, String state,
            String pinCode, String gender, String ms, String dob, Update1 update1, UserForm user) {
        super("APPLICATION FORM");
        String path = GetPathName.getPathName();

        ImageIcon i1 = new ImageIcon(path + "/public/images/bank.png");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.accountNumber = accountNumber;
        this.name = name;
        this.fname = fname;
        this.email = email;
        this.add = add;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.gender = gender;
        this.ms = ms;
        this.dob = dob;
        this.update1 = update1;
        this.user = user;

        JLabel l1 = new JLabel("Page 2 : ");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(300, 30, 600, 40);
        add(l1);

        JLabel l2 = new JLabel("Additonal Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 120, 100, 30);
        add(l3);

        String religion[] = { "Muslim", "Hindu", "Christian", "Other" };
        comboBox = new JComboBox(religion);
        if (user.getReligion() != null) {
            comboBox.setSelectedItem(user.getReligion().trim());

        }
        comboBox.setBackground(new Color(252, 208, 76));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(350, 120, 320, 30);
        add(comboBox);

        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 170, 100, 30);
        add(l4);

        String Category[] = { "General", "OBC", "SC", "ST", "Other" };
        comboBox2 = new JComboBox(Category);
        if (user.getCategory() != null) {
            comboBox2.setSelectedItem(user.getCategory().trim());
        }
        comboBox2.setBackground(new Color(252, 208, 76));
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(350, 170, 320, 30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        l5.setBounds(100, 220, 100, 30);
        add(l5);

        String income[] = { "Null", "<1,50,000", "<2,50,000", "5,00,000", "Uptp 10,00,000", "Above 10,00,000" };
        comboBox3 = new JComboBox(income);
        if (user.getIncome() != null) {
            comboBox3.setSelectedItem(user.getIncome().trim());
        }
        comboBox3.setBackground(new Color(252, 208, 76));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(350, 220, 320, 30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational : ");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(100, 270, 150, 30);
        add(l6);

        String educational[] = { "Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others" };
        comboBox4 = new JComboBox(educational);
        if (user.getEducation() != null) {
            comboBox4.setSelectedItem(user.getEducation().trim());
        }
        comboBox4.setBackground(new Color(252, 208, 76));
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(350, 270, 320, 30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100, 340, 150, 30);
        add(l7);

        String Occupation[] = { "Salaried", "Self-Employed", "Business", "Student", "Retired", "Other" };
        comboBox5 = new JComboBox(Occupation);
        if (user.getOccupation() != null) {
            comboBox5.setSelectedItem(user.getOccupation().trim());
        }
        comboBox5.setBackground(new Color(252, 208, 76));
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(350, 340, 320, 30);
        add(comboBox5);

        JLabel l8 = new JLabel("NID Number : ");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 390, 150, 30);
        add(l8);

        textPan = new JTextField(user.getPan());
        textPan.setFont(new Font("Raleway", Font.BOLD, 18));
        textPan.setBounds(350, 390, 320, 30);
        add(textPan);

        JLabel l9 = new JLabel("Nominee NID Number : ");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100, 440, 180, 30);
        add(l9);

        textAadhar = new JTextField(user.getAadhar());
        textAadhar.setFont(new Font("Raleway", Font.BOLD, 18));
        textAadhar.setBounds(350, 440, 320, 30);
        add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100, 490, 180, 30);
        add(l10);

        r1 = new JRadioButton("Yes");
        if (user.getSenior().trim().equals("Yes")) {
            r1.setSelected(true);

        }
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(252, 208, 76));
        r1.setBounds(350, 490, 100, 30);
        add(r1);
        r2 = new JRadioButton("No");
        if (user.getSenior().trim().equals("No")) {
            r2.setSelected(true);
        }
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(252, 208, 76));
        r2.setBounds(460, 490, 100, 30);
        add(r2);

        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 540, 180, 30);
        add(l11);

        e1 = new JRadioButton("Yes");
        if (user.getExisting().trim().equals("Yes")) {
            e1.setSelected(true);
        }
        e1.setFont(new Font("Raleway", Font.BOLD, 14));
        e1.setBackground(new Color(252, 208, 76));
        e1.setBounds(350, 540, 100, 30);
        add(e1);
        e2 = new JRadioButton("No");
        if (user.getExisting().trim().equals("No")) {
            e2.setSelected(true);
        }
        e2.setFont(new Font("Raleway", Font.BOLD, 14));
        e2.setBackground(new Color(252, 208, 76));
        e2.setBounds(460, 540, 100, 30);
        add(e2);

        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        l12.setBounds(700, 10, 100, 30);
        add(l12);

        JLabel l13 = new JLabel(" " + user.getAccountNumber());
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        l13.setBounds(770, 10, 100, 30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570, 640, 100, 30);
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String religion = (String) comboBox.getSelectedItem();
                String category = (String) comboBox2.getSelectedItem();
                String income = (String) comboBox3.getSelectedItem();
                String education = (String) comboBox4.getSelectedItem();
                String occupation = (String) comboBox5.getSelectedItem();
                String pan = textPan.getText();
                String aadhar = textAadhar.getText();
                String senior = null;
                if (r1.isSelected()) {
                    senior = "Yes";
                } else if (r2.isSelected()) {
                    senior = "No";
                }
                String existing = null;
                if (e1.isSelected()) {
                    existing = "Yes";
                } else if (e2.isSelected()) {
                    existing = "No";
                }

                new Update3(accountNumber, name, fname, email, add, city, state, pinCode,
                        gender, ms, dob, religion,
                        category, income, education, occupation, pan, aadhar, senior, existing,
                        update2, user);
                setVisible(false);
            }
        });
        add(next);

        back = new JButton("Back");
        back.setFont(new Font("Raleway", Font.BOLD, 14));
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setBounds(450, 640, 100, 30);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                update1.setVisible(true);
                setVisible(false);
            }
        });
        add(back);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBackground(Color.WHITE);
        cancel.setForeground(Color.BLACK);
        cancel.setBounds(330, 640, 100, 30);
        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new DashboardLogin(accountNumber, user.getPassword()).setVisible(true);
                setVisible(false);
            }
        });
        add(cancel);

        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(252, 208, 76));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }

}
