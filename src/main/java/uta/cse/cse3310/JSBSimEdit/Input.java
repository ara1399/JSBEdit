package uta.cse.cse3310.JSBSimEdit;

//import java.math.BigInteger;
import java.util.Optional;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import generated.FdmConfig;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;

public class Input extends JPanel implements TabComponent {
    
JLabel portLabel;
JTextField portText;

    Input() {
        portLabel = new JLabel("Port");
        portText = new JTextField();
        add(portLabel);
        add(portText);
    }

    @Override
    public void bindUIwithXML(FdmConfig cfg) {
       /*  generated.Input in = cfg.getInput();
        BigInteger portValue = in.getPort();
		if (portValue != null) {
			portText.setText(portValue.toString());
		} else {
			return;
		}*/
    }

    @Override
    public Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg) {
        // TODO
        return Optional.ofNullable(cfg);
    }
}