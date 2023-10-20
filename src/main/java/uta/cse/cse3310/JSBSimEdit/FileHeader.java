package uta.cse.cse3310.JSBSimEdit;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import net.miginfocom.swing.*;

/*
 * Created by JFormDesigner on Wed Oct 18 21:22:52 CDT 2023
 */
public class FileHeader extends JPanel {

	public FileHeader() {
		initComponents();
	}
	
	public JTextField getAircraftNameText() {
		return aircraftNameText;
	}

	public JComboBox getReleaseLevelCombo() {
		return releaseLevelCombo;
	}

	public JTextField getFlightModelVersionText() {
		return flightModelVersionText;
	}

	public JTextField getLicenseText() {
		return licenseText;
	}

	public JTextField getLicenseURLText() {
		return licenseURLText;
	}

	public JTextField getSensitivityText() {
		return sensitivityText;
	}

	public JTextField getFileDateText() {
		return fileDateText;
	}

	public JTextField getConfigVersionText() {
		return configVersionText;
	}

	public JTextField getCopyrightText() {
		return copyrightText;
	}

	public JTextField getAuthorText() {
		return authorText;
	}

	public JTextField getEmailText() {
		return emailText;
	}

	public JTextArea getOrganizationTextArea() {
		return organizationTextArea;
	}

	public JTextArea getDescriptionTextArea() {
		return descriptionTextArea;
	}

	public JTable getReferencesTable() {
		return referencesTable;
	}

	public JTextArea getLimitationsTextArea() {
		return limitationsTextArea;
	}

	public JTextArea getNotesTextArea() {
		return notesTextArea;
	}

