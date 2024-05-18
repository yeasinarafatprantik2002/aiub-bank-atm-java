import javax.swing.UIManager;

import frontend.dashboardLogin.DashboardLogin;
import frontend.adminLogin.AdminLogin;
import frontend.adminPanel.AdminPanel;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // new DashboardLogin("", "").setVisible(true);
        new AdminLogin("", "").setVisible(true);
        // new AdminPanel("", "").setVisible(true);

    }

}