package uta.cse.cse3310.JSBSimEdit;

import java.awt.*;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import java.lang.StringBuilder;
import javax.swing.border.*;
import net.miginfocom.swing.*;

import java.math.BigInteger;

public class LandingGearSetup extends JDialog{
    public LandingGearSetup(){
        initComponents();
        setSomeText();
        setVisible(true);
    }
    
    public LandingGearSetup(LandingGearSetup other){ //filling all fields that are known for detail
        initComponents();
        setDetails(other);
        setVisible(true);
    }
    
    public LandingGearSetup(String name, String type, String locUnit, //constructor for Loading in list of LGS
                            String springCoUnit, String dampCoUnit,
                            String dampCoReUnit, String steerUnit,
                            String brakeGroup, String relaxRollUnit, 
                            String relaxSideUnit,
                            Double x, Double y, Double z,
                            Double staticFric,
                            Double dynamicFric, Double rollingFric,
                            Double springCo, Double dampCo,
                            Double dampCoRe, Double steer,
                            Float wheel, Float relaxRoll,
                            Float relaxSide, Float forceRoll,
                            Float forceSide,
                            int retractable){ 
        this.name = name;
        this.type = type;
        this.locUnit = locUnit;
        this.springCoUnit = springCoUnit;
        this.dampCoUnit = dampCoUnit;
        this.dampCoReUnit = dampCoReUnit;
        this.steerUnit = steerUnit;
        if(brakeGroup != null) this.brakeGroup = brakeGroup;
        else this.brakeGroup = "NONE";
        this.relaxRollUnit = relaxRollUnit;
        this.relaxSideUnit = relaxSideUnit;
        
        this.xLoc = x;
        this.yLoc = y;
        this.zLoc = z;
        this.staticFric = staticFric;
        this.dynamicFric = dynamicFric;
        this.rollingFric = rollingFric;
        if(springCo!= null) this.springCo = springCo;
        else this.springCo = 0.0;
        if(dampCo!= null) this.dampCo = dampCo;
        else this.dampCo = 0.0;
        if(dampCoRe!= null) this.dampCoRe = dampCoRe;
        else this.dampCoRe = 0.0;
        if(steer != null) this.steer = steer;
        else this.steer = 0.0;
        if(wheel != null) this.wheel = (double) wheel;
        else this.wheel = 0.0;
        if(relaxRoll != null) this.relaxRoll = (double) relaxRoll;
        else this.relaxRoll = 0.0;
        if(relaxSide != null) this.relaxSide = (double) relaxSide;
        else this.relaxSide = 0.0;
        if(forceRoll != null) this.forceRoll = (double) forceRoll;
        else this.forceRoll = 0.0;
        if(forceSide != null) this.forceSide = (double) forceSide;
        else this.forceSide = 0.0;
        if(retractable == 0) this.retractable = 0;
        else this.retractable = 1;
        
    }

    private void cancelBPressed(ActionEvent e) { //just get rid of the object if the user cancels
	this.dispose();                          //the object's getters and values will just return null
    }

    private void okBPressed(ActionEvent e) { //save all the information into variables so the toString
        name = nameT.getText().trim();       //can display them in the Jlist on GroundReactions tab
        type = typeT.getText().trim();
        locUnit = locC.getSelectedItem().toString();
        springCoUnit = springC.getSelectedItem().toString();
        dampCoUnit = dampC.getSelectedItem().toString();
        dampCoReUnit = dampRebC.getSelectedItem().toString();
        steerUnit = steerC.getSelectedItem().toString();
        brakeGroup = brakeC.getSelectedItem().toString();
        relaxRollUnit = relaxRollC.getSelectedItem().toString();
        relaxSideUnit = relaxSideC.getSelectedItem().toString();
        
        staticFric = Double.parseDouble(statT.getText().trim());
        dynamicFric = Double.parseDouble(dynT.getText().trim());
        rollingFric = Double.parseDouble(rollT.getText().trim());
        springCo = Double.parseDouble(springT.getText().trim());
        dampCo = Double.parseDouble(dampT.getText().trim());
        dampCoRe = Double.parseDouble(dampRebT.getText().trim());
        steer = Double.parseDouble(steerT.getText().trim());
        wheel = Double.parseDouble(wheelT.getText().trim());
        xLoc = Double.parseDouble(xLocT.getText().trim());
        yLoc = Double.parseDouble(yLocT.getText().trim());
        zLoc = Double.parseDouble(zLocT.getText().trim());
        relaxRoll = Double.parseDouble(relaxRollT.getText().trim());
        relaxSide = Double.parseDouble(relaxSideT.getText().trim());
        forceRoll = Double.parseDouble(forceRollT.getText().trim());
        forceSide = Double.parseDouble(forceSideT.getText().trim());
        this.dispose();
    }
    
