package uta.cse.cse3310.JSBSimEdit;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Tue Nov 14 18:13:43 CST 2023
 */



/**
 * @author seans
 */
public class ExternalForce extends JDialog {
	public ExternalForce() {
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
		locationL = new JLabel();
		locationF = new JTextField();
		frameL = new JLabel();
		frameBox = new JComboBox();
		functionL = new JLabel();
		scrollFunction = new JScrollPane();
		directionL = new JLabel();
		scrollDirection = new JScrollPane();
		buttonBar = new JPanel();
		okButton = new JButton();
		cancelButton = new JButton();

		//======== this ========
		setTitle("Force");
		setPreferredSize(new Dimension(1000, 400));
		setMinimumSize(new Dimension(1000, 400));
		var contentPane = getContentPane();
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
					"[]"));

				//---- nameL ----
				nameL.setText("Name");
				contentPanel.add(nameL, "cell 1 0");
				contentPanel.add(nameF, "cell 2 0 6 1");

				//---- locationL ----
				locationL.setText("Location");
				contentPanel.add(locationL, "cell 1 1");
				contentPanel.add(locationF, "cell 2 1 6 1");
				//---- frameL ----
				frameL.setText("Frame");
				contentPanel.add(frameL, "cell 1 2");
				contentPanel.add(frameBox, "cell 2 2 2 1");

				//---- functionL ----
				functionL.setText("Function(s)");
				contentPanel.add(functionL, "cell 0 4,alignx right,growx 0");
				contentPanel.add(scrollFunction, "cell 1 4 3 6,growy");

				//---- directionL ----
				directionL.setText("Direction(s)");
				contentPanel.add(directionL, "cell 4 4,alignx right,growx 0");
				contentPanel.add(scrollDirection, "cell 5 4 4 6,growy");
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
	private JLabel locationL;
	private JTextField locationF;
	private JLabel frameL;
	private JComboBox frameBox;
	private JLabel functionL;
	private JScrollPane scrollFunction;
	private JLabel directionL;
	private JScrollPane scrollDirection;
	private JPanel buttonBar;
	private JButton okButton;
	private JButton cancelButton;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
