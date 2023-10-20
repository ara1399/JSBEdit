package uta.cse.cse3310.JSBSimEdit;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class LandingGearSetup extends JFrame{
    LandingGearSetup(){
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Landing Gear Setup");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 100));

        add(new JLabel("Random Text"));
        setVisible(true);
    }
}
