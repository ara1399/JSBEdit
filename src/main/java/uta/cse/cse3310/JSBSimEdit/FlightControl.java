package uta.cse.cse3310.JSBSimEdit;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Dialog.ModalityType;
import java.util.Optional;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SpinnerListModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

import generated.FdmConfig;
import net.miginfocom.swing.MigLayout;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;
import uta.cse.cse3310.JSBSimEdit.utils.Constants;
import uta.cse.cse3310.JSBSimEdit.utils.LoadSave;

public class FlightControl extends JPanel implements TabComponent {
    
    FlightControl() {
        initComponents();
    }

    @Override
    public void bindUIwithXML(FdmConfig cfg) {
        generated.FlightControl fc = cfg.getFlightControl();
		fc.getChannel().forEach(channel -> {
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

    @Override
    public Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg) {
        // TODO
        return Optional.ofNullable(cfg);
    }

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Educational license - James Hofer
		toolBar1 = new JToolBar();
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();
		button6 = new JButton();
		button7 = new JButton();
		button8 = new JButton();
		button9 = new JButton();
		button10 = new JButton();
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
		button11 = new JButton();
		button12 = new JButton();
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

		//======== toolBar1 ========
		{
			toolBar1.setBackground(new Color(0x333333));

			//---- button1 ----
			button1.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.SOURCE_RES)));
			button1.setToolTipText("Source");
			toolBar1.add(button1);

			//---- button2 ----
			button2.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.DESTINATION_RES)));
			button2.setToolTipText("Destination");
			toolBar1.add(button2);

			//---- button3 ----
			button3.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.SUMMER_RES)));
			button3.setToolTipText("Summer");
			toolBar1.add(button3);

			//---- button4 ----
			button4.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.PID_RES)));
			button4.setToolTipText("PID");
			toolBar1.add(button4);

			//---- button5 ----
			button5.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.GAIN_RES)));
			button5.setToolTipText("Gain");
			toolBar1.add(button5);

			//---- button6 ----
			button6.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.FILTER_RES)));
			button6.setToolTipText("Filter");
			toolBar1.add(button6);

			//---- button7 ----
			button7.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.DEADBAND_RES)));
			button7.setToolTipText("Deadband");
			toolBar1.add(button7);

			//---- button8 ----
			button8.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.SWITCH_RES)));
			button8.setToolTipText("Switch");
			toolBar1.add(button8);

			//---- button9 ----
			button9.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.KINEMAT_RES)));
			button9.setToolTipText("Kinematics");
			toolBar1.add(button9);

			//---- button10 ----
			button10.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.FUNC_RES)));
			button10.setToolTipText("Functions");
			toolBar1.add(button10);
		}
		add(toolBar1, "north");

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

				//---- button11 ----
				button11.setText("Add");
				button11.addActionListener(e -> {
					Properties props = new Properties(SwingUtilities.getWindowAncestor(this));
					props.setModalityType(ModalityType.APPLICATION_MODAL);
					props.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					props.setVisible(true);
				});
				panel2.add(button11, "cell 0 0");

				//---- button12 ----
				button12.setText("Remove");
				panel2.add(button12, "cell 1 0");
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
	private JToolBar toolBar1;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button10;
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
	private JButton button11;
	private JButton button12;
	private JTabbedPane tabbedPane1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
