package uta.cse.cse3310.JSBSimEdit;

import java.awt.Color;
import java.util.Optional;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
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
        // TODO
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
		textField3 = new JTextField();
		tabbedPane1 = new JTabbedPane();
		scrollPane1 = new JScrollPane();
		panel1 = new JPanel();
		scrollPane2 = new JScrollPane();
		panel4 = new JPanel();

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
			toolBar1.add(button1);

			//---- button2 ----
			button2.setSelectedIcon(null);
			button2.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.DESTINATION_RES)));
			toolBar1.add(button2);

			//---- button3 ----
			button3.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.SUMMER_RES)));
			toolBar1.add(button3);

			//---- button4 ----
			button4.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.PID_RES)));
			toolBar1.add(button4);

			//---- button5 ----
			button5.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.GAIN_RES)));
			toolBar1.add(button5);

			//---- button6 ----
			button6.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.FILTER_RES)));
			toolBar1.add(button6);

			//---- button7 ----
			button7.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.DEADBAND_RES)));
			toolBar1.add(button7);

			//---- button8 ----
			button8.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.SWITCH_RES)));
			toolBar1.add(button8);

			//---- button9 ----
			button9.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.KINEMAT_RES)));
			toolBar1.add(button9);

			//---- button10 ----
			button10.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.FUNC_RES)));
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
				"alignx center,gap 10 10",
				// columns
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
				"[]"));

			//======== panel5 ========
			{
				panel5.setBackground(new Color(0x333333));
				panel5.setBorder(new EmptyBorder(5, 5, 5, 5));
				panel5.setLayout(new MigLayout(
					"alignx center,gap 10 10",
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
				panel5.add(textField4, "cell 1 2");

				//======== panel7 ========
				{
					panel7.setBackground(new Color(0x333333));
					panel7.setBorder(new CompoundBorder(
						new TitledBorder("Clipper"),
						new EmptyBorder(5, 5, 5, 5)));
					panel7.setLayout(new MigLayout(
						"alignx center,gap 5 5",
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
						"[]" +
						"[]" +
						"[]"));

					//---- checkBox1 ----
					checkBox1.setText("clipable");
					panel7.add(checkBox1, "cell 0 2 2 1");

					//---- label8 ----
					label8.setText("Max");
					panel7.add(label8, "cell 0 4");
					panel7.add(textField6, "cell 1 4");

					//---- label9 ----
					label9.setText("Min");
					panel7.add(label9, "cell 0 5");
					panel7.add(textField7, "cell 1 5");
				}
				panel5.add(panel7, "cell 0 3 2 1");

				//---- label7 ----
				label7.setText("Bias");
				panel5.add(label7, "cell 0 5");
				panel5.add(textField5, "cell 1 5");
			}
			panel3.add(panel5, "cell 0 3");
			panel3.add(separator3, "cell 0 5");

			//======== panel6 ========
			{
				panel6.setBackground(new Color(0x333333));
				panel6.setBorder(new EmptyBorder(5, 5, 5, 5));
				panel6.setLayout(new MigLayout(
					"alignx center,gap 10 10",
					// columns
					"[fill]" +
					"[fill]",
					// rows
					"[]" +
					"[]" +
					"[]" +
					"[]" +
					"[]"));

				//---- label3 ----
				label3.setText("Label");
				panel6.add(label3, "cell 0 0");
				panel6.add(textField3, "cell 1 0");
			}
			panel3.add(panel6, "cell 0 6");
		}
		add(panel3, "east");

		//======== tabbedPane1 ========
		{
			tabbedPane1.setBorder(new MatteBorder(1, 0, 0, 0, UIManager.getColor("Button.borderColor")));

			//======== scrollPane1 ========
			{
				scrollPane1.setBorder(null);

				//======== panel1 ========
				{
					panel1.setLayout(new MigLayout(
						"align center center,gap 10 30",
						// columns
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
						"[]"));
				}
				scrollPane1.setViewportView(panel1);
			}
			tabbedPane1.addTab("channel1", scrollPane1);

			//======== scrollPane2 ========
			{
				scrollPane2.setBorder(null);

				//======== panel4 ========
				{
					panel4.setLayout(new MigLayout(
						"align center center,gap 10 30",
						// columns
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
						"[]"));
				}
				scrollPane2.setViewportView(panel4);
			}
			tabbedPane1.addTab("channel2", scrollPane2);
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
	private JTextField textField3;
	private JTabbedPane tabbedPane1;
	private JScrollPane scrollPane1;
	private JPanel panel1;
	private JScrollPane scrollPane2;
	private JPanel panel4;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
