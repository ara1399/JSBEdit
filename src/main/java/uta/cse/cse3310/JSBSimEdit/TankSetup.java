package uta.cse.cse3310.JSBSimEdit;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class TankSetup extends JDialog { //if this is its own window, should be jframe
    
    TankSetup() {
        tankComponents();
        setSomeText();
        setVisible(true);
    }
    public TankSetup(TankSetup other){ //filling all fields that are known for detail
        tankComponents();
        setDetails(other);
        setVisible(true);
    }
    
    public TankSetup(String type, String locationUnit, //constructor for Loading in list of LGS
                            String capacityUnit, String contentsUnit,
                            Double x, Double y, Double z,
                            Double capacity, Double contents){ 
        this.type = type;
        this.locUnit = locationUnit;
        this.capUnit = capacityUnit;
        this.contUnit = contentsUnit;
        this.xLoc = x;
        this.yLoc = y;
        this.zLoc = z;
        this.contents = contents;
        this.capacity = capacity;
        
        if(capacity != null) this.capacity = (double) capacity;
        else this.capacity = 0.0;
        if(contents != null) this.contents = (double) contents;
        else this.contents = 0.0;
        
    }

    private void cancelBPressed(ActionEvent e) { //just get rid of the object if the user cancels
	this.dispose();                          //the object's getters and values will just return null
    }

    private void okBPressed(ActionEvent e) { //save all the information into variables so the toString
         //can display them in the Jlist on GroundReactions tab
        type = typeComboBox.getSelectedItem().toString();
        locUnit = locationUnit.getSelectedItem().toString();
        capUnit = capacityUnit.getSelectedItem().toString();
        contUnit  = contentsUnit.getSelectedItem().toString();
        
        xLoc = Double.parseDouble(xText.getText().trim());
        yLoc = Double.parseDouble(yText.getText().trim());
        zLoc = Double.parseDouble(zText.getText().trim());
        contents = Double.parseDouble(contentsTextBox.getText().trim());
        capacity = Double.parseDouble(capacityTextBox.getText().trim());
        
        this.dispose();
    }
    
    public String getTypeTS() {return type;}
    public String getLocUnitTS() {return locUnit;}
    public String getCapacityUnitTS() {return capUnit;}
    public String getContentsUnitTS() {return contUnit;}
    
    public Double getXLocTS() {return xLoc;}
    public Double getYLocTS() {return yLoc;}
    public Double getZLocTS() {return zLoc;}
    public Double getContentsTS() {return contents;}
    public Double getCapacityTS() {return capacity;}
    
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(type + " at point [" + xLoc + ", " + yLoc + ", " + zLoc + "] in "
                  + locUnit + " (in " + contents + " contents)"  + 
                  " (in " + capacity + " capacity)");
        return sb.toString();
    }
    
    private void setDetails(TankSetup other){
        typeComboBox.setSelectedItem(other.getTypeTS());
        locationUnit.setSelectedItem(other.getLocUnitTS());
        capacityUnit.setSelectedItem(other.getCapacityUnitTS());
        contentsUnit.setSelectedItem(other.getContentsUnitTS());
                
        xText.setText(Double.toString(other.getXLocTS()));
        yText.setText(Double.toString(other.getYLocTS()));
        zText.setText(Double.toString(other.getZLocTS()));
        contentsTextBox.setText(Double.toString(other.getContentsTS()));
        capacityTextBox.setText(Double.toString(other.getCapacityTS()));
    }
    
    private void setSomeText(){
        xText.setText("0.0");
        yText.setText("0.0");
        zText.setText("0.0");
        contentsTextBox.setText("0.0");
        capacityTextBox.setText("0.0");
    }

    private void tankComponents() {
		
        dialogPane = new JPanel();
		tankSetup = new JPanel();
		typePanel = new JPanel();
		typeLabel = new JLabel();
		typeComboBox = new JComboBox<>();
		capPanel = new JPanel();
		capacityLabel = new JLabel();
		capacityTextBox = new JTextField();
		capacityUnit = new JComboBox<>();
		contentsLabel = new JLabel();
		contentsTextBox = new JTextField();
		contentsUnit = new JComboBox<>();
		locationPanel = new JPanel();
		xLabel = new JLabel();
		xText = new JTextField();
		yLabel = new JLabel();
		yText = new JTextField();
		zLabel = new JLabel();
		zText = new JTextField();
		locationUnit = new JComboBox<>();
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
                    locationPanel.add(yText, "cell 3 0");
    
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
                    OkButton.addActionListener(e -> okBPressed(e));
                    OptionsPanel.add(OkButton, "cell 0 0");
    
                    //---- CancelButton ----
                    CancelButton.setText("Cancel");
                    CancelButton.addActionListener(e -> cancelBPressed(e));
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
	private JComboBox<String> typeComboBox;
	private JPanel capPanel;
	private JLabel capacityLabel;
	private JTextField capacityTextBox;
	private JComboBox<String> capacityUnit;
	private JLabel contentsLabel;
	private JTextField contentsTextBox;
	private JComboBox<String> contentsUnit;
	private JPanel locationPanel;
	private JLabel xLabel;
	private JTextField xText;
	private JLabel yLabel;
	private JTextField yText;
	private JLabel zLabel;
	private JTextField zText;
	private JComboBox<String> locationUnit;
	private JPanel OptionsPanel;
	private JButton OkButton;
	private JButton CancelButton;

    private Double xLoc, yLoc, zLoc, capacity, contents; 
    private String type, locUnit, capUnit, contUnit;
}

