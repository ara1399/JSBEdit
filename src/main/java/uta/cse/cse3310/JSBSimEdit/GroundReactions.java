package uta.cse.cse3310.JSBSimEdit;

import java.util.Optional;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import generated.FdmConfig;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;

public class GroundReactions extends JPanel implements TabComponent {
    
    GroundReactions(){
        add(new JLabel("Random Text"));

        addGR = new JButton("Add");
        addGR.addActionListener(e -> openLandingGearSetup());
        add(addGR);
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

    void openLandingGearSetup(){
        new LandingGearSetup();
    }

    JButton addGR;
}