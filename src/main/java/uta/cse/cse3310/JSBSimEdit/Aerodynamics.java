package uta.cse.cse3310.JSBSimEdit;


import java.awt.*;
import java.awt.event.*;
import java.util.Optional;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

//import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;

import generated.FdmConfig;
import generated.Function;
import generated.IndependentVar;
import generated.Axis;
import generated.Product;
import generated.Table;
//import generated.TableData;
import jakarta.xml.bind.JAXBElement;

import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;
import uta.cse.cse3310.JSBSimEdit.utils.Constants;
import uta.cse.cse3310.JSBSimEdit.utils.LoadSave;

public class Aerodynamics extends JPanel implements TabComponent {
    
    private AerodynamicsPropertiesPopup apropertiesPopup;
    private FunctionOrProductPopUp ForPPopUp;
    private ValuePopUp valuepopup;
    private AxisPopUp axispopup;
    //private TablePopUp tablepopup;


    public Aerodynamics(){
        initComponents();
        apropertiesPopup = new AerodynamicsPropertiesPopup((Frame) SwingUtilities.getWindowAncestor(this));
        ForPPopUp = new FunctionOrProductPopUp((Frame) SwingUtilities.getWindowAncestor(this));
        valuepopup = new ValuePopUp((Frame) SwingUtilities.getWindowAncestor(this));
        axispopup = new AxisPopUp((Frame) SwingUtilities.getWindowAncestor(this));
        //tablepopup = new TablePopUp((Frame) SwingUtilities.getWindowAncestor(this), tableName, tableData);
        SwingUtilities.invokeLater(()->{
            new CustomTreeCellRenderer().setVisible(true);
        });

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
            hysteresisLimitsMinText.setText(Double.toString(30));
            hysteresisLimitsMaxText.setText(Double.toString(30));
        }

        ScrollPane = new JScrollPane();
        CustomTreeNode root = new CustomTreeNode("Aerodynamics",NodeType.AERODYNAMICS);
        List<Function> func = a.getFunction();
        //get functions under root node
        for (Function f : func){
            CustomTreeNode func_node = new CustomTreeNode(f.getName() + "("+ f.getDescription() + ")",NodeType.FUNCTION);
            CustomTreeNode Productnode = new CustomTreeNode("Product",NodeType.PRODUCT);

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

                CustomTreeNode Tnode = new CustomTreeNode(Tname,NodeType.TABLE);
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
            CustomTreeNode axisNode = new CustomTreeNode(ax.getName(),NodeType.AXIS);

            List<Function> axis_func = ax.getFunction();
            for (Function ax_f : axis_func){
                CustomTreeNode func_node = new CustomTreeNode(ax_f.getName() + "("+ ax_f.getDescription() + ")",NodeType.FUNCTION);

                Product P = ax_f.getProduct();
                if(P != null){
                    CustomTreeNode Productnode = new CustomTreeNode("Product",NodeType.PRODUCT);

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

                                CustomTreeNode Tnode = new CustomTreeNode(Tname,NodeType.TABLE);
                                Productnode.add(Tnode);
                                //System.out.println("\t\t\t\t"+Tnode);

                                //link table data using hashmap
                                //List<TableData> tableData = T.getTableData();
                                //tableDataMap.put(Tname,tableData);
                            }
                        }else if (o instanceof JAXBElement){
                            JAXBElement<?> element = (JAXBElement<?>) o;
                            Object value = element.getValue();
                            if (value instanceof String) {
                                String propertyOrValue = (String) value;
                                // Check if it is a property or a value
                                if (element.getName().getLocalPart().equals("property")) {
                                    // Process the property name
                                    CustomTreeNode PropNode = new CustomTreeNode(propertyOrValue,NodeType.PROPERTY);
                                    Productnode.add(PropNode);
                                    //System.out.println("\t\t\t\t" + PropNode);
                                }
                            } else {
                                    CustomTreeNode ValueNode = new CustomTreeNode(value,NodeType.VALUE);
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
        aeroTree.setToggleClickCount(0);    //disable double click expand and collapse
        aeroTree.setCellRenderer(new CustomTreeCellRenderer()); //allows icons for each node
        aeroTree.setShowsRootHandles(true);         //displays the root node, and allows to collapse to see only root node

        ScrollPane = new JScrollPane(aeroTree);         //allows scrolling when the tree is expanded fully
        this.setLayout(new BorderLayout());
        this.add(ScrollPane, BorderLayout.CENTER); 
        
        aeroTree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
            // This will be triggered when a node is selected, handle the event if needed
            }
        });

