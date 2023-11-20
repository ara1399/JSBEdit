package uta.cse.cse3310.JSBSimEdit;

import java.awt.Component;
import java.awt.Window;
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
}
