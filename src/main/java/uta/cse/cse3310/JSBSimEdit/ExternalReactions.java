package uta.cse.cse3310.JSBSimEdit;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Optional;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import generated.FdmConfig;
import net.miginfocom.swing.MigLayout;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;

public class ExternalReactions extends JPanel implements TabComponent {
    
    ExternalReactions() {
        initComponents();
    }

    @Override
    public void bindUIwithXML(FdmConfig cfg) {
        // TODO
    }

    @Override
    public Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg) {
        // TODO=
        return Optional.ofNullable(cfg);
    }

    
    private void addExternalReaction(ActionEvent e) {
        ExternalForce currentForce = new ExternalForce();
		if (currentForce.getName() == null) return;
		arrayForce.add(currentForce);
		modelForce.clear();
		modelForce.addAll(arrayForce);
    }
    
    private void deleteExternalReaction(ActionEvent e) {
        if (listER.getSelectedValue() == null) return;
		int userAnswer = JOptionPane.showConfirmDialog(this,"Are you sure you want to delete this?"
		,"Confirm",JOptionPane.OK_CANCEL_OPTION);
		if(userAnswer == JOptionPane.OK_OPTION){
			ExternalForce currentForce = listER.getSelectedValue();
			modelForce.removeElement(currentForce);
			listER.remove(currentForce);
		}
    }
    
    private void detailExternalReaction(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
	// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
	// Generated using JFormDesigner Educational license - Sean McElroy (Patrick McElroy)
	scrollER = new JScrollPane();
	listER = new JList<>();
	buttonPanel = new JPanel();
	addER = new JButton();
	deleteER = new JButton();
	detailER = new JButton();

	//======== this ========
	setLayout(new MigLayout(
		"fill,hidemode 3",
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
		"[]"));

        //======== scrollER ========
		{
			//Allows the list to be see and only allows a single selection
			listER.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
			listER.setModel(modelForce);
			scrollER.setViewportView(listER);
		}
		add(scrollER, "cell 0 0 49 22,grow");

		//======== buttonPanel ========
		{
			buttonPanel.setLayout(new MigLayout(
				"fill,hidemode 3",
				// columns
				"[fill]" +
				"[fill]" +
				"[fill]",
				// rows
				"[]"));

			//---- addER ----
			addER.setText("Add");
    		addER.addActionListener(e -> addExternalReaction(e));
			buttonPanel.add(addER, "cell 0 0");

			//---- deleteER ----
			deleteER.setText("Delete");
           	addER.addActionListener(e -> deleteExternalReaction(e));
			buttonPanel.add(deleteER, "cell 1 0");

			//---- detailER ----
			detailER.setText("Detail");
            //addER.addActionListener(e -> detailExternalReaction(e));
			buttonPanel.add(detailER, "cell 2 0");
		}
		add(buttonPanel, "cell 0 22 49 1");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}





    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Educational license - Sean McElroy (Patrick McElroy)
	private JScrollPane scrollER;
	private JList<ExternalForce> listER;
	private JPanel buttonPanel;
	private JButton addER;
	private JButton deleteER;
	private JButton detailER;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private ArrayList<ExternalForce> arrayForce;
	private DefaultListModel<ExternalForce> modelForce = new DefaultListModel<ExternalForce>();
}