    //mouse listener for double click
        aeroTree.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e) && e.getClickCount() == 2) {
                                        
                    TreePath path = aeroTree.getPathForLocation(e.getX(), e.getY());
                    if (path != null) {
                        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) path.getLastPathComponent();
                        if (selectedNode.toString().equals("Aerodynamics")) {
                            showAerodynamicsPropertiesPopup();
                        } else {
                            showPopup(selectedNode);
                        }
                    }
                }
            }
        });
    }
    //set custom nodes to represent node type
    public class CustomTreeNode extends DefaultMutableTreeNode {
        private NodeType nodeType;
        public CustomTreeNode(Object userObject, NodeType nodeType) {
            super(userObject);
            this.nodeType = nodeType;
        }
        public NodeType getNodeType() {
            return nodeType;
        }
    }

    //class to give correct icons to each node
    private static class CustomTreeCellRenderer extends DefaultTreeCellRenderer{
        
        private Icon aeroIcon = new ImageIcon(LoadSave.getContext().getResource(Constants.AERO_RES));
        private Icon axisIcon = new ImageIcon(LoadSave.getContext().getResource(Constants.AXIS_RES));
        private Icon funcIcon = new ImageIcon(LoadSave.getContext().getResource(Constants.FUNCTION_RES));
        private Icon productIcon = new ImageIcon(LoadSave.getContext().getResource(Constants.PRODUCT_RES));
        private Icon propIcon = new ImageIcon(LoadSave.getContext().getResource(Constants.PROPERTY_RES));
        private Icon tableIcon = new ImageIcon(LoadSave.getContext().getResource(Constants.TABLE_RES));
        private Icon valueIcon = new ImageIcon(LoadSave.getContext().getResource(Constants.VALUE_RES));

        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus){
            super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);

            if (value instanceof CustomTreeNode) {
                CustomTreeNode node = (CustomTreeNode) value;
                NodeType nodeType = node.getNodeType();
    
                switch (nodeType) {
                    case AERODYNAMICS:
                        setIcon(aeroIcon);
                        break;
                    case AXIS:
                        setIcon(axisIcon);
                        break; 
                    case FUNCTION:
                        setIcon(funcIcon);
                        break;
                    case PRODUCT:
                        setIcon(productIcon);
                        break;
                    case PROPERTY:
                        setIcon(propIcon);
                        break;
                    case TABLE:
                        setIcon(tableIcon);
                        break;
                    case VALUE:
                        setIcon(valueIcon);
                        break;
                }
            }
            return this;
        }
    }

    private void showAerodynamicsPropertiesPopup() {
        // Create and show the Aerodynamics Properties Popup
        AerodynamicsPropertiesPopup popup = new AerodynamicsPropertiesPopup(null);
        popup.setVisible(true);
    }

    private class AerodynamicsPropertiesPopup extends JDialog {

        private JCheckBox alphaLimitsCheckBox;
        private JCheckBox hysteresisLimitsCheckBox;
        private JButton okButton;
        private JButton cancelButton;

        public AerodynamicsPropertiesPopup(Frame parent) {
            super(parent, "Aerodynamics Properties", true);
            initializeComponents();
        }

        private void initializeComponents() {
            // Set layout
            setLayout(new GridLayout(0,2,5,5));

            alphaLimitsCheckBox = new JCheckBox("Enable Alpha Limits");
            configureEnabledState(alphalimitsMinText, alphalimitsMaxText, alphaLimitsCheckBox);
            
            hysteresisLimitsCheckBox = new JCheckBox("Enable Hysteresis Limits");
            configureEnabledState(hysteresisLimitsMinText, hysteresisLimitsMaxText, hysteresisLimitsCheckBox);

            okButton = new JButton("OK");
            cancelButton = new JButton("Cancel");
            // Add action listener to OK button
            
            add(alphaLimitsCheckBox);
            add((new JPanel()));
            add(new JLabel("Min Alpha:"));
            add(alphalimitsMinText);
            add(new JLabel("Max Alpha:"));
            add(alphalimitsMaxText);

            add(hysteresisLimitsCheckBox);
            add((new JPanel()));
            add(new JLabel("Min Hysteresis:"));
            add(hysteresisLimitsMinText);
            add(new JLabel("Max Hysteresis:"));
            add(hysteresisLimitsMaxText);

            add(okButton);
            add(cancelButton);
            
            okButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle OK button click (save values, close the window, etc.)
                    dispose(); // Close the popup
                }
            });

            // Add action listener to Cancel button
            cancelButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle Cancel button click (close the window without saving)
                    dispose(); // Close the popup
                }
            });

            alphaLimitsCheckBox.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent e){
                    configureEnabledState(alphalimitsMinText, alphalimitsMaxText, alphaLimitsCheckBox);
                }
            });

            hysteresisLimitsCheckBox.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent e){
                    configureEnabledState(hysteresisLimitsMinText, hysteresisLimitsMaxText, hysteresisLimitsCheckBox);
                }
            });

            setSize(300,200);
            setLocationRelativeTo(getParent());
        }
        private void configureEnabledState(JTextField minField, JTextField maxField, JCheckBox checkBox) {
            boolean isEnabled = checkBox.isSelected();
            minField.setEnabled(isEnabled);
            maxField.setEnabled(isEnabled);
        }
    }
 
    private void showFunctionorProductPopUp(String nodeName) {
        if(!nodeName.equals("Product")){
            String[] parts = nodeName.split("\\(");
            functionText.setText(parts[0].trim());
            //System.out.println(parts[0]);
            functiondescText.setText(parts[1].replace("\\)", "").trim());
            //System.out.println(parts[1]);
            functionoroperatortype.setText("function");

        } else {
            functionText.setText("");
            functiondescText.setText("");
            functionoroperatortype.setText("product");
            functionText.setEnabled(false);
            functiondescText.setEnabled(false);
        }
        FunctionOrProductPopUp fPopup = new FunctionOrProductPopUp(null);
        fPopup.setVisible(true);
    }

    private class FunctionOrProductPopUp extends JDialog{
        private JButton okButton;
        private JButton cancelButton;

        public FunctionOrProductPopUp(Frame parent){
            super(parent, "Fuction or Operator", true);
            initializeComponents();
        }

        private void initializeComponents(){

            setLayout(new GridLayout(0,2,5,5));

            okButton = new JButton("OK");
            cancelButton = new JButton("Cancel");
            // Add action listener to OK button
            
            add(new JLabel("Type"));//add(functionoroperatortype);
      
			//---- releaseLevelCombo ----
		    operatorBox = new JComboBox<>();
            operatorBox.setMaximumRowCount(25);
		    operatorBox.setModel(new DefaultComboBoxModel<>(new String[] {
                "function","product","difference","sum","quotient","pow","abs",
                "sin","cos","tan","asin","acos","atan","derivative","integral",
                "it","le","ge","gt","eq","ne","and","or","not","ifthen"
		    }));

            operatorBox.setSelectedItem(functionoroperatortype.getText());
            add(operatorBox);
           
            add(new JLabel("Name"));add(functionText);
            add(new JLabel("Description"));add(functiondescText);

            add(okButton);
            add(cancelButton);


            okButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle OK button click (save values, close the window, etc.)
                    dispose(); // Close the popup
                }
            });
            // Add action listener to Cancel button
            cancelButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle Cancel button click (close the window without saving)
                    dispose(); // Close the popup
                }
            });
            setSize(300,200);
            setLocationRelativeTo(getParent());
        }
    }

    private void showValuePopUp(String nodeName){
        //System.out.println(nodeName);
        //Get value from xml
        ValueFloat.setText(nodeName);
        
        ValuePopUp popup = new ValuePopUp(null);
        popup.setVisible(true);
    }
    
    private class ValuePopUp extends JDialog {
        private JButton okButton;
        private JButton cancelButton;

        public ValuePopUp(Frame parent) {
            super(parent, "Input Value", true);
            initializeComponents();
        }

        private void initializeComponents() {
             // Set layout
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5, 5, 5);

            // Value label
            gbc.gridx = 0;
            gbc.gridy = 0;
            add(new JLabel("Value:"), gbc);

            // Value text field
            gbc.gridx = 1;
            gbc.gridy = 0;
            add(ValueFloat, gbc);

            // OK button
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.gridwidth = 2;
            okButton = new JButton("OK");
            add(okButton, gbc);

            // Cancel button
            gbc.gridy = 2;
            cancelButton = new JButton("Cancel");
            add(cancelButton, gbc);

            okButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle OK button click (save values, close the window, etc.)
                    dispose(); // Close the popup
                }
            });

            // Add action listener to Cancel button
            cancelButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle Cancel button click (close the window without saving)
                    dispose(); // Close the popup
                }
            });

            setSize(300,200);
            setLocationRelativeTo(getParent());
        }
    }
    
/*     private void showTablePopUp(String nodeName){
        List<TableData> tableData = tableDataMap.get(nodeName);
        TablePopUp popup = new TablePopUp((Frame) SwingUtilities.getWindowAncestor(this), nodeName, tableData);
        popup.setVisible(true);
    }

    private class TablePopUp extends JDialog{
        private JTable table;
        private JButton okButton;
        private JButton cancelButton;

        public TablePopUp(Frame parent, String tableName, List<TableData> tableData) {
            super(parent, "Table Properties", true);
            initializeComponents(tableData);
        }

        private void initializeComponents(List<TableData> tableData){
            setLayout(new BorderLayout());
            okButton = new JButton("Ok");
            cancelButton = new JButton("Cancel");
            // Create a JTable to display the table data
            String[] columnNames = {"Column 1", "Column 2"}; // Change these names based on your data
            Object[][] rowData = new Object[tableData.size()][columnNames.length];

            for (int i = 0; i < tableData.size(); i++) {
                String[] values = tableData.get(i).getValue().split("\\s+");
                rowData[i] = values;
            }

            table = new JTable(rowData, columnNames);
            JScrollPane scrollPane = new JScrollPane(table);
            add(scrollPane, BorderLayout.CENTER);
            
            okButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle OK button click (save values, close the window, etc.)
                    dispose(); // Close the popup
                }
            });

            // Add action listener to Cancel button
            cancelButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle Cancel button click (close the window without saving)
                    dispose(); // Close the popup
                }
            });
            
            
            JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
            buttonPanel.add(okButton);
            buttonPanel.add(cancelButton);
            add(buttonPanel, BorderLayout.SOUTH);

            setSize(400,300);
            setLocationRelativeTo(getParent());
        }
    }*/
    
    private void showAxisPopUp(String nodeName){
        //System.out.println(nodeName);
        AxisName.setText(nodeName);
        AxisPopUp popup = new AxisPopUp(null);
        popup.setVisible(true);
    }
    
    private class AxisPopUp extends JDialog {
        private JButton okButton;
        private JButton cancelButton;

        public AxisPopUp(Frame parent) {
            super(parent, "Axis Properties", true);
            initializeComponents();
        }

        private void initializeComponents() {
             // Set layout
            setLayout(new GridLayout(0,2,5,5));
            operatorBox = new JComboBox<>();
            operatorBox.setMaximumRowCount(10);
		    operatorBox.setModel(new DefaultComboBoxModel<>(new String[] {
                "Undef","DRAG","SIDE","LIFT","ROLL","PITCH","YAW","FORWARD","RIGHT","DOWN"
		    }));
            if(AxisName != null){
                //System.out.println(AxisName);
                operatorBox.setSelectedItem(AxisName.getText());
            }else{
                operatorBox.setSelectedItem("Undef");
            }
            // Value label
            add(new JLabel("Name:"));
            add(operatorBox);

            // OK button
            okButton = new JButton("OK");
            add(okButton);

            // Cancel button
            cancelButton = new JButton("Cancel");
            add(cancelButton);

            okButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle OK button click (save values, close the window, etc.)
                    dispose(); // Close the popup
                }
            });

            // Add action listener to Cancel button
            cancelButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle Cancel button click (close the window without saving)
                    dispose(); // Close the popup
                }
            });

            setSize(300,200);
            setLocationRelativeTo(getParent());
        }
    }
    
    private void showPopup(DefaultMutableTreeNode node){
        String nodeName = node.toString();
        if (nodeName.equals("Aerodynamics")) {
            apropertiesPopup.setVisible(true);
        } else {
            NodeType nodeType = ((CustomTreeNode) node).getNodeType();
            switch(nodeType) {
                case PRODUCT:
                    showFunctionorProductPopUp(nodeName);
                    break;
                case FUNCTION:
                    showFunctionorProductPopUp(nodeName);
                    break;
                case VALUE:
                    showValuePopUp(nodeName);
                    break;
                case AXIS:
                    showAxisPopUp(nodeName);
                    break;
                //case TABLE:
                   // showTablePopUp(nodeName);
                   // break;
            }
        }
    }

    @Override
    public Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg) {
        // TODO
        return Optional.ofNullable(cfg);
    }

 /*    public List<TableData> getTableData(String Tname){
        List<TableData> tableDataList = new ArrayList<>();

        

        return tableDataList;
    }*/

    private void initComponents(){
        alphalimitsMinText = new JTextField();
        alphalimitsMaxText = new JTextField();
        alphalimitsUnitText = new JTextField();

        hysteresisLimitsMinText = new JTextField();
        hysteresisLimitsMaxText = new JTextField();
        hysteresisLimitsUnitText = new JTextField();

        functionText = new JTextField();
        functiondescText = new JTextField();
        functionoroperatortype = new JLabel();
        ValueFloat = new JTextField();
        AxisName = new JTextField();
    }

    public enum NodeType {
        AERODYNAMICS,
        FUNCTION,
        AXIS,
        PRODUCT,
        PROPERTY,
        TABLE,
        VALUE
    }

    //variables
    private JScrollPane ScrollPane;
    private JTree aeroTree;
    FdmConfig cfg;
    Aerodynamics a;
    List<Function> funcs;
    List<Axis> axis;

    private JTextField alphalimitsMinText;
    private JTextField alphalimitsMaxText;
    private JTextField alphalimitsUnitText;
    private JTextField hysteresisLimitsMinText;
    private JTextField hysteresisLimitsMaxText;
    private JTextField hysteresisLimitsUnitText;
    private JTextField functionText;
    private JTextField functiondescText;
    private JLabel functionoroperatortype;
    private JTextField AxisName;
    private JTextField ValueFloat;
    private JComboBox<String> operatorBox;
    //private Map<String,List<TableData>> tableDataMap = new HashMap<>();
}

