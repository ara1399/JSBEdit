package uta.cse.cse3310.JSBSimEdit;

import java.util.Optional;
import javax.swing.*;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.*;

import generated.FdmConfig;
import java.awt.Dimension;
import net.miginfocom.swing.*;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;
import uta.cse.cse3310.JSBSimEdit.utils.Constants;
    
public class MassBalance extends JPanel implements TabComponent {
    
    MassBalance(){
        initComponents();
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

    void openPointMass(){
        new PointMass();
    }

    JButton addPM;

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Connor Baldwin
		massPanel = new JPanel();
		emptyWeightL = new JLabel();
		emptyWeightT = new JTextField();
		emptyWeightC = new JComboBox();
		locationPanel = new JPanel();
		xLocL = new JLabel();
		xLocT = new JTextField();
		yLocL = new JLabel();
		yLocT = new JTextField();
		zLocL = new JLabel();
		zLocT = new JTextField();
		locC = new JComboBox();
		moiPanel = new JPanel();
		moiLeftPanel = new JPanel();
		ixxL = new JLabel();
		ixxT = new JTextField();
		ixxC = new JComboBox();
		iyyL = new JLabel();
		iyyT = new JTextField();
		iyyC = new JComboBox();
		izzL = new JLabel();
		izzT = new JTextField();
		izzC = new JComboBox();
		moiRightPanel = new JPanel();
		ixxL2 = new JLabel();
		ixxT2 = new JTextField();
		ixxC2 = new JComboBox();
		iyyL2 = new JLabel();
		iyyT2 = new JTextField();
		iyyC2 = new JComboBox();
		izzL2 = new JLabel();
		izzT2 = new JTextField();
		izzC2 = new JComboBox();
		pointMassPanel = new JPanel();
		pointMassTextArea = new JTextField();
		pointMassButtonsPanel = new JPanel();
		addPointMassButton = new JButton();
		deletePointMassButton = new JButton();

		//======== this ========
		setMinimumSize(new Dimension(1250, 600));
		setPreferredSize(new Dimension(1250, 600));
		setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder
		( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax. swing. border
		. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt
		. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void
		propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( )
		; }} );
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
		    massPanel.setBorder(new TitledBorder("Mass"));
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
		    massPanel.add(emptyWeightT, "cell 1 1");
		    massPanel.add(emptyWeightC, "cell 2 1");
		}
		add(massPanel, "cell 0 0 49 1,grow");

		//======== locationPanel ========
		{
		    locationPanel.setBorder(new TitledBorder("Location"));
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
		    locationPanel.add(locC, "cell 22 1");
		}
		add(locationPanel, "cell 0 1 49 1,grow");

		//======== moiPanel ========
		{
		    moiPanel.setBorder(new TitledBorder("Moment of Inertia"));
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
			moiLeftPanel.add(ixxC, "cell 2 0");

			//---- iyyL ----
			iyyL.setText("iyy =");
			moiLeftPanel.add(iyyL, "cell 0 1");
			moiLeftPanel.add(iyyT, "cell 1 1");
			moiLeftPanel.add(iyyC, "cell 2 1");

			//---- izzL ----
			izzL.setText("izz =");
			moiLeftPanel.add(izzL, "cell 0 2");
			moiLeftPanel.add(izzT, "cell 1 2");
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

			//---- ixxL2 ----
			ixxL2.setText("ixz =");
			moiRightPanel.add(ixxL2, "cell 0 0");
			moiRightPanel.add(ixxT2, "cell 1 0");
			moiRightPanel.add(ixxC2, "cell 2 0");

			//---- iyyL2 ----
			iyyL2.setText("iyz =");
			moiRightPanel.add(iyyL2, "cell 0 1");
			moiRightPanel.add(iyyT2, "cell 1 1");
			moiRightPanel.add(iyyC2, "cell 2 1");

			//---- izzL2 ----
			izzL2.setText("ixy =");
			moiRightPanel.add(izzL2, "cell 0 2");
			moiRightPanel.add(izzT2, "cell 1 2");
			moiRightPanel.add(izzC2, "cell 2 2");
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
		    pointMassPanel.add(pointMassTextArea, "cell 0 0 48 9,grow");

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
			pointMassButtonsPanel.add(addPointMassButton, "cell 0 0");

			//---- deletePointMassButton ----
			deletePointMassButton.setText("Delete the selected Point Mass");
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
	private JComboBox emptyWeightC;
	private JPanel locationPanel;
	private JLabel xLocL;
	private JTextField xLocT;
	private JLabel yLocL;
	private JTextField yLocT;
	private JLabel zLocL;
	private JTextField zLocT;
	private JComboBox locC;
	private JPanel moiPanel;
	private JPanel moiLeftPanel;
	private JLabel ixxL;
	private JTextField ixxT;
	private JComboBox ixxC;
	private JLabel iyyL;
	private JTextField iyyT;
	private JComboBox iyyC;
	private JLabel izzL;
	private JTextField izzT;
	private JComboBox izzC;
	private JPanel moiRightPanel;
	private JLabel ixxL2;
	private JTextField ixxT2;
	private JComboBox ixxC2;
	private JLabel iyyL2;
	private JTextField iyyT2;
	private JComboBox iyyC2;
	private JLabel izzL2;
	private JTextField izzT2;
	private JComboBox izzC2;
	private JPanel pointMassPanel;
	private JTextField pointMassTextArea;
	private JPanel pointMassButtonsPanel;
	private JButton addPointMassButton;
	private JButton deletePointMassButton;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}