	private void initComponents() {
		aircraftNameLabel = new JLabel();
		aircraftNameText = new JTextField();
		releaseLevelLabel = new JLabel();
		releaseLevelCombo = new JComboBox();
		flightModelVersionLabel = new JLabel();
		flightModelVersionText = new JTextField();
		licenseLabel = new JLabel();
		licenseText = new JTextField();
		licenseURLLabel = new JLabel();
		licenseURLText = new JTextField();
		sensitivityLabel = new JLabel();
		sensitivityText = new JTextField();
		fileDateLabel = new JLabel();
		fileDateText = new JTextField();
		configVersionLabel = new JLabel();
		configVersionText = new JTextField();
		copyrightLabel = new JLabel();
		copyrightText = new JTextField();
		authorLabel = new JLabel();
		authorText = new JTextField();
		emailLabel = new JLabel();
		emailText = new JTextField();
		organizationLabel = new JLabel();
		organizationScrollPane = new JScrollPane();
		organizationTextArea = new JTextArea();
		descriptionLabel = new JLabel();
		descriptionScrollPane = new JScrollPane();
		descriptionTextArea = new JTextArea();
		referencesLabel = new JLabel();
		referencesScrollPane = new JScrollPane();
		referencesTable = new JTable();
		limitationsLabel = new JLabel();
		limitationsScrollPane = new JScrollPane();
		limitationsTextArea = new JTextArea();
		notesLabel = new JLabel();
		notesScrollPane = new JScrollPane();
		notesTextArea = new JTextArea();

		//======== this ========
		setBorder(new CompoundBorder(
			new EmptyBorder(20, 20, 20, 20),
			new EmptyBorder(5, 0, 5, 50)));
		setLayout(new MigLayout(
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
			"[150]" +
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- aircraftNameLabel ----
		aircraftNameLabel.setText("Aircraft Name");
		aircraftNameLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(aircraftNameLabel, "cell 0 0");

		//---- aircraftNameText ----
		aircraftNameText.setPreferredSize(new Dimension(100, 23));
		add(aircraftNameText, "cell 1 0");

		//---- releaseLevelLabel ----
		releaseLevelLabel.setText("Release Label");
		releaseLevelLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(releaseLevelLabel, "cell 2 0");

		//---- releaseLevelCombo ----
		releaseLevelCombo.setMaximumRowCount(10);
		releaseLevelCombo.setPreferredSize(new Dimension(100, 23));
		add(releaseLevelCombo, "cell 3 0");

		//---- flightModelVersionLabel ----
		flightModelVersionLabel.setText("Flight Model Version");
		flightModelVersionLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(flightModelVersionLabel, "cell 4 0");

		//---- flightModelVersionText ----
		flightModelVersionText.setPreferredSize(new Dimension(100, 23));
		add(flightModelVersionText, "cell 5 0");

		//---- licenseLabel ----
		licenseLabel.setText("License");
		licenseLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(licenseLabel, "cell 0 1");

		//---- licenseText ----
		licenseText.setPreferredSize(new Dimension(100, 23));
		add(licenseText, "cell 1 1");

		//---- licenseURLLabel ----
		licenseURLLabel.setText("License URL");
		licenseURLLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(licenseURLLabel, "cell 2 1");

		//---- licenseURLText ----
		licenseURLText.setPreferredSize(new Dimension(100, 23));
		add(licenseURLText, "cell 3 1");

		//---- sensitivityLabel ----
		sensitivityLabel.setText("Sensitivity");
		sensitivityLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(sensitivityLabel, "cell 4 1");

		//---- sensitivityText ----
		sensitivityText.setPreferredSize(new Dimension(100, 23));
		add(sensitivityText, "cell 5 1");

		//---- fileDateLabel ----
		fileDateLabel.setText("File Date");
		fileDateLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(fileDateLabel, "cell 0 2");

		//---- fileDateText ----
		fileDateText.setPreferredSize(new Dimension(100, 23));
		add(fileDateText, "cell 1 2");

		//---- configVersionLabel ----
		configVersionLabel.setText("Config Version");
		configVersionLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(configVersionLabel, "cell 2 2");

		//---- configVersionText ----
		configVersionText.setPreferredSize(new Dimension(100, 23));
		add(configVersionText, "cell 3 2");

		//---- copyrightLabel ----
		copyrightLabel.setText("Copyright");
		copyrightLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(copyrightLabel, "cell 4 2");

		//---- copyrightText ----
		copyrightText.setPreferredSize(new Dimension(100, 23));
		add(copyrightText, "cell 5 2");

		//---- authorLabel ----
		authorLabel.setText("Author");
		authorLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(authorLabel, "cell 0 3");
		add(authorText, "cell 1 3 2 1");

		//---- emailLabel ----
		emailLabel.setText("Email");
		emailLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(emailLabel, "cell 3 3");
		add(emailText, "cell 4 3 2 1");

		//---- organizationLabel ----
		organizationLabel.setText("Organization");
		organizationLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(organizationLabel, "cell 0 4");

		//======== organizationScrollPane ========
		{
			organizationScrollPane.setViewportView(organizationTextArea);
		}
		add(organizationScrollPane, "cell 1 4 2 2,growy");

		//---- descriptionLabel ----
		descriptionLabel.setText("Description");
		descriptionLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(descriptionLabel, "cell 3 4");

		//======== descriptionScrollPane ========
		{
			descriptionScrollPane.setViewportView(descriptionTextArea);
		}
		add(descriptionScrollPane, "cell 4 4 2 2,growy");

		//---- referencesLabel ----
		referencesLabel.setText("References");
		referencesLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(referencesLabel, "cell 0 6");

		//======== referencesScrollPane ========
		{

			//---- referencesTable ----
			referencesTable.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null},
				},
				new String[] {
					"Ref ID", "Title", "Author", "Date", "URL"
				}
			) {
				Class<?>[] columnTypes = new Class<?>[] {
					String.class, String.class, String.class, String.class, String.class
				};
				@Override
				public Class<?> getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
			});
			referencesScrollPane.setViewportView(referencesTable);
		}
		add(referencesScrollPane, "cell 1 6 5 1");

		//---- limitationsLabel ----
		limitationsLabel.setText("Limitations");
		limitationsLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(limitationsLabel, "cell 0 7");

		//======== limitationsScrollPane ========
		{
			limitationsScrollPane.setViewportView(limitationsTextArea);
		}
		add(limitationsScrollPane, "cell 1 7 5 2,growy");

		//---- notesLabel ----
		notesLabel.setText("Notes");
		notesLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(notesLabel, "cell 0 9");

		//======== notesScrollPane ========
		{
			notesScrollPane.setViewportView(notesTextArea);
		}
		add(notesScrollPane, "cell 1 9 5 2,growy");
	}

	private JLabel aircraftNameLabel;
	private JTextField aircraftNameText;
	private JLabel releaseLevelLabel;
	private JComboBox releaseLevelCombo;
	private JLabel flightModelVersionLabel;
	private JTextField flightModelVersionText;
	private JLabel licenseLabel;
	private JTextField licenseText;
	private JLabel licenseURLLabel;
	private JTextField licenseURLText;
	private JLabel sensitivityLabel;
	private JTextField sensitivityText;
	private JLabel fileDateLabel;
	private JTextField fileDateText;
	private JLabel configVersionLabel;
	private JTextField configVersionText;
	private JLabel copyrightLabel;
	private JTextField copyrightText;
	private JLabel authorLabel;
	private JTextField authorText;
	private JLabel emailLabel;
	private JTextField emailText;
	private JLabel organizationLabel;
	private JScrollPane organizationScrollPane;
	private JTextArea organizationTextArea;
	private JLabel descriptionLabel;
	private JScrollPane descriptionScrollPane;
	private JTextArea descriptionTextArea;
	private JLabel referencesLabel;
	private JScrollPane referencesScrollPane;
	private JTable referencesTable;
	private JLabel limitationsLabel;
	private JScrollPane limitationsScrollPane;
	private JTextArea limitationsTextArea;
	private JLabel notesLabel;
	private JScrollPane notesScrollPane;
	private JTextArea notesTextArea;
}
