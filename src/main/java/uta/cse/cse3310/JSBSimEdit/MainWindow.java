package uta.cse.cse3310.JSBSimEdit;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("JSBEdit (JE)");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(300, 300));

        mainWinTabs = new JTabbedPane();
        add(mainWinTabs);
        makeTabs();

        setVisible(true);
    }

    //////////////////////////////////////ADD TABS HERE///////////////////////////////////////
    public void makeTabs(){
        
        mainWinTabs.addTab("FileHeader", new FileHeader());
        mainWinTabs.addTab("Metrics", new Metrics());
        mainWinTabs.addTab("MassBalance", new MassBalance());
        mainWinTabs.addTab("GroundReactions", new GroundReactions());
        mainWinTabs.addTab("ExternalReactions", new ExternalReactions());
        mainWinTabs.addTab("BouyantForces", new BouyantForces());
        mainWinTabs.addTab("AutoPilot", new AutoPilot());
        mainWinTabs.addTab("FlightControl", new FlightControl());
        mainWinTabs.addTab("Input", new Input());
        mainWinTabs.addTab("Output", new Output());
        
    }

    JTabbedPane mainWinTabs;
}
