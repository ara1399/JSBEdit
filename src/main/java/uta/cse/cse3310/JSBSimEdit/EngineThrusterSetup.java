package uta.cse.cse3310.JSBSimEdit;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class EngineThrusterSetup extends JDialog { // should be jframe if its a window
	EngineThrusterSetup() {
		engineThrusterComponents();
		setSomeText();
		setVisible(true);
	}

	public EngineThrusterSetup(EngineThrusterSetup other) { // filling all fields that are known for detail
		engineThrusterComponents();
		setDetails(other);
		setVisible(true);
	}

	public EngineThrusterSetup(String engineName, String thrusterName,
			String engineLocationUnit, String thrusterLocationUnit,
			String engineOrientUnit, String thrusterOrientUnit,
			Double engineX, Double engineY, Double engineZ,
			Double engineRoll, Double enginePitch, Double engineYaw,
			Double thrusterX, Double thrusterY, Double thrusterZ,
			Double thrusterRoll, Double thrusterPitch, Double thrusterYaw) {
		this.engName = engineName;
		this.thrusName = thrusterName;
		this.engineLocUnit = engineLocationUnit;
		this.thrusterLocUnit = thrusterLocationUnit;
		this.engineOrientUnit = engineOrientUnit;
		this.thrusterOrientUnit = thrusterOrientUnit;

		this.engineXLoc = engineX;
		this.engineYLoc = engineY;
		this.engineZLoc = engineZ;

		this.engineRoll = engineRoll;
		this.enginePitch = enginePitch;
		this.engineYaw = engineYaw;

		this.thrusterXLoc = thrusterX;
		this.thrusterYLoc = thrusterY;
		this.thrusterZLoc = thrusterZ;

		this.thrusterRoll = thrusterRoll;
		this.thrusterPitch = thrusterPitch;
		this.thrusterYaw = thrusterYaw;

		if (engineRoll != null)
			this.engineRoll = (double) engineRoll;
		else
			this.engineRoll = 0.0;
		if (enginePitch != null)
			this.enginePitch = (double) enginePitch;
		else
			this.enginePitch = 0.0;
		if (engineYaw != null)
			this.engineYaw = (double) engineYaw;
		else
			this.engineYaw = 0.0;
		if (thrusterRoll != null)
			this.thrusterRoll = (double) thrusterRoll;
		else
			this.thrusterRoll = 0.0;
		if (thrusterPitch != null)
			this.thrusterPitch = (double) thrusterPitch;
		else
			this.thrusterPitch = 0.0;
		if (thrusterYaw != null)
			this.thrusterYaw = (double) thrusterYaw;
		else
			this.thrusterYaw = 0.0;
	}

	public EngineThrusterSetup(String engineName,
			String engineLocationUnit,
			String engineOrientUnit,
			Double engineX, Double engineY, Double engineZ,
			Double engineRoll, Double enginePitch, Double engineYaw) {
		this.engName = engineName;
		this.engineLocUnit = engineLocationUnit;
		this.engineOrientUnit = engineOrientUnit;

		this.engineXLoc = engineX;
		this.engineYLoc = engineY;
		this.engineZLoc = engineZ;

		this.engineRoll = engineRoll;
		this.enginePitch = enginePitch;
		this.engineYaw = engineYaw;

		if (engineRoll != null)
			this.engineRoll = (double) engineRoll;
		else
			this.engineRoll = 0.0;
		if (enginePitch != null)
			this.enginePitch = (double) enginePitch;
		else
			this.enginePitch = 0.0;
		if (engineYaw != null)
			this.engineYaw = (double) engineYaw;
		else
			this.engineYaw = 0.0;
	}

	public EngineThrusterSetup(
			Double thrusterX, Double thrusterY, Double thrusterZ,
			Double thrusterRoll, Double thrusterPitch, Double thrusterYaw,
			String thrusterName,
			String thrusterLocationUnit,
			String thrusterOrientUnit) {
		this.thrusName = thrusterName;
		this.thrusterLocUnit = thrusterLocationUnit;
		this.thrusterOrientUnit = thrusterOrientUnit;

		this.thrusterXLoc = thrusterX;
		this.thrusterYLoc = thrusterY;
		this.thrusterZLoc = thrusterZ;

		this.thrusterRoll = thrusterRoll;
		this.thrusterPitch = thrusterPitch;
		this.thrusterYaw = thrusterYaw;

		if (thrusterRoll != null)
			this.thrusterRoll = (double) thrusterRoll;
		else
			this.thrusterRoll = 0.0;
		if (thrusterPitch != null)
			this.thrusterPitch = (double) thrusterPitch;
		else
			this.thrusterPitch = 0.0;
		if (thrusterYaw != null)
			this.thrusterYaw = (double) thrusterYaw;
		else
			this.thrusterYaw = 0.0;
	}

	private void cancelBPressed(ActionEvent e) { // just get rid of the object if the user cancels
		this.dispose(); // the object's getters and values will just return null
	}

	private void okBPressed(ActionEvent e) { //save all the information into variables so the toString
         //can display them in the Jlist on GroundReactions tab
        engName = engineNameText.getText().trim();
		thrusName = thrusterNameText.getText().trim();
        engineLocUnit = eUnitComboBox.getSelectedItem().toString();
        thrusterLocUnit = tUnitComboBox.getSelectedItem().toString();
        engineOrientUnit = eTUnitComboBox.getSelectedItem().toString();
        thrusterOrientUnit = tTUnitComboBox.getSelectedItem().toString();
        
        engineXLoc = Double.parseDouble(eXLocText.getText().trim());
        engineYLoc = Double.parseDouble(eYLocText.getText().trim());
        engineZLoc = Double.parseDouble(eZLocText.getText().trim());

        engineRoll = Double.parseDouble(eRollText.getText().trim());
        enginePitch = Double.parseDouble(ePitchText.getText().trim());
		engineYaw = Double.parseDouble(eYawText.getText().trim());

		thrusterXLoc = Double.parseDouble(tXLocText.getText().trim());
        thrusterYLoc = Double.parseDouble(tYLocText.getText().trim());
        thrusterZLoc = Double.parseDouble(tZLocText.getText().trim());

		thrusterRoll = Double.parseDouble(tRollText.getText().trim());
        thrusterPitch = Double.parseDouble(tPitchText.getText().trim());
		thrusterYaw = Double.parseDouble(tYawText.getText().trim());
        
        this.dispose();
    }

	public String getEngineNameETS() {
		return engName;
	}

	public String getThrusterNameETS() {
		return thrusName;
	}

	public String getEngineLocationUnitETS() {
		return engineLocUnit;
	}

	public String getThrusterLocationUnitETS() {
		return thrusterLocUnit;
	}

	public String getEngineOrientUnitETS() {
		return engineOrientUnit;
	}

	public String getThrusterOrientUnitETS() {
		return thrusterOrientUnit;
	}

	public Double getEngineXLocETS() {
		return engineXLoc;
	}

	public Double getEngineYLocETS() {
		return engineYLoc;
	}

	public Double getEngineZLocETS() {
		return engineZLoc;
	}

	public Double getEngineRollETS() {
		return engineRoll;
	}

	public Double getEnginePitchETS() {
		return enginePitch;
	}

	public Double getEngineYawETS() {
		return engineYaw;
	}

	public Double getThrusterXLocETS() {
		return thrusterXLoc;
	}

	public Double getThrusterYLocETS() {
		return thrusterYLoc;
	}

	public Double getThrusterZLocETS() {
		return thrusterZLoc;
	}

	public Double getThrusterRollETS() {
		return thrusterRoll;
	}

	public Double getThrusterPitchETS() {
		return thrusterPitch;
	}

	public Double getThrusterYawETS() {
		return thrusterYaw;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(engName + " at point [" + engineXLoc + ", " + engineYLoc + ", " + engineZLoc + "] in "
				+ engineLocUnit + " (in " + engineRoll + " engineRoll)"
				+ " (in " + enginePitch + " enginePitch)"
				+ " (in " + engineYaw + " engineYaw)"
				+ thrusName + " at point [" + thrusterXLoc + ", " + thrusterYLoc + ", " + thrusterZLoc + "] in "
				+ thrusterLocUnit + " (in " + thrusterRoll + " thrusterRoll)"
				+ " (in " + thrusterPitch + " thrusterPitch)"
				+ " (in " + thrusterYaw + " thrusterYaw)");
		return sb.toString();
	}

	private void setDetails(EngineThrusterSetup other) {
		engineNameText.setText(other.getEngineNameETS());
		thrusterNameText.setText(other.getThrusterNameETS());

		eUnitComboBox.setSelectedItem(other.getEngineLocationUnitETS());
		tUnitComboBox.setSelectedItem(other.getThrusterLocationUnitETS());
		eTUnitComboBox.setSelectedItem(other.getEngineOrientUnitETS());
		tTUnitComboBox.setSelectedItem(other.getThrusterOrientUnitETS());

		eXLocText.setText(Double.toString(other.getEngineXLocETS()));
		eYLocText.setText(Double.toString(other.getEngineYLocETS()));
		eZLocText.setText(Double.toString(other.getEngineZLocETS()));

		eRollText.setText(Double.toString(other.getEngineRollETS()));
		ePitchText.setText(Double.toString(other.getEnginePitchETS()));
		eYawText.setText(Double.toString(other.getEngineYawETS()));

		tXLocText.setText(Double.toString(other.getThrusterXLocETS()));
		tYLocText.setText(Double.toString(other.getThrusterYLocETS()));
		tZLocText.setText(Double.toString(other.getThrusterZLocETS()));

		tRollText.setText(Double.toString(other.getThrusterRollETS()));
		tPitchText.setText(Double.toString(other.getThrusterPitchETS()));
		tYawText.setText(Double.toString(other.getThrusterYawETS()));
	}

	private void setSomeText() {
		engineNameText.setText("ENGINE INTAKE");
		eXLocText.setText("0.0");
		eYLocText.setText("0.0");
		eZLocText.setText("0.0");
		eRollText.setText("0.0");
		ePitchText.setText("0.0");
		eYawText.setText("0.0");

		thrusterNameText.setText("THRUSTER INTAKE");
		tXLocText.setText("0.0");
		tYLocText.setText("0.0");
		tZLocText.setText("0.0");
		tRollText.setText("0.0");
		tPitchText.setText("0.0");
		tYawText.setText("0.0");
	}

	private void engineThrusterComponents() {

		dialogPane = new JPanel();
		engineThruster = new JPanel();
		enginePanel = new JPanel();
		engineNamePanel = new JPanel();
		engineName = new JLabel();
		engineNameText = new JTextField();
		eLocationPanel = new JPanel();
		eXLoc = new JLabel();
		eXLocText = new JTextField();
		eYLoc = new JLabel();
		eYLocText = new JTextField();
		eZLoc = new JLabel();
		eZLocText = new JTextField();
		eUnitComboBox = new JComboBox<>();
		eOrientPanel = new JPanel();
		eRoll = new JLabel();
		eRollText = new JTextField();
		ePitch = new JLabel();
		ePitchText = new JTextField();
		eYaw = new JLabel();
		eYawText = new JTextField();
		eTUnitComboBox = new JComboBox<>();
		feedPanel = new JPanel();
		feedText = new JTextField();
		thrusterPanel = new JPanel();
		thrusterNamePanel = new JPanel();
		thrusterName = new JLabel();
		thrusterNameText = new JTextField();
		tLocationPanel = new JPanel();
		tXLoc = new JLabel();
		tXLocText = new JTextField();
		tYLoc = new JLabel();
		tYLocText = new JTextField();
		tZLoc = new JLabel();
		tZLocText = new JTextField();
		tUnitComboBox = new JComboBox<>();
		tOrientPanel = new JPanel();
		tRoll = new JLabel();
		tRollText = new JTextField();
		tPitch = new JLabel();
		tPitchText = new JTextField();
		tYaw = new JLabel();
		tYawText = new JTextField();
		tTUnitComboBox = new JComboBox<>();
		optionsPanel = new JPanel();
		okButton = new JButton();
		cancelButton = new JButton();

		// ======== this ========
		setTitle("engine/Thruster Setup");
		setPreferredSize(new Dimension(1000, 600));
		setMinimumSize(new Dimension(1000, 600));
		var contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		// ======== dialogPane ========
		{
			dialogPane.setLayout(new BorderLayout());
			{
				{
					engineThruster.setLayout(new MigLayout(
							"align center center,gap 10 30",
							// columns
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
									"[]" +
									"[]" +
									"[]" +
									"[]" +
									"[]"));

					// ======== enginePanel ========
					{
						enginePanel.setLayout(new MigLayout(
								"fill,hidemode 3",
								// columns
								"[fill]" +
										"[fill]",
								// rows
								"[]" +
										"[]" +
										"[]" +
										"[]"));

						// ======== engineNamePanel ========
						{
							engineNamePanel.setLayout(new MigLayout(
									"fillx,hidemode 3",
									// columns
									"[fill]" +
											"[fill]" +
											"[fill]" +
											"[fill]" +
											"[fill]",
									// rows
									"[]" +
											"[]"));

							// ---- engineName ----
							engineName.setText("Engine Name:");
							engineNamePanel.add(engineName, "cell 0 0");
							engineNamePanel.add(engineNameText, "cell 1 0 4 1");
						}
						enginePanel.add(engineNamePanel, "cell 0 0 2 1");

						// ======== eLocationPanel ========
						{
							eLocationPanel.setLayout(new MigLayout(
									"fillx,hidemode 3",
									// columns
									"[fill]" +
											"[fill]" +
											"[fill]" +
											"[fill]" +
											"[fill]" +
											"[fill]" +
											"[fill]",
									// rows
									"[]"));

							// ---- eXLoc ----
							eXLoc.setText("X:");
							eLocationPanel.add(eXLoc, "cell 0 0");
							eLocationPanel.add(eXLocText, "cell 1 0");

							// ---- eYLoc ----
							eYLoc.setText("Y:");
							eLocationPanel.add(eYLoc, "cell 2 0");
							eLocationPanel.add(eYLocText, "cell 3 0");

							// ---- eZLoc ----
							eZLoc.setText("Z:");
							eLocationPanel.add(eZLoc, "cell 4 0");
							eLocationPanel.add(eZLocText, "cell 5 0");

							eUnitComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
								"M",
								"FT",
								"IN"
						}));
							eLocationPanel.add(eUnitComboBox, "cell 6 0");
						}
						enginePanel.add(eLocationPanel, "cell 0 1 2 2");

						// ======== eOrientPanel ========
						{
							eOrientPanel.setLayout(new MigLayout(
									"fillx,hidemode 3",
									// columns
									"[fill]" +
											"[fill]" +
											"[fill]" +
											"[fill]" +
											"[fill]" +
											"[fill]" +
											"[fill]",
									// rows
									"[]"));

							// ---- eRoll ----
							eRoll.setText("Roll:");
							eOrientPanel.add(eRoll, "cell 0 0");
							eOrientPanel.add(eRollText, "cell 1 0");

							// ---- ePitch ----
							ePitch.setText("Pitch:");
							eOrientPanel.add(ePitch, "cell 2 0");
							eOrientPanel.add(ePitchText, "cell 3 0");

							// ---- eYaw ----
							eYaw.setText("Yaw:");
							eOrientPanel.add(eYaw, "cell 4 0");
							eOrientPanel.add(eYawText, "cell 5 0");

							eTUnitComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
								"DEG",
								"RAD"
							}));
							eOrientPanel.add(eTUnitComboBox, "cell 6 0");
						}
						enginePanel.add(eOrientPanel, "cell 0 3 2 1");
					}
					engineThruster.add(enginePanel, "cell 0 0 9 4");

					// ======== feedPanel ========
					{
						feedPanel.setLayout(new MigLayout(
								"fillx,hidemode 3",
								// columns
								"[fill]",
								// rows
								"[]" +
										"[]"));
						feedPanel.add(feedText, "cell 0 0");
					}
					engineThruster.add(feedPanel, "cell 0 4 9 1");

					// ======== thrusterPanel ========
					{
						thrusterPanel.setLayout(new MigLayout(
								"fill,hidemode 3",
								// columns
								"[fill]" +
										"[fill]",
								// rows
								"[]" +
										"[]" +
										"[]" +
										"[]"));

						// ======== thrusterNamePanel ========
						{
							thrusterNamePanel.setLayout(new MigLayout(
									"fillx,hidemode 3",
									// columns
									"[fill]" +
											"[fill]" +
											"[fill]" +
											"[fill]" +
											"[fill]",
									// rows
									"[]" +
											"[]"));

							// ---- thrusterName ----
							thrusterName.setText("Thruster Name:");
							thrusterNamePanel.add(thrusterName, "cell 0 0");
							thrusterNamePanel.add(thrusterNameText, "cell 1 0 4 1");
						}
						thrusterPanel.add(thrusterNamePanel, "cell 0 0 2 1");

						// ======== tLocationPanel ========
						{
							tLocationPanel.setLayout(new MigLayout(
									"fillx,hidemode 3",
									// columns
									"[fill]" +
											"[fill]" +
											"[fill]" +
											"[fill]" +
											"[fill]" +
											"[fill]" +
											"[fill]",
									// rows
									"[]"));

							// ---- tXLoc ----
							tXLoc.setText("X:");
							tLocationPanel.add(tXLoc, "cell 0 0");
							tLocationPanel.add(tXLocText, "cell 1 0");

							// ---- tYLoc ----
							tYLoc.setText("Y:");
							tLocationPanel.add(tYLoc, "cell 2 0");
							tLocationPanel.add(tYLocText, "cell 3 0");

							// ---- tZLoc ----
							tZLoc.setText("Z:");
							tLocationPanel.add(tZLoc, "cell 4 0");
							tLocationPanel.add(tZLocText, "cell 5 0");

							tUnitComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
								"M",
								"FT",
								"IN"
							}));
							tLocationPanel.add(tUnitComboBox, "cell 6 0");
						}
						thrusterPanel.add(tLocationPanel, "cell 0 1 2 2");

						// ======== tOrientPanel ========
						{
							tOrientPanel.setLayout(new MigLayout(
									"fillx,hidemode 3",
									// columns
									"[fill]" +
											"[fill]" +
											"[fill]" +
											"[fill]" +
											"[fill]" +
											"[fill]" +
											"[fill]",
									// rows
									"[]"));

							// ---- tRoll ----
							tRoll.setText("Roll:");
							tOrientPanel.add(tRoll, "cell 0 0");
							tOrientPanel.add(tRollText, "cell 1 0");

							// ---- tPitch ----
							tPitch.setText("Pitch:");
							tOrientPanel.add(tPitch, "cell 2 0");
							tOrientPanel.add(tPitchText, "cell 3 0");

							// ---- tYaw ----
							tYaw.setText("Yaw:");
							tOrientPanel.add(tYaw, "cell 4 0");
							tOrientPanel.add(tYawText, "cell 5 0");

							tTUnitComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
								"DEG",
								"RAD"
							}));
							tOrientPanel.add(tTUnitComboBox, "cell 6 0");
						}
						thrusterPanel.add(tOrientPanel, "cell 0 3 2 1");
					}
					engineThruster.add(thrusterPanel, "cell 0 5 9 5");

					// ======== optionsPanel ========
					{
						optionsPanel.setLayout(new MigLayout(
								"fillx,hidemode 3",
								// columns
								"[fill]" +
										"[fill]",
								// rows
								"[]" +
										"[]"));

						// ---- okButton ----
						okButton.setText("Ok");
						okButton.addActionListener(e -> okBPressed(e));
						optionsPanel.add(okButton, "cell 0 0");

						// ---- cancelButton ----
						cancelButton.setText("Cancel");
						cancelButton.addActionListener(e -> cancelBPressed(e));
						optionsPanel.add(cancelButton, "cell 1 0");
					}
					engineThruster.add(optionsPanel, "cell 0 10 10 1");
				}
			}

			dialogPane.add(engineThruster, BorderLayout.SOUTH);
			// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
		}
		contentPane.add(dialogPane, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(getOwner());
	}

	private JPanel dialogPane;
	private JPanel engineThruster;
	private JPanel enginePanel;
	private JPanel engineNamePanel;
	private JLabel engineName;
	private JTextField engineNameText;
	private JPanel eLocationPanel;
	private JLabel eXLoc;
	private JTextField eXLocText;
	private JLabel eYLoc;
	private JTextField eYLocText;
	private JLabel eZLoc;
	private JTextField eZLocText;
	private JComboBox<String> eUnitComboBox;
	private JPanel eOrientPanel;
	private JLabel eRoll;
	private JTextField eRollText;
	private JLabel ePitch;
	private JTextField ePitchText;
	private JLabel eYaw;
	private JTextField eYawText;
	private JComboBox<String> eTUnitComboBox;
	private JPanel feedPanel;
	private JTextField feedText;
	private JPanel thrusterPanel;
	private JPanel thrusterNamePanel;
	private JLabel thrusterName;
	private JTextField thrusterNameText;
	private JPanel tLocationPanel;
	private JLabel tXLoc;
	private JTextField tXLocText;
	private JLabel tYLoc;
	private JTextField tYLocText;
	private JLabel tZLoc;
	private JTextField tZLocText;
	private JComboBox<String> tUnitComboBox;
	private JPanel tOrientPanel;
	private JLabel tRoll;
	private JTextField tRollText;
	private JLabel tPitch;
	private JTextField tPitchText;
	private JLabel tYaw;
	private JTextField tYawText;
	private JComboBox<String> tTUnitComboBox;
	private JPanel optionsPanel;
	private JButton okButton;
	private JButton cancelButton;

	private Double engineXLoc, engineYLoc, engineZLoc,
			engineRoll, enginePitch, engineYaw,
			thrusterXLoc, thrusterYLoc, thrusterZLoc,
			thrusterRoll, thrusterPitch, thrusterYaw;
	private String engName, thrusName, engineLocUnit, thrusterLocUnit,
			engineOrientUnit, thrusterOrientUnit;
}