    public String getName() {return name;}
    public String getTypeLGS() {return type;}
    public String getLocUnit() {return locUnit;}
    public String getSpringCoUnit() {return springCoUnit;}
    public String getDampCoUnit() {return dampCoUnit;}
    public String getDampCoReUnit() {return dampCoReUnit;}
    public String getSteerUnit() {return steerUnit;}
    public String getBrakeGroup() {return brakeGroup;}
    public String getRelaxRollUnit() {return relaxRollUnit;}
    public String getRelaxSideUnit() {return relaxSideUnit;}
    
    public Double getStaticFric() {return staticFric;}
    public Double getDynamicFric() {return dynamicFric;}
    public Double getRollingFric() {return rollingFric;}
    public Double getSpringCo() {return springCo;}
    public Double getDampCo() {return dampCo;}
    public Double getDampCoRe() {return dampCoRe;}
    public Double getSteer() {return steer;}
    public Double getWheel() {return wheel;}
    public Double getXLoc() {return xLoc;}
    public Double getYLoc() {return yLoc;}
    public Double getZLoc() {return zLoc;}
    public Double getRelaxRoll() {return relaxRoll;}
    public Double getRelaxSide() {return relaxSide;}
    public Double getForceRoll() {return forceRoll;}
    public Double getForceSide() {return forceSide;}
    
    public int getRetract() {return retractable;}
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name + " at point [" + xLoc + ", " + yLoc + ", " + zLoc + "] in "
                  + locUnit + " (in " + brakeGroup + " brake group)");
        return sb.toString();
    }
    
    private void setDetails(LandingGearSetup other){
        nameT.setText(other.getName());
        typeT.setText(other.getTypeLGS());
        locC.setSelectedItem(other.getLocUnit());
        springC.setSelectedItem(other.getSpringCoUnit());
        dampC.setSelectedItem(other.getDampCoUnit());
        dampRebC.setSelectedItem(other.getDampCoReUnit());
        steerC.setSelectedItem(other.getSteerUnit());
        if(other.getBrakeGroup() != null) brakeC.setSelectedItem(other.getBrakeGroup());
        else brakeC.setSelectedItem("NONE");
        relaxRollC.setSelectedItem(other.getRelaxRollUnit());
        relaxSideC.setSelectedItem(other.getRelaxSideUnit());
        
        statT.setText(Double.toString(other.getStaticFric()));
        dynT.setText(Double.toString(other.getDynamicFric()));
        rollT.setText(Double.toString(other.getRollingFric()));
        springT.setText(Double.toString(other.getSpringCo()));
        dampT.setText(Double.toString(other.getDampCo()));
        dampRebT.setText(Double.toString(other.getDampCoRe()));
        steerT.setText(Double.toString(other.getSteer()));
        wheelT.setText(Double.toString(other.getWheel()));
        xLocT.setText(Double.toString(other.getXLoc()));
        yLocT.setText(Double.toString(other.getYLoc()));
        zLocT.setText(Double.toString(other.getZLoc()));
        relaxRollT.setText(Double.toString(other.getRelaxRoll()));
        relaxSideT.setText(Double.toString(other.getRelaxSide()));
        forceRollT.setText(Double.toString(other.getForceRoll()));
        forceSideT.setText(Double.toString(other.getForceSide()));
        
        if(other.getRetract() == 1) retractableCh.setSelected(true);
    }
    
    private void setSomeText(){
        nameT.setText("INTAKE");
        typeT.setText("type");
        
        statT.setText("0.0");
        dynT.setText("0.0");
        rollT.setText("0.0");
        springT.setText("0.0");
        dampT.setText("0.0");
        dampRebT.setText("0.0");
        steerT.setText("0.0");
        wheelT.setText("0.0");
        xLocT.setText("0.0");
        yLocT.setText("0.0");
        zLocT.setText("0.0");
        relaxRollT.setText("0.0");
        relaxSideT.setText("0.0");
        forceRollT.setText("0.0");
        forceSideT.setText("0.0");
    }

    private void retractableChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED) this.retractable = 1;
        else this.retractable = 0;
    }

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Connor Baldwin
		topP = new JPanel();
		nameL = new JLabel();
		nameT = new JTextField();
		typeL = new JLabel();
		typeT = new JTextField();
		locP = new JPanel();
		xLocL = new JLabel();
		xLocT = new JTextField();
		yLocL = new JLabel();
		yLocT = new JTextField();
		zLocL = new JLabel();
		zLocT = new JTextField();
		locC = new JComboBox<>();
		fricP = new JPanel();
		statL = new JLabel();
		statT = new JTextField();
		dynL = new JLabel();
		dynT = new JTextField();
		rollL = new JLabel();
		rollT = new JTextField();
		springL = new JLabel();
		springT = new JTextField();
		springC = new JComboBox<>();
		dampL = new JLabel();
		dampT = new JTextField();
		dampC = new JComboBox<>();
		dampRebL = new JLabel();
		dampRebT = new JTextField();
		dampRebC = new JComboBox<>();
		steerL = new JLabel();
		steerT = new JTextField();
		steerC = new JComboBox<>();
		wheelL = new JLabel();
		wheelT = new JTextField();
		brakeL = new JLabel();
		brakeC = new JComboBox<>();
		retractableCh = new JCheckBox();
		relaxForceP = new JPanel();
		relaxP = new JPanel();
		relaxRollL = new JLabel();
		relaxRollT = new JTextField();
		relaxRollC = new JComboBox<>();
		relaxSideL = new JLabel();
		relaxSideT = new JTextField();
		relaxSideC = new JComboBox<>();
		forceP = new JPanel();
		forceRollL = new JLabel();
		forceRollT = new JTextField();
		forceSideL = new JLabel();
		forceSideT = new JTextField();
		buttonP = new JPanel();
		okB = new JButton();
		cancelB = new JButton();

		//======== this ========
		setTitle("Landing Gear Setup");
		setAlwaysOnTop(true);
		setModal(true);
		var contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
		    "hidemode 3",
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
		    "[]" +
		    "[]" +
		    "[]" +
		    "[]" +
		    "[]0" +
		    "[]0"));

		//======== topP ========
		{
		    topP.setLayout(new MigLayout(
			"hidemode 3,alignx center",
			// columns
			"[fill]" +
			"[159,fill]" +
			"[fill]" +
			"[183,fill]",
			// rows
			"[]"));

		    //---- nameL ----
		    nameL.setText("Name ");
		    topP.add(nameL, "cell 0 0");
		    topP.add(nameT, "cell 1 0");

		    //---- typeL ----
		    typeL.setText("Type");
		    topP.add(typeL, "cell 2 0");
		    topP.add(typeT, "cell 3 0");
		}
		contentPane.add(topP, "cell 0 0 19 1,grow");

		//======== locP ========
		{
		    locP.setBorder(new TitledBorder("Location"));
		    locP.setLayout(new MigLayout(
			"hidemode 3,alignx center",
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

		    //---- xLocL ----
		    xLocL.setText("x =");
		    locP.add(xLocL, "cell 0 0");
		    locP.add(xLocT, "cell 1 0");

		    //---- yLocL ----
		    yLocL.setText("y =");
		    locP.add(yLocL, "cell 2 0");
		    locP.add(yLocT, "cell 3 0");

		    //---- zLocL ----
		    zLocL.setText("z =");
		    locP.add(zLocL, "cell 4 0");
		    locP.add(zLocT, "cell 5 0");

		    //---- locC ----
		    locC.setModel(new DefaultComboBoxModel<>(new String[] {
			"M",
			"FT",
			"IN"
		    }));
		    locP.add(locC, "cell 6 0");
		}
		contentPane.add(locP, "cell 0 1 19 1,grow");

		//======== fricP ========
		{
		    fricP.setLayout(new MigLayout(
			"fill,hidemode 3,align center center",
			// columns
			"[fill]" +
			"[135,fill]" +
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
			"[]0"));

		    //---- statL ----
		    statL.setText("static friction =");
		    fricP.add(statL, "cell 0 0,alignx right,growx 0");
		    fricP.add(statT, "cell 1 0");

		    //---- dynL ----
		    dynL.setText("dynamic friction =");
		    fricP.add(dynL, "cell 0 1,alignx right,growx 0");
		    fricP.add(dynT, "cell 1 1");

		    //---- rollL ----
		    rollL.setText("rolling friction =");
		    fricP.add(rollL, "cell 0 2,alignx right,growx 0");
		    fricP.add(rollT, "cell 1 2");

		    //---- springL ----
		    springL.setText("spring coefficient =");
		    fricP.add(springL, "cell 0 3,alignx right,growx 0");
		    fricP.add(springT, "cell 1 3");

		    //---- springC ----
		    springC.setModel(new DefaultComboBoxModel<>(new String[] {
			"LBS/FT",
			"N/M"
		    }));
		    fricP.add(springC, "cell 2 3");

		    //---- dampL ----
		    dampL.setText("damping coefficient =");
		    fricP.add(dampL, "cell 0 4,alignx right,growx 0");
		    fricP.add(dampT, "cell 1 4");

		    //---- dampC ----
		    dampC.setModel(new DefaultComboBoxModel<>(new String[] {
			"LBS/FT/SEC",
			"N/M/SEC"
		    }));
		    fricP.add(dampC, "cell 2 4");

		    //---- dampRebL ----
		    dampRebL.setText("damping coefficient rebound =");
		    fricP.add(dampRebL, "cell 0 5,alignx right,growx 0");
		    fricP.add(dampRebT, "cell 1 5");

		    //---- dampRebC ----
		    dampRebC.setModel(new DefaultComboBoxModel<>(new String[] {
			"LBS/FT/SEC",
			"N/M/SEC"
		    }));
		    fricP.add(dampRebC, "cell 2 5");

		    //---- steerL ----
		    steerL.setText("max steer =");
		    fricP.add(steerL, "cell 0 6,alignx right,growx 0");
		    fricP.add(steerT, "cell 1 6");

		    //---- steerC ----
		    steerC.setModel(new DefaultComboBoxModel<>(new String[] {
			"DEG",
			"RAD"
		    }));
		    fricP.add(steerC, "cell 2 6");

		    //---- wheelL ----
		    wheelL.setText("wheel slip filter =");
		    fricP.add(wheelL, "cell 0 7,alignx right,growx 0");
		    fricP.add(wheelT, "cell 1 7");

		    //---- brakeL ----
		    brakeL.setText("brake group =");
		    fricP.add(brakeL, "cell 0 8,alignx right,growx 0");

		    //---- brakeC ----
		    brakeC.setModel(new DefaultComboBoxModel<>(new String[] {
			"NOSE",
			"RIGHT",
			"LEFT",
			"CENTER",
			"TAIL",
			"NONE"
		    }));
		    fricP.add(brakeC, "cell 1 8");

		    //---- retractableCh ----
		    retractableCh.setText("retractable");
		    retractableCh.setHorizontalAlignment(SwingConstants.RIGHT);
		    retractableCh.addItemListener(e -> retractableChanged(e));
		    fricP.add(retractableCh, "cell 0 9");
		}
		contentPane.add(fricP, "cell 0 2 19 11,grow");

		//======== relaxForceP ========
		{
		    relaxForceP.setLayout(new MigLayout(
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
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]"));

		    //======== relaxP ========
		    {
			relaxP.setBorder(new TitledBorder("Relaxation Velocity"));
			relaxP.setLayout(new MigLayout(
			    "fill,hidemode 3,align center center",
			    // columns
			    "[fill]" +
			    "[fill]" +
			    "[fill]",
			    // rows
			    "[]" +
			    "[]"));

			//---- relaxRollL ----
			relaxRollL.setText("rolling =");
			relaxP.add(relaxRollL, "cell 0 0,alignx right,growx 0");
			relaxP.add(relaxRollT, "cell 1 0");

			//---- relaxRollC ----
			relaxRollC.setModel(new DefaultComboBoxModel<>(new String[] {
			    "FT/SEC"
			}));
			relaxP.add(relaxRollC, "cell 2 0");

			//---- relaxSideL ----
			relaxSideL.setText("side =");
			relaxP.add(relaxSideL, "cell 0 1,alignx right,growx 0");
			relaxP.add(relaxSideT, "cell 1 1");

			//---- relaxSideC ----
			relaxSideC.setModel(new DefaultComboBoxModel<>(new String[] {
			    "FT/SEC"
			}));
			relaxP.add(relaxSideC, "cell 2 1");
		    }
		    relaxForceP.add(relaxP, "cell 0 0 11 3,alignx center,growx 0");

		    //======== forceP ========
		    {
			forceP.setBorder(new TitledBorder("Force Lag Filter"));
			forceP.setLayout(new MigLayout(
			    "fill,hidemode 3",
			    // columns
			    "[fill]" +
			    "[fill]",
			    // rows
			    "[]" +
			    "[]"));

			//---- forceRollL ----
			forceRollL.setText("rolling =");
			forceP.add(forceRollL, "cell 0 0,alignx right,growx 0");
			forceP.add(forceRollT, "cell 1 0");

			//---- forceSideL ----
			forceSideL.setText("side =");
			forceP.add(forceSideL, "cell 0 1,alignx right,growx 0");
			forceP.add(forceSideT, "cell 1 1");
		    }
		    relaxForceP.add(forceP, "cell 0 0 11 3");
		}
		contentPane.add(relaxForceP, "cell 0 13 19 1,alignx center,grow 0 100");

		//======== buttonP ========
		{
		    buttonP.setLayout(new MigLayout(
			"hidemode 3,alignx center",
			// columns
			"[fill]" +
			"[fill]",
			// rows
			"[]"));

		    //---- okB ----
		    okB.setText("OK");
		    okB.addActionListener(e -> okBPressed(e));
		    buttonP.add(okB, "cell 0 0");

		    //---- cancelB ----
		    cancelB.setText("Cancel");
		    cancelB.addActionListener(e -> cancelBPressed(e));
		    buttonP.add(cancelB, "cell 1 0");
		}
		contentPane.add(buttonP, "cell 0 14 19 1,growx");
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Connor Baldwin
    private JPanel topP;
    private JLabel nameL;
    private JTextField nameT;
    private JLabel typeL;
    private JTextField typeT;
    private JPanel locP;
    private JLabel xLocL;
    private JTextField xLocT;
    private JLabel yLocL;
    private JTextField yLocT;
    private JLabel zLocL;
    private JTextField zLocT;
    private JComboBox<String> locC;
    private JPanel fricP;
    private JLabel statL;
    private JTextField statT;
    private JLabel dynL;
    private JTextField dynT;
    private JLabel rollL;
    private JTextField rollT;
    private JLabel springL;
    private JTextField springT;
    private JComboBox<String> springC;
    private JLabel dampL;
    private JTextField dampT;
    private JComboBox<String> dampC;
    private JLabel dampRebL;
    private JTextField dampRebT;
    private JComboBox<String> dampRebC;
    private JLabel steerL;
    private JTextField steerT;
    private JComboBox<String> steerC;
    private JLabel wheelL;
    private JTextField wheelT;
    private JLabel brakeL;
    private JComboBox<String> brakeC;
    private JCheckBox retractableCh;
    private JPanel relaxForceP;
    private JPanel relaxP;
    private JLabel relaxRollL;
    private JTextField relaxRollT;
    private JComboBox<String> relaxRollC;
    private JLabel relaxSideL;
    private JTextField relaxSideT;
    private JComboBox<String> relaxSideC;
    private JPanel forceP;
    private JLabel forceRollL;
    private JTextField forceRollT;
    private JLabel forceSideL;
    private JTextField forceSideT;
    private JPanel buttonP;
    private JButton okB;
    private JButton cancelB;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    
    private Double staticFric, dynamicFric, rollingFric, springCo, dampCo, dampCoRe, 
                   steer, wheel, xLoc, yLoc, zLoc, relaxRoll, relaxSide, forceRoll, forceSide; 
    
    private String name, type, locUnit, springCoUnit, dampCoUnit, dampCoReUnit, 
                   steerUnit, brakeGroup, relaxRollUnit, relaxSideUnit;
    
    private int retractable;
}
//will still need constructor for if the user pressed detail
//  this new constructor will use the given information to fill out already known information in the dialog