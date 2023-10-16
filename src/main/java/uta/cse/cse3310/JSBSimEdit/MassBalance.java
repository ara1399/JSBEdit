package uta.cse.cse3310.JSBSimEdit;

import javax.swing.*;
    
public class MassBalance extends JPanel{
    
    MassBalance(){
        add(new JLabel("Random Text"));

        addPM = new JButton("Add a Point Mass");
        addPM.addActionListener(event -> openPointMass());
        add(addPM);
    }

    void openPointMass(){
        PointMass pm = new PointMass();
    }

    JButton addPM;
}