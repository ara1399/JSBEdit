package uta.cse.cse3310.JSBSimEdit;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.util.SystemInfo;

import javax.swing.*;

public class App {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
            if(SystemInfo.isLinux) {
                // enable custom window decorations
                JFrame.setDefaultLookAndFeelDecorated(true);
                JDialog.setDefaultLookAndFeelDecorated(true);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            new MainWindow();
        });
    }
}
