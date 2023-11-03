package uta.cse.cse3310.JSBSimEdit;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import generated.FdmConfig;
import generated.Function;
import generated.Axis;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;

public class Aerodynamics extends JPanel implements TabComponent {
    
    public Aerodynamics(){
        initComponents();  
    }

    @Override
    public void bindUIwithXML(FdmConfig cfg) {
        // TODO
        generated.Aerodynamics a = cfg.getAerodynamics();
        generated.Function f = (Function) a.getFunction();
        generated.Axis ax = (Axis) a.getAxis();

        if(a.getAlphalimits() != null){
            alphalimitsText.setText(Double.toString(a.getAlphalimits().getMin()));
        }

        if(a.getHysteresisLimits() != null){
            hysteresisLimitsText.setText(Double.toString(a.getHysteresisLimits().getMin()));
        }
        //function gets
        while(a.getFunction() != null){
            funtionText.setText(f.getName());
            functiondescText.setText(f.getDescription());
            System.out.println(funtionText);
        }
        
        
        //axis gets
        List<String> axisnames = new ArrayList<String>();
        while(a.getAxis() != null){
            axisnameText.setText(ax.getName());
            axisnames.add(ax.getName());
        }
        array = axisnames.toArray(new String[0]);
    }

    @Override
    public Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg) {
        // TODO
        return Optional.ofNullable(cfg);
    }

    private void initComponents(){
        treeBuild();
    }

    private void treeBuild(){
        //create root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Aerodynamics");
        //create child node
        DefaultMutableTreeNode functions = new DefaultMutableTreeNode("Functions");
        DefaultMutableTreeNode axis = new DefaultMutableTreeNode(axisnameText);

        root.add(functions);
        root.add(axis);
        aeroTree = new JTree(root);
        add(aeroTree);
    }
    

    //variables
    private JTree aeroTree;

    private JFormattedTextField alphalimitsText;
    private JFormattedTextField hysteresisLimitsText;
    private JFormattedTextField funtionText;
    private JFormattedTextField functiondescText;
    private JFormattedTextField axisnameText;
    private String[] array;
}