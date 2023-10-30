package uta.cse.cse3310.JSBSimEdit;

import java.awt.Color;
import java.awt.Dimension;
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
			panel2.setPreferredSize(new Dimension(745, 715));
			panel2.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new
			javax . swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax
			. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java
			. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt
			. Color .red ) ,panel2. getBorder () ) ); panel2. addPropertyChangeListener( new java. beans .
			PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r" .
			equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
			panel2.setLayout(new MigLayout(
				"hidemode 3,align center center,gap 15 25",
				// columns
				"[fill]" +
				"[71,fill]" +
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
			label6.setHorizontalAlignment(SwingConstants.TRAILING);
			panel2.add(label6, "cell 1 1");
			panel2.add(textField2, "cell 2 1 3 1");

			//---- label5 ----
			label5.setText("port");
			label5.setHorizontalAlignment(SwingConstants.TRAILING);
			panel2.add(label5, "cell 1 2");
			panel2.add(textField3, "cell 2 2 3 1");

			//---- label3 ----
			label3.setText("rate");
			label3.setHorizontalAlignment(SwingConstants.TRAILING);
			panel2.add(label3, "cell 1 3");
			panel2.add(textField4, "cell 2 3 3 1");

			//---- label4 ----
			label4.setText("type");
			label4.setHorizontalAlignment(SwingConstants.TRAILING);
			panel2.add(label4, "cell 1 4");
			panel2.add(comboBox6, "cell 2 4 3 1");

			//---- checkBox1 ----
			checkBox1.setText("simulation");
			panel2.add(checkBox1, "cell 2 5");

			//---- checkBox3 ----
			checkBox3.setText("atmosphere");
			panel2.add(checkBox3, "cell 4 5");

			//---- checkBox4 ----
			checkBox4.setText("massprops");
			panel2.add(checkBox4, "cell 6 5");

			//---- checkBox5 ----
			checkBox5.setText("rates");
			panel2.add(checkBox5, "cell 8 5");

			//---- checkBox6 ----
			checkBox6.setText("velocities");
			panel2.add(checkBox6, "cell 2 6");

			//---- checkBox7 ----
			checkBox7.setText("forces");
			panel2.add(checkBox7, "cell 4 6");

			//---- checkBox8 ----
			checkBox8.setText("moments");
			panel2.add(checkBox8, "cell 6 6");

			//---- checkBox9 ----
			checkBox9.setText("position");
			panel2.add(checkBox9, "cell 8 6");

			//---- checkBox10 ----
			checkBox10.setText("propulsion");
			panel2.add(checkBox10, "cell 2 7");

			//---- checkBox11 ----
			checkBox11.setText("aerosurfaces");
			panel2.add(checkBox11, "cell 4 7");

			//---- checkBox12 ----
			checkBox12.setText("fcs");
			panel2.add(checkBox12, "cell 6 7");

			//---- checkBox13 ----
			checkBox13.setText("ground reactions");
			panel2.add(checkBox13, "cell 8 7");

			//---- checkBox14 ----
			checkBox14.setText("coefficients");
			panel2.add(checkBox14, "cell 2 8");

			//---- label7 ----
			label7.setText("properties");
			label7.setHorizontalAlignment(SwingConstants.CENTER);
			panel2.add(label7, "cell 1 10");

			//======== scrollPane1 ========
			{
				scrollPane1.setViewportView(textArea1);
			}
			panel2.add(scrollPane1, "cell 2 10 13 8,growy");

			//======== toolBar1 ========
			{
				toolBar1.setBackground(new Color(0x333333));

				//---- button3 ----
				button3.setText("Choose");
				button3.setHorizontalAlignment(SwingConstants.TRAILING);
				toolBar1.add(button3);

				//---- button2 ----
				button2.setText("Add");
				toolBar1.add(button2);

				//---- button1 ----
				button1.setText("Delete");
				button1.setHorizontalAlignment(SwingConstants.TRAILING);
				toolBar1.add(button1);
			}
			panel2.add(toolBar1, "cell 1 20 22 1,growx");
		}
		add(panel2);
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Arham Riaz Ali
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
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
