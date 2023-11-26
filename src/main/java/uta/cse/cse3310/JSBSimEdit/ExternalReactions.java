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
import javax.swing.border.TitledBorder;

import generated.FdmConfig;
import net.miginfocom.swing.MigLayout;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;

public class ExternalReactions extends JPanel implements TabComponent {
    
    ExternalReactions() {
        initComponents();
    }

    @Override
    public void bindUIwithXML(FdmConfig cfg) {
		//Force implmentation
		modelForce.clear();
		if(arrayForce != null){arrayForce.clear();}
		ArrayList<generated.Force> forces = new ArrayList<>();
		if(cfg.getExternalReactions().getForce() != null){
			for(Object o : cfg.getExternalReactions().getForce()){
				generated.Force f = (generated.Force) o;
				forces.add(f);
			}
		}
    }

    @Override
    public Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg) {
        // TODO=
        return Optional.ofNullable(cfg);
    }

    
    private void addForce(ActionEvent e) {
        Force currentForce = new Force();
		if (currentForce.getName() == null) return;
		arrayForce.add(currentForce);
		modelForce.clear();
		modelForce.addAll(arrayForce);
    }
    
    private void deleteForce(ActionEvent e) {
        if  (listForce.getSelectedValue() == null) return;
		int userAnswer = JOptionPane.showConfirmDialog(this,"Are you sure you want to delete this?"
		,"Confirm",JOptionPane.OK_CANCEL_OPTION);
		if(userAnswer == JOptionPane.OK_OPTION){
			Force currentForce = listForce.getSelectedValue();
			modelForce.removeElement(currentForce);
		 listForce.remove(currentForce);
		}
    }
    
    private void detailForce(ActionEvent e) {
        if  (listForce.getSelectedValue() != null){
			Force oldForce = listForce.getSelectedValue();
			Force newForce = new Force(oldForce);
			if(newForce.getName() == null) return;
			else if(newForce.getName() ==null) return;
			else{
				arrayForce.remove(listForce.getSelectedValue());
				arrayForce.add(newForce);
				modelForce.clear();
				modelForce.addAll(arrayForce);
			}
		}
    }

	private void addProp(ActionEvent e) {
		// TODO add your code here
	}

	private void deleteProp(ActionEvent e) {
		// TODO add your code here
	}

	private void detailProp(ActionEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Educational license - Sean McElroy (Patrick McElroy)
		scrollForce = new JScrollPane();
		listForce = new JList<Force>();
		scrollProp = new JScrollPane();
		listProp = new JList();
		addForce = new JButton();
		deleteForce = new JButton();
		detailForce = new JButton();
		addProp = new JButton();
		deleteProp = new JButton();
		detailProp = new JButton();

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

		//======== scrollForce ========
		{
			scrollForce.setViewportBorder(new TitledBorder(null, "Forces", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
			scrollForce.setToolTipText("List of forces");
			scrollForce.setViewportView(listForce);
		}
		add(scrollForce, "cell 0 0 6 9,growy");

		//======== scrollProp ========
		{
			scrollProp.setToolTipText("List of Properties");
			scrollProp.setViewportBorder(new TitledBorder(null, "Properties", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
			scrollProp.setViewportView(listProp);
		}
		add(scrollProp, "cell 6 0 6 9,growy");

		//---- addForce ----
		addForce.setText("Add Force");
		addForce.addActionListener(e -> addForce(e));
		add(addForce, "cell 0 9 2 1");

		//---- deleteForce ----
		deleteForce.setText("Delete Force");
		deleteForce.addActionListener(e -> deleteForce(e));
		add(deleteForce, "cell 2 9 2 1");

		//---- detailForce ----
		detailForce.setText("Detail Force");
		detailForce.addActionListener(e -> detailForce(e));
		add(detailForce, "cell 4 9 2 1");

		//---- addProp ----
		addProp.setText("Add Property");
		addProp.addActionListener(e -> addProp(e));
		add(addProp, "cell 6 9 2 1");

		//---- deleteProp ----
		deleteProp.setText("Delete Property");
		deleteProp.addActionListener(e -> deleteProp(e));
		add(deleteProp, "cell 8 9 2 1");

		//---- detailProp ----
		detailProp.setText("Detail Property");
		detailProp.addActionListener(e -> detailProp(e));
		add(detailProp, "cell 10 9 2 1");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Educational license - Sean McElroy (Patrick McElroy)
	private JScrollPane scrollForce;
	private JList<Force> listForce;
	private JScrollPane scrollProp;
	private JList<String> listProp;
	private JButton addForce;
	private JButton deleteForce;
	private JButton detailForce;
	private JButton addProp;
	private JButton deleteProp;
	private JButton detailProp;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private ArrayList<Force> arrayForce;
	private DefaultListModel<Force> modelForce = new DefaultListModel<Force>();
}
