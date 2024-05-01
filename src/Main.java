import javax.swing.UIManager;

import Frontend.login.Login;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName()); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Login().setVisible(true);

    }

}