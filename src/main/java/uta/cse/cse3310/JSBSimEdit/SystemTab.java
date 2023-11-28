package uta.cse.cse3310.JSBSimEdit;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.Dialog.ModalityType;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import java.util.List;

import generated.Channel;
import generated.FdmConfig;
import generated.System;
import net.miginfocom.swing.MigLayout;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;
import uta.cse.cse3310.JSBSimEdit.utils.Constants;
import uta.cse.cse3310.JSBSimEdit.utils.LoadSave;

public class SystemTab extends JPanel implements TabComponent {

	SystemTab() {
		initComponents();
	}

	@Override
	public void bindUIwithXML(FdmConfig cfg) {
		List<System> sys = cfg.getSystem();
		if (sys != null) {
			for (System s : sys) {
				channel = new ArrayList<>();
				for (Object object : s.getPropertyOrSensorOrChannel()) {
					if (object instanceof Channel) {
						channel.add((Channel) object);
						channel.forEach(channel -> {
							JScrollPane scrollPane = new JScrollPane();
							scrollPane.setBorder(null);
							tabbedPane1.addTab(channel.getName(), scrollPane);
							JPanel panel = new JPanel();
							scrollPane.setViewportView(panel);
							panel.setLayout(new MigLayout(
									"align center center,gap 10 30",
									"[fill][fill][fill][fill][fill]",
									"[][][][][]"));
						});
					}
				}
			}
		}
	}

	@Override
	public Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg) {
		// TODO
		return Optional.ofNullable(cfg);
	}

	private void addButtonToPanel(JButton button, int x, int y) {
		JButton newButton = new JButton(button.getIcon());
		newButton.setToolTipText(button.getToolTipText());

		// Set the preferred size to the original button size
		newButton.setPreferredSize(button.getPreferredSize());

		// Add the new button to the main panel at the specified location
		add(newButton, "cell " + x + " " + y);
		revalidate();
		repaint();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Educational license - James Hofer
		typesToolBar = new JToolBar();
		sourceB = new JButton();
		destinationB = new JButton();
		summerB = new JButton();
		pid = new JButton();
		gainB = new JButton();
		filterB = new JButton();
		deadBandB = new JButton();
		switchB = new JButton();
		kinematicsB = new JButton();
		functionsB = new JButton();
		panel3 = new JPanel();
		panel5 = new JPanel();
		label1 = new JLabel();
		textField2 = new JTextField();
		label4 = new JLabel();
		label6 = new JLabel();
		label5 = new JLabel();
		textField4 = new JTextField();
		panel7 = new JPanel();
		checkBox1 = new JCheckBox();
		label8 = new JLabel();
		textField6 = new JTextField();
		label9 = new JLabel();
		textField7 = new JTextField();
		label7 = new JLabel();
		textField5 = new JTextField();
		separator3 = new JSeparator();
		panel6 = new JPanel();
		label3 = new JLabel();
		spinner1 = new JSpinner();
		textField3 = new JTextField();
		label10 = new JLabel();
		spinner2 = new JSpinner();
		textField8 = new JTextField();
		panel2 = new JPanel();
		source1 = new JButton();
		source2 = new JButton();
		tabbedPane1 = new JTabbedPane();

		//======== this ========
		setLayout(new MigLayout(
			"filly,alignx center,gap 10 30",
			// columns
			"[grow,fill]" +
			"[grow,fill]" +
			"[grow,fill]" +
			"[grow,fill]" +
			"[grow,fill]" +
			"[grow,fill]",
			// rows
			"0[]0" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//======== typesToolBar ========
		{
			typesToolBar.setBackground(new Color(0x333333));

			//---- sourceB ----
			sourceB.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.SOURCE_RES)));
			sourceB.setToolTipText("Source");
			typesToolBar.add(sourceB);

			//---- destinationB ----
			destinationB.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.DESTINATION_RES)));
			destinationB.setToolTipText("Destination");
			typesToolBar.add(destinationB);

			//---- summerB ----
			summerB.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.SUMMER_RES)));
			summerB.setToolTipText("Summer");
			typesToolBar.add(summerB);

			//---- pid ----
			pid.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.PID_RES)));
			pid.setToolTipText("PID");
			typesToolBar.add(pid);

			//---- gainB ----
			gainB.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.GAIN_RES)));
			gainB.setToolTipText("Gain");
			typesToolBar.add(gainB);

			//---- filterB ----
			filterB.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.FILTER_RES)));
			filterB.setToolTipText("Filter");
			typesToolBar.add(filterB);

			//---- deadBandB ----
			deadBandB.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.DEADBAND_RES)));
			deadBandB.setToolTipText("Deadband");
			typesToolBar.add(deadBandB);

			//---- switchB ----
			switchB.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.SWITCH_RES)));
			switchB.setToolTipText("Switch");
			typesToolBar.add(switchB);

			//---- kinematicsB ----
			kinematicsB.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.KINEMAT_RES)));
			kinematicsB.setToolTipText("Kinematics");
			typesToolBar.add(kinematicsB);

			//---- functionsB ----
			functionsB.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.FUNC_RES)));
			functionsB.setToolTipText("Functions");
			typesToolBar.add(functionsB);
		}

		for (Component component : typesToolBar.getComponents()) {
            if (component instanceof JButton) {
                JButton button = (JButton) component;

                button.setTransferHandler(new TransferHandler("icon"));

                button.addMouseListener(new MouseAdapter() {
                    public void mousePressed(MouseEvent evt) {
                        JButton newButton = new JButton(button.getIcon());
                        newButton.setToolTipText(button.getToolTipText());

                        TransferHandler th = button.getTransferHandler();
                        th.exportAsDrag(button, evt, TransferHandler.COPY);

                        Point location = evt.getPoint();
                        int x = (int) (location.getX() / getWidth() * 6);
                        int y = (int) (location.getY() / getHeight() * 6);

                        addButtonToPanel(newButton, x, y);
                    }
                });
        }
	}


		add(typesToolBar, "north");

		//======== panel3 ========
		{
			panel3.setBackground(new Color(0x333333));
			panel3.setBorder(new CompoundBorder(
				new LineBorder(UIManager.getColor("Button.borderColor")),
				new EmptyBorder(5, 5, 5, 5)));
			panel3.setLayout(new MigLayout(
				"alignx trailing,gap 10 10",
				// columns
				"[fill]",
				// rows
				"[]" +
				"[]" +
				"[]" +
				"[]"));

			//======== panel5 ========
			{
				panel5.setBackground(new Color(0x333333));
				panel5.setBorder(new EmptyBorder(5, 5, 5, 5));
				panel5.setLayout(new MigLayout(
					"alignx trailing,gap 10 5",
					// columns
					"[fill]" +
					"[fill]",
					// rows
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]"));

				//---- label1 ----
				label1.setText("Name");
				panel5.add(label1, "cell 0 0");

				//---- textField2 ----
				textField2.setBorder(null);
				textField2.setPreferredSize(new Dimension(100, 17));
				panel5.add(textField2, "cell 1 0");

				//---- label4 ----
				label4.setText("Type");
				panel5.add(label4, "cell 0 1");

				//---- label6 ----
				label6.setText("SUMMER");
				label6.setEnabled(false);
				panel5.add(label6, "cell 1 1");

				//---- label5 ----
				label5.setText("Order");
				panel5.add(label5, "cell 0 2");

				//---- textField4 ----
				textField4.setBorder(null);
				textField4.setPreferredSize(new Dimension(100, 17));
				panel5.add(textField4, "cell 1 2");

				//======== panel7 ========
				{
					panel7.setBackground(new Color(0x333333));
					panel7.setBorder(new CompoundBorder(
						new TitledBorder(""),
						new EmptyBorder(0, 5, 0, 5)));
					panel7.setLayout(new MigLayout(
						"alignx center,gap 5 5",
						// columns
						"[fill]" +
						"[fill]",
						// rows
						"[]" +
						"[]" +
						"[]"));

					//---- checkBox1 ----
					checkBox1.setText("Clippable?");
					panel7.add(checkBox1, "cell 0 0 2 1");

					//---- label8 ----
					label8.setText("Max");
					panel7.add(label8, "cell 0 1");

					//---- textField6 ----
					textField6.setBorder(null);
					panel7.add(textField6, "cell 1 1");

					//---- label9 ----
					label9.setText("Min");
					panel7.add(label9, "cell 0 2");

					//---- textField7 ----
					textField7.setBorder(null);
					panel7.add(textField7, "cell 1 2");
				}
				panel5.add(panel7, "cell 0 4 2 1");

				//---- label7 ----
				label7.setText("Bias");
				panel5.add(label7, "cell 0 6");

				//---- textField5 ----
				textField5.setBorder(null);
				textField5.setPreferredSize(new Dimension(100, 17));
				panel5.add(textField5, "cell 1 6");
			}
			panel3.add(panel5, "cell 0 0");
			panel3.add(separator3, "cell 0 1");

			//======== panel6 ========
			{
				panel6.setBackground(new Color(0x333333));
				panel6.setBorder(new EmptyBorder(5, 5, 5, 5));
				panel6.setLayout(new MigLayout(
					"alignx trailing,gap 10 5",
					// columns
					"[fill]" +
					"[fill]",
					// rows
					"[]" +
					"[]" +
					"[]" +
					"[]"));

				//---- label3 ----
				label3.setText("Input1");
				panel6.add(label3, "cell 0 0");

				//---- spinner1 ----
				spinner1.setModel(new SpinnerListModel(new String[] {"+", "-"}));
				spinner1.setPreferredSize(new Dimension(40, 20));
				spinner1.setMaximumSize(new Dimension(40, 20));
				spinner1.setBorder(null);
				panel6.add(spinner1, "cell 0 1");

				//---- textField3 ----
				textField3.setBorder(null);
				textField3.setPreferredSize(new Dimension(100, 20));
				panel6.add(textField3, "cell 1 1");

				//---- label10 ----
				label10.setText("Input2");
				panel6.add(label10, "cell 0 2");

				//---- spinner2 ----
				spinner2.setModel(new SpinnerListModel(new String[] {"+", "-"}));
				spinner2.setPreferredSize(new Dimension(40, 20));
				spinner2.setMaximumSize(new Dimension(40, 20));
				spinner2.setBorder(null);
				panel6.add(spinner2, "cell 0 3");

				//---- textField8 ----
				textField8.setBorder(null);
				textField8.setPreferredSize(new Dimension(100, 20));
				panel6.add(textField8, "cell 1 3");
			}
			panel3.add(panel6, "cell 0 2");

			//======== panel2 ========
			{
				panel2.setBackground(new Color(0x333333));
				panel2.setLayout(new MigLayout(
					"align center center,gap 10 30",
					// columns
					"[fill]" +
					"[fill]",
					// rows
					"[]"));

				//---- source1 ----
				source1.setText("Add");
				source1.addActionListener(e -> {
					Properties props = new Properties(SwingUtilities.getWindowAncestor(this));
					props.setModalityType(ModalityType.APPLICATION_MODAL);
					props.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					props.setVisible(true);
				});
				panel2.add(source1, "cell 0 0");

				//---- source2 ----
				source2.setText("Remove");
				panel2.add(source2, "cell 1 0");
			}
			panel3.add(panel2, "cell 0 3");
		}
		add(panel3, "east");

		//======== tabbedPane1 ========
		{
			tabbedPane1.setBorder(new MatteBorder(1, 0, 0, 0, UIManager.getColor("Button.borderColor")));
		}
		add(tabbedPane1, "cell 0 0 6 6,aligny top,growy 0");
		
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Educational license - James Hofer
	private JToolBar typesToolBar;
	private JButton sourceB;
	private JButton destinationB;
	private JButton summerB;
	private JButton pid;
	private JButton gainB;
	private JButton filterB;
	private JButton deadBandB;
	private JButton switchB;
	private JButton kinematicsB;
	private JButton functionsB;
	private JPanel panel3;
	private JPanel panel5;
	private JLabel label1;
	private JTextField textField2;
	private JLabel label4;
	private JLabel label6;
	private JLabel label5;
	private JTextField textField4;
	private JPanel panel7;
	private JCheckBox checkBox1;
	private JLabel label8;
	private JTextField textField6;
	private JLabel label9;
	private JTextField textField7;
	private JLabel label7;
	private JTextField textField5;
	private JSeparator separator3;
	private JPanel panel6;
	private JLabel label3;
	private JSpinner spinner1;
	private JTextField textField3;
	private JLabel label10;
	private JSpinner spinner2;
	private JTextField textField8;
	private JPanel panel2;
	private JButton source1;
	private JButton source2;
	private JTabbedPane tabbedPane1;
	private ArrayList<Channel> channel;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
