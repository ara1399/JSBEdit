package uta.cse.cse3310.JSBSimEdit;

import java.util.Optional;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import net.miginfocom.swing.*;

import generated.FdmConfig;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;

public class Output extends JPanel implements TabComponent {
    public Output() {
		initComponents();
	}

    @Override
    public void bindUIwithXML(FdmConfig cfg) {
        // TODO add delete, hi arham
    }

    @Override
    public Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg) {
        // TODO
        return Optional.ofNullable(cfg);
    }
    private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Arham Riaz Ali
		panel2 = new JPanel();
		label6 = new JLabel();
		textField2 = new JTextField();
		label5 = new JLabel();
		textField3 = new JTextField();
		label3 = new JLabel();
		textField4 = new JTextField();
		label4 = new JLabel();
		comboBox6 = new JComboBox();
		checkBox1 = new JCheckBox();
		checkBox3 = new JCheckBox();
		checkBox4 = new JCheckBox();
		checkBox5 = new JCheckBox();
		checkBox6 = new JCheckBox();
		checkBox7 = new JCheckBox();
		checkBox8 = new JCheckBox();
		checkBox9 = new JCheckBox();
		checkBox10 = new JCheckBox();
		checkBox11 = new JCheckBox();
		checkBox12 = new JCheckBox();
		checkBox13 = new JCheckBox();
		checkBox14 = new JCheckBox();
		label7 = new JLabel();
		scrollPane1 = new JScrollPane();
		textArea1 = new JTextArea();
		toolBar1 = new JToolBar();
		button3 = new JButton();
		button2 = new JButton();
		button1 = new JButton();

		//======== panel2 ========
		{
			panel2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
			border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder. CENTER
			, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dialo\u0067" ,java .awt .Font
			.BOLD ,12 ), java. awt. Color. red) ,panel2. getBorder( )) ); panel2. addPropertyChangeListener (
			new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("borde\u0072"
			.equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
			panel2.setLayout(new MigLayout(
				"hidemode 3,gap 15 25",
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
				"[]"));

			//---- label6 ----
			label6.setText("name");
			panel2.add(label6, "cell 1 1");
			panel2.add(textField2, "cell 2 1");

			//---- label5 ----
			label5.setText("port");
			panel2.add(label5, "cell 3 1");
			panel2.add(textField3, "cell 4 1");

			//---- label3 ----
			label3.setText("rate");
			panel2.add(label3, "cell 5 1");
			panel2.add(textField4, "cell 6 1");

			//---- label4 ----
			label4.setText("type");
			panel2.add(label4, "cell 7 1");
			panel2.add(comboBox6, "cell 8 1");

			//---- checkBox1 ----
			checkBox1.setText("simulation");
			panel2.add(checkBox1, "cell 2 2");

			//---- checkBox3 ----
			checkBox3.setText("atmosphere");
			panel2.add(checkBox3, "cell 4 2");

			//---- checkBox4 ----
			checkBox4.setText("massprops");
			panel2.add(checkBox4, "cell 6 2");

			//---- checkBox5 ----
			checkBox5.setText("rates");
			panel2.add(checkBox5, "cell 8 2");

			//---- checkBox6 ----
			checkBox6.setText("velocities");
			panel2.add(checkBox6, "cell 2 3");

			//---- checkBox7 ----
			checkBox7.setText("forces");
			panel2.add(checkBox7, "cell 4 3");

			//---- checkBox8 ----
			checkBox8.setText("moments");
			panel2.add(checkBox8, "cell 6 3");

			//---- checkBox9 ----
			checkBox9.setText("position");
			panel2.add(checkBox9, "cell 8 3");

			//---- checkBox10 ----
			checkBox10.setText("propulsion");
			panel2.add(checkBox10, "cell 2 4");

			//---- checkBox11 ----
			checkBox11.setText("aerosurfaces");
			panel2.add(checkBox11, "cell 4 4");

			//---- checkBox12 ----
			checkBox12.setText("fcs");
			panel2.add(checkBox12, "cell 6 4");

			//---- checkBox13 ----
			checkBox13.setText("ground reactions");
			panel2.add(checkBox13, "cell 8 4");

			//---- checkBox14 ----
			checkBox14.setText("coefficients");
			panel2.add(checkBox14, "cell 2 5");

			//---- label7 ----
			label7.setText("properties");
			panel2.add(label7, "cell 1 6");

			//======== scrollPane1 ========
			{
				scrollPane1.setViewportView(textArea1);
			}
			panel2.add(scrollPane1, "cell 2 6 7 5,growy");

			//======== toolBar1 ========
			{

				//---- button3 ----
				button3.setText("Choose");
				toolBar1.add(button3);

				//---- button2 ----
				button2.setText("Add");
				toolBar1.add(button2);

				//---- button1 ----
				button1.setText("Delete");
				toolBar1.add(button1);
			}
			panel2.add(toolBar1, "cell 1 11 10 1,alignx right,growx 0");
		}
    }
    private JPanel panel2;
	private JLabel label6;
	private JTextField textField2;
	private JLabel label5;
	private JTextField textField3;
	private JLabel label3;
	private JTextField textField4;
	private JLabel label4;
	private JComboBox comboBox6;
	private JCheckBox checkBox1;
	private JCheckBox checkBox3;
	private JCheckBox checkBox4;
	private JCheckBox checkBox5;
	private JCheckBox checkBox6;
	private JCheckBox checkBox7;
	private JCheckBox checkBox8;
	private JCheckBox checkBox9;
	private JCheckBox checkBox10;
	private JCheckBox checkBox11;
	private JCheckBox checkBox12;
	private JCheckBox checkBox13;
	private JCheckBox checkBox14;
	private JLabel label7;
	private JScrollPane scrollPane1;
	private JTextArea textArea1;
	private JToolBar toolBar1;
	private JButton button3;
	private JButton button2;
	private JButton button1;
}
