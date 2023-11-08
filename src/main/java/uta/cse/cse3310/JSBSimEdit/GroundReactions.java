package uta.cse.cse3310.JSBSimEdit;

import java.awt.*;
import java.awt.event.*;
import java.util.Optional;
import javax.swing.*;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;

import generated.FdmConfig;
import net.miginfocom.swing.*;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;

public class GroundReactions extends JPanel implements TabComponent {
    
    GroundReactions(){
          initComponents();
    }

    @Override
    public void bindUIwithXML(FdmConfig cfg) {
        // TODO
    }

    @Override
    public Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg) {
        // TODO
        return Optional.ofNullable(cfg);
    }

    private void addGroundReaction(ActionEvent e) {
	//TODO
    }

    private void deleteGroundReaction(ActionEvent e) {
	JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this?", "Confirm", JOptionPane.OK_CANCEL_OPTION);
    }

    private void detailGroundReaction(ActionEvent e) {
	new LandingGearSetup();
        //here we want to display the information of the currently selected groundreaction
    }

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Connor Baldwin
		scrollPane1 = new JScrollPane();
		list1 = new JList();
		buttonsPanel = new JPanel();
		addGroundReactionButton = new JButton();
		deleteGroundReactionButton = new JButton();
		detailGroundReactionButton = new JButton();

		//======== this ========
		setMinimumSize(new Dimension(1250, 600));
		setPreferredSize(new Dimension(1250, 600));
		setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
		EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing
		. border. TitledBorder. BOTTOM, new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ),
		java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( )
		{ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("borde\u0072" .equals (e .getPropertyName () ))
		throw new RuntimeException( ); }} );
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

		//======== scrollPane1 ========
		{
		    scrollPane1.setViewportView(list1);
		}
		add(scrollPane1, "cell 0 0 49 22,grow");

		//======== buttonsPanel ========
		{
		    buttonsPanel.setLayout(new MigLayout(
			"hidemode 3,align center center",
			// columns
			"[grow,fill]" +
			"[grow,fill]" +
			"[grow,fill]",
			// rows
			"[]"));

		    //---- addGroundReactionButton ----
		    addGroundReactionButton.setText("Add");
		    addGroundReactionButton.addActionListener(e -> addGroundReaction(e));
		    buttonsPanel.add(addGroundReactionButton, "cell 0 0");

		    //---- deleteGroundReactionButton ----
		    deleteGroundReactionButton.setText("Delete");
		    deleteGroundReactionButton.addActionListener(e -> deleteGroundReaction(e));
		    buttonsPanel.add(deleteGroundReactionButton, "cell 1 0");

		    //---- detailGroundReactionButton ----
		    detailGroundReactionButton.setText("Detail");
		    detailGroundReactionButton.addActionListener(e -> detailGroundReaction(e));
		    buttonsPanel.add(detailGroundReactionButton, "cell 2 0");
		}
		add(buttonsPanel, "cell 0 22 49 1,grow");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Connor Baldwin
    private JScrollPane scrollPane1;
    private JList list1;
    private JPanel buttonsPanel;
    private JButton addGroundReactionButton;
    private JButton deleteGroundReactionButton;
    private JButton detailGroundReactionButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}