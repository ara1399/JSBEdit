package uta.cse.cse3310.JSBSimEdit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;

import java.awt.Dimension;
import java.util.List;

import generated.FdmConfig;
import generated.Fileheader;
import generated.Reference;
import jakarta.xml.bind.JAXBElement;
import net.miginfocom.swing.*;

/*
 * Created by JFormDesigner on Wed Oct 18 21:22:52 CDT 2023
 */
public class FileHeader extends JPanel {
	
	public FileHeader() {
		initComponents();
	}

	public void bindUIwithXML(FdmConfig cfg) {
		// Example bindings
        //System.out.println(cfg);
        //System.out.println(cfg.getFileheader().getCopyright());
        //System.out.println(cfg.getFileheader().getVersion());
        //System.out.println(cfg.getAerodynamics().getAxis().get(0).getName());
        //System.out.println(cfg.getAerodynamics().getAxis().get(0).getFunction());
        //System.out.println(cfg.getAerodynamics().getAxis().get(0).getClass());

        aircraftNameText.setText(cfg.getName());
        aircraftNameText.setCaretPosition(0); //scroll to left
        releaseLevelCombo.setSelectedItem(cfg.getRelease());
        flightModelVersionText.setText(cfg.getVersion());

        Fileheader fh = cfg.getFileheader();
        licenseText.setText(fh.getLicense().getLicenseName());
        licenseText.setCaretPosition(0); //scroll to left
        licenseURLText.setText(fh.getLicense().getLicenseURL());
        licenseURLText.setCaretPosition(0); //scroll to left
        sensitivityText.setText(fh.getSensitivity());
        fileDateText.setText(fh.getFilecreationdate().toString());
        configVersionText.setText(fh.getVersion());
        copyrightText.setText(fh.getCopyright());
        descriptionTextArea.setText(fh.getDescription());
        descriptionTextArea.setCaretPosition(0); //scroll to top

        // checking each element for a match is more robust because elements
        // are not guaranteed to be in the same order in the XML file
        List<JAXBElement<String>> aeo = fh.getAuthorOrEmailOrOrganization();
        for (var element : aeo) {
            String value = element.getValue();
			if (element.getName().getLocalPart().equals("author")) {
				authorText.setText(value);
			}
			else if (element.getName().getLocalPart().equals("email")) {
				emailText.setText(value);
			}
			else if (element.getName().getLocalPart().equals("organization")) {
				organizationTextArea.setText(value);
				organizationTextArea.setCaretPosition(0); //scroll to top
			}
        }

        /* List<JAXBElement<String>> aeo = fh.getAuthorOrEmailOrOrganization();
        ListIterator<JAXBElement<String>> aeoITR = aeo.listIterator();
        if(aeoITR.hasNext()) {
            fileHeader.getAuthorText().setText(aeoITR.next().getValue());
        }
        if(aeoITR.hasNext()) {
            fileHeader.getEmailText().setText(aeoITR.next().getValue());
        }
        if(aeoITR.hasNext()) {
            fileHeader.getOrganizationTextArea().setText(aeoITR.next().getValue());
            fileHeader.getOrganizationTextArea().setCaretPosition(0); //scroll to top
        } */

        List<Object> nlr = fh.getNoteOrLimitationOrReference();
        for (var element : nlr) {
            if (element instanceof JAXBElement<?>) {
                JAXBElement<String> el = (JAXBElement<String>) element;
                String value = (String) el.getValue();
                if(el.getName().getLocalPart().equals("limitation")) {
                    limitationsTextArea.setText(value);
                    limitationsTextArea.setCaretPosition(0); //scroll to top
                }
                else if(el.getName().getLocalPart().equals("note")) {
                    notesTextArea.setText(value);
                    notesTextArea.setCaretPosition(0); //scroll to top
                }
            }
            else {
                Reference ref = (Reference) element;
				if(ref.getTitle() != null) {
					DefaultTableModel model = (DefaultTableModel) referencesTable.getModel();
					model.addRow(new Object[]{
						ref.getRefID(), ref.getTitle(), ref.getAuthor(), ref.getDate(), ref.getURL()
					});
				}
            }
        }
	}

	public FdmConfig saveXMLfromUI(FdmConfig cfg) {

		cfg.setName(aircraftNameText.getText());
		cfg.setRelease((String) releaseLevelCombo.getSelectedItem());
		cfg.setVersion(flightModelVersionText.getText());

        Fileheader fh = cfg.getFileheader();
		fh.getLicense().setLicenseName(licenseText.getText());
		fh.getLicense().setLicenseURL(licenseURLText.getText());
		fh.setSensitivity(sensitivityText.getText());
		try {
			fh.setFilecreationdate(DatatypeFactory.newInstance().newXMLGregorianCalendar(fileDateText.getText()));
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		fh.setVersion(configVersionText.getText());
		fh.setCopyright(copyrightText.getText());
		fh.setDescription(descriptionTextArea.getText());

        // update element in list if it exists, otherwise add it
        List<JAXBElement<String>> aeo = fh.getAuthorOrEmailOrOrganization();
		boolean updatedAuthor = false;
		boolean updatedEmail = false;
		boolean updatedOrganization = false;
        for (var element : aeo) {
			if (element.getName().getLocalPart().equals("author")) {
				element.setValue(authorText.getText());
				updatedAuthor = true;
			}
			else if (element.getName().getLocalPart().equals("email")) {
				element.setValue(emailText.getText());
				updatedEmail = true;
			}
			else if (element.getName().getLocalPart().equals("organization")) {
				element.setValue(organizationTextArea.getText());
				updatedOrganization = true;
			}
        }
		if(!updatedAuthor) {
			aeo.add(new JAXBElement<String>(new QName("author"), String.class, authorText.getText()));
		}
		if(!updatedEmail) {
			aeo.add(new JAXBElement<String>(new QName("email"), String.class, emailText.getText()));
		}
		if(!updatedOrganization) {
			aeo.add(new JAXBElement<String>(new QName("organization"), String.class, organizationTextArea.getText()));
		}

       /*  List<Object> nlr = fh.getNoteOrLimitationOrReference();
        for (var element : nlr) {
            if (element instanceof JAXBElement<?>) {
                JAXBElement<String> el = (JAXBElement<String>) element;
                if(el.getName().getLocalPart().equals("limitation")) {
                    el.setValue(limitationsTextArea.getText());
                }
                else if(el.getName().getLocalPart().equals("note")) {
					el.setValue(notesTextArea.getText());
                }
            }
            else {
                Reference ref = (Reference) element;
				if(ref.getTitle() != null) {
					DefaultTableModel model = (DefaultTableModel) referencesTable.getModel();
					model.addRow(new Object[]{
						ref.getRefID(), ref.getTitle(), ref.getAuthor(), ref.getDate(), ref.getURL()
					});
					for(int i = 0; i < model.getRowCount(); i++) {
						if(model.getDataVector().elementAt(i).elementAt(1) {

						}
					}
				}
            }
        } */
		return cfg;
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
		releaseLevelCombo.setModel(new DefaultComboBoxModel<>(new String[] {
			"ALPHA",
			"BETA",
			"PRODUCTION"
		}));
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
		fileDateLabel.setToolTipText("yyyy-mm-dd");
		fileDateLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		add(fileDateLabel, "cell 0 2");

		//---- fileDateText ----
		fileDateText.setPreferredSize(new Dimension(100, 23));
		fileDateText.setToolTipText("yyyy-mm-dd");
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
				new Object[][] {},
				new String[] {
					"Ref ID", "Title (required)", "Author", "Date", "URL"
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
		add(referencesScrollPane, "cell 1 6 5 1,growy");

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
	private JComboBox<String> releaseLevelCombo;
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
