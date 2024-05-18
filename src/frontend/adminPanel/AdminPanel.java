package frontend.adminPanel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import backend.adminForm.AdminForm;
import backend.userForm.UserForm;
import db.dbConfig.DbConfig;
import frontend.adminProfile.AdminProfile;
import frontend.update1.Update1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import helpers.GetPathName;

public class AdminPanel extends JFrame {

    private JLabel name, adminDash, total, search, l1;
    private JButton profile, update, logout, searchB, deleteB, addB;
    private JTextField searchT;
    private ImageIcon image;
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane scrollPane;
    private int count = 1;
    private AdminForm admin;
    private AdminPanel adminPanel = this;
    private UserForm[] rows;

    public AdminPanel(AdminForm admin) {
        super("Admin Panel");
        this.admin = admin;
        rows = new DbConfig().findAll();

        String path = GetPathName.getPathName();

        image = new ImageIcon(path + "/public/images/bank.png");
        Image image2 = image.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel imageLabel = new JLabel(image3);
        imageLabel.setBounds(25, 10, 100, 100);
        add(imageLabel);

        name = new JLabel("Welcome Sonar Bank Admin Panel");
        name.setBounds(500, 30, 700, 40);
        name.setFont(new Font("Raleway", Font.BOLD, 38));
        add(name);

        adminDash = new JLabel("Admin Dashboard");
        adminDash.setBounds(720, 90, 600, 30);
        adminDash.setFont(new Font("Raleway", Font.BOLD, 22));
        add(adminDash);

        total = new JLabel("Total Accounts : " + count);
        total.setBounds(100, 150, 400, 30);
        total.setFont(new Font("Raleway", Font.BOLD, 20));
        add(total);

        search = new JLabel("Search Account :");
        search.setBounds(100, 200, 200, 30);
        search.setFont(new Font("Raleway", Font.BOLD, 20));
        add(search);

        searchT = new JTextField();
        searchT.setBounds(300, 200, 400, 30);
        searchT.setFont(new Font("Raleway", Font.BOLD, 14));
        add(searchT);

        l1 = new JLabel("All Accounts Details:");
        l1.setBounds(100, 250, 400, 30);
        l1.setFont(new Font("Raleway", Font.BOLD, 20));
        add(l1);

        searchB = new JButton("Search");
        searchB.setBounds(750, 200, 100, 30);
        searchB.setFont(new Font("Raleway", Font.BOLD, 14));
        searchB.setBackground(new Color(59, 89, 182));
        searchB.setForeground(Color.WHITE);
        searchB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String accountNo = searchT.getText();
                if (accountNo.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter account number");
                    return;
                }
                boolean found = false;
                for (int i = 0; i < rows.length; i++) {
                    if (rows[i] == null) {
                        break;
                    }
                    String accNo = rows[i].getAccountNumber();
                    if (accNo.equals(accountNo)) {
                        table.setRowSelectionInterval(i, i);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(null, "Account not found");
                } else {
                    JOptionPane.showMessageDialog(null, "Account found", "Success", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });
        add(searchB);

        profile = new JButton("Profile");
        profile.setBounds(1500, 200, 100, 30);
        profile.setFont(new Font("Raleway", Font.BOLD, 14));
        profile.setBackground(new Color(59, 89, 182));
        profile.setForeground(Color.WHITE);
        profile.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email = admin.getEmail();
                String password = admin.getPassword();
                System.out.println(email + " " + password);
                AdminForm admin = new DbConfig().findAdminByEmailAndPass(email, password);
                if (admin != null) {
                    new AdminProfile(admin, adminPanel).setVisible(true);
                    adminPanel.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Admin not found");

                }
            }
        });
        add(profile);

        table = new JTable();

        model = new DefaultTableModel();
        model.addColumn("Account Number");
        model.addColumn("Name");
        model.addColumn("Email");
        model.addColumn("Account Type");
        model.addColumn("Balance");
        model.isCellEditable(0, 0);
        for (UserForm user : rows) {
            if (user == null) {
                break;
            }
            model.addRow(new Object[] { user.getAccountNumber(), user.getName(), user.getEmail(), user.getAccountType(),
                    user.getBalance() });
            count++;
        }

        table.setEnabled(false);
        table.setColumnSelectionAllowed(false);
        table.setBackground(new Color(224, 255, 255));
        table.setForeground(Color.BLACK);
        table.setFont(new Font("Raleway", Font.BOLD, 20));
        table.setRowHeight(50);
        table.getTableHeader().setFont(new Font("Raleway", Font.BOLD, 30));
        table.setModel(model);

        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(100, 300, 1500, 600);
        add(scrollPane);

        update = new JButton("Update");
        update.setBounds(100, 950, 100, 30);
        update.setFont(new Font("Raleway", Font.BOLD, 14));
        update.setBackground(new Color(59, 89, 182));
        update.setForeground(Color.WHITE);
        update.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int row = table.getSelectedRow();
                if (row == -1) {
                    JOptionPane.showMessageDialog(null, "Please select a row to update");
                    return;
                }
                String accountNo = (String) model.getValueAt(row, 0);
                UserForm user = new DbConfig().findUserById(accountNo);
                if (user == null) {
                    JOptionPane.showMessageDialog(null, "User not found");
                    return;
                }
                new Update1(user).setVisible(true);
                adminPanel.setVisible(false);

            }
        });
        add(update);

        deleteB = new JButton("Delete");
        deleteB.setBounds(300, 950, 100, 30);
        deleteB.setFont(new Font("Raleway", Font.BOLD, 14));
        deleteB.setBackground(new Color(59, 89, 182));
        deleteB.setForeground(Color.WHITE);
        deleteB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int row = table.getSelectedRow();
                if (row == -1) {
                    JOptionPane.showMessageDialog(null, "Please select a row to delete");
                    return;
                }
                String accountNo = (String) model.getValueAt(row, 0);
                UserForm user = new DbConfig().findUserById(accountNo);
                if (user == null) {
                    JOptionPane.showMessageDialog(null, "User not found");
                    return;
                }
                new DbConfig(user).deleteUser(user.getAccountNumber());
                JOptionPane.showMessageDialog(null, "User deleted successfully");
                model.removeRow(row);
            }
        });
        add(deleteB);

        logout = new JButton("Logout");
        logout.setBounds(1500, 950, 100, 30);
        logout.setFont(new Font("Raleway", Font.BOLD, 14));
        logout.setBackground(new Color(59, 89, 182));
        logout.setForeground(Color.WHITE);
        logout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new frontend.adminLogin.AdminLogin("", "").setVisible(true);
                adminPanel.setVisible(false);
            }
        });
        add(logout);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);

    }

}
