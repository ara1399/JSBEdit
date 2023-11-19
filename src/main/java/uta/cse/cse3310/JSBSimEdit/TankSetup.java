package uta.cse.cse3310.JSBSimEdit;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class TankSetup extends JDialog { //if this is its own window, should be jframe
    
    TankSetup() {
        tankComponents();
        setVisible(true);
    }
    private void tankComponents() {
		
        dialogPane = new JPanel();
		tankSetup = new JPanel();
		typePanel = new JPanel();
		typeLabel = new JLabel();
		typeComboBox = new JComboBox();
		capPanel = new JPanel();
		capacityLabel = new JLabel();
		capacityTextBox = new JTextField();
		capacityUnit = new JComboBox();
		contentsLabel = new JLabel();
		contentsTextBox = new JTextField();
		contentsUnit = new JComboBox();
		locationPanel = new JPanel();
		xLabel = new JLabel();
		xText = new JTextField();
		yLabel = new JLabel();
		textField4 = new JTextField();
		zLabel = new JLabel();
		zText = new JTextField();
		locationUnit = new JComboBox();
		OptionsPanel = new JPanel();
		OkButton = new JButton();
		CancelButton = new JButton();

        //======== this ========
		setTitle("Tank Setup");
		setPreferredSize(new Dimension(1000, 300));
		setMinimumSize(new Dimension(1000, 300));
		var contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setLayout(new BorderLayout());
            {
                //======== tankSetup ========
                tankSetup.setLayout(new MigLayout(
                    "align center center,gap 10 30",
                    // columns
                    "[grow,fill]" +
                    "[grow,fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[grow,fill]" +
                    "[grow,fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]"));
    
                //======== typePanel ========
                {
                    typePanel.setLayout(new MigLayout(
                        "fillx,hidemode 3",
                        // columns
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]",
                        // rows
                        "[]"));
    
                    //---- typeLabel ----
                    typeLabel.setText("Type:");
                    typePanel.add(typeLabel, "cell 0 0");
                    typePanel.add(typeComboBox, "cell 1 0");
                }
                tankSetup.add(typePanel, "cell 0 0 7 1");
    
                //======== capPanel ========
                {
                    capPanel.setLayout(new MigLayout(
                        "fill,hidemode 3",
                        // columns
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]",
                        // rows
                        "[]"));
    
                    //---- capacityLabel ----
                    capacityLabel.setText("Capacity:");
                    capPanel.add(capacityLabel, "cell 0 0");
                    capPanel.add(capacityTextBox, "cell 1 0");
                    capPanel.add(capacityUnit, "cell 2 0");
    
                    //---- contentsLabel ----
                    contentsLabel.setText("Contents:");
                    capPanel.add(contentsLabel, "cell 3 0");
                    capPanel.add(contentsTextBox, "cell 4 0");
                    capPanel.add(contentsUnit, "cell 5 0");
                }
                tankSetup.add(capPanel, "cell 0 1 7 2");
    
                //======== locationPanel ========
                {
                    locationPanel.setLayout(new MigLayout(
                        "fill,hidemode 3",
                        // columns
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]" +
                        "[fill]",
                        // rows
                        "[]"));
    
                    //---- xLabel ----
                    xLabel.setText("x:");
                    locationPanel.add(xLabel, "cell 0 0");
                    locationPanel.add(xText, "cell 1 0");
    
                    //---- yLabel ----
                    yLabel.setText("y:");
                    locationPanel.add(yLabel, "cell 2 0");
                    locationPanel.add(textField4, "cell 3 0");
    
                    //---- zLabel ----
                    zLabel.setText("z:");
                    locationPanel.add(zLabel, "cell 4 0");
                    locationPanel.add(zText, "cell 5 0");
                    locationPanel.add(locationUnit, "cell 6 0");
                }
                tankSetup.add(locationPanel, "cell 0 3 7 1");
    
                //======== OptionsPanel ========
                {
                    OptionsPanel.setLayout(new MigLayout(
                        "fillx,hidemode 3",
                        // columns
                        "[fill]" +
                        "[fill]",
                        // rows
                        "[]" +
                        "[]"));
    
                    //---- OkButton ----
                    OkButton.setText("Ok");
                    OptionsPanel.add(OkButton, "cell 0 0");
    
                    //---- CancelButton ----
                    CancelButton.setText("Cancel");
                    OptionsPanel.add(CancelButton, "cell 1 0");
                }
                tankSetup.add(OptionsPanel, "cell 0 4 7 1");
            }
		
		dialogPane.add(tankSetup, BorderLayout.SOUTH);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}
    contentPane.add(dialogPane, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(getOwner());
}

    private JPanel dialogPane;
	private JPanel tankSetup;
	private JPanel typePanel;
	private JLabel typeLabel;
	private JComboBox typeComboBox;
	private JPanel capPanel;
	private JLabel capacityLabel;
	private JTextField capacityTextBox;
	private JComboBox capacityUnit;
	private JLabel contentsLabel;
	private JTextField contentsTextBox;
	private JComboBox contentsUnit;
	private JPanel locationPanel;
	private JLabel xLabel;
	private JTextField xText;
	private JLabel yLabel;
	private JTextField textField4;
	private JLabel zLabel;
	private JTextField zText;
	private JComboBox locationUnit;
	private JPanel OptionsPanel;
	private JButton OkButton;
	private JButton CancelButton;
}

