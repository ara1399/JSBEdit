package uta.cse.cse3310.JSBSimEdit;

import java.util.Optional;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import generated.FdmConfig;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;

public class Aerodynamics extends JPanel implements TabComponent {
    
    public Aerodynamics(){
        initComponents();  
    }

    @Override
    public void bindUIwithXML(FdmConfig cfg) {
        // TODO
        generated.Aerodynamics a = cfg.getAerodynamics();

        if(a.getAlphalimits() != null){
            alphalimitsText.setText(Double.toString(a.getAlphalimits().getMin()));
            alphalimitsCombo.setSelectedItem(a.getAlphalimits().getUnit().value());
        }

        if(a.getHysteresisLimits() != null){
            hysteresisLimitsText.setText(Double.toString(a.getHysteresisLimits().getMin()));
            hysteresisLimitsCombo.setSelectedItem(a.getHysteresisLimits().getUnit().value());
        }

        if(a.getFunction() != null){

        }
        if(a.getAxis() != null){

        }
    }

    @Override
    public Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg) {
        // TODO
        return Optional.ofNullable(cfg);
    }

    private void initComponents(){
        mainPanel = new JPanel();
        treeBuild();
    }

    private void treeBuild(){
        //create root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Aerodynamics");
        //create child node
        DefaultMutableTreeNode functions = new DefaultMutableTreeNode("Functions");
        DefaultMutableTreeNode axis = new DefaultMutableTreeNode("Axis");

        root.add(functions);
        root.add(axis);
        aeroTree = new JTree(root);
        add(aeroTree);
    }
    

    //variables
    private JPanel mainPanel;
    private JTree aeroTree;

    private JFormattedTextField alphalimitsText;
    private JFormattedTextField hysteresisLimitsText;
    private JComboBox alphalimitsCombo;
    private JComboBox hysteresisLimitsCombo;
}