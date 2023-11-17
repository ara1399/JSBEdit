package uta.cse.cse3310.JSBSimEdit;

import java.util.List;
import java.util.Optional;

import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import generated.FdmConfig;
import generated.Function;
import generated.Axis;
import generated.Product;
import generated.Table;

import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;

public class Aerodynamics extends JPanel implements TabComponent {
    
    public Aerodynamics(){
        initComponents();
        
        
        ScrollPane = new JScrollPane();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Aerodynamics");
        generated.Aerodynamics a = cfg.getAerodynamics();
        funcs = a.getFunction();
        for (Function F : funcs){
            //Create function node
            DefaultMutableTreeNode func_node = new DefaultMutableTreeNode(F.getName() + "(" + F.getDescription() + ")");

            Table func_table = F.getTable();
            if(func_table != null){
                String table_name = new String();
                if(func_table.getName() != null){
                    table_name = func_table.getName();
                }else {
                    table_name = "T("+func_table.getIndependentVar()+")";
                }

                DefaultMutableTreeNode table_node = new DefaultMutableTreeNode(table_name);
                func_node.add(table_node);

                root.add(func_node);
            }
        }

        axis = a.getAxis();
        for(Axis ax : axis){
            DefaultMutableTreeNode axisNode = new DefaultMutableTreeNode(ax.getName());

            List<Function> axis_func = ax.getFunction();
            for (Function ax_f : axis_func){
                DefaultMutableTreeNode func_node = new DefaultMutableTreeNode(ax_f.getName() + "("+ax_f.getDescription()+")");

                Product P = ax_f.getProduct();
                if(P != null){
                    DefaultMutableTreeNode Productnode = new DefaultMutableTreeNode("Product");
                    
                    List<Object> Product_List = P.getTableOrProductOrDifference();
                    for(Object o : Product_List){
                        if (o instanceof Table){
                            Table T = (Table)o;
                            if(T != null){
                                String Tname = new String();
                                if (T.getName() != null){
                                    Tname = T.getName();
                                } else {
                                    Tname = "T("+T.getIndependentVar()+")";
                                }

                                DefaultMutableTreeNode Tnode = new DefaultMutableTreeNode(Tname);
                                Productnode.add(Tnode);
                            }
                        }
                    }
                    func_node.add(Productnode);
                }
                axisNode.add(func_node);
            }
            root.add(axisNode);
        }  

        aeroTree = new JTree(root);
        //aeroTree.setShowsRootHandles(true);

        ScrollPane.setViewportView(aeroTree);
    }

    @Override
    public void bindUIwithXML(FdmConfig cfg) {
        generated.Aerodynamics a = cfg.getAerodynamics();
       
        if(a.getAlphalimits() != null){
            alphalimitsMinText.setText(Double.toString(a.getAlphalimits().getMin()));
            alphalimitsMaxText.setText(Double.toString(a.getAlphalimits().getMax()));
            alphalimitsUnitText.setText((a.getAlphalimits().getUnit().value()));
        }else{
            alphalimitsMinText.setText(Double.toString(-20));
            alphalimitsMaxText.setText(Double.toString(90));
        }

        if(a.getHysteresisLimits() != null){
            hysteresisLimitsMinText.setText(Double.toString(a.getHysteresisLimits().getMin()));
            hysteresisLimitsMaxText.setText(Double.toString(a.getHysteresisLimits().getMax()));
            hysteresisLimitsUnitText.setText((a.getHysteresisLimits().getUnit().value()));
        }else{
            alphalimitsMinText.setText(Double.toString(30));
            alphalimitsMaxText.setText(Double.toString(30));
        }
    }

    @Override
    public Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg) {
        // TODO
        return Optional.ofNullable(cfg);
    }

    private void initComponents(){
        alphalimitsMinText = new JFormattedTextField();
        alphalimitsMaxText = new JFormattedTextField();
        alphalimitsUnitText = new JFormattedTextField();

        hysteresisLimitsMinText = new JFormattedTextField();
        hysteresisLimitsMaxText = new JFormattedTextField();
        hysteresisLimitsUnitText = new JFormattedTextField();

    }

    

    //variables
    private JScrollPane ScrollPane;
    private JTree aeroTree;
    FdmConfig cfg;
    Aerodynamics a;
    List<Function> funcs;
    List<Axis> axis;

    private JFormattedTextField alphalimitsMinText;
    private JFormattedTextField alphalimitsMaxText;
    private JFormattedTextField alphalimitsUnitText;
    private JFormattedTextField hysteresisLimitsMinText;
    private JFormattedTextField hysteresisLimitsMaxText;
    private JFormattedTextField hysteresisLimitsUnitText;
    //private JFormattedTextField funtionText;
    //private JFormattedTextField functiondescText;
    //private JFormattedTextField axisnameText;
}