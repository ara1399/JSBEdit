package uta.cse.cse3310.JSBSimEdit;

import javax.swing.*;
import java.awt.*;

public class PointMass extends JFrame{
    PointMass(){        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Point Mass");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 100));

        add(new JLabel("Random Text"));
        setVisible(true);
    }
}