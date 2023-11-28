package uta.cse.cse3310.JSBSimEdit;

import java.awt.event.ActionEvent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.lang.StringBuilder;
import javax.swing.border.*;
import net.miginfocom.swing.*;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
/*
 * Created by JFormDesigner on Tue Nov 14 18:13:43 CST 2023
 * views/ExternalForce.jfd
 */



/**
 * @author seans
 */
public class ExternalForce extends JDialog {
	public ExternalForce() {
		initComponents();
		setVisible(true);
	}
        
        public ExternalForce(String name, String frame, String dirName, String locUnit,
                             String dirUnit, Double xLoc, Double yLoc, Double zLoc,
                             Double xDir, Double yDir, Double zDir) {
            
            initComponents();
            this.name = name;
            this.frame = frame;
            this.dirName = dirName;
            this.locUnit = locUnit;
            this.dirUnit = dirUnit;
            
            this.xLoc = xLoc;
            this.yLoc = yLoc;
            this.zLoc = zLoc;
            this.xDir = xDir;
            this.yDir = yDir;
            this.zDir = zDir;
	}
        
        public ExternalForce(ExternalForce other) {
		initComponents();
                setDetails(other);
		setVisible(true);
	}

	private void cancelBpressed(ActionEvent e) {
	    this.dispose();
	}

	private void okBpressed(ActionEvent e) {
            name = nameT.getText().trim();
            frame = frameC.getSelectedItem().toString();
            dirName = dirNameT.getText().trim();
            
            locUnit = locC.getSelectedItem().toString(); //location
            xLoc = Double.parseDouble(xT.getText().trim()); 
            yLoc = Double.parseDouble(yT.getText().trim());
            zLoc = Double.parseDouble(zT.getText().trim());
            
            xDir = Double.parseDouble(dirXT.getText().trim()); //direction
            yDir = Double.parseDouble(dirYT.getText().trim());
            zDir = Double.parseDouble(dirZT.getText().trim());
            dirUnit = dirC.getSelectedItem().toString();
            this.dispose();
	}
        
        private void setDetails(ExternalForce other){
            nameT.setText(other.getName());
            dirNameT.setText(other.getDirName());
            
            /*if(other.getFrame() != null)*/ frameC.setSelectedItem(other.getFrame());
//            else frameC.setSelectedItem("BODY");
            
            locC.setSelectedItem(other.getLocU());
            xT.setText(Double.toString(other.getXLoc()));
            yT.setText(Double.toString(other.getYLoc()));
            zT.setText(Double.toString(other.getZLoc()));
            
            dirXT.setText(Double.toString(other.getXLoc()));
            dirYT.setText(Double.toString(other.getYLoc()));
            dirZT.setText(Double.toString(other.getZLoc()));
            dirC.setSelectedItem(other.getDirU());
        }

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Connor Baldwin
		nameP = new JPanel();
		nameT = new JTextField();
		LocP = new JPanel();
		xL = new JLabel();
		xT = new JTextField();
		yL = new JLabel();
		yT = new JTextField();
		zL = new JLabel();
		zT = new JTextField();
		locC = new JComboBox<>();
		frameP = new JPanel();
		frameC = new JComboBox<>();
		bottomP = new JPanel();
		funcP = new JPanel();
		dirP = new JPanel();
		dirNameP = new JPanel();
		dirNameL = new JLabel();
		dirNameT = new JTextField();
		dirdirP = new JPanel();
		dirX = new JLabel();
		dirXT = new JTextField();
		dirY = new JLabel();
		dirYT = new JTextField();
		dirC = new JComboBox<>();
		dirZ = new JLabel();
		dirZT = new JTextField();
		buttonsP = new JPanel();
		okB = new JButton();
		cancelB = new JButton();

