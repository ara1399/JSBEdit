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
import java.util.ArrayList;
import net.miginfocom.swing.*;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;

public class GroundReactions extends JPanel implements TabComponent {
    
    GroundReactions(){
          initComponents();
          listLGS = new ArrayList<LandingGearSetup>();

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

    private void addGroundReaction(ActionEvent e) {//adding a new GR/LGS to the displayed list
	LandingGearSetup lgs = new LandingGearSetup();
        if(lgs.getName() == null) return;
        listLGS.add(lgs);
        model.clear();
        model.addAll(listLGS);
    }

    private void deleteGroundReaction(ActionEvent e) {//removing a GR/LGS from the displayed list
//        if(listLGSDisplay.getSelectedValue() == null) return;
	int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this?", "Confirm", JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.OK_OPTION){
            LandingGearSetup lgs = listLGSDisplay.getSelectedValue();
            model.removeElement(lgs);
            listLGS.remove(lgs);
        }
    }

    private void detailGroundReaction(ActionEvent e) {
        //here we want to display the information of the currently selected groundreaction
        //if the newLGS comes back null, the user cancelled, which means we want to keep the old LGS
        if(listLGSDisplay.getSelectedValue() != null){
            LandingGearSetup oldLGS = listLGSDisplay.getSelectedValue();
            LandingGearSetup newLGS = new LandingGearSetup(oldLGS);
            if(newLGS == null) return; //if the user cancelled, do nothing
            else if(newLGS.getName() == null) return;
            else{ //if the user presses ok, remove the old LGS and then add the new LGS
                listLGS.remove(listLGSDisplay.getSelectedValue());
                listLGS.add(newLGS);
                model.clear(); //refreshing the model to Display on the listLGSDisplay
                model.addAll(listLGS);
            }
            
        }
    }

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Connor Baldwin
		scrollGR = new JScrollPane();
		listLGSDisplay = new JList<>();
		buttonsPanel = new JPanel();
		addGRB = new JButton();
		deleteGRB = new JButton();
		detailGRB = new JButton();

		//======== this ========
		setMinimumSize(new Dimension(1250, 600));
		setPreferredSize(new Dimension(1250, 600));
		setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder (
		0, 0 ,0 , 0) ,  "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border .TitledBorder
		. BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt. Color .
		red ) , getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java .
		beans. PropertyChangeEvent e) { if( "\u0062ord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
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

		//======== scrollGR ========
		{

		    //---- listLGSDisplay ----
		    listLGSDisplay.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		    listLGSDisplay.setModel(model);
		    scrollGR.setViewportView(listLGSDisplay);
		}
		add(scrollGR, "cell 0 0 49 22,grow");

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

		    //---- addGRB ----
		    addGRB.setText("Add");
		    addGRB.addActionListener(e -> addGroundReaction(e));
		    buttonsPanel.add(addGRB, "cell 0 0");

		    //---- deleteGRB ----
		    deleteGRB.setText("Delete");
		    deleteGRB.addActionListener(e -> deleteGroundReaction(e));
		    buttonsPanel.add(deleteGRB, "cell 1 0");

		    //---- detailGRB ----
		    detailGRB.setText("Detail");
		    detailGRB.addActionListener(e -> detailGroundReaction(e));
		    buttonsPanel.add(detailGRB, "cell 2 0");
		}
		add(buttonsPanel, "cell 0 22 49 1,grow");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Connor Baldwin
    private JScrollPane scrollGR;
    private JList<LandingGearSetup> listLGSDisplay;
    private JPanel buttonsPanel;
    private JButton addGRB;
    private JButton deleteGRB;
    private JButton detailGRB;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    private DefaultListModel<LandingGearSetup> model = new DefaultListModel<LandingGearSetup>();
    private ArrayList<LandingGearSetup> listLGS;
}   