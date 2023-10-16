package uta.cse.cse3310.JSBSimEdit;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JSBEdit (JE)");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(300, 300));

        JTabbedPane mainWinTabs = new JTabbedPane();
        add(mainWinTabs);

        mainWinTabs.addTab("Metrics", new Metrics());

        setVisible(true);
    }


}
