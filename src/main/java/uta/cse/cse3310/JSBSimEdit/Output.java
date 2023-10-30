package uta.cse.cse3310.JSBSimEdit;

import java.awt.Color;
import java.awt.Dimension;
import java.util.List;
import java.util.Optional;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import net.miginfocom.swing.*;

import generated.FdmConfig;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;

public class Output extends JPanel implements TabComponent {
    public Output() {
		initComponents();
	}

    @Override
    public void bindUIwithXML(FdmConfig cfg) {
        //Output op = cfg.getOutput().add(Output e);
		//nameText.setText(op.getName());
    }

    @Override
    public Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg) {
        // TODO
        return Optional.ofNullable(cfg);
    }
    private void initComponents() {
		
		panelOutput = new JPanel();
		name = new JLabel();
		nameText = new JTextField();
		port = new JLabel();
		portText = new JTextField();
		rate = new JLabel();
		rateText = new JTextField();
		type = new JLabel();
		typeComboBox = new JComboBox();
		simulation = new JCheckBox();
		atmosphere = new JCheckBox();
		massProps = new JCheckBox();
		rates = new JCheckBox();
		velocities = new JCheckBox();
		forces = new JCheckBox();
		moments = new JCheckBox();
		position = new JCheckBox();
		propulsion = new JCheckBox();
		aerosurfaces = new JCheckBox();
		fcs = new JCheckBox();
		groundReactions = new JCheckBox();
		coefficients = new JCheckBox();
		propertiesScrollPane = new JScrollPane();
		propertiesTextArea = new JTextArea();
		properties = new JLabel();
		options = new JToolBar();
		chooseButton = new JButton();
		addButton = new JButton();
		deleteButton = new JButton();

		//======== panelOutput ========
		{
			panelOutput.setBorder(new CompoundBorder(
				new EmptyBorder(20, 20, 20, 20),
				new EmptyBorder(5, 5, 5, 5)));
			
			panelOutput.setLayout(new MigLayout(
				"align center center,gap 10 30",
				// columns
				"[grow,fill]" +
				"[grow,fill]" +
				"[grow,fill]" +
				"[grow,fill]" +
				"[grow,fill]" +
				"[grow,fill]",
				// rows
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[30]" +
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

			//---- name ----
			name.setText("Name");
			name.setHorizontalAlignment(SwingConstants.TRAILING);
			panelOutput.add(name, "cell 0 0");

			//---- nameText ----
			nameText.setPreferredSize(new Dimension(100, 23));
			panelOutput.add(nameText, "cell 1 0 2 1");

			//---- port ----
			port.setText("Port");
			port.setHorizontalAlignment(SwingConstants.TRAILING);
			panelOutput.add(port, "cell 0 1");

			//---- portText ----
			portText.setPreferredSize(new Dimension(100, 23));
			panelOutput.add(portText, "cell 1 1 2 1");

			//---- rate ----
			rate.setText("Rate");
			rate.setHorizontalAlignment(SwingConstants.TRAILING);
			panelOutput.add(rate, "cell 0 2");

			//---- rateText ----
			rateText.setPreferredSize(new Dimension(100, 23));
			panelOutput.add(rateText, "cell 1 2 2 1");

			//---- type ----
			type.setText("Type");
			type.setHorizontalAlignment(SwingConstants.TRAILING);
			panelOutput.add(type, "cell 0 3");

			//---- typeComboBox ----
			typeComboBox.setMaximumRowCount(10);
			typeComboBox.setPreferredSize(new Dimension(100, 23));
			panelOutput.add(typeComboBox, "cell 1 3 2 1");

			//---- simulation ----
			simulation.setText("Similation");
			panelOutput.add(simulation, "cell 1 4");

			//---- atmosphere ----
			atmosphere.setText("Atmosphere");
			panelOutput.add(atmosphere, "cell 2 4");

			//---- massProps ----
			massProps.setText("Massprops");
			panelOutput.add(massProps, "cell 3 4");

			//---- rates ----
			rates.setText("Rates");
			panelOutput.add(rates, "cell 4 4");

			//---- velocities ----
			velocities.setText("Velocities");
			panelOutput.add(velocities, "cell 5 4");

			//---- forces ----
			forces.setText("Forces");
			panelOutput.add(forces, "cell 1 5");

			//---- moments ----
			moments.setText("Moments");
			panelOutput.add(moments, "cell 2 5");

			//---- position ----
			position.setText("Position");
			panelOutput.add(position, "cell 3 5");

			//---- propulsion ----
			propulsion.setText("Propulsion");
			panelOutput.add(propulsion, "cell 4 5");

			//---- aerosurfaces ----
			aerosurfaces.setText("Aerosurfaces");
			panelOutput.add(aerosurfaces, "cell 1 6");

			//---- fcs ----
			fcs.setText("FCS");
			panelOutput.add(fcs, "cell 2 6");

			//---- groundReactions ----
			groundReactions.setText("Ground Reactions");
			panelOutput.add(groundReactions, "cell 3 6");

			//---- coefficients ----
			coefficients.setText("Coeffeients");
			panelOutput.add(coefficients, "cell 4 6");

			//======== propertiesScrollPane ========
			{
				propertiesScrollPane.setViewportView(propertiesTextArea);
			}
			panelOutput.add(propertiesScrollPane, "cell 1 9 5 8,growy");

			//---- properties ----
			properties.setText("Properties");
			properties.setHorizontalAlignment(SwingConstants.TRAILING);
			panelOutput.add(properties, "cell 0 9");

			//======== options ========
			{
				options.setBorder(LineBorder.createBlackLineBorder());
				options.setBackground(new Color(0x333333));

				//---- chooseButton ----
				chooseButton.setText("Choose");
				options.add(chooseButton);

				//---- addButton ----
				addButton.setText("Add");
				options.add(addButton);

				//---- deleteButton ----
				deleteButton.setText("Delete");
				options.add(deleteButton);
			}
			panelOutput.add(options, "cell 0 17 6 1,aligny baseline,growy 0");
		}
		add(panelOutput);
	}

	private JPanel panelOutput;
	private JLabel name;
	private JTextField nameText;
	private JLabel port;
	private JTextField portText;
	private JLabel rate;
	private JTextField rateText;
	private JLabel type;
	private JComboBox typeComboBox;
	private JCheckBox simulation;
	private JCheckBox atmosphere;
	private JCheckBox massProps;
	private JCheckBox rates;
	private JCheckBox velocities;
	private JCheckBox forces;
	private JCheckBox moments;
	private JCheckBox position;
	private JCheckBox propulsion;
	private JCheckBox aerosurfaces;
	private JCheckBox fcs;
	private JCheckBox groundReactions;
	private JCheckBox coefficients;
	private JScrollPane propertiesScrollPane;
	private JTextArea propertiesTextArea;
	private JLabel properties;
	private JToolBar options;
	private JButton chooseButton;
	private JButton addButton;
	private JButton deleteButton;
}