		//======== this ========
		setModal(true);
		var contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
		    "hidemode 3,align center center",
		    // columns
		    "[33,fill]",
		    // rows
		    "[]" +
		    "[]" +
		    "[]" +
		    "[]" +
		    "[]"));

		//======== nameP ========
		{
		    nameP.setBorder(new TitledBorder("Name"));
		    nameP.setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing.
		    border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax. swing .border . TitledBorder. CENTER
		    ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069al\u006fg", java .awt . Font
		    . BOLD ,12 ) ,java . awt. Color .red ) ,nameP. getBorder () ) ); nameP. addPropertyChangeListener(
		    new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java . beans. PropertyChangeEvent e) { if( "\u0062or\u0064er"
		    .equals ( e. getPropertyName () ) )throw new RuntimeException( ) ;} } );
		    nameP.setLayout(new MigLayout(
			"hidemode 3,align center center",
			// columns
			"[fill]",
			// rows
			"[]"));

		    //---- nameT ----
		    nameT.setText("Force");
		    nameP.add(nameT, "cell 0 0,aligny center,grow 100 0");
		}
		contentPane.add(nameP, "cell 0 0,aligny center,grow 100 0");

		//======== LocP ========
		{
		    LocP.setBorder(new TitledBorder("Location"));
		    LocP.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]",
			// rows
			"[]"));

		    //---- xL ----
		    xL.setText("x =");
		    LocP.add(xL, "cell 0 0");

		    //---- xT ----
		    xT.setText("0");
		    LocP.add(xT, "cell 1 0");

		    //---- yL ----
		    yL.setText("y =");
		    LocP.add(yL, "cell 2 0");

		    //---- yT ----
		    yT.setText("0");
		    LocP.add(yT, "cell 3 0");

		    //---- zL ----
		    zL.setText("z =");
		    LocP.add(zL, "cell 4 0");

		    //---- zT ----
		    zT.setText("0");
		    LocP.add(zT, "cell 5 0");

		    //---- locC ----
		    locC.setModel(new DefaultComboBoxModel<>(new String[] {
			"M",
			"FT",
			"IN"
		    }));
		    LocP.add(locC, "cell 6 0");
		}
		contentPane.add(LocP, "cell 0 1,align center center,grow 0 0");

		//======== frameP ========
		{
		    frameP.setBorder(new TitledBorder("Frame"));
		    frameP.setLayout(new MigLayout(
			"hidemode 3,align center center",
			// columns
			"[fill]",
			// rows
			"[]"));

		    //---- frameC ----
		    frameC.setModel(new DefaultComboBoxModel<>(new String[] {
			"BODY",
			"LOCAL",
			"WIND"
		    }));
		    frameP.add(frameC, "cell 0 0");
		}
		contentPane.add(frameP, "cell 0 2,grow");

		//======== bottomP ========
		{
		    bottomP.setLayout(new MigLayout(
			"hidemode 3,align center center",
			// columns
			"[fill]" +
			"[fill]",
			// rows
			"[]"));

		    //======== funcP ========
		    {
			funcP.setBorder(new TitledBorder("Function(s)"));
			funcP.setLayout(new MigLayout(
			    "fill,hidemode 3",
			    // columns
			    "[fill]",
			    // rows
			    "[]"));
		    }
		    bottomP.add(funcP, "cell 0 0,grow");

		    //======== dirP ========
		    {
			dirP.setBorder(new TitledBorder("Direction"));
			dirP.setLayout(new MigLayout(
			    "fill,hidemode 3",
			    // columns
			    "[fill]",
			    // rows
			    "[]" +
			    "[]" +
			    "[]"));

			//======== dirNameP ========
			{
			    dirNameP.setLayout(new MigLayout(
				"hidemode 3",
				// columns
				"[fill]" +
				"[fill]",
				// rows
				"[]"));

			    //---- dirNameL ----
			    dirNameL.setText("Name");
			    dirNameP.add(dirNameL, "cell 0 0");

			    //---- dirNameT ----
			    dirNameT.setText("direction");
			    dirNameP.add(dirNameT, "cell 1 0");
			}
			dirP.add(dirNameP, "cell 0 0,align center center,grow 0 0");

			//======== dirdirP ========
			{
			    dirdirP.setLayout(new MigLayout(
				"hidemode 3",
				// columns
				"[fill]" +
				"[fill]" +
				"[fill]",
				// rows
				"[]" +
				"[]" +
				"[]"));

			    //---- dirX ----
			    dirX.setText("x =");
			    dirdirP.add(dirX, "cell 0 0");

			    //---- dirXT ----
			    dirXT.setText("0");
			    dirdirP.add(dirXT, "cell 1 0");

			    //---- dirY ----
			    dirY.setText("y =");
			    dirdirP.add(dirY, "cell 0 1");

			    //---- dirYT ----
			    dirYT.setText("0");
			    dirdirP.add(dirYT, "cell 1 1");

			    //---- dirC ----
			    dirC.setModel(new DefaultComboBoxModel<>(new String[] {
				"M",
				"FT",
				"IN"
			    }));
			    dirdirP.add(dirC, "cell 2 1");

			    //---- dirZ ----
			    dirZ.setText("z =");
			    dirdirP.add(dirZ, "cell 0 2");

			    //---- dirZT ----
			    dirZT.setText("0");
			    dirdirP.add(dirZT, "cell 1 2");
			}
			dirP.add(dirdirP, "cell 0 1,align center center,grow 0 0");
		    }
		    bottomP.add(dirP, "cell 1 0,grow");
		}
		contentPane.add(bottomP, "cell 0 3,grow");

		//======== buttonsP ========
		{
		    buttonsP.setLayout(new MigLayout(
			"hidemode 3,align center center",
			// columns
			"[fill]" +
			"[fill]",
			// rows
			"[]"));

		    //---- okB ----
		    okB.setText("OK");
		    okB.addActionListener(e -> okBpressed(e));
		    buttonsP.add(okB, "cell 0 0");

		    //---- cancelB ----
		    cancelB.setText("Cancel");
		    cancelB.addActionListener(e -> cancelBpressed(e));
		    buttonsP.add(cancelB, "cell 1 0");
		}
		contentPane.add(buttonsP, "cell 0 4,grow");
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}
        
        public Double getXLoc(){return xLoc;}
        public Double getYLoc() {return yLoc;}
        public Double getZLoc(){return zLoc;}
        public Double getXDir(){return xDir;}
        public Double getYDir(){return yDir;}
        public Double getZDir(){return zDir;}
        
        public String getName(){return name;}
        public String getFrame(){return frame;}
        public String getDirName(){return dirName;}
        public String getDirU(){return dirUnit;}
        public String getLocU(){return locUnit;}
        
        @Override
        public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append(name + " at point [" + xLoc + ", " + yLoc + ", " + zLoc + "] in "
                  + locUnit + " in direction [" + xDir + ", " + yDir + ", " + zDir + "] in " + dirUnit);
            return sb.toString();
        }

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Connor Baldwin
	private JPanel nameP;
	private JTextField nameT;
	private JPanel LocP;
	private JLabel xL;
	private JTextField xT;
	private JLabel yL;
	private JTextField yT;
	private JLabel zL;
	private JTextField zT;
	private JComboBox<String> locC;
	private JPanel frameP;
	private JComboBox<String> frameC;
	private JPanel bottomP;
	private JPanel funcP;
	private JPanel dirP;
	private JPanel dirNameP;
	private JLabel dirNameL;
	private JTextField dirNameT;
	private JPanel dirdirP;
	private JLabel dirX;
	private JTextField dirXT;
	private JLabel dirY;
	private JTextField dirYT;
	private JComboBox<String> dirC;
	private JLabel dirZ;
	private JTextField dirZT;
	private JPanel buttonsP;
	private JButton okB;
	private JButton cancelB;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
        
        private Double xLoc, yLoc, zLoc, xDir, yDir, zDir;
        private String name, frame, dirName, dirUnit, locUnit;
}
