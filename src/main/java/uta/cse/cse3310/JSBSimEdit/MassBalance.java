package uta.cse.cse3310.JSBSimEdit;

import java.awt.event.*;
import java.util.Optional;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.*;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.DefaultListModel;

import java.math.BigDecimal;

import generated.FdmConfig;
import generated.Location;
import generated.Pointmass;
import generated.Weight;
import generated.WeightType;
import generated.Emptywt;
import generated.InertiaType;
import generated.Ixx;
import generated.Iyy;
import generated.Izz;
import generated.Ixy;
import generated.Ixz;
import generated.Iyz;
import java.awt.Dimension;
import java.util.HashSet;
import net.miginfocom.swing.*;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;
    
public class MassBalance extends JPanel implements TabComponent {
    
    MassBalance(){
        initComponents();
    }

    @Override
    public void bindUIwithXML(FdmConfig cfg) {
        
        generated.MassBalance mb = cfg.getMassBalance();
        
        if(mb != null){
            if(mb.getEmptywt() != null){ //Empty Weight in the mass section
                emptyWeightT.setText(Double.toString(mb.getEmptywt().getValue()));
                emptyWeightC.setSelectedItem(mb.getEmptywt().getUnit().value());
            }
            
            if(mb.getLocation() != null){ //Location section's x, y and z
                xLocT.setText(Double.toString(mb.getLocation().getX()));
                yLocT.setText(Double.toString(mb.getLocation().getY()));
                zLocT.setText(Double.toString(mb.getLocation().getZ()));
                locC.setSelectedItem(mb.getLocation().getUnit());
            }
            
            
            //getting values and units for moments of inertia section
            if(mb.getIxx() != null){
                ixxT.setText(Double.toString(mb.getIxx().getValue()));
                ixxC.setSelectedItem(mb.getIxx().getUnit().value());
            }
            
            if(mb.getIyy() != null){
                iyyT.setText(Double.toString(mb.getIyy().getValue()));
                iyyC.setSelectedItem(mb.getIyy().getUnit().value());
            }
            
            if(mb.getIzz() != null){
                izzT.setText(Double.toString(mb.getIzz().getValue()));
                izzC.setSelectedItem(mb.getIzz().getUnit().value());
            }
            
            if(mb.getIxz() != null){
                ixzT.setText(mb.getIxz().getValue().toString());
                ixzC.setSelectedItem(mb.getIxz().getUnit().value());
            }
            
            if(mb.getIyz() != null){
                iyzT.setText(mb.getIyz().getValue().toString());
                iyzC.setSelectedItem(mb.getIyz().getUnit().value());
            }
            
            if(mb.getIxy() != null){
                ixyT.setText(mb.getIxy().getValue().toString());
                ixyC.setSelectedItem(mb.getIxy().getUnit().value());
            }
            
            if(mb.getPointmass() != null){//get list of point masses
                List<generated.Pointmass> generatedPointmassList = mb.getPointmass();
                
                pointMassList = new ArrayList<PointMass>();
                
                for(generated.Pointmass pm : generatedPointmassList){//iterate and convert each generated.Pointmass into a JSBSimEdit.PointMass
                    pointMassList.add(new PointMass(
                        pm.getName(),
                        pm.getWeight().getValue(),
                        pm.getWeight().getUnit().toString(),
                        pm.getLocation().getX(),
                        pm.getLocation().getY(),
                        pm.getLocation().getZ(),
                        pm.getLocation().getUnit().toString()));
                }
                    //add them to the JList pointMassListDisplay
                    model.addAll(pointMassList);
            }
        }
    }

    @Override
    public Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg) {
        generated.MassBalance mb = cfg.getMassBalance();
        
        // Mass is required Schema element
        if(!(emptyWeightT.getText().length() > 0)) { //check if emptyWeight was filled or not
			System.out.println("Schema Mismatch: MassBalance: Mass is required");
			return Optional.empty();
		}
        else{//if the emptyWeight was filled out, save it
            Emptywt ew = new Emptywt(); //configuring and saving emptyWeight
            ew.setValue(Double.parseDouble(emptyWeightT.getText().trim()));
            if(emptyWeightC.getSelectedItem() == "LBS") ew.setUnit(WeightType.LBS);
            else ew.setUnit(WeightType.KG);
            
            mb.setEmptywt(ew);
        }
        // Location is required Schema element
        if(!(xLocT.getText().length() > 0)) { //check if location boxes were filled or not
			System.out.println("Schema Mismatch: MassBalance: Location is required");
			return Optional.empty();
		}
        else if(xLocT.getText().length() > 0 && 
                yLocT.getText().length() > 0 && 
                zLocT.getText().length() > 0){
            Location ll = new Location();
            ll.setName("Location");
            ll.setX(Double.parseDouble(xLocT.getText().trim()));
            ll.setY(Double.parseDouble(yLocT.getText().trim()));
            ll.setZ(Double.parseDouble(zLocT.getText().trim()));
            ll.setUnit(locC.getSelectedItem().toString());
            mb.setLocation(ll); //setting the location to be saved
            
        }
        // MomentofInertia is required Schema element (ixx, iyy, izz)
        if(!(ixxT.getText().length() > 0)) { //check if location boxes were filled or not
			System.out.println("Schema Mismatch: MassBalance: Moment of Inertia is required");
			return Optional.empty();
		}
        else if(ixxT.getText().length() > 0 && 
                iyyT.getText().length() > 0 && 
                izzT.getText().length() > 0){
            
            //setting ixx
            Ixx first = new Ixx();
            first.setValue(Double.parseDouble(ixxT.getText().trim()));
            if(ixxC.getSelectedItem() == "KG*M2") first.setUnit(InertiaType.KG_M_2);
            else first.setUnit(InertiaType.SLUG_FT_2);
            mb.setIxx(first);
            
            //setting iyy
            Iyy second  = new Iyy();
            second.setValue(Double.parseDouble(iyyT.getText().trim()));
            if(iyyC.getSelectedItem() == "KG*M2") second.setUnit(InertiaType.KG_M_2);
            else second.setUnit(InertiaType.SLUG_FT_2);
            mb.setIyy(second);
            
            //setting izz
            Izz third  = new Izz();
            third.setValue(Double.parseDouble(izzT.getText().trim()));
            if(izzC.getSelectedItem() == "KG*M2") third.setUnit(InertiaType.KG_M_2);
            else third.setUnit(InertiaType.SLUG_FT_2);
            mb.setIzz(third);
        }
        
        if(ixzT.getText().length() > 0 &&
           iyzT.getText().length() > 0 &&
           ixyT.getText().length() > 0){
           
            //setting ixz
            Ixz first = new Ixz();
            first.setValue(new BigDecimal(ixzT.getText().trim()));
            if(ixzC.getSelectedItem() == "KG*M2") first.setUnit(InertiaType.KG_M_2);
            else first.setUnit(InertiaType.SLUG_FT_2);
            mb.setIxz(first); 
            
            //setting iyz
            Iyz second  = new Iyz();
            second.setValue(new BigDecimal(iyzT.getText().trim()));
            if(iyzC.getSelectedItem() == "KG*M2") second.setUnit(InertiaType.KG_M_2);
            else second.setUnit(InertiaType.SLUG_FT_2);
            mb.setIyz(second);
            
            //setting izz
            Ixy third  = new Ixy();
            third.setValue(new BigDecimal(ixyT.getText().trim()));
            if(ixyC.getSelectedItem() == "KG*M2") third.setUnit(InertiaType.KG_M_2);
            else third.setUnit(InertiaType.SLUG_FT_2);
            mb.setIxy(third);
        }
        
        mb.getPointmass().clear(); //clearing old list
        
        for(PointMass myPM : pointMassList){ //updating with new list
            Pointmass pm = new Pointmass();
            
            pm.setName(myPM.getName()); //setting name
            
            Weight w = new Weight(); //configuring and setting weight
            //w.setValue(myPM.getWeight());
            //if(myPM.getWeightUnit() == "LBS") w.setUnit(WeightType.LBS);
            //else w.setUnit(WeightType.KG);
            
            pm.setWeight(w);
            
            Location l = new Location(); //setting location
            l.setName("Location");
            //l.setX(myPM.getXLoc());
            //l.setY(myPM.getYLoc());
            //l.setZ(myPM.getZLoc());
            //l.setUnit(myPM.getLocUnit());
            
            pm.setLocation(l);
            
            mb.getPointmass().add(pm);
        }
        
        return Optional.ofNullable(cfg);
    }

    private void addPointMass(ActionEvent e) {//create new pointmass and add it to pointMassList
        PointMass pm = new PointMass();
        if(pm.getName() == null) return;
        pointMassList.add(pm);
        model.clear();
        model.addAll(pointMassList);
    }

    private void deletePointMass(ActionEvent e) {
        if(pointMassListDisplay.getSelectedValue() != null){
            int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this?", "Confirm", JOptionPane.OK_CANCEL_OPTION);
            if(result == JOptionPane.OK_OPTION){
                PointMass selectedPM = pointMassListDisplay.getSelectedValue(); //find the requested value to delete
                model.removeElement(selectedPM); //delete it from the model and the arraylist
                pointMassList.remove(selectedPM);
            }          
        }
    }

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Connor Baldwin
		massPanel = new JPanel();
		emptyWeightL = new JLabel();
		emptyWeightT = new JTextField();
		emptyWeightC = new JComboBox<>();
		locationPanel = new JPanel();
		xLocL = new JLabel();
		xLocT = new JTextField();
		yLocL = new JLabel();
		yLocT = new JTextField();
		zLocL = new JLabel();
		zLocT = new JTextField();
		locC = new JComboBox<>();
		moiPanel = new JPanel();
		moiLeftPanel = new JPanel();
		ixxL = new JLabel();
		ixxT = new JTextField();
		ixxC = new JComboBox<>();
		iyyL = new JLabel();
		iyyT = new JTextField();
		iyyC = new JComboBox<>();
		izzL = new JLabel();
		izzT = new JTextField();
		izzC = new JComboBox<>();
		moiRightPanel = new JPanel();
		ixzL = new JLabel();
		ixzT = new JTextField();
		ixzC = new JComboBox<>();
		iyzL = new JLabel();
		iyzT = new JTextField();
		iyzC = new JComboBox<>();
		ixyL = new JLabel();
		ixyT = new JTextField();
		ixyC = new JComboBox<>();
		pointMassPanel = new JPanel();
		scrollPane1 = new JScrollPane();
		pointMassListDisplay = new JList<PointMass>();
		pointMassButtonsPanel = new JPanel();
		addPointMassButton = new JButton();
		deletePointMassButton = new JButton();

		//======== this ========
		setMinimumSize(new Dimension(1250, 600));
		setPreferredSize(new Dimension(1250, 600));
		setLayout(new MigLayout(
		    "fill,hidemode 3,alignx center",
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
		    "[301]"));

		//======== massPanel ========
		{
		    massPanel.setBorder(new TitledBorder("Mass*"));
		    massPanel.setLayout(new MigLayout(
			"hidemode 3,align center center",
			// columns
			"[fill]" +
			"[fill]" +
			"[fill]",
			// rows
			"[19]" +
			"[]" +
			"[]"));

		    //---- emptyWeightL ----
		    emptyWeightL.setText("Empty Weight =");
		    massPanel.add(emptyWeightL, "cell 0 1");
		    massPanel.add(emptyWeightT, "cell 1 1,alignx right,growx 0");

		    //---- emptyWeightC ----
		    emptyWeightC.setModel(new DefaultComboBoxModel<>(new String[] {
			"KG",
			"LBS"
		    }));
		    massPanel.add(emptyWeightC, "cell 2 1");
		}
		add(massPanel, "cell 0 0 49 1,grow");

		//======== locationPanel ========
		{
		    locationPanel.setBorder(new TitledBorder("Location*"));
		    locationPanel.setLayout(new MigLayout(
			"fill,hidemode 3,align center center",
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
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]"));

		    //---- xLocL ----
		    xLocL.setText("x =");
		    locationPanel.add(xLocL, "cell 0 1,alignx right,growx 0");
		    locationPanel.add(xLocT, "cell 1 1");

		    //---- yLocL ----
		    yLocL.setText("y =");
		    locationPanel.add(yLocL, "cell 10 1,alignx right,growx 0");
		    locationPanel.add(yLocT, "cell 11 1");

		    //---- zLocL ----
		    zLocL.setText("z =");
		    locationPanel.add(zLocL, "cell 19 1,alignx right,growx 0");
		    locationPanel.add(zLocT, "cell 20 1");

		    //---- locC ----
		    locC.setModel(new DefaultComboBoxModel<>(new String[] {
			"IN",
			"FT",
			"M"
		    }));
		    locationPanel.add(locC, "cell 22 1");
		}
		add(locationPanel, "cell 0 1 49 1,grow");

		//======== moiPanel ========
		{
		    moiPanel.setBorder(new TitledBorder("Moment of Inertia*"));
		    moiPanel.setLayout(new MigLayout(
			"fill,hidemode 3,align center center",
			// columns
			"[fill]" +
			"[fill]",
			// rows
			"[]"));

		    //======== moiLeftPanel ========
		    {
			moiLeftPanel.setLayout(new MigLayout(
			    "fill,hidemode 3",
			    // columns
			    "[fill]" +
			    "[120,fill]" +
			    "[fill]",
			    // rows
			    "[]" +
			    "[]" +
			    "[]"));

			//---- ixxL ----
			ixxL.setText("ixx =");
			moiLeftPanel.add(ixxL, "cell 0 0");
			moiLeftPanel.add(ixxT, "cell 1 0");

			//---- ixxC ----
			ixxC.setModel(new DefaultComboBoxModel<>(new String[] {
			    "SLUG*FT2",
			    "KG*M2"
			}));
			moiLeftPanel.add(ixxC, "cell 2 0");

			//---- iyyL ----
			iyyL.setText("iyy =");
			moiLeftPanel.add(iyyL, "cell 0 1");
			moiLeftPanel.add(iyyT, "cell 1 1");

			//---- iyyC ----
			iyyC.setModel(new DefaultComboBoxModel<>(new String[] {
			    "SLUG*FT2",
			    "KG*M2"
			}));
			moiLeftPanel.add(iyyC, "cell 2 1");

			//---- izzL ----
			izzL.setText("izz =");
			moiLeftPanel.add(izzL, "cell 0 2");
			moiLeftPanel.add(izzT, "cell 1 2");

			//---- izzC ----
			izzC.setModel(new DefaultComboBoxModel<>(new String[] {
			    "SLUG*FT2",
			    "KG*M2"
			}));
			moiLeftPanel.add(izzC, "cell 2 2");
		    }
		    moiPanel.add(moiLeftPanel, "cell 0 0,align center center,grow 0 0");

		    //======== moiRightPanel ========
		    {
			moiRightPanel.setLayout(new MigLayout(
			    "fill,hidemode 3",
			    // columns
			    "[fill]" +
			    "[120,fill]" +
			    "[fill]",
			    // rows
			    "[]" +
			    "[]" +
			    "[]"));

			//---- ixzL ----
			ixzL.setText("ixz =");
			moiRightPanel.add(ixzL, "cell 0 0");
			moiRightPanel.add(ixzT, "cell 1 0");

			//---- ixzC ----
			ixzC.setModel(new DefaultComboBoxModel<>(new String[] {
			    "SLUG*FT2",
			    "KG*M2"
			}));
			moiRightPanel.add(ixzC, "cell 2 0");

			//---- iyzL ----
			iyzL.setText("iyz =");
			moiRightPanel.add(iyzL, "cell 0 1");
			moiRightPanel.add(iyzT, "cell 1 1");

			//---- iyzC ----
			iyzC.setModel(new DefaultComboBoxModel<>(new String[] {
			    "SLUG*FT2",
			    "KG*M2"
			}));
			moiRightPanel.add(iyzC, "cell 2 1");

			//---- ixyL ----
			ixyL.setText("ixy =");
			moiRightPanel.add(ixyL, "cell 0 2");
			moiRightPanel.add(ixyT, "cell 1 2");

			//---- ixyC ----
			ixyC.setModel(new DefaultComboBoxModel<>(new String[] {
			    "SLUG*FT2",
			    "KG*M2"
			}));
			moiRightPanel.add(ixyC, "cell 2 2");
		    }
		    moiPanel.add(moiRightPanel, "cell 1 0,align center center,grow 0 0");
		}
		add(moiPanel, "cell 0 2 49 1,grow");

		//======== pointMassPanel ========
		{
		    pointMassPanel.setBorder(new TitledBorder("Point Mass"));
		    pointMassPanel.setLayout(new MigLayout(
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
			"[]"));

		    //======== scrollPane1 ========
		    {

			//---- pointMassListDisplay ----
			pointMassListDisplay.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			pointMassListDisplay.setModel(model);
			scrollPane1.setViewportView(pointMassListDisplay);
		    }
		    pointMassPanel.add(scrollPane1, "cell 0 0 48 9,grow");

		    //======== pointMassButtonsPanel ========
		    {
			pointMassButtonsPanel.setLayout(new MigLayout(
			    "fill,hidemode 3",
			    // columns
			    "[fill]" +
			    "[fill]",
			    // rows
			    "[]"));

			//---- addPointMassButton ----
			addPointMassButton.setText("Add a new Point Mass");
			addPointMassButton.addActionListener(e -> addPointMass(e));
			pointMassButtonsPanel.add(addPointMassButton, "cell 0 0");

			//---- deletePointMassButton ----
			deletePointMassButton.setText("Delete the selected Point Mass");
			deletePointMassButton.addActionListener(e -> deletePointMass(e));
			pointMassButtonsPanel.add(deletePointMassButton, "cell 1 0");
		    }
		    pointMassPanel.add(pointMassButtonsPanel, "cell 0 9 48 2,grow");
		}
		add(pointMassPanel, "cell 0 3 49 1,grow");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Connor Baldwin
	private JPanel massPanel;
	private JLabel emptyWeightL;
	private JTextField emptyWeightT;
	private JComboBox<String> emptyWeightC;
	private JPanel locationPanel;
	private JLabel xLocL;
	private JTextField xLocT;
	private JLabel yLocL;
	private JTextField yLocT;
	private JLabel zLocL;
	private JTextField zLocT;
	private JComboBox<String> locC;
	private JPanel moiPanel;
	private JPanel moiLeftPanel;
	private JLabel ixxL;
	private JTextField ixxT;
	private JComboBox<String> ixxC;
	private JLabel iyyL;
	private JTextField iyyT;
	private JComboBox<String> iyyC;
	private JLabel izzL;
	private JTextField izzT;
	private JComboBox<String> izzC;
	private JPanel moiRightPanel;
	private JLabel ixzL;
	private JTextField ixzT;
	private JComboBox<String> ixzC;
	private JLabel iyzL;
	private JTextField iyzT;
	private JComboBox<String> iyzC;
	private JLabel ixyL;
	private JTextField ixyT;
	private JComboBox<String> ixyC;
	private JPanel pointMassPanel;
	private JScrollPane scrollPane1;
	private JList<PointMass> pointMassListDisplay;
	private JPanel pointMassButtonsPanel;
	private JButton addPointMassButton;
	private JButton deletePointMassButton;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
        
        private ArrayList<PointMass> pointMassList;        
        private DefaultListModel<PointMass> model = new DefaultListModel<PointMass>(); //list to be put into JList pointMassListDisplay
}