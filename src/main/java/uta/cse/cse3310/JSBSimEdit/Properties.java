package uta.cse.cse3310.JSBSimEdit;

import generated.ObjectFactory;
import generated.PropsType;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.awt.BorderLayout;
import java.awt.Window;
import java.io.InputStream;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import net.miginfocom.swing.*;
import uta.cse.cse3310.JSBSimEdit.utils.Constants;
import uta.cse.cse3310.JSBSimEdit.utils.LoadSave;

public class Properties extends JDialog {
	
	private PropsType pt;
	
	public Properties(Window owner) {
		super(owner);
		initComponents();
        loadProperties();
	}

	private void loadProperties() {
        try {
            // load xml resource
			InputStream is = LoadSave.getContext().getResourceAsStream(Constants.PROPS_RES);
            
			// unmarshall xml to jaxb object
			JAXBContext jc = JAXBContext.newInstance(ObjectFactory.class);
			Unmarshaller um = jc.createUnmarshaller();
			pt = ((JAXBElement<PropsType>) um.unmarshal(is)).getValue();
			
			for(var source : pt.getSource()) {
				System.out.println(source.getName());
			}
        } catch (JAXBException e) {
            System.out.println(Constants.ANSI_RED + "XML parsing Error." + Constants.ANSI_RESET);
            e.printStackTrace();
        }
    }
    
    private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Educational license - James Hofer
		dialogPane = new JPanel();
		contentPanel = new JPanel();
		scrollPane1 = new JScrollPane();
		list1 = new JList();
		buttonBar = new JPanel();
		okButton = new JButton();
		cancelButton = new JButton();

		//======== this ========
		var contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setLayout(new BorderLayout());

			//======== contentPanel ========
			{
				contentPanel.setLayout(new MigLayout(
					"insets dialog,align center center,gap 10 30",
					// columns
					"[grow,fill]",
					// rows
					"[grow]"));

				//======== scrollPane1 ========
				{
					scrollPane1.setViewportView(list1);
				}
				contentPanel.add(scrollPane1, "cell 0 0,grow");
			}
			dialogPane.add(contentPanel, BorderLayout.CENTER);

			//======== buttonBar ========
			{
				buttonBar.setLayout(new MigLayout(
					"insets dialog,alignx right",
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
	// Generated using JFormDesigner Educational license - James Hofer
	private JPanel dialogPane;
	private JPanel contentPanel;
	private JScrollPane scrollPane1;
	private JList list1;
	private JPanel buttonBar;
	private JButton okButton;
	private JButton cancelButton;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}