package uta.cse.cse3310.JSBSimEdit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.*;

import java.awt.Dimension;
import java.util.Optional;

import generated.FdmConfig;
import net.miginfocom.swing.*;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;

/*
 * UI elements created by JFormDesigner on Mon Oct 23 19:14:13 CDT 2023
 */
public class Metrics extends JPanel implements TabComponent {
	
	public Metrics() {
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
    
    private void initComponents() {
		mainPanel = new JPanel();
		wingAreaLabel = new JLabel();
		wingAreaText = new JTextField();
		wingAreaCombo = new JComboBox<>();
		hTailAreaLabel = new JLabel();
		hTailAreaText = new JTextField();
		hTailAreaCombo = new JComboBox<>();
		wingSpanLabel = new JLabel();
		wingSpanText = new JTextField();
		wingSpanCombo = new JComboBox<>();
		hTailArmLabel = new JLabel();
		hTailArmText = new JTextField();
		hTailArmCombo = new JComboBox<>();
		chordLabel = new JLabel();
		chordText = new JTextField();
		chordCombo = new JComboBox<>();
		vTailAreaLabel = new JLabel();
		vTailAreaText = new JTextField();
		vTailAreaCombo = new JComboBox<>();
		wingIncidenceLabel = new JLabel();
		wingIncidenceText = new JTextField();
		wingIncidenceCombo = new JComboBox<>();
		vTailArmLabel = new JLabel();
		vTailArmText = new JTextField();
		vTailArmCombo = new JComboBox<>();
		aerodynamicRefPanel = new JPanel();
		aerodynamicRefXLabel = new JLabel();
		aerodynamicRefXText = new JTextField();
		aerodynamicRefYLabel = new JLabel();
		aerodynamicRefYText = new JTextField();
		aerodynamicRefZLabel = new JLabel();
		aerodynamicRefZText = new JTextField();
		aerodynamicRefUnitLabel = new JLabel();
		aerodynamicRefUnitCombo = new JComboBox<>();
		eyePointPanel = new JPanel();
		eyePointXLabel = new JLabel();
		eyePointXText = new JTextField();
		eyePointYLabel = new JLabel();
		eyePointYText = new JTextField();
		eyePointZLabel = new JLabel();
		eyePointZText = new JTextField();
		eyePointUnitLabel = new JLabel();
		eyePointUnitCombo = new JComboBox<>();
		visualRefPanel = new JPanel();
		visualRefXLabel = new JLabel();
		visualRefXText = new JTextField();
		visualRefYLabel = new JLabel();
		visualRefYText = new JTextField();
		visualRefZLabel = new JLabel();
		visualRefZText = new JTextField();
		visualRefUnitLabel = new JLabel();
		visualRefUnitCombo = new JComboBox<>();

		//======== this ========
		setBorder(new CompoundBorder(
			new EmptyBorder(20, 20, 20, 20),
			new EmptyBorder(5, 5, 5, 5)));
		setLayout(new MigLayout(
			"align center center,gap 10 30",
			// columns
			"[grow,fill]" +
			"[grow,fill]" +
			"[fill]" +
			"[grow,fill]" +
			"[grow,fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//======== mainPanel ========
		{
			mainPanel.setBorder(new CompoundBorder(
				new TitledBorder(""),
				new EmptyBorder(20, 20, 20, 20)));
			mainPanel.setLayout(new MigLayout(
				"align center center,gap 10 30",
				// columns
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[100,fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]",
				// rows
				"[]" +
				"[]" +
				"[]" +
				"[]"));

			//---- wingAreaLabel ----
			wingAreaLabel.setText("WingArea* =");
			wingAreaLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			mainPanel.add(wingAreaLabel, "cell 0 0");

			//---- wingAreaText ----
			wingAreaText.setPreferredSize(new Dimension(100, 23));
			mainPanel.add(wingAreaText, "cell 1 0");

			//---- wingAreaCombo ----
			wingAreaCombo.setMaximumRowCount(5);
			wingAreaCombo.setPreferredSize(new Dimension(40, 23));
			wingAreaCombo.setModel(new DefaultComboBoxModel<>(new String[] {
				"FT2",
				"M2"
			}));
			mainPanel.add(wingAreaCombo, "cell 2 0");

			//---- hTailAreaLabel ----
			hTailAreaLabel.setText("HTailArea =");
			hTailAreaLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			mainPanel.add(hTailAreaLabel, "cell 4 0");

			//---- hTailAreaText ----
			hTailAreaText.setPreferredSize(new Dimension(100, 23));
			mainPanel.add(hTailAreaText, "cell 5 0");

			//---- hTailAreaCombo ----
			hTailAreaCombo.setMaximumRowCount(5);
			hTailAreaCombo.setPreferredSize(new Dimension(40, 23));
			hTailAreaCombo.setModel(new DefaultComboBoxModel<>(new String[] {
				"FT2",
				"M2"
			}));
			mainPanel.add(hTailAreaCombo, "cell 6 0");

			//---- wingSpanLabel ----
			wingSpanLabel.setText("WingSpan* =");
			wingSpanLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			mainPanel.add(wingSpanLabel, "cell 0 1");

			//---- wingSpanText ----
			wingSpanText.setPreferredSize(new Dimension(100, 23));
			mainPanel.add(wingSpanText, "cell 1 1");

			//---- wingSpanCombo ----
			wingSpanCombo.setMaximumRowCount(5);
			wingSpanCombo.setPreferredSize(new Dimension(40, 23));
			wingSpanCombo.setModel(new DefaultComboBoxModel<>(new String[] {
				"FT",
				"M",
				"IN"
			}));
			mainPanel.add(wingSpanCombo, "cell 2 1");

			//---- hTailArmLabel ----
			hTailArmLabel.setText("HTailArm =");
			hTailArmLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			mainPanel.add(hTailArmLabel, "cell 4 1");

			//---- hTailArmText ----
			hTailArmText.setPreferredSize(new Dimension(100, 23));
			mainPanel.add(hTailArmText, "cell 5 1");

			//---- hTailArmCombo ----
			hTailArmCombo.setMaximumRowCount(5);
			hTailArmCombo.setPreferredSize(new Dimension(40, 23));
			hTailArmCombo.setModel(new DefaultComboBoxModel<>(new String[] {
				"FT",
				"M",
				"IN"
			}));
			mainPanel.add(hTailArmCombo, "cell 6 1");

			//---- chordLabel ----
			chordLabel.setText("Chord* =");
			chordLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			mainPanel.add(chordLabel, "cell 0 2");

			//---- chordText ----
			chordText.setPreferredSize(new Dimension(100, 23));
			mainPanel.add(chordText, "cell 1 2");

			//---- chordCombo ----
			chordCombo.setMaximumRowCount(5);
			chordCombo.setPreferredSize(new Dimension(40, 23));
			chordCombo.setModel(new DefaultComboBoxModel<>(new String[] {
				"FT",
				"M",
				"IN"
			}));
			mainPanel.add(chordCombo, "cell 2 2");

			//---- vTailAreaLabel ----
			vTailAreaLabel.setText("VTailArea =");
			vTailAreaLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			mainPanel.add(vTailAreaLabel, "cell 4 2");

			//---- vTailAreaText ----
			vTailAreaText.setPreferredSize(new Dimension(100, 23));
			mainPanel.add(vTailAreaText, "cell 5 2");

			//---- vTailAreaCombo ----
			vTailAreaCombo.setMaximumRowCount(5);
			vTailAreaCombo.setPreferredSize(new Dimension(40, 23));
			vTailAreaCombo.setModel(new DefaultComboBoxModel<>(new String[] {
				"FT2",
				"M2"
			}));
			mainPanel.add(vTailAreaCombo, "cell 6 2");

			//---- wingIncidenceLabel ----
			wingIncidenceLabel.setText("WingIncidence =");
			wingIncidenceLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			mainPanel.add(wingIncidenceLabel, "cell 0 3");

			//---- wingIncidenceText ----
			wingIncidenceText.setPreferredSize(new Dimension(100, 23));
			mainPanel.add(wingIncidenceText, "cell 1 3");

			//---- wingIncidenceCombo ----
			wingIncidenceCombo.setMaximumRowCount(5);
			wingIncidenceCombo.setPreferredSize(new Dimension(40, 23));
			wingIncidenceCombo.setModel(new DefaultComboBoxModel<>(new String[] {
				"DEG",
				"RAD"
			}));
			mainPanel.add(wingIncidenceCombo, "cell 2 3");

			//---- vTailArmLabel ----
			vTailArmLabel.setText("VTailArm =");
			vTailArmLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			mainPanel.add(vTailArmLabel, "cell 4 3");

			//---- vTailArmText ----
			vTailArmText.setPreferredSize(new Dimension(100, 23));
			mainPanel.add(vTailArmText, "cell 5 3");

			//---- vTailArmCombo ----
			vTailArmCombo.setMaximumRowCount(5);
			vTailArmCombo.setPreferredSize(new Dimension(40, 23));
			vTailArmCombo.setModel(new DefaultComboBoxModel<>(new String[] {
				"FT",
				"M",
				"IN"
			}));
			mainPanel.add(vTailArmCombo, "cell 6 3");
		}
		add(mainPanel, "cell 0 0 5 1");

		//======== aerodynamicRefPanel ========
		{
			aerodynamicRefPanel.setBorder(new CompoundBorder(
				new TitledBorder("Aerodynamic Reference Point*"),
				new EmptyBorder(20, 20, 20, 20)));
			aerodynamicRefPanel.setLayout(new MigLayout(
				"align center center,gap 10 30",
				// columns
				"[grow,fill]" +
				"[grow,fill]" +
				"[grow,fill]" +
				"[grow,fill]" +
				"[grow,fill]" +
				"[grow,fill]" +
				"[grow,fill]" +
				"[fill]",
				// rows
				"[]"));

			//---- aerodynamicRefXLabel ----
			aerodynamicRefXLabel.setText("x =");
			aerodynamicRefXLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			aerodynamicRefPanel.add(aerodynamicRefXLabel, "cell 0 0");

			//---- aerodynamicRefXText ----
			aerodynamicRefXText.setPreferredSize(new Dimension(100, 23));
			aerodynamicRefPanel.add(aerodynamicRefXText, "cell 1 0");

			//---- aerodynamicRefYLabel ----
			aerodynamicRefYLabel.setText("y =");
			aerodynamicRefYLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			aerodynamicRefPanel.add(aerodynamicRefYLabel, "cell 2 0");

			//---- aerodynamicRefYText ----
			aerodynamicRefYText.setPreferredSize(new Dimension(100, 23));
			aerodynamicRefPanel.add(aerodynamicRefYText, "cell 3 0");

			//---- aerodynamicRefZLabel ----
			aerodynamicRefZLabel.setText("z =");
			aerodynamicRefZLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			aerodynamicRefPanel.add(aerodynamicRefZLabel, "cell 4 0");

			//---- aerodynamicRefZText ----
			aerodynamicRefZText.setPreferredSize(new Dimension(100, 23));
			aerodynamicRefPanel.add(aerodynamicRefZText, "cell 5 0");

			//---- aerodynamicRefUnitLabel ----
			aerodynamicRefUnitLabel.setText("Unit");
			aerodynamicRefUnitLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			aerodynamicRefPanel.add(aerodynamicRefUnitLabel, "cell 6 0");

			//---- aerodynamicRefUnitCombo ----
			aerodynamicRefUnitCombo.setMaximumRowCount(5);
			aerodynamicRefUnitCombo.setPreferredSize(new Dimension(40, 23));
			aerodynamicRefUnitCombo.setModel(new DefaultComboBoxModel<>(new String[] {
				"IN",
				"FT",
				"M"
			}));
			aerodynamicRefPanel.add(aerodynamicRefUnitCombo, "cell 7 0");
		}
		add(aerodynamicRefPanel, "cell 0 2 5 1");

		//======== eyePointPanel ========
		{
			eyePointPanel.setBorder(new CompoundBorder(
				new TitledBorder("Eye Point"),
				new EmptyBorder(20, 20, 20, 20)));
			eyePointPanel.setLayout(new MigLayout(
				"align center center,gap 10 30",
				// columns
				"[grow,fill]" +
				"[grow,fill]" +
				"[grow,fill]" +
				"[grow,fill]" +
				"[grow,fill]" +
				"[grow,fill]" +
				"[grow,fill]" +
				"[fill]",
				// rows
				"[]"));

			//---- eyePointXLabel ----
			eyePointXLabel.setText("x =");
			eyePointXLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			eyePointPanel.add(eyePointXLabel, "cell 0 0");

			//---- eyePointXText ----
			eyePointXText.setPreferredSize(new Dimension(100, 23));
			eyePointPanel.add(eyePointXText, "cell 1 0");

			//---- eyePointYLabel ----
			eyePointYLabel.setText("y =");
			eyePointYLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			eyePointPanel.add(eyePointYLabel, "cell 2 0");

			//---- eyePointYText ----
			eyePointYText.setPreferredSize(new Dimension(100, 23));
			eyePointPanel.add(eyePointYText, "cell 3 0");

			//---- eyePointZLabel ----
			eyePointZLabel.setText("z =");
			eyePointZLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			eyePointPanel.add(eyePointZLabel, "cell 4 0");

			//---- eyePointZText ----
			eyePointZText.setPreferredSize(new Dimension(100, 23));
			eyePointPanel.add(eyePointZText, "cell 5 0");

			//---- eyePointUnitLabel ----
			eyePointUnitLabel.setText("Unit");
			eyePointUnitLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			eyePointPanel.add(eyePointUnitLabel, "cell 6 0");

			//---- eyePointUnitCombo ----
			eyePointUnitCombo.setMaximumRowCount(5);
			eyePointUnitCombo.setPreferredSize(new Dimension(40, 23));
			eyePointUnitCombo.setModel(new DefaultComboBoxModel<>(new String[] {
				"IN",
				"FT",
				"M"
			}));
			eyePointPanel.add(eyePointUnitCombo, "cell 7 0");
		}
		add(eyePointPanel, "cell 0 3 5 1");

		//======== visualRefPanel ========
		{
			visualRefPanel.setBorder(new CompoundBorder(
				new TitledBorder("Visual Reference Point"),
				new EmptyBorder(20, 20, 20, 20)));
			visualRefPanel.setLayout(new MigLayout(
				"align center center,gap 10 30",
				// columns
				"[grow,fill]" +
				"[grow,fill]" +
				"[grow,fill]" +
				"[grow,fill]" +
				"[grow,fill]" +
				"[grow,fill]" +
				"[grow,fill]" +
				"[fill]",
				// rows
				"[]"));

			//---- visualRefXLabel ----
			visualRefXLabel.setText("x =");
			visualRefXLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			visualRefPanel.add(visualRefXLabel, "cell 0 0");

			//---- visualRefXText ----
			visualRefXText.setPreferredSize(new Dimension(100, 23));
			visualRefPanel.add(visualRefXText, "cell 1 0");

			//---- visualRefYLabel ----
			visualRefYLabel.setText("y =");
			visualRefYLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			visualRefPanel.add(visualRefYLabel, "cell 2 0");

			//---- visualRefYText ----
			visualRefYText.setPreferredSize(new Dimension(100, 23));
			visualRefPanel.add(visualRefYText, "cell 3 0");

			//---- visualRefZLabel ----
			visualRefZLabel.setText("z =");
			visualRefZLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			visualRefPanel.add(visualRefZLabel, "cell 4 0");

			//---- visualRefZText ----
			visualRefZText.setPreferredSize(new Dimension(100, 23));
			visualRefPanel.add(visualRefZText, "cell 5 0");

			//---- visualRefUnitLabel ----
			visualRefUnitLabel.setText("Unit");
			visualRefUnitLabel.setHorizontalAlignment(SwingConstants.TRAILING);
			visualRefPanel.add(visualRefUnitLabel, "cell 6 0");

			//---- visualRefUnitCombo ----
			visualRefUnitCombo.setMaximumRowCount(5);
			visualRefUnitCombo.setPreferredSize(new Dimension(40, 23));
			visualRefUnitCombo.setModel(new DefaultComboBoxModel<>(new String[] {
				"IN",
				"FT",
				"M"
			}));
			visualRefPanel.add(visualRefUnitCombo, "cell 7 0");
		}
		add(visualRefPanel, "cell 0 4 5 1");
	}

	private JPanel mainPanel;
	private JLabel wingAreaLabel;
	private JTextField wingAreaText;
	private JComboBox<String> wingAreaCombo;
	private JLabel hTailAreaLabel;
	private JTextField hTailAreaText;
	private JComboBox<String> hTailAreaCombo;
	private JLabel wingSpanLabel;
	private JTextField wingSpanText;
	private JComboBox<String> wingSpanCombo;
	private JLabel hTailArmLabel;
	private JTextField hTailArmText;
	private JComboBox<String> hTailArmCombo;
	private JLabel chordLabel;
	private JTextField chordText;
	private JComboBox<String> chordCombo;
	private JLabel vTailAreaLabel;
	private JTextField vTailAreaText;
	private JComboBox<String> vTailAreaCombo;
	private JLabel wingIncidenceLabel;
	private JTextField wingIncidenceText;
	private JComboBox<String> wingIncidenceCombo;
	private JLabel vTailArmLabel;
	private JTextField vTailArmText;
	private JComboBox<String> vTailArmCombo;
	private JPanel aerodynamicRefPanel;
	private JLabel aerodynamicRefXLabel;
	private JTextField aerodynamicRefXText;
	private JLabel aerodynamicRefYLabel;
	private JTextField aerodynamicRefYText;
	private JLabel aerodynamicRefZLabel;
	private JTextField aerodynamicRefZText;
	private JLabel aerodynamicRefUnitLabel;
	private JComboBox<String> aerodynamicRefUnitCombo;
	private JPanel eyePointPanel;
	private JLabel eyePointXLabel;
	private JTextField eyePointXText;
	private JLabel eyePointYLabel;
	private JTextField eyePointYText;
	private JLabel eyePointZLabel;
	private JTextField eyePointZText;
	private JLabel eyePointUnitLabel;
	private JComboBox<String> eyePointUnitCombo;
	private JPanel visualRefPanel;
	private JLabel visualRefXLabel;
	private JTextField visualRefXText;
	private JLabel visualRefYLabel;
	private JTextField visualRefYText;
	private JLabel visualRefZLabel;
	private JTextField visualRefZText;
	private JLabel visualRefUnitLabel;
	private JComboBox<String> visualRefUnitCombo;
}