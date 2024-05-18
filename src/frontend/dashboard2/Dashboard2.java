package frontend.dashboard2;

import javax.swing.*;

import backend.userForm.UserForm;
import frontend.dashboard1.Dashboard1;
import frontend.dashboard3.Dashboard3;
import helpers.GetPathName;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard2 extends JFrame {

    JTextField textReligion, textCategory, textIncome, textEducation, textOccupation, textPan, textAadhar, textSenior,
            textExisting;
    JButton next, back;
    Dashboard1 dashboard1;
    Dashboard2 dashboard2 = this;
    boolean flag;
    UserForm user;

    public Dashboard2(Dashboard1 dashboard1, boolean flag, UserForm user) {
        super("DASHBOARD");
        String path = GetPathName.getPathName();

        ImageIcon i1 = new ImageIcon(path + "/public/images/bank.png");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.dashboard1 = dashboard1;
        this.flag = flag;
        this.user = user;

        JLabel l1 = new JLabel("Page 2 :");
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

        textReligion = new JTextField(user.getReligion());
        textReligion.setFont(new Font("Raleway", Font.BOLD, 18));
        textReligion.setBounds(350, 120, 320, 30);
        textReligion.setEditable(flag);
        add(textReligion);

        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 170, 100, 30);
        add(l4);

        textCategory = new JTextField(user.getCategory());
        textCategory.setFont(new Font("Raleway", Font.BOLD, 18));
        textCategory.setBounds(350, 170, 320, 30);
        textCategory.setEditable(flag);
        add(textCategory);

        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        l5.setBounds(100, 220, 100, 30);
        add(l5);

        textIncome = new JTextField(user.getIncome());
        textIncome.setFont(new Font("Raleway", Font.BOLD, 18));
        textIncome.setBounds(350, 220, 320, 30);
        textIncome.setEditable(flag);
        add(textIncome);

        JLabel l6 = new JLabel("Educational : ");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(100, 270, 150, 30);
        add(l6);

        textEducation = new JTextField(user.getEducation());
        textEducation.setFont(new Font("Raleway", Font.BOLD, 18));
        textEducation.setBounds(350, 270, 320, 30);
        textEducation.setEditable(flag);
        add(textEducation);

        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100, 340, 150, 30);
        add(l7);

        textOccupation = new JTextField(user.getOccupation());
        textOccupation.setFont(new Font("Raleway", Font.BOLD, 18));
        textOccupation.setBounds(350, 340, 320, 30);
        textOccupation.setEditable(flag);
        add(textOccupation);

        JLabel l8 = new JLabel("NID Number : ");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 390, 150, 30);
        add(l8);

        textPan = new JTextField(user.getPan());
        textPan.setFont(new Font("Raleway", Font.BOLD, 18));
        textPan.setBounds(350, 390, 320, 30);
        textPan.setEditable(flag);
        add(textPan);

        JLabel l9 = new JLabel("Nominee NID Number : ");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100, 440, 180, 30);
        add(l9);

        textAadhar = new JTextField(user.getAadhar());
        textAadhar.setFont(new Font("Raleway", Font.BOLD, 18));
        textAadhar.setBounds(350, 440, 320, 30);
        textAadhar.setEditable(flag);
        add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100, 490, 180, 30);
        add(l10);

        textSenior = new JTextField(user.getSenior());
        textSenior.setFont(new Font("Raleway", Font.BOLD, 18));
        textSenior.setBounds(350, 490, 320, 30);
        textSenior.setEditable(flag);
        add(textSenior);

        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 540, 180, 30);
        add(l11);

        textExisting = new JTextField(user.getExisting());
        textExisting.setFont(new Font("Raleway", Font.BOLD, 18));
        textExisting.setBounds(350, 540, 320, 30);
        textExisting.setEditable(flag);
        add(textExisting);

        JLabel l12 = new JLabel("Account No : ");
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        l12.setBounds(600, 10, 200, 30);
        add(l12);

        JLabel l13 = new JLabel(user.getAccountNumber());
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        l13.setBounds(760, 10, 60, 30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570, 640, 100, 30);
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new Dashboard3(user, dashboard2, flag);
                setVisible(false);
            }
        });
        add(next);

        back = new JButton("Back");
        back.setFont(new Font("Raleway", Font.BOLD, 14));
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setBounds(400, 640, 100, 30);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                dashboard1.setVisible(true);
                setVisible(false);
            }
        });
        add(back);

        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(252, 208, 76));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

}
