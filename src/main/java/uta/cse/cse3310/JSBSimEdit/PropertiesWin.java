package uta.cse.cse3310.JSBSimEdit;

import generated.PropsType;
import generated.SourceType;
import generated.DestinationType;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import java.awt.Component;
import java.awt.Window;
import java.io.File;
import java.util.Optional;
import javax.swing.JDialog;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.*;

public class PropertiesWin extends JDialog { // this can be called from anywhere, 'PropertiesWin.showProperties(this)'

    public PropertiesWin(Window parent) {
	super(parent); //calling the JDialog constructor
	initComponents();
        System.out.println("PropertiesWin loaded.");
    }
    
    public static void showProperties(Component component){ //I believe parent will be the window/frame/dialog that calls this function
        Window parent = SwingUtilities.getWindowAncestor(component); //user component to find the parent
        if(instance == null)instance = new PropertiesWin(parent); //create a new properties window if it doesnt already exist 
        instance.setVisible(true);
    }
    
    public static void loadProperties(Optional<File> xml) { //load in from cfg object
        try{
//            JAXBContext jc = JAXBContext.newInstance(PropsType.class);
//            Unmarshaller um = jc.createUnmarshaller();
        
//            pt = (PropsType) um.unmarshal(xml.get()); // unmarshalling doesnt work from what I found
                                                        // PropsType doesnt exist in XML, its not a root element, can't directly access it from root element
//            for(SourceType s : pt.getSource()){
//                System.out.println(s.getName());
//            }
        }
        catch(Exception e){    
            e.printStackTrace();
        }

    }

    private void initComponents() {
	// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
	// Generated using JFormDesigner Evaluation license - Connor Baldwin

	//======== this ========
	setModal(true);
	setTitle("Properties");
	setAlwaysOnTop(true);
	var contentPane = getContentPane();
	contentPane.setLayout(new MigLayout(
	    "hidemode 3",
	    // columns
	    "[fill]" +
	    "[fill]",
	    // rows
	    "[]" +
	    "[]" +
	    "[]"));
	pack();
	setLocationRelativeTo(getOwner());
	// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Connor Baldwin
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private static PropertiesWin instance; //this is our properties window object
    private static PropsType pt;
}
