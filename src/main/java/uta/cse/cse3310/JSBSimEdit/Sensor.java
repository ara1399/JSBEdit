package uta.cse.cse3310.JSBSimEdit;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed Nov 15 11:29:25 CST 2023
 */



/**
 * @author seans
 */
public class Sensor extends JDialog {
	public Sensor() {
		initComponents();
        setVisible(true);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Educational license - Sean McElroy (Patrick McElroy)
		dialogPane = new JPanel();
		contentPanel = new JPanel();
		nameL = new JLabel();
		nameF = new JTextField();
		descriptionL = new JLabel();
		descriptionF = new JTextField();
		inputL = new JLabel();
		inputF = new JTextField();
		lagL = new JLabel();
		lagF = new JTextField();
		noiseVariationL = new JLabel();
		noiseVariationF = new JTextField();
		noiseValueL = new JLabel();
		noiseValueF = new JTextField();
		quantizationNL = new JLabel();
		quantizationNF = new JTextField();
		quantizationBL = new JLabel();
		qunatizationBF = new JTextField();
		quantizationMinL = new JLabel();
		quantizationMinF = new JTextField();
		quantizationMaxL = new JLabel();
		quantizationMaxF = new JTextField();
		driftRateL = new JLabel();
		driftRateF = new JTextField();
		biasL = new JLabel();
		biasF = new JTextField();
		cliptoMinL = new JLabel();
		cliptoMinF = new JTextField();
		cliptoMaxL = new JLabel();
		cliptoMaxF = new JTextField();
		outputL = new JLabel();
		outputF = new JTextField();
		buttonBar = new JPanel();
		okButton = new JButton();
		cancelButton = new JButton();

		//======== this ========
		setTitle("Sensor");
    	setPreferredSize(new Dimension(600, 800));
		setMinimumSize(new Dimension(600, 800));
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setLayout(new BorderLayout());

			//======== contentPanel ========
			{
				contentPanel.setLayout(new MigLayout(
					"fill,insets dialog,hidemode 3",
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

				//---- nameL ----
				nameL.setText("Name");
				contentPanel.add(nameL, "cell 0 0,alignx right,growx 0");
				contentPanel.add(nameF, "cell 1 0 3 1");

				//---- descriptionL ----
				descriptionL.setText("Description");
				contentPanel.add(descriptionL, "cell 0 1,alignx right,growx 0");
				contentPanel.add(descriptionF, "cell 1 1 3 1");

				//---- inputL ----
				inputL.setText("Input");
				contentPanel.add(inputL, "cell 0 2,alignx right,growx 0");
				contentPanel.add(inputF, "cell 1 2 3 1");

				//---- lagL ----
				lagL.setText("Lag =");
				contentPanel.add(lagL, "cell 0 3,alignx right,growx 0");
				contentPanel.add(lagF, "cell 1 3 3 1");

				//---- noiseVariationL ----
				noiseVariationL.setText("Noise: Variation");
				contentPanel.add(noiseVariationL, "cell 0 4,alignx right,growx 0");
				contentPanel.add(noiseVariationF, "cell 1 4 3 1");

				//---- noiseValueL ----
				noiseValueL.setText("Noise: Value =");
				contentPanel.add(noiseValueL, "cell 0 5,alignx right,growx 0");
				contentPanel.add(noiseValueF, "cell 1 5 2 1");

				//---- quantizationNL ----
				quantizationNL.setText("Quantization: Name ");
				contentPanel.add(quantizationNL, "cell 0 6,alignx right,growx 0");
				contentPanel.add(quantizationNF, "cell 1 6 3 1");

				//---- quantizationBL ----
				quantizationBL.setText("Quantization: Bits =");
				contentPanel.add(quantizationBL, "cell 0 7,alignx right,growx 0");
				contentPanel.add(qunatizationBF, "cell 1 7 2 1");

				//---- quantizationMinL ----
				quantizationMinL.setText("Quantization: Min =");
				contentPanel.add(quantizationMinL, "cell 0 8,alignx right,growx 0");
				contentPanel.add(quantizationMinF, "cell 1 8 2 1");

				//---- quantizationMaxL ----
				quantizationMaxL.setText("Quantization: Max =");
				contentPanel.add(quantizationMaxL, "cell 0 9,alignx right,growx 0");
				contentPanel.add(quantizationMaxF, "cell 1 9 2 1");

				//---- driftRateL ----
				driftRateL.setText("Drift Rate =");
				contentPanel.add(driftRateL, "cell 0 10,alignx right,growx 0");
				contentPanel.add(driftRateF, "cell 1 10 2 1");

				//---- biasL ----
				biasL.setText("Bias =");
				contentPanel.add(biasL, "cell 0 11,alignx right,growx 0");
				contentPanel.add(biasF, "cell 1 11 2 1");

				//---- cliptoMinL ----
				cliptoMinL.setText("Clipto: Min =");
				contentPanel.add(cliptoMinL, "cell 0 12,alignx right,growx 0");
				contentPanel.add(cliptoMinF, "cell 1 12 2 1");

				//---- cliptoMaxL ----
				cliptoMaxL.setText("Clipto: Max =");
				contentPanel.add(cliptoMaxL, "cell 0 13,alignx right,growx 0");
				contentPanel.add(cliptoMaxF, "cell 1 13 2 1");

				//---- outputL ----
				outputL.setText("Output");
				contentPanel.add(outputL, "cell 0 14,alignx right,growx 0");
				contentPanel.add(outputF, "cell 1 14 3 1");
			}
			dialogPane.add(contentPanel, BorderLayout.CENTER);

			//======== buttonBar ========
			{
				buttonBar.setLayout(new MigLayout(
					"insets dialog,alignx center",
					// columns
					"[button,fill]" +
					"[button,fill]",
					// rows
					null));

				//---- okButton ----
				okButton.setText("OK");
				buttonBar.add(okButton, "cell 0 0");

				//---- cancelButton ----
				cancelButton.setText("Cancel");
				buttonBar.add(cancelButton, "cell 1 0");
			}
			dialogPane.add(buttonBar, BorderLayout.SOUTH);
		}
		contentPane.add(dialogPane, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Educational license - Sean McElroy (Patrick McElroy)
	private JPanel dialogPane;
	private JPanel contentPanel;
	private JLabel nameL;
	private JTextField nameF;
	private JLabel descriptionL;
	private JTextField descriptionF;
	private JLabel inputL;
	private JTextField inputF;
	private JLabel lagL;
	private JTextField lagF;
	private JLabel noiseVariationL;
	private JTextField noiseVariationF;
	private JLabel noiseValueL;
	private JTextField noiseValueF;
	private JLabel quantizationNL;
	private JTextField quantizationNF;
	private JLabel quantizationBL;
	private JTextField qunatizationBF;
	private JLabel quantizationMinL;
	private JTextField quantizationMinF;
	private JLabel quantizationMaxL;
	private JTextField quantizationMaxF;
	private JLabel driftRateL;
	private JTextField driftRateF;
	private JLabel biasL;
	private JTextField biasF;
	private JLabel cliptoMinL;
	private JTextField cliptoMinF;
	private JLabel cliptoMaxL;
	private JTextField cliptoMaxF;
	private JLabel outputL;
	private JTextField outputF;
	private JPanel buttonBar;
	private JButton okButton;
	private JButton cancelButton;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}

