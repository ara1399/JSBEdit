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
<<<<<<< HEAD
        //external reactions
        //buoyant forces
        mainWinTabs.addTab("Propulsion", new Propulsion());
        //system
        //autopilot
=======
        mainWinTabs.addTab("ExternalReactions", new ExternalReactions());
        mainWinTabs.addTab("BouyantForces", new BouyantForces());
        mainWinTabs.addTab("System", new System());
        mainWinTabs.addTab("AutoPilot", new AutoPilot());
>>>>>>> 85a6018d8f2df27c87a440947f4d5f453d6b328d
        mainWinTabs.addTab("FlightControl", new FlightControl());
        mainWinTabs.addTab("Aerodynamics", new Aerodynamics());
        mainWinTabs.addTab("Input", new Input());
        mainWinTabs.addTab("Output", new Output());
        
    }

    JTabbedPane mainWinTabs;
}
