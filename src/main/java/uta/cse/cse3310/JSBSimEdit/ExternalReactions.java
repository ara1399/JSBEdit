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
        arrayForce = new ArrayList<>();
    }

    @Override
    public void bindUIwithXML(FdmConfig cfg) {
        modelForce.clear();
        ArrayList<generated.Force> forces = new ArrayList<>();
        if(cfg.getExternalReactions().getForce() != null){
            forces.addAll(cfg.getExternalReactions().getForce());
            
            Double xL, yL, zL, xD, yD, zD;
            String name, frame, /*dirN,*/ locU, dirU;
            
            for(generated.Force f : forces){
                //getFunction()
                
                if(f.getName() != null) name = f.getName(); //name
                else name = null;
                
                if(f.getFrame() != null) frame = f.getFrame(); //frame
                else frame = null;
                
                if(f.getLocation() != null){//location
                    xL = f.getLocation().getX(); 
                    yL = f.getLocation().getY();
                    zL = f.getLocation().getZ();
                    locU = f.getLocation().getUnit().toString();
                }
                else{
                    xL = null;
                    yL = null;
                    zL = null;
                    locU = null;
                }
                
                if(f.getDirection() != null){//direction
                    xD = f.getDirection().getX(); 
                    yD = f.getDirection().getY();
                    zD = f.getDirection().getZ();
                    dirU = f.getDirection().getUnit().toString();
//                    dirN = f.getDirection().getName();
                }
                else{
                    xD = null;
                    yD = null;
                    zD = null;
                    dirU = null;
//                    dirN = null;
                }
                
                ExternalForce ef = new ExternalForce(name, frame, /*dirN,*/ locU, dirU, 
                                                 xL, yL, zL, xD, yD, zD);
                arrayForce.add(ef);
            }
            modelForce.addAll(arrayForce);
        }
    }

    @Override
    public Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg) {
        
        cfg.getExternalReactions().getForce().clear();
        
        for(ExternalForce ef : arrayForce){
            generated.Force f = new generated.Force();
            
            generated.Location l = new generated.Location(); //location
            l.setX(ef.getXLoc());
            l.setY(ef.getYLoc());
            l.setZ(ef.getZLoc());
            l.setUnit(ef.getLocU());
            f.setLocation(l);
            
            generated.Direction d = new generated.Direction(); //Direction
            d.setX(ef.getXDir());
            d.setY(ef.getYDir());
            d.setZ(ef.getZDir());
            d.setUnit(ef.getDirU());
            f.setDirection(d);
            
            f.setName(ef.getName()); //name
            f.setFrame(ef.getFrame()); //frame
            
            cfg.getExternalReactions().getForce().add(f);
        }
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
	int userAnswer = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this?", "Confirm", JOptionPane.OK_CANCEL_OPTION);
	if(userAnswer == JOptionPane.OK_OPTION){
		ExternalForce currentForce = listER.getSelectedValue();
		modelForce.removeElement(currentForce);
		arrayForce.remove(currentForce);
	}
    }
    
    private void detailExternalReaction(ActionEvent e) {
        if (listER.getSelectedValue() == null) return;
        
        ExternalForce newER = new ExternalForce(listER.getSelectedValue());
        if(newER.getName() == null) return; //user cancelled
        else{
            arrayForce.remove(listER.getSelectedValue());
            arrayForce.add(newER);
            modelForce.clear();
            modelForce.addAll(arrayForce);
        }
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
                        deleteER.addActionListener(e -> deleteExternalReaction(e));
			buttonPanel.add(deleteER, "cell 1 0");

			//---- detailER ----
			detailER.setText("Detail");
                        detailER.addActionListener(e -> detailExternalReaction(e));
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
