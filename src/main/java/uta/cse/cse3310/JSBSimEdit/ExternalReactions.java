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
	arrayForce = new ArrayList<>();
    }

    @Override
    public void bindUIwithXML(FdmConfig cfg) {
		//Force implmentation
		modelForce.clear();
		arrayForce.clear();
		ArrayList<generated.Force> forces = new ArrayList<>();
		if(cfg.getExternalReactions().getForce() != null){
		forces.addAll(cfg.getExternalReactions().getForce());
            
            Double xL, yL, zL, xD, yD, zD;
            String name, frame, /*dirN,*/ locU, dirU;
			generated.Function function;

			for(generated.Force f : forces){
				if(f.getFunction() != null) function = f.getFunction();
				else function = null;
                
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
					
                Force ef = new Force(name, frame, locU, dirU, 
                                    xL, yL, zL, xD, yD, zD,function);
                arrayForce.add(ef);
			}
			modelForce.addAll(arrayForce);
		}
    }

    @Override
    public Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg) {
        
        cfg.getExternalReactions().getForce().clear();
        
        for(Force ef : arrayForce){
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
