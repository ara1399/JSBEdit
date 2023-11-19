package uta.cse.cse3310.JSBSimEdit;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class EngineThrusterSetup extends JDialog { // should be jframe if its a window
	EngineThrusterSetup() {
		engineThrusterComponents();
		setVisible(true);
	}

	private void engineThrusterComponents() {

		dialogPane = new JPanel();
		engineThruster = new JPanel();
		EnginePanel = new JPanel();
		EngineNamePanel = new JPanel();
		EngineName = new JLabel();
		EngineNameText = new JTextField();
		ELocationPanel = new JPanel();
		EXLoc = new JLabel();
		EXLocText = new JTextField();
		EYLoc = new JLabel();
		EYLocText = new JTextField();
		EZLoc = new JLabel();
		EZLocText = new JTextField();
		EUnitComboBox = new JComboBox<>();
		EOrientPanel = new JPanel();
		ERoll = new JLabel();
		ERollText = new JTextField();
		EPitch = new JLabel();
		EPitchText = new JTextField();
		EYaw = new JLabel();
		EYawText = new JTextField();
		ETUnitComboBox = new JComboBox<>();
		FeedPanel = new JPanel();
		textField9 = new JTextField();
		ThrusterPanel = new JPanel();
		ThrusterNamePanel = new JPanel();
		ThrusterName = new JLabel();
		ThrusterNameText = new JTextField();
		TLocationPanel = new JPanel();
		TXLoc = new JLabel();
		TXLocText = new JTextField();
		TYLoc = new JLabel();
		TYLocText = new JTextField();
		TZLoc = new JLabel();
		TZLocText = new JTextField();
		TUnitComboBox = new JComboBox<>();
		TOrientPanel = new JPanel();
		TRoll = new JLabel();
		TRollText = new JTextField();
		TPitch = new JLabel();
		TPitchText = new JTextField();
		TYaw = new JLabel();
		TYawText = new JTextField();
		TTUnitComboBox = new JComboBox<>();
		OptionsPanel = new JPanel();
		OkButton = new JButton();
		CancelButton = new JButton();

		// ======== this ========
		setTitle("Engine/Thruster Setup");
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

					// ======== EnginePanel ========
					{
						EnginePanel.setLayout(new MigLayout(
								"fill,hidemode 3",
								// columns
								"[fill]" +
										"[fill]",
								// rows
								"[]" +
										"[]" +
										"[]" +
										"[]"));

						// ======== EngineNamePanel ========
						{
							EngineNamePanel.setLayout(new MigLayout(
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

							// ---- EngineName ----
							EngineName.setText("Engine Name:");
							EngineNamePanel.add(EngineName, "cell 0 0");
							EngineNamePanel.add(EngineNameText, "cell 1 0 4 1");
						}
						EnginePanel.add(EngineNamePanel, "cell 0 0 2 1");

						// ======== ELocationPanel ========
						{
							ELocationPanel.setLayout(new MigLayout(
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

							// ---- EXLoc ----
							EXLoc.setText("X:");
							ELocationPanel.add(EXLoc, "cell 0 0");
							ELocationPanel.add(EXLocText, "cell 1 0");

							// ---- EYLoc ----
							EYLoc.setText("Y:");
							ELocationPanel.add(EYLoc, "cell 2 0");
							ELocationPanel.add(EYLocText, "cell 3 0");

							// ---- EZLoc ----
							EZLoc.setText("Z:");
							ELocationPanel.add(EZLoc, "cell 4 0");
							ELocationPanel.add(EZLocText, "cell 5 0");
							ELocationPanel.add(EUnitComboBox, "cell 6 0");
						}
						EnginePanel.add(ELocationPanel, "cell 0 1 2 2");

						// ======== EOrientPanel ========
						{
							EOrientPanel.setLayout(new MigLayout(
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

							// ---- ERoll ----
							ERoll.setText("Roll:");
							EOrientPanel.add(ERoll, "cell 0 0");
							EOrientPanel.add(ERollText, "cell 1 0");

							// ---- EPitch ----
							EPitch.setText("Pitch:");
							EOrientPanel.add(EPitch, "cell 2 0");
							EOrientPanel.add(EPitchText, "cell 3 0");

							// ---- EYaw ----
							EYaw.setText("Yaw:");
							EOrientPanel.add(EYaw, "cell 4 0");
							EOrientPanel.add(EYawText, "cell 5 0");
							EOrientPanel.add(ETUnitComboBox, "cell 6 0");
						}
						EnginePanel.add(EOrientPanel, "cell 0 3 2 1");
					}
					engineThruster.add(EnginePanel, "cell 0 0 9 4");

					// ======== FeedPanel ========
					{
						FeedPanel.setLayout(new MigLayout(
								"fillx,hidemode 3",
								// columns
								"[fill]",
								// rows
								"[]" +
										"[]"));
						FeedPanel.add(textField9, "cell 0 0");
					}
					engineThruster.add(FeedPanel, "cell 0 4 9 1");

					// ======== ThrusterPanel ========
					{
						ThrusterPanel.setLayout(new MigLayout(
								"fill,hidemode 3",
								// columns
								"[fill]" +
										"[fill]",
								// rows
								"[]" +
										"[]" +
										"[]" +
										"[]"));

						// ======== ThrusterNamePanel ========
						{
							ThrusterNamePanel.setLayout(new MigLayout(
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

							// ---- ThrusterName ----
							ThrusterName.setText("Thruster Name:");
							ThrusterNamePanel.add(ThrusterName, "cell 0 0");
							ThrusterNamePanel.add(ThrusterNameText, "cell 1 0 4 1");
						}
						ThrusterPanel.add(ThrusterNamePanel, "cell 0 0 2 1");

						// ======== TLocationPanel ========
						{
							TLocationPanel.setLayout(new MigLayout(
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

							// ---- TXLoc ----
							TXLoc.setText("X:");
							TLocationPanel.add(TXLoc, "cell 0 0");
							TLocationPanel.add(TXLocText, "cell 1 0");

							// ---- TYLoc ----
							TYLoc.setText("Y:");
							TLocationPanel.add(TYLoc, "cell 2 0");
							TLocationPanel.add(TYLocText, "cell 3 0");

							// ---- TZLoc ----
							TZLoc.setText("Z:");
							TLocationPanel.add(TZLoc, "cell 4 0");
							TLocationPanel.add(TZLocText, "cell 5 0");
							TLocationPanel.add(TUnitComboBox, "cell 6 0");
						}
						ThrusterPanel.add(TLocationPanel, "cell 0 1 2 2");

						// ======== TOrientPanel ========
						{
							TOrientPanel.setLayout(new MigLayout(
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

							// ---- TRoll ----
							TRoll.setText("Roll:");
							TOrientPanel.add(TRoll, "cell 0 0");
							TOrientPanel.add(TRollText, "cell 1 0");

							// ---- TPitch ----
							TPitch.setText("Pitch:");
							TOrientPanel.add(TPitch, "cell 2 0");
							TOrientPanel.add(TPitchText, "cell 3 0");

							// ---- TYaw ----
							TYaw.setText("Yaw:");
							TOrientPanel.add(TYaw, "cell 4 0");
							TOrientPanel.add(TYawText, "cell 5 0");
							TOrientPanel.add(TTUnitComboBox, "cell 6 0");
						}
						ThrusterPanel.add(TOrientPanel, "cell 0 3 2 1");
					}
					engineThruster.add(ThrusterPanel, "cell 0 5 9 5");

					// ======== OptionsPanel ========
					{
						OptionsPanel.setLayout(new MigLayout(
								"fillx,hidemode 3",
								// columns
								"[fill]" +
										"[fill]",
								// rows
								"[]" +
										"[]"));

						// ---- OkButton ----
						OkButton.setText("Ok");
						OptionsPanel.add(OkButton, "cell 0 0");

						// ---- CancelButton ----
						CancelButton.setText("Cancel");
						OptionsPanel.add(CancelButton, "cell 1 0");
					}
					engineThruster.add(OptionsPanel, "cell 0 12 8 1");
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
	private JPanel EnginePanel;
	private JPanel EngineNamePanel;
	private JLabel EngineName;
	private JTextField EngineNameText;
	private JPanel ELocationPanel;
	private JLabel EXLoc;
	private JTextField EXLocText;
	private JLabel EYLoc;
	private JTextField EYLocText;
	private JLabel EZLoc;
	private JTextField EZLocText;
	private JComboBox<String> EUnitComboBox;
	private JPanel EOrientPanel;
	private JLabel ERoll;
	private JTextField ERollText;
	private JLabel EPitch;
	private JTextField EPitchText;
	private JLabel EYaw;
	private JTextField EYawText;
	private JComboBox<String> ETUnitComboBox;
	private JPanel FeedPanel;
	private JTextField textField9;
	private JPanel ThrusterPanel;
	private JPanel ThrusterNamePanel;
	private JLabel ThrusterName;
	private JTextField ThrusterNameText;
	private JPanel TLocationPanel;
	private JLabel TXLoc;
	private JTextField TXLocText;
	private JLabel TYLoc;
	private JTextField TYLocText;
	private JLabel TZLoc;
	private JTextField TZLocText;
	private JComboBox<String> TUnitComboBox;
	private JPanel TOrientPanel;
	private JLabel TRoll;
	private JTextField TRollText;
	private JLabel TPitch;
	private JTextField TPitchText;
	private JLabel TYaw;
	private JTextField TYawText;
	private JComboBox<String> TTUnitComboBox;
	private JPanel OptionsPanel;
	private JButton OkButton;
	private JButton CancelButton;
}
