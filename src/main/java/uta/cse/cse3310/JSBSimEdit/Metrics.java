package uta.cse.cse3310.JSBSimEdit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.border.*;
import javax.swing.text.NumberFormatter;

import java.awt.Dimension;
import java.text.NumberFormat;
import java.util.Optional;

import generated.AngleType;
import generated.LengthType;
import generated.AreaType;
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

        generated.Metrics m = cfg.getMetrics();

        if(m.getWingarea() != null) {
            wingAreaText.setText(Double.toString(m.getWingarea().getValue()));
            wingAreaCombo.setSelectedItem(m.getWingarea().getUnit().value());
        }

        if(m.getWingspan() != null) {
            wingSpanText.setText(Double.toString(m.getWingspan().getValue()));
            wingSpanCombo.setSelectedItem(m.getWingspan().getUnit().value());
        }

        if(m.getChord() != null) {
            chordText.setText(Double.toString(m.getChord().getValue()));
            chordCombo.setSelectedItem(m.getChord().getUnit().value());
        }

        if(m.getWingIncidence() != null) {
            wingIncidenceText.setText(Double.toString(m.getWingIncidence().getValue()));
            wingIncidenceCombo.setSelectedItem(m.getWingIncidence().getUnit().value());
        }

        if(m.getHtailarea() != null) {
            hTailAreaText.setText(Double.toString(m.getHtailarea().getValue()));
            hTailAreaCombo.setSelectedItem(m.getHtailarea().getUnit().value());
        }

        if(m.getHtailarm() != null) {
            hTailArmText.setText(Double.toString(m.getHtailarm().getValue()));
            hTailArmCombo.setSelectedItem(m.getHtailarm().getUnit().value());
        }

        if(m.getVtailarea() != null) {
            vTailAreaText.setText(Double.toString(m.getVtailarea().getValue()));
            vTailAreaCombo.setSelectedItem(m.getVtailarea().getUnit().value());
        }

        if(m.getVtailarm() != null) {
            vTailArmText.setText(Double.toString(m.getVtailarm().getValue()));
            vTailArmCombo.setSelectedItem(m.getVtailarm().getUnit().value());
        }
    }

    @Override
    public Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg) {
        
        generated.Metrics m = cfg.getMetrics();
        
        // WingArea is required Schema element
		if(!(wingAreaText.getText().length() > 0)) {
			System.out.println("Schema Mismatch: Metrics: WingArea is required");
			return Optional.empty();
		}
		else {
            if(m.getWingarea() == null)
                m.setWingarea(new generated.Wingarea());
			m.getWingarea().setValue(Double.parseDouble(wingAreaText.getText().trim()));
            m.getWingarea().setUnit(AreaType.fromValue(wingAreaCombo.getSelectedItem().toString()));
		}

        // WingSpan is required Schema element
		if(!(wingAreaText.getText().length() > 0)) {
			System.out.println("Schema Mismatch: Metrics: WingSpan is required");
			return Optional.empty();
		}
		else {
            if(m.getWingspan() == null)
                m.setWingspan(new generated.Wingspan());
            m.getWingspan().setValue(Double.parseDouble(wingSpanText.getText().trim()));
            m.getWingspan().setUnit(LengthType.fromValue(wingSpanCombo.getSelectedItem().toString()));
		}

        // Chord is required Schema element
		if(!(chordText.getText().length() > 0)) {
			System.out.println("Schema Mismatch: Metrics: Chord is required");
			return Optional.empty();
		}
		else {
            if(m.getChord() == null)
                m.setChord(new generated.Chord());
			m.getChord().setValue(Double.parseDouble(chordText.getText().trim()));
            m.getChord().setUnit(LengthType.fromValue(chordCombo.getSelectedItem().toString()));
		}

        // WingIncidence is optional, remove if empty
		if(wingIncidenceText.getText().length() > 0) {
			if(m.getWingIncidence() == null)
                m.setWingIncidence(new generated.WingIncidence());
            m.getWingIncidence().setValue(Double.parseDouble(wingIncidenceText.getText().trim()));
            m.getWingIncidence().setUnit(AngleType.fromValue(wingIncidenceCombo.getSelectedItem().toString()));
		}
		else {
			m.setWingIncidence(null);
		}

        // HTailArea is optional, remove if empty
        if(hTailAreaText.getText().length() > 0) {
            if(m.getHtailarea() == null)
                m.setHtailarea(new generated.Htailarea());
            m.getHtailarea().setValue(Double.parseDouble(hTailAreaText.getText().trim()));
            m.getHtailarea().setUnit(AreaType.fromValue(hTailAreaCombo.getSelectedItem().toString()));
        }
        else {
            m.setHtailarea(null);
        }

        // HTailArm is optional, remove if empty
        if(hTailArmText.getText().length() > 0) {
            if(m.getHtailarm() == null)
                m.setHtailarm(new generated.Htailarm());
            m.getHtailarm().setValue(Double.parseDouble(hTailArmText.getText().trim()));
            m.getHtailarm().setUnit(LengthType.fromValue(hTailArmCombo.getSelectedItem().toString()));
        }
        else {
            m.setHtailarm(null);
        }

        // VTailArea is optional, remove if empty
        if(vTailAreaText.getText().length() > 0) {
            if(m.getVtailarea() == null)
                m.setVtailarea(new generated.Vtailarea());
            m.getVtailarea().setValue(Double.parseDouble(vTailAreaText.getText().trim()));
            m.getVtailarea().setUnit(AreaType.fromValue(vTailAreaCombo.getSelectedItem().toString()));
        }
        else {
            m.setVtailarea(null);
        }

        // VTailArm is optional, remove if empty
        if(vTailArmText.getText().length() > 0) {
            if(m.getVtailarm() == null)
                m.setVtailarm(new generated.Vtailarm());
            m.getVtailarm().setValue(Double.parseDouble(vTailArmText.getText().trim()));
            m.getVtailarm().setUnit(LengthType.fromValue(vTailArmCombo.getSelectedItem().toString()));
        }
        else {
            m.setVtailarm(null);
        }

        return Optional.ofNullable(cfg);
    }
    
    private void initComponents() {
		mainPanel = new JPanel();
		wingAreaLabel = new JLabel();
		wingAreaText = new JFormattedTextField(doubleFormatterPositive);
		wingAreaCombo = new JComboBox<>();
		hTailAreaLabel = new JLabel();
		hTailAreaText = new JFormattedTextField(doubleFormatterPositive);
		hTailAreaCombo = new JComboBox<>();
		wingSpanLabel = new JLabel();
		wingSpanText = new JFormattedTextField(doubleFormatterPositive);
		wingSpanCombo = new JComboBox<>();
		hTailArmLabel = new JLabel();
		hTailArmText = new JFormattedTextField(doubleFormatterPositive);
		hTailArmCombo = new JComboBox<>();
		chordLabel = new JLabel();
		chordText = new JFormattedTextField(doubleFormatterPositive);
		chordCombo = new JComboBox<>();
		vTailAreaLabel = new JLabel();
		vTailAreaText = new JFormattedTextField(doubleFormatterPositive);
		vTailAreaCombo = new JComboBox<>();
		wingIncidenceLabel = new JLabel();
		wingIncidenceText = new JFormattedTextField(doubleFormatter);
		wingIncidenceCombo = new JComboBox<>();
		vTailArmLabel = new JLabel();
		vTailArmText = new JFormattedTextField(doubleFormatterPositive);
		vTailArmCombo = new JComboBox<>();
		aerodynamicRefPanel = new JPanel();
		aerodynamicRefXLabel = new JLabel();
		aerodynamicRefXText = new JFormattedTextField(doubleFormatter);
		aerodynamicRefYLabel = new JLabel();
		aerodynamicRefYText = new JFormattedTextField(doubleFormatter);
		aerodynamicRefZLabel = new JLabel();
		aerodynamicRefZText = new JFormattedTextField(doubleFormatter);
		aerodynamicRefUnitLabel = new JLabel();
		aerodynamicRefUnitCombo = new JComboBox<>();
		eyePointPanel = new JPanel();
		eyePointXLabel = new JLabel();
		eyePointXText = new JFormattedTextField(doubleFormatter);
		eyePointYLabel = new JLabel();
		eyePointYText = new JFormattedTextField(doubleFormatter);
		eyePointZLabel = new JLabel();
		eyePointZText = new JFormattedTextField(doubleFormatter);
		eyePointUnitLabel = new JLabel();
		eyePointUnitCombo = new JComboBox<>();
		visualRefPanel = new JPanel();
		visualRefXLabel = new JLabel();
		visualRefXText = new JFormattedTextField(doubleFormatter);
		visualRefYLabel = new JLabel();
		visualRefYText = new JFormattedTextField(doubleFormatter);
		visualRefZLabel = new JLabel();
		visualRefZText = new JFormattedTextField(doubleFormatter);
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

    //ensure text fields only accept doubles
    NumberFormat doubleFormat = NumberFormat.getNumberInstance();
    NumberFormatter doubleFormatterPositive = new NumberFormatter(doubleFormat);
    {
        doubleFormatterPositive.setValueClass(Double.class);
        doubleFormatterPositive.setAllowsInvalid(false);
        doubleFormatterPositive.setMinimum(0.0);
    }
    NumberFormatter doubleFormatter = new NumberFormatter(doubleFormat);
    {
        doubleFormatter.setValueClass(Double.class);
        doubleFormatter.setAllowsInvalid(false);
    }
    
    private JPanel mainPanel;
	private JLabel wingAreaLabel;
	private JFormattedTextField wingAreaText;
	private JComboBox<String> wingAreaCombo;
	private JLabel hTailAreaLabel;
	private JFormattedTextField hTailAreaText;
	private JComboBox<String> hTailAreaCombo;
	private JLabel wingSpanLabel;
	private JFormattedTextField wingSpanText;
	private JComboBox<String> wingSpanCombo;
	private JLabel hTailArmLabel;
	private JFormattedTextField hTailArmText;
	private JComboBox<String> hTailArmCombo;
	private JLabel chordLabel;
	private JFormattedTextField chordText;
	private JComboBox<String> chordCombo;
	private JLabel vTailAreaLabel;
	private JFormattedTextField vTailAreaText;
	private JComboBox<String> vTailAreaCombo;
	private JLabel wingIncidenceLabel;
	private JFormattedTextField wingIncidenceText;
	private JComboBox<String> wingIncidenceCombo;
	private JLabel vTailArmLabel;
	private JFormattedTextField vTailArmText;
	private JComboBox<String> vTailArmCombo;
	private JPanel aerodynamicRefPanel;
	private JLabel aerodynamicRefXLabel;
	private JFormattedTextField aerodynamicRefXText;
	private JLabel aerodynamicRefYLabel;
	private JFormattedTextField aerodynamicRefYText;
	private JLabel aerodynamicRefZLabel;
	private JFormattedTextField aerodynamicRefZText;
	private JLabel aerodynamicRefUnitLabel;
	private JComboBox<String> aerodynamicRefUnitCombo;
	private JPanel eyePointPanel;
	private JLabel eyePointXLabel;
	private JFormattedTextField eyePointXText;
	private JLabel eyePointYLabel;
	private JFormattedTextField eyePointYText;
	private JLabel eyePointZLabel;
	private JFormattedTextField eyePointZText;
	private JLabel eyePointUnitLabel;
	private JComboBox<String> eyePointUnitCombo;
	private JPanel visualRefPanel;
	private JLabel visualRefXLabel;
	private JFormattedTextField visualRefXText;
	private JLabel visualRefYLabel;
	private JFormattedTextField visualRefYText;
	private JLabel visualRefZLabel;
	private JFormattedTextField visualRefZText;
	private JLabel visualRefUnitLabel;
	private JComboBox<String> visualRefUnitCombo;
}