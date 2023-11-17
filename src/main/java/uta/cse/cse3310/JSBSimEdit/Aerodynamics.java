package uta.cse.cse3310.JSBSimEdit;


import java.awt.*;
import java.awt.event.*;
import java.util.Optional;
import javax.swing.*;

import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import generated.FdmConfig;
import generated.Function;
import generated.IndependentVar;
import generated.Axis;
import generated.Product;
import generated.Table;
import jakarta.xml.bind.JAXBElement;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;

public class Aerodynamics extends JPanel implements TabComponent {
    
    public Aerodynamics(){
        initComponents();
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

        if(a.getAlphalimits() != null){
            alphalimitsMinText.setText(Double.toString(a.getAlphalimits().getMin()));
            alphalimitsMinText.setText(Double.toString(a.getAlphalimits().getMax()));
            //alphalimitsUnitText.setText(Double.toString(a.getAlphalimits().getUnit()));
        }

        if(a.getHysteresisLimits() != null){
            hysteresisLimitsMinText.setText(Double.toString(a.getHysteresisLimits().getMin()));
            hysteresisLimitsMaxText.setText(Double.toString(a.getHysteresisLimits().getMax()));
            hysteresisLimitsUnitText.setText((a.getHysteresisLimits().getUnit().value()));
        }else{
            alphalimitsMinText.setText(Double.toString(30));
            alphalimitsMaxText.setText(Double.toString(30));
        }

        ScrollPane = new JScrollPane();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Aerodynamics");
        List<Function> func = a.getFunction();
        //get funrions under root node
        for (Function f : func){
            DefaultMutableTreeNode func_node = new DefaultMutableTreeNode(f.getName() + "("+ f.getDescription() + ")");
            DefaultMutableTreeNode Productnode = new DefaultMutableTreeNode("Product");

            Table T = f.getTable();
            if(T != null){
                List<IndependentVar> independentVar = T.getIndependentVar();
                StringBuilder tableNameBuilder = new StringBuilder("");

                for (IndependentVar IV : independentVar) {
                    String varName = IV.getContent();
                    varName = varName.substring(varName.lastIndexOf("/") + 1);
                    tableNameBuilder.append(varName).append(",");
                }
                tableNameBuilder.deleteCharAt(tableNameBuilder.length() - 1);

                String Tname = tableNameBuilder.toString();
                if (T.getName() != null) {
                    Tname = T.getName() + "(" + Tname + ")";
                } else {
                    Tname = "T(" + Tname + ")";
                }

                DefaultMutableTreeNode Tnode = new DefaultMutableTreeNode(Tname);
                Productnode.add(Tnode);
                //System.out.println("\t\t\t" + Tnode);
            }
            func_node.add(Productnode);
            //System.out.println("\t\t"+Productnode);
            root.add(func_node);
            //System.out.println("\t"+func_node);     
        }
        
        axis = a.getAxis();
        //get all axis->functions->products->(properties/tables/values) under each axis node
        for(Axis ax : axis){
            DefaultMutableTreeNode axisNode = new DefaultMutableTreeNode(ax.getName());

            List<Function> axis_func = ax.getFunction();
            for (Function ax_f : axis_func){
                DefaultMutableTreeNode func_node = new DefaultMutableTreeNode(ax_f.getName() + "("+ ax_f.getDescription() + ")");

                Product P = ax_f.getProduct();
                if(P != null){
                    DefaultMutableTreeNode Productnode = new DefaultMutableTreeNode("Product");

                    //get table or property
                    List<Object> Product_List = P.getTableOrProductOrDifference();
                    for(Object o : Product_List){
                        if (o instanceof Table){
                            Table T = (Table) o;
                            if(T != null){
                                List<IndependentVar> independentVar = T.getIndependentVar();
                                StringBuilder tableNameBuilder = new StringBuilder("");
                                
                                for(IndependentVar IV : independentVar){
                                    String varName = IV.getContent();
                                    varName = varName.substring(varName.lastIndexOf("/")+1);
                                    tableNameBuilder.append(varName).append(",");
                                }
                                tableNameBuilder.deleteCharAt(tableNameBuilder.length()-1);
                                
                                String Tname = tableNameBuilder.toString();
                                if (T.getName() != null){
                                    Tname = T.getName() + "("+Tname+")";
                                }else{
                                    Tname = "T("+Tname+")";
                                }

                                DefaultMutableTreeNode Tnode = new DefaultMutableTreeNode(Tname);
                                Productnode.add(Tnode);
                                //System.out.println("\t\t\t\t"+Tnode);
                            }
                        }else if (o instanceof JAXBElement){
                            JAXBElement<?> element = (JAXBElement<?>) o;
                            Object value = element.getValue();
                            if (value instanceof String) {
                                String propertyOrValue = (String) value;
                                // Check if it is a property or a value
                                if (element.getName().getLocalPart().equals("property")) {
                                    // Process the property name
                                    DefaultMutableTreeNode PropNode = new DefaultMutableTreeNode(propertyOrValue);
                                    Productnode.add(PropNode);
                                    //System.out.println("\t\t\t\t" + PropNode);
                                }
                            } else {
                                    DefaultMutableTreeNode ValueNode = new DefaultMutableTreeNode(value);
                                    Productnode.add(ValueNode);
                                    //System.out.println("\t\t\t\t" + ValueNode);
                                }
                        }
                    }
                    func_node.add(Productnode);
                    //System.out.println("\t\t\t"+Productnode);
                }
                axisNode.add(func_node);
                //System.out.println("\t\t"+func_node);
            }
            root.add(axisNode);
            //System.out.println("\t"+axisNode);
        }  

        aeroTree = new JTree(root);
        //System.out.println(root);
    /* 
        //add mouse listener
        aeroTree.addMouseListener(new MouseAdapter() {
            //TODO
            public void mouseClickedTwice(MouseEvent two){
                if (two.getClickCount() == 2){
                    TreePath path = aeroTree.getPathForLocation(two.getX(), two.getY());
                    if(path != null){
                        DefaultMutableTreeNode selectTreeNode = (DefaultMutableTreeNode)path.getLastPathComponent();
                        showPopup(selectTreeNode, two.getXOnScreen(), two.getYOnScreen());
                    }
                }
            }
        });
    */
        aeroTree.setShowsRootHandles(true);

        ScrollPane = new JScrollPane(aeroTree);
        this.setLayout(new BorderLayout());
        this.add(ScrollPane, BorderLayout.CENTER);
        
    }

/* 
    private void showPopup(DefaultMutableTreeNode node, int x, int y){
        //TODO
        String nodeName = node.toString();
        JOptionPane.showMessageDialog(this, "Detail for Node: " + nodeName, "Node Deatails",JOptionPane.INFORMATION_MESSAGE);
    }
*/

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