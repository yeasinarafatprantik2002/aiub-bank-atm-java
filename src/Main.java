import javax.swing.UIManager;

import frontend.dashboardLogin.DashboardLogin;
import frontend.login.Login;
import frontend.dashboard.Dashboard;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Login("", "").setVisible(true);
        // new DashboardLogin().setVisible(true);
        // new Dashboard().setVisible(true);

    }

}