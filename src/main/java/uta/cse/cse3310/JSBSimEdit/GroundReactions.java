package uta.cse.cse3310.JSBSimEdit;

import java.awt.*;
import java.awt.event.*;
import java.util.Optional;
import javax.swing.*;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;

import generated.Contact;

import generated.FdmConfig;
import java.math.BigInteger;
import java.util.ArrayList;
import net.miginfocom.swing.*;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;

public class GroundReactions extends JPanel implements TabComponent {
    
    GroundReactions(){
          initComponents();
          listLGS = new ArrayList<LandingGearSetup>();
    }

    @Override
    public void bindUIwithXML(FdmConfig cfg) { 
        // contacts are the same as GR or LGS
        ArrayList<generated.Contact> contacts = new ArrayList<>();
        if(cfg.getGroundReactions().getContent() != null){
            
            for(Object o : cfg.getGroundReactions().getContent()){ //converting the list of objects
                if(o instanceof generated.Contact){                //to contact
                    generated.Contact c = (generated.Contact) o;
                    contacts.add(c);
                }
            }
        
        
            for(generated.Contact c : contacts){ //conversion of generated.Contact to LandingGearSetup
                if(c.getLocation() != null && c.getName() != null && c.getType() != null){
                    
                    //check the getters that have getters inside them
                    //and put them into variables
                    //if it returns null put a placeholder
                    //already checked location/name/type so skip those
                    
                    String springCoUnit,  dampCoUnit, 
                           dampCoReUnit,  steerUnit,  
                           relaxRollUnit, relaxSideUnit;
                    Double springCo, dampCo, dampCoRe, steer;
                    Float relaxRoll, relaxSide, forceRoll, forceSide;
                    int retract = 0;
                    
                                        
                    if(c.getSpringCoeff() != null){ //springCo
                        springCoUnit = c.getSpringCoeff().getUnit().toString();
                        springCo = c.getSpringCoeff().getValue();
                    }
                    else{
                        springCoUnit = null;
                        springCo = null;
                    }
                    
                    if(c.getDampingCoeff() != null){ //dampCo
                        dampCoUnit = c.getDampingCoeff().getUnit().toString();
                        dampCo = c.getDampingCoeff().getValue();
                    }
                    else{
                        dampCoUnit = null;
                        dampCo = null;
                    }
                    
                    if(c.getDampingCoeffRebound() != null){ //dampCoRe
                        dampCoReUnit = c.getDampingCoeffRebound().getUnit().toString();
                        dampCoRe = c.getDampingCoeffRebound().getValue();
                    }
                    else{
                        dampCoReUnit = null;
                        dampCoRe = null;
                    }
                    
                    if(c.getMaxSteer() != null){ //steer
                        steerUnit = c.getMaxSteer().getUnit().toString();
                        steer = c.getMaxSteer().getValue();
                    }
                    else{
                        steerUnit = null;
                        steer = null;
                    }
                    
                    if(c.getRelaxationVelocity() != null){ //relax
                        relaxRollUnit = c.getRelaxationVelocity().getRolling().getUnit().toString();
                        relaxRoll = c.getRelaxationVelocity().getRolling().getValue();
                        
                        relaxSideUnit = c.getRelaxationVelocity().getSide().getUnit().toString();
                        relaxSide = c.getRelaxationVelocity().getSide().getValue();
                    }
                    else{
                        relaxRollUnit = null;
                        relaxRoll = null;
                        
                        relaxSideUnit = null;
                        relaxSide = null;
                    }
                    
                    if(c.getForceLagFilter() != null){ //force lag filter
                        forceRoll = c.getForceLagFilter().getRolling();
                        forceSide = c.getForceLagFilter().getSide();
                    }
                    else{
                        forceRoll = null;
                        forceSide = null;
                    }
                    
                    if(c.getRetractable() != null){
                        retract = 1;
                    }
                    
                    LandingGearSetup lgs = new LandingGearSetup(//calling the constructor for loading
                        //strings
                        c.getName(),
                        c.getType(),
                        c.getLocation().getUnit(),
                        springCoUnit,
                        dampCoUnit,
                        dampCoReUnit,
                        steerUnit,
                        c.getBrakeGroup(),
                        relaxRollUnit,
                        relaxSideUnit,
                        //doubles
                        c.getLocation().getX(),
                        c.getLocation().getY(),
                        c.getLocation().getZ(),
                        c.getStaticFriction(),
                        c.getDynamicFriction(),
                        c.getRollingFriction(),
                        springCo,
                        dampCo,
                        dampCoRe,
                        steer,
                        c.getWheelSlipFilter(),
                        relaxRoll,
                        relaxSide,
                        forceRoll,
                        forceSide,
                        retract
                    );
                    
                    listLGS.add(lgs);
                }
            }
            model.addAll(listLGS);
        }
            
    }

    @Override
    public Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg) {
        //clear old list and readd everything so it will include deletions and additions
        
        // clear old list
        
        cfg.getGroundReactions().getContent().clear();
        
        //update old list with the edited list
        
        for(LandingGearSetup lgs : listLGS){ //must convert all lgs to generated.Contact and add them to cfg.getGroundReactions().getContent()
            generated.Contact c = new generated.Contact();
            
            generated.Location l = new generated.Location(); //location
            l.setX(lgs.getXLoc());
            l.setY(lgs.getYLoc());
            l.setZ(lgs.getZLoc());
            c.setLocation(l);
            
            c.setStaticFriction(lgs.getStaticFric()); //staticFric
            c.setDynamicFriction(lgs.getDynamicFric()); //dynamicFric
            
            Contact.SpringCoeff sc = new Contact.SpringCoeff(); //springCo
            sc.setValue(lgs.getSpringCo());
            if(lgs.getSpringCoUnit() == "LBS/FT") sc.setUnit(generated.SpringCoeffType.LBS_FT);
            else sc.setUnit(generated.SpringCoeffType.N_M);
            c.setSpringCoeff(sc);
            
            Contact.DampingCoeff dc = new Contact.DampingCoeff(); //dampCo
            dc.setValue(lgs.getDampCo());
            if(lgs.getDampCoUnit() == "LBS/FT/SEC") dc.setUnit(generated.DampingCoeffType.LBS_FT_SEC);
            else dc.setUnit(generated.DampingCoeffType.N_M_SEC);
            c.setDampingCoeff(dc);
            
            Contact.DampingCoeffRebound dcr = new Contact.DampingCoeffRebound(); //dampCoRe
            dcr.setValue(lgs.getDampCoRe());
            if(lgs.getDampCoUnit() == "LBS/FT/SEC") dcr.setUnit(generated.DampingCoeffType.LBS_FT_SEC);
            else dcr.setUnit(generated.DampingCoeffType.N_M_SEC);
            c.setDampingCoeffRebound(dcr);
            
            c.setRollingFriction(lgs.getRollingFric()); //rollingFric
            
            Contact.MaxSteer ms = new Contact.MaxSteer(); //steer
            ms.setValue(lgs.getSteer());
            if(lgs.getSteerUnit() == "DEG") ms.setUnit(generated.AngleType.DEG);
            else ms.setUnit(generated.AngleType.RAD);
            
            c.setBrakeGroup(lgs.getBrakeGroup()); //brakeGroup

            if(lgs.getRetract() == 0) c.setRetractable(null); //retractable 
            else c.setRetractable(BigInteger.ONE); //not exactly sure how this is supposed to work
                                                        //im going for something like true/false just like in C
            
            Contact.RelaxationVelocity rv = new Contact.RelaxationVelocity(); //relaxation velocity
            Contact.RelaxationVelocity.Rolling rl = new Contact.RelaxationVelocity.Rolling();//relaxRoll
            rl.setValue(lgs.getRelaxRoll().floatValue()); 
            rl.setUnit("FT/SEC");
            rv.setRolling(rl);
            Contact.RelaxationVelocity.Side sd = new Contact.RelaxationVelocity.Side(); //relaxSide
            sd.setValue(lgs.getRelaxSide().floatValue());
            sd.setUnit("FT/SEC");
            rv.setSide(sd);
            c.setRelaxationVelocity(rv);
            
            generated.ForceLagFilter flf = new generated.ForceLagFilter(); //force lag filter
            flf.setRolling(lgs.getForceRoll().floatValue());
            flf.setSide(lgs.getForceSide().floatValue());            
            c.setForceLagFilter(flf);
            
            c.setWheelSlipFilter(lgs.getWheel().floatValue());//wheel slip filter
            
            //add new Contact into the list
            cfg.getGroundReactions().getContent().add(c);
        }                                      
           
        return Optional.ofNullable(cfg);
    }

    private void addGroundReaction(ActionEvent e) {//adding a new GR/LGS to the displayed list
	LandingGearSetup lgs = new LandingGearSetup();
        if(lgs.getName() == null) return;
        listLGS.add(lgs);
        model.clear();
        model.addAll(listLGS);
    }

    private void deleteGroundReaction(ActionEvent e) {//removing a GR/LGS from the displayed list
        if(listLGSDisplay.getSelectedValue() == null) return;
	int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this?", "Confirm", JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.OK_OPTION){
            LandingGearSetup lgs = listLGSDisplay.getSelectedValue();
            model.removeElement(lgs);
            listLGS.remove(lgs);
        }
    }

    private void detailGroundReaction(ActionEvent e) {
        //here we want to display the information of the currently selected groundreaction
        //if the newLGS comes back null, the user cancelled, which means we want to keep the old LGS
        if(listLGSDisplay.getSelectedValue() != null){
            LandingGearSetup oldLGS = listLGSDisplay.getSelectedValue();
            LandingGearSetup newLGS = new LandingGearSetup(oldLGS);
            if(newLGS.getName() == null) return; //if the user cancelled, do nothing
            else if(newLGS.getName() == null) return;
            else{ //if the user presses ok, remove the old LGS and then add the new LGS
                listLGS.remove(listLGSDisplay.getSelectedValue());
                listLGS.add(newLGS);
                model.clear(); //refreshing the model to Display on the listLGSDisplay
                model.addAll(listLGS);
            }
            
        }
    }

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Connor Baldwin
		scrollGR = new JScrollPane();
		listLGSDisplay = new JList<>();
		buttonsPanel = new JPanel();
		addGRB = new JButton();
		deleteGRB = new JButton();
		detailGRB = new JButton();

		//======== this ========
		setMinimumSize(new Dimension(1250, 600));
		setPreferredSize(new Dimension(1250, 600));
		setLayout(new MigLayout(
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

		//======== scrollGR ========
		{

		    //---- listLGSDisplay ----
		    listLGSDisplay.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		    listLGSDisplay.setModel(model);
		    scrollGR.setViewportView(listLGSDisplay);
		}
		add(scrollGR, "cell 0 0 49 22,grow");

		//======== buttonsPanel ========
		{
		    buttonsPanel.setLayout(new MigLayout(
			"hidemode 3,align center center",
			// columns
			"[grow,fill]" +
			"[grow,fill]" +
			"[grow,fill]",
			// rows
			"[]"));

		    //---- addGRB ----
		    addGRB.setText("Add");
		    addGRB.addActionListener(e -> addGroundReaction(e));
		    buttonsPanel.add(addGRB, "cell 0 0");

		    //---- deleteGRB ----
		    deleteGRB.setText("Delete");
		    deleteGRB.addActionListener(e -> deleteGroundReaction(e));
		    buttonsPanel.add(deleteGRB, "cell 1 0");

		    //---- detailGRB ----
		    detailGRB.setText("Detail");
		    detailGRB.addActionListener(e -> detailGroundReaction(e));
		    buttonsPanel.add(detailGRB, "cell 2 0");
		}
		add(buttonsPanel, "cell 0 22 49 1,grow");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Connor Baldwin
    private JScrollPane scrollGR;
    private JList<LandingGearSetup> listLGSDisplay;
    private JPanel buttonsPanel;
    private JButton addGRB;
    private JButton deleteGRB;
    private JButton detailGRB;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private DefaultListModel<LandingGearSetup> model = new DefaultListModel<LandingGearSetup>();
    private ArrayList<LandingGearSetup> listLGS;
}   