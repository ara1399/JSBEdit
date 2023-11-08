package uta.cse.cse3310.JSBSimEdit;

import java.awt.*;
import java.awt.Dimension;
import javax.swing.*;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.border.*;
import net.miginfocom.swing.*;

public class LandingGearSetup extends JDialog{
    LandingGearSetup(){
        initComponents();
        retractableCh.setHorizontalAlignment(SwingConstants.RIGHT);
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
		textField3 = new JTextField();
		dynL = new JLabel();
		textField4 = new JTextField();
		rollL = new JLabel();
		textField5 = new JTextField();
		springL = new JLabel();
		textField6 = new JTextField();
		comboBox3 = new JComboBox<>();
		dampL = new JLabel();
		textField7 = new JTextField();
		comboBox2 = new JComboBox<>();
		dampRebL = new JLabel();
		dampRebT = new JTextField();
		dampRebC = new JComboBox<>();
		steerL = new JLabel();
		textField8 = new JTextField();
		comboBox1 = new JComboBox<>();
		label9 = new JLabel();
		textField11 = new JTextField();
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
		    topP.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
		    . border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder
		    . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .
		    awt .Font .BOLD ,12 ), java. awt. Color. red) ,topP. getBorder( )) )
		    ; topP. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
		    ) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
		    ;
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
		    fricP.add(textField3, "cell 1 0");

		    //---- dynL ----
		    dynL.setText("dynamic friction =");
		    fricP.add(dynL, "cell 0 1,alignx right,growx 0");
		    fricP.add(textField4, "cell 1 1");

		    //---- rollL ----
		    rollL.setText("rolling friction =");
		    fricP.add(rollL, "cell 0 2,alignx right,growx 0");
		    fricP.add(textField5, "cell 1 2");

		    //---- springL ----
		    springL.setText("spring coefficient =");
		    fricP.add(springL, "cell 0 3,alignx right,growx 0");
		    fricP.add(textField6, "cell 1 3");

		    //---- comboBox3 ----
		    comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
			"LBS/FT",
			"N/M"
		    }));
		    fricP.add(comboBox3, "cell 2 3");

		    //---- dampL ----
		    dampL.setText("damping coefficient =");
		    fricP.add(dampL, "cell 0 4,alignx right,growx 0");
		    fricP.add(textField7, "cell 1 4");

		    //---- comboBox2 ----
		    comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
			"LBS/FT/SEC",
			"N/M/SEC"
		    }));
		    fricP.add(comboBox2, "cell 2 4");

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
		    fricP.add(textField8, "cell 1 6");

		    //---- comboBox1 ----
		    comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
			"DEG",
			"RAD"
		    }));
		    fricP.add(comboBox1, "cell 2 6");

		    //---- label9 ----
		    label9.setText("wheel slip filter =");
		    fricP.add(label9, "cell 0 7,alignx right,growx 0");
		    fricP.add(textField11, "cell 1 7");

		    //---- brakeL ----
		    brakeL.setText("brake group =");
		    fricP.add(brakeL, "cell 0 8,alignx right,growx 0");

		    //---- brakeC ----
		    brakeC.setModel(new DefaultComboBoxModel<>(new String[] {
			"NOSE",
			"RIGHT",
			"CENTER",
			"TAIL",
			"NONE"
		    }));
		    fricP.add(brakeC, "cell 1 8");

		    //---- retractableCh ----
		    retractableCh.setText("retractable");
		    retractableCh.setHorizontalAlignment(SwingConstants.RIGHT);
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
		    buttonP.add(okB, "cell 0 0");

		    //---- cancelB ----
		    cancelB.setText("Cancel");
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
    private JTextField textField3;
    private JLabel dynL;
    private JTextField textField4;
    private JLabel rollL;
    private JTextField textField5;
    private JLabel springL;
    private JTextField textField6;
    private JComboBox<String> comboBox3;
    private JLabel dampL;
    private JTextField textField7;
    private JComboBox<String> comboBox2;
    private JLabel dampRebL;
    private JTextField dampRebT;
    private JComboBox<String> dampRebC;
    private JLabel steerL;
    private JTextField textField8;
    private JComboBox<String> comboBox1;
    private JLabel label9;
    private JTextField textField11;
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
}
