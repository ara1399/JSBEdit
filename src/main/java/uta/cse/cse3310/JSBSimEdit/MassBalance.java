package uta.cse.cse3310.JSBSimEdit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
    
public class MassBalance extends JPanel{
    
    MassBalance(){
        add(new JLabel("Random Text"));

        addPM = new JButton("Add a Point Mass");
        addPM.addActionListener(event -> openPointMass());
        add(addPM);
    }

    void openPointMass(){
        new PointMass();
    }

    JButton addPM;
}