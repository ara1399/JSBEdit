package uta.cse.cse3310.JSBSimEdit;

import java.awt.*;
import java.awt.event.*;
import java.lang.StringBuilder;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JDialog;
import javax.swing.border.*;
import net.miginfocom.swing.*;


public class PointMass extends JDialog {
    PointMass(){//creating a new point mass from scratch, a new dialog will be created to gather information
        try{
            initComponents();
            setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null , e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    PointMass(String name, Double weight, String weightUnit, Double x, Double y, Double z, String locUnit){ //adding a completed point mass
        this.name = name;
        this.weight = weight;
        this.weightUnit = weightUnit;
        this.x = x;
        this.y = y;
        this.z = z;
        this.locUnit = locUnit;
    }
    
    @Override
    public String toString(){ //since each PointMass Object will be displayed in a JList, I want a specific format for printing it out
        StringBuilder sb = new StringBuilder();
        sb.append(name + " is ");
        sb.append(weight + " ");
        sb.append(weightUnit + " at point ");
        sb.append("[" + x + ", " + y + ", " + z + "] in ");
        sb.append(locUnit);
        
        return sb.toString();
    }

    private void okBpressed(ActionEvent e) {
        name = pmNameT.getText();
        weight = Double.parseDouble(pmWeightT.getText());
        weightUnit = pmWeightC.getSelectedItem().toString();
        x = Double.parseDouble(xT.getText());
        y = Double.parseDouble(yT.getText());
        z = Double.parseDouble(zT.getText());
        locUnit = locC.getSelectedItem().toString();
        this.dispose();
    }

    private void cancelBpressed(ActionEvent e) {
	this.dispose();
    }
    
    private String name, weightUnit, locUnit;
    private Double weight, x, y, z; //x, y, and z represent location

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Connor Baldwin
		pmNameP = new JPanel();
		pmNameL = new JLabel();
		pmNameT = new JTextField();
		pmWeightP = new JPanel();
		pmWeightL = new JLabel();
		pmWeightT = new JTextField();
		pmWeightC = new JComboBox<>();
		locP = new JPanel();
		xL = new JLabel();
		xT = new JTextField();
		yL = new JLabel();
		yT = new JTextField();
		zL = new JLabel();
		zT = new JTextField();
		locC = new JComboBox<>();
		buttonPanel = new JPanel();
		okB = new JButton();
		cancelB = new JButton();

		//======== this ========
		setPreferredSize(new Dimension(500, 300));
		setAlwaysOnTop(true);
		setTitle("Point Mass");
		setModal(true);
		var contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
		    "fill,hidemode 3",
		    // columns
		    "[fill]" +
		    "[fill]" +
		    "[fill]" +
		    "[fill]" +
		    "[fill]" +
		    "[fill]" +
		    "[fill]" +
		    "[fill]" +
		    "[fill]" +
		    "[fill]" +
		    "[fill]" +
		    "[fill]" +
		    "[fill]" +
		    "[fill]" +
		    "[fill]" +
		    "[fill]" +
		    "[fill]",
		    // rows
		    "[]" +
		    "[]" +
		    "[]" +
		    "[]" +
		    "[]" +
		    "[]" +
		    "[]" +
		    "[]" +
		    "[]" +
		    "[]"));

		//======== pmNameP ========
		{
		    pmNameP.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
		    javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax
		    . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
		    .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt
		    . Color. red) ,pmNameP. getBorder( )) ); pmNameP. addPropertyChangeListener (new java. beans.
		    PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .
		    equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
		    pmNameP.setLayout(new MigLayout(
			"fill,hidemode 3",
			// columns
			"[fill]" +
			"[fill]",
			// rows
			"[]"));

		    //---- pmNameL ----
		    pmNameL.setText("Name: ");
		    pmNameP.add(pmNameL, "cell 0 0,alignx right,growx 0");

		    //---- pmNameT ----
		    pmNameT.setText("Pilot");
		    pmNameP.add(pmNameT, "cell 1 0");
		}
		contentPane.add(pmNameP, "cell 0 0 8 1,alignx center,grow 0 100");

		//======== pmWeightP ========
		{
		    pmWeightP.setLayout(new MigLayout(
			"fill,hidemode 3",
			// columns
			"[fill]" +
			"[fill]" +
			"[fill]",
			// rows
			"[]"));

		    //---- pmWeightL ----
		    pmWeightL.setText("Weight = ");
		    pmWeightP.add(pmWeightL, "cell 0 0,alignx right,growx 0");

		    //---- pmWeightT ----
		    pmWeightT.setText("0.0");
		    pmWeightP.add(pmWeightT, "cell 1 0");

		    //---- pmWeightC ----
		    pmWeightC.setModel(new DefaultComboBoxModel<>(new String[] {
			"KG",
			"LBS"
		    }));
		    pmWeightP.add(pmWeightC, "cell 2 0");
		}
		contentPane.add(pmWeightP, "cell 11 0 6 1,alignx center,grow 0 100");

		//======== locP ========
		{
		    locP.setBorder(new TitledBorder("Location"));
		    locP.setLayout(new MigLayout(
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

		    //---- xL ----
		    xL.setText("x =");
		    locP.add(xL, "cell 0 0,alignx right,growx 0");

		    //---- xT ----
		    xT.setText("0.0");
		    locP.add(xT, "cell 1 0");

		    //---- yL ----
		    yL.setText("y =");
		    locP.add(yL, "cell 2 0,alignx right,growx 0");

		    //---- yT ----
		    yT.setText("0.0");
		    locP.add(yT, "cell 3 0");

		    //---- zL ----
		    zL.setText("z =");
		    locP.add(zL, "cell 4 0,alignx right,growx 0");

		    //---- zT ----
		    zT.setText("0.0");
		    locP.add(zT, "cell 5 0");

		    //---- locC ----
		    locC.setModel(new DefaultComboBoxModel<>(new String[] {
			"IN",
			"FT",
			"M"
		    }));
		    locP.add(locC, "cell 6 0");
		}
		contentPane.add(locP, "cell 0 2 17 7,grow");

		//======== buttonPanel ========
		{
		    buttonPanel.setLayout(new MigLayout(
			"fill,hidemode 3",
			// columns
			"[fill]" +
			"[fill]",
			// rows
			"[]"));

		    //---- okB ----
		    okB.setText("OK");
		    okB.addActionListener(e -> okBpressed(e));
		    buttonPanel.add(okB, "cell 0 0");

		    //---- cancelB ----
		    cancelB.setText("Cancel");
		    cancelB.addActionListener(e -> cancelBpressed(e));
		    buttonPanel.add(cancelB, "cell 1 0");
		}
		contentPane.add(buttonPanel, "cell 0 9 17 1,grow");
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Connor Baldwin
    private JPanel pmNameP;
    private JLabel pmNameL;
    private JTextField pmNameT;
    private JPanel pmWeightP;
    private JLabel pmWeightL;
    private JTextField pmWeightT;
    private JComboBox<String> pmWeightC;
    private JPanel locP;
    private JLabel xL;
    private JTextField xT;
    private JLabel yL;
    private JTextField yT;
    private JLabel zL;
    private JTextField zT;
    private JComboBox<String> locC;
    private JPanel buttonPanel;
    private JButton okB;
    private JButton cancelB;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
