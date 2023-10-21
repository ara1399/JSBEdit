package uta.cse.cse3310.JSBSimEdit;

import java.util.Optional;

import javax.swing.JLabel;
import javax.swing.JPanel;

import generated.FdmConfig;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;

public class Metrics extends JPanel implements TabComponent{
    
    Metrics(){
        add(new JLabel("Random Text"));
        
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
}