package uta.cse.cse3310.JSBSimEdit;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Wed Nov 22 14:13:41 CST 2023
 */

import uta.cse.cse3310.JSBSimEdit.utils.Constants;
import uta.cse.cse3310.JSBSimEdit.utils.LoadSave;



/**
 * @author seans
 */
public class Force extends JDialog {
	public Force() {
		initComponents();
        setVisible(true);
	}

    public Force(Force oldForce){
        initComponents();
        setVisible(true);
        setDetails(oldForce);
    }

    public Force(Double locXFromXML, Double locYFromXML, Double locZFromXML,
                 Double dirXFromXML,Double dirYFromXML, Double dirZFromXML,generated.Function function){

        initComponents();
        setVisible(true);

        if(this.locXFromXML != null)
            this.locXFromXML = locXFromXML;
        else this.locXFromXML = null;

        if(this.locYFromXML != null)
            this.locYFromXML = locYFromXML;
        else this.locYFromXML = null;

        if(this.locZFromXML != null)
            this.locZFromXML = locZFromXML;
        else this.locZFromXML = null;


        if(this.dirXFromXML != null)
            this.dirXFromXML = dirXFromXML;
        else this.dirXFromXML = null;

        if(this.dirYFromXML != null)
            this.dirYFromXML = dirYFromXML;
        else this.dirYFromXML = null;

        if(this.dirZFromXML != null)
            this.dirZFromXML = dirZFromXML;
        else this.dirZFromXML = null;


        CustomTreeNodeForce root = new CustomTreeNodeForce(function.getName() + "("+ function.getDescription() + ")",NodeTypeForce.FUNCTION);
		
    }

		private class CustomTreeNodeForce extends DefaultMutableTreeNode {
			private NodeTypeForce nodeTypeForce;
			private String treeNodeName;
			private CustomTreeNodeForce(Object userObject, NodeTypeForce nodeType) {
				super(userObject);
				this.nodeTypeForce = nodeType;
			}
			private CustomTreeNodeForce(String treeNodeName, NodeTypeForce nodeTypeForce) {
				this.treeNodeName = treeNodeName;
				this.nodeTypeForce = nodeTypeForce;
			}
			private NodeTypeForce getNodeType() {
				return nodeTypeForce;
			}
		}
         //set custom nodes to represent node type

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

            if (value instanceof CustomTreeNodeForce) {
                CustomTreeNodeForce node = (CustomTreeNodeForce) value;
                NodeTypeForce nodeType = node.getNodeType();
    
                switch (nodeType) {
                    case AERODYNAMICS:
                        setIcon(aeroIcon);
                        break;
                    case FUNCTION:
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
                    // Add more cases as needed
                }
            }
            return this;
        }
    }
	private void setDetails(Force oldForce){
		nameF.setText(oldForce.getNameForce());
		locXF.setText(oldForce.getLocationXForce());
		frameF.setText(oldForce.getFrameForce());
	}

	private void okButton(ActionEvent e) {
		// TODO add your code here
	}

	private void cancelButton(ActionEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Educational license - Sean McElroy (Patrick McElroy)
		dialogPane = new JPanel();
		contentPanel = new JPanel();
		nameFunPanel = new JPanel();
		nameL = new JLabel();
		nameF = new JTextField();
		frameL = new JLabel();
		frameF = new JTextField();
		funL = new JLabel();
		funTree = new JTree();
		locationPanel = new JPanel();
		locXL = new JLabel();
		locXF = new JTextField();
		locYL = new JLabel();
		locYF = new JTextField();
		locZL = new JLabel();
		locZF = new JTextField();
		locUnitBox = new JComboBox();
		panel3 = new JPanel();
		dirXL = new JLabel();
		dirXF = new JTextField();
		dirYL = new JLabel();
		dirYF = new JTextField();
		dirZL = new JLabel();
		dirZF = new JTextField();
		dirUntiBox = new JComboBox();
		buttonBar = new JPanel();
		okButton = new JButton();
		cancelButton = new JButton();

		//======== this ========
		setTitle("Force");
        setAlwaysOnTop(true);
        setModal(true);
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setLayout(new BorderLayout());

			//======== contentPanel ========
			{
				contentPanel.setLayout(new MigLayout(
					"fill,insets dialog,hidemode 3",
					// columns
					"[fill]",
					// rows
					"[]" +
					"[]"));

				//======== nameFunPanel ========
				{
					nameFunPanel.setLayout(new MigLayout(
						"fill,hidemode 3",
						// columns
						"[fill]" +
						"[fill]" +
						"[fill]" +
						"[fill]" +
						"[fill]",
						// rows
						"[]" +
						"[]" +
						"[]"));

					//---- nameL ----
					nameL.setText("Name");
					nameFunPanel.add(nameL, "cell 1 0,alignx right,growx 0");
					nameFunPanel.add(nameF, "cell 2 0,growx");

					//---- frameL ----
					frameL.setText("Frame");
					nameFunPanel.add(frameL, "cell 1 1,alignx right,growx 0");
					nameFunPanel.add(frameF, "cell 2 1");

					//---- funL ----
					funL.setText("Function");
					nameFunPanel.add(funL, "cell 1 2,alignx right,growx 0");
					nameFunPanel.add(funTree, "cell 2 2");
				}
				contentPanel.add(nameFunPanel, "cell 0 0");

				//======== locationPanel ========
				{
					locationPanel.setBorder(new TitledBorder("Location*"));
					locationPanel.setLayout(new MigLayout(
						"fill,hidemode 3",
						// columns
						"[fill]" +
						"[fill]" +
						"[fill]" +
						"[fill]" +
						"[fill]" +
						"[fill]" +
						"[fill]",
						// rows
						"[]"));

					//---- locXL ----
					locXL.setText("x=");
					locationPanel.add(locXL, "cell 0 0,alignx right,growx 0");
					locationPanel.add(locXF, "cell 1 0,alignx leading,growx 0");

					//---- locYL ----
					locYL.setText("y=");
					locationPanel.add(locYL, "cell 2 0,alignx right,growx 0");
					locationPanel.add(locYF, "cell 3 0,alignx leading,growx 0");

					//---- locZL ----
					locZL.setText("z=");
					locationPanel.add(locZL, "cell 4 0,alignx right,growx 0");
					locationPanel.add(locZF, "cell 5 0,alignx leading,growx 0");
					locationPanel.add(locUnitBox, "cell 6 0,alignx leading,growx 0");
				}
				contentPanel.add(locationPanel, "cell 0 1,growy");

				//======== panel3 ========
				{
					panel3.setBorder(new TitledBorder("Direction*"));
					panel3.setLayout(new MigLayout(
						"fill,hidemode 3",
						// columns
						"[fill]" +
						"[fill]" +
						"[fill]" +
						"[fill]" +
						"[fill]" +
						"[fill]" +
						"[fill]",
						// rows
						"[]"));

					//---- dirXL ----
					dirXL.setText("x=");
					panel3.add(dirXL, "cell 0 0,alignx right,growx 0");
					panel3.add(dirXF, "cell 1 0,alignx leading,growx 0");

					//---- dirYL ----
					dirYL.setText("y=");
					panel3.add(dirYL, "cell 2 0,alignx right,growx 0");
					panel3.add(dirYF, "cell 3 0,alignx leading,growx 0");

					//---- dirZL ----
					dirZL.setText("z=");
					panel3.add(dirZL, "cell 4 0,alignx right,growx 0");
					panel3.add(dirZF, "cell 5 0,alignx leading,growx 0");
					panel3.add(dirUntiBox, "cell 6 0,alignx leading,growx 0");
				}
				contentPanel.add(panel3, "cell 0 2,growy");
			}
			dialogPane.add(contentPanel, BorderLayout.CENTER);

			//======== buttonBar ========
			{
				buttonBar.setLayout(new MigLayout(
					"insets dialog,alignx center",
					// columns
					"[button,fill]" +
					"[button,fill]",
					// rows
					null));

				//---- okButton ----
				okButton.setText("OK");
				okButton.addActionListener(e -> okButton(e));
				buttonBar.add(okButton, "cell 0 0");

				//---- cancelButton ----
				cancelButton.setText("Cancel");
				cancelButton.addActionListener(e -> cancelButton(e));
				buttonBar.add(cancelButton, "cell 1 0");
			}
			dialogPane.add(buttonBar, BorderLayout.SOUTH);
		}
		contentPane.add(dialogPane, BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

    public String getNameForce() {return name;}
	private String getLocationXForce() {return location;}
	private String getFrameForce() {return frame;}

    private enum NodeTypeForce {
        AERODYNAMICS,
        FUNCTION,
        AXIS,
        PRODUCT,
        PROPERTY,
        TABLE,
        VALUE
    }

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Educational license - Sean McElroy (Patrick McElroy)
	private JPanel dialogPane;
	private JPanel contentPanel;
	private JPanel nameFunPanel;
	private JLabel nameL;
	private JTextField nameF;
	private JLabel frameL;
	private JTextField frameF;
	private JLabel funL;
	private JTree funTree;
	private JPanel locationPanel;
	private JLabel locXL;
	private JTextField locXF;
	private JLabel locYL;
	private JTextField locYF;
	private JLabel locZL;
	private JTextField locZF;
	private JComboBox locUnitBox;
	private JPanel panel3;
	private JLabel dirXL;
	private JTextField dirXF;
	private JLabel dirYL;
	private JTextField dirYF;
	private JLabel dirZL;
	private JTextField dirZF;
	private JComboBox dirUntiBox;
	private JPanel buttonBar;
	private JButton okButton;
	private JButton cancelButton;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
	private String name, location, frame, treeNodeName;
    private Double locXFromXML,locYFromXML,locZFromXML,
                   dirXFromXML,dirYFromXML,dirZFromXML;
	private NodeTypeForce nodeTypeForce;
}
