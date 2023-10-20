package uta.cse.cse3310.JSBSimEdit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GroundReactions extends JPanel{
    
    GroundReactions(){
        add(new JLabel("Random Text"));

        addGR = new JButton("Add");
        addGR.addActionListener(e -> openLandingGearSetup());
        add(addGR);
    }

    void openLandingGearSetup(){
        new LandingGearSetup();
    }

    JButton addGR;
}