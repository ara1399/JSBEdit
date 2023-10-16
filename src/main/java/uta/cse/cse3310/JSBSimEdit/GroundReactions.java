package uta.cse.cse3310.JSBSimEdit;

import javax.swing.*;

public class GroundReactions extends JPanel{
    
    GroundReactions(){
        add(new JLabel("Random Text"));

        addGR = new JButton("Add");
        addGR.addActionListener(e -> openLandingGearSetup());
        add(addGR);
    }

    void openLandingGearSetup(){
        LandingGearSetup lgs = new LandingGearSetup();
    }

    JButton addGR;
}