package uta.cse.cse3310.JSBSimEdit;

import java.util.Optional;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import generated.FdmConfig;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;
    
public class MassBalance extends JPanel implements TabComponent {
    
    MassBalance(){
        add(new JLabel("Random Text"));

        addPM = new JButton("Add a Point Mass");
        addPM.addActionListener(event -> openPointMass());
        add(addPM);
    }

    @Override
    public void bindUIwithXML(FdmConfig cfg) {
        // TODO
    }

    @Override
    public Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg) {
        // TODO
        return Optional.ofNullable(cfg);
    }

    void openPointMass(){
        new PointMass();
    }

    JButton addPM;
}