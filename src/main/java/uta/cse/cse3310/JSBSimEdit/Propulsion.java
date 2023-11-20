package uta.cse.cse3310.JSBSimEdit;

import java.awt.event.ActionEvent;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import generated.FdmConfig;

import net.miginfocom.swing.MigLayout;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;

public class Propulsion extends JPanel implements TabComponent {
    
    Propulsion() {
        propComponents();
		listETS = new ArrayList<EngineThrusterSetup>();
		listTS = new ArrayList<TankSetup>();
			
    }

    @Override
    public void bindUIwithXML(FdmConfig cfg) {

		ArrayList<generated.Engine> engine = new ArrayList<>();
        if(cfg.getPropulsion().getEngineOrTank() != null){
            
            for(Object o : cfg.getPropulsion().getEngineOrTank()){ 
                if(o instanceof generated.Engine){               
                    generated.Engine e = (generated.Engine) o;
                    engine.add(e);
                }
            }
			for(generated.Engine e : engine){ 
                if(e.getFeed() != null && e.getDescription() != null  && e.getFile() != null) {

					Double thrusterRoll, thrusterPitch, thrusterYaw,
					thrusterX, thrusterY, thrusterZ;
					int feed = 0;
					String thrusName, thrusterLocUnit, thrusterOrientUnit;


					if(e.getThruster() != null){ //springCo
                        thrusName = e.getThruster().getFile();
                        thrusterLocUnit = e.getThruster().getLocation().getUnit();
						thrusterOrientUnit = e.getThruster().getOrient().getUnit();

						thrusterRoll = e.getThruster().getOrient().getRoll();
						thrusterPitch = e.getThruster().getOrient().getPitch();
						thrusterYaw = e.getThruster().getOrient().getYaw();

						thrusterX = e.getThruster().getLocation().getX();
						thrusterY = e.getThruster().getLocation().getY();
						thrusterZ = e.getThruster().getLocation().getZ();
                    }
                    else{
                        thrusName = null;
                        thrusterLocUnit = null;
						thrusterOrientUnit = null;

						thrusterRoll = null;
						thrusterPitch = null;
						thrusterYaw = null;

						thrusterX = null;
						thrusterY = null;
						thrusterZ = null;
                    }
	
					if (e.getFeed() != null) {
						feed = e.getFeed().get(0).intValue();
					}
                    
                    EngineThrusterSetup ets = new EngineThrusterSetup(//calling the constructor for loading
                        //strings
                        e.getFile(),
						feed,
                        thrusName,
						thrusterLocUnit,
						thrusterOrientUnit,
                        //doubles
                        thrusterX,
						thrusterY,
						thrusterZ,
						thrusterRoll,
						thrusterPitch,
						thrusterYaw                   
					);
					listETS.add(ets);
				}
			}
			modelETS.addAll(listETS);
		}
		
		ArrayList<generated.Tank> tank = new ArrayList<>();
        if(cfg.getPropulsion().getEngineOrTank() != null){
            
            for(Object o : cfg.getPropulsion().getEngineOrTank()){ 
                if(o instanceof generated.Tank){               
                    generated.Tank t = (generated.Tank) o;
                    tank.add(t);
                }
            }
			for(generated.Tank t : tank){ 
                if(t.getLocation() != null && t.getType() != null ) {

					String capUnit, contUnit;
					Double contents, capacity;

					if(t.getCapacity() != null){ //springCo
                        capUnit = t.getCapacity().getUnit().toString();
                        capacity = t.getCapacity().getValue();
                    }
                    else{
                        capUnit = null;
                        capacity = null;
                    }
                    
                    if(t.getContents() != null){ //dampCo
                        contUnit = t.getContents().getUnit().toString();
                        contents = t.getContents().getValue();
                    }
                    else{
                        contUnit = null;
                        contents = null;
                    }
                    
                    TankSetup ts = new TankSetup(//calling the constructor for loading
                        //strings
                        t.getType(),
                        t.getLocation().getUnit(),
						t.getCapacity().getUnit(),
						t.getContents().getUnit(),
                        //doubles
                        t.getLocation().getX(),
                        t.getLocation().getY(),
                        t.getLocation().getZ(),
						capacity,
						contents                      
					);
					listTS.add(ts);
				}
			}
			modelTS.addAll(listTS);
		}
    }

    @Override
    public Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg) {
        // TODO
        return Optional.ofNullable(cfg);
    }

	private void addPair(ActionEvent e) {
        EngineThrusterSetup engThSetup = new EngineThrusterSetup();
		if (engThSetup.getName() == null) {
			return;
		}
		listETS.add(engThSetup);
		modelETS.clear();
		modelETS.addAll(listETS);
    }

	private void addTank(ActionEvent e) {
        TankSetup tankSetup = new TankSetup();
		if (tankSetup.getName() == null) {
			return;
		}
		listTS.add(tankSetup);
		modelTS.clear();
		modelTS.addAll(listTS);
    }
	
	private void deleteTank(ActionEvent e) {//removing a GR/LGS from the displayed list
        if(tankList.getSelectedValue() == null) {
			return;
		}
		int result = JOptionPane.showConfirmDialog(this, "Do you really want to delete the tank?", "Confirm", JOptionPane.YES_NO_OPTION);
        if(result == JOptionPane.YES_OPTION){
            TankSetup tankSetup = tankList.getSelectedValue();
            modelTS.removeElement(tankSetup);
            listTS.remove(tankSetup);
        }
    }

    private void propComponents() {
		
		Propulsion = new JPanel();
		availableEngines = new JLabel();
		availableThrusters = new JLabel();
		subscribedEngines = new JLabel();
		tanks = new JLabel();
		engine = new JLabel();
		thruster = new JLabel();
		eng = new JLabel();
		th = new JLabel();
		tank = new JLabel();
		engineScrollPane = new JScrollPane();
		engineList = new JList<>();
		thrusterScrollPane = new JScrollPane();
		thrusterList = new JList<>();
		engScrollPane = new JScrollPane();
		engList = new JList<>();
		thScrollPane = new JScrollPane();
		thList = new JList<>();
		tankScrollPane = new JScrollPane();
		tankList = new JList<>();
		buttonPanel = new JPanel();
		newP = new JButton();
		newT = new JButton();
		deleteP = new JButton();
		deleteT = new JButton();
		detailP = new JButton();
		detailT = new JButton();

		//======== Propulsion ========
		{
			setBorder(new CompoundBorder(
				new EmptyBorder(20, 20, 20, 20),
				new EmptyBorder(5, 0, 5, 50)));
			Propulsion.setLayout(new MigLayout(
				"align center center,gap 5 20",
				// columns
				"[fill]" +
				"[fill]" +
				"[fill]0" +
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

			//---- availableEngines ----
			availableEngines.setText("Available Engines");
			availableEngines.setHorizontalAlignment(SwingConstants.CENTER);
			Propulsion.add(availableEngines, "cell 0 0");

			//---- availableThrusters ----
			availableThrusters.setText("Available Thrusters");
			availableThrusters.setHorizontalAlignment(SwingConstants.CENTER);
			Propulsion.add(availableThrusters, "cell 1 0");

			//---- subscribedEngines ----
			subscribedEngines.setText("Subscribed Engines");
			subscribedEngines.setHorizontalAlignment(SwingConstants.CENTER);
			Propulsion.add(subscribedEngines, "cell 2 0 2 1");

			//---- tanks ----
			tanks.setText("Tanks");
			tanks.setHorizontalAlignment(SwingConstants.CENTER);
			Propulsion.add(tanks, "cell 4 0");

			//---- engine ----
			engine.setText("Engine");
			Propulsion.add(engine, "cell 0 2");

			//---- thruster ----
			thruster.setText("Thruster");
			Propulsion.add(thruster, "cell 1 2");

			//---- eng ----
			eng.setText("Engine");
			Propulsion.add(eng, "cell 2 2");

			//---- th ----
			th.setText("Thruster");
			Propulsion.add(th, "cell 3 2");

			//---- tank ----
			tank.setText("Tank");
			Propulsion.add(tank, "cell 4 2");

			//======== engineScrollPane ========
			{
				engineList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		    	engineList.setModel(modelETS);
				engineScrollPane.setViewportView(engineList);
			}
			Propulsion.add(engineScrollPane, "cell 0 3 1 29,growy,wmax 250,hmax 900");

			//======== thrusterScrollPane ========
			{
				thrusterScrollPane.setViewportView(thrusterList);
			}
			Propulsion.add(thrusterScrollPane, "cell 1 3 1 29,growy,wmax 250,hmax 900");

			//======== engScrollPane ========
			{
				engScrollPane.setViewportView(engList);
			}
			Propulsion.add(engScrollPane, "cell 2 3 1 29,growy,wmax 150,hmax 900");

			//======== thScrollPane ========
			{
				thScrollPane.setViewportView(thList);
			}
			Propulsion.add(thScrollPane, "cell 3 3 1 29,growy,wmax 150,hmax 900");

			//======== tankScrollPane ========
			{
				tankList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		    	tankList.setModel(modelTS);
				tankScrollPane.setViewportView(tankList);
			}
			Propulsion.add(tankScrollPane, "cell 4 3 1 29,growy,wmax 275,hmax 900");

			//======== buttonPanel ========
			{
				buttonPanel.setLayout(new MigLayout(
					"fillx,hidemode 3",
					// columns
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]" +
					"[fill]",
					// rows
					"[]" +
					"[]"));

				//---- newP ----
				newP.setText("New Pair");
				newP.addActionListener(e -> addPair(e));
				buttonPanel.add(newP, "cell 0 0");

				//---- newT ----
				newT.setText("New Tank");
				newT.addActionListener(e -> addTank(e));
				buttonPanel.add(newT, "cell 1 0");

				//---- deleteP ----
				deleteP.setText("Delete Pair");
				buttonPanel.add(deleteP, "cell 2 0");

				//---- deleteT ----
				deleteT.setText("Delete Tank");
				deleteT.addActionListener(e -> deleteTank(e));
				buttonPanel.add(deleteT, "cell 3 0");

				//---- detailP ----
				detailP.setText("Detail Pair");
				buttonPanel.add(detailP, "cell 4 0");

				//---- detailT ----
				detailT.setText("Detail Tank");
				buttonPanel.add(detailT, "cell 5 0");
			}
			Propulsion.add(buttonPanel, "cell 0 32 6 1");
		}
		add(Propulsion);
	}

	
	private JPanel Propulsion;
	private JLabel availableEngines;
	private JLabel availableThrusters;
	private JLabel subscribedEngines;
	private JLabel tanks;
	private JLabel engine;
	private JLabel thruster;
	private JLabel eng;
	private JLabel th;
	private JLabel tank;
	private JScrollPane engineScrollPane;
	private JList<EngineThrusterSetup> engineList;
	private JScrollPane thrusterScrollPane;
	private JList<String> thrusterList;
	private JScrollPane engScrollPane;
	private JList<String> engList;
	private JScrollPane thScrollPane;
	private JList<String> thList;
	private JScrollPane tankScrollPane;
	private JList<TankSetup> tankList;
	private JPanel buttonPanel;
	private JButton newP;
	private JButton newT;
	private JButton deleteP;
	private JButton deleteT;
	private JButton detailP;
	private JButton detailT;
	
	private DefaultListModel<EngineThrusterSetup> modelETS = new DefaultListModel<EngineThrusterSetup>();
    private ArrayList<EngineThrusterSetup> listETS;

	private DefaultListModel<TankSetup> modelTS = new DefaultListModel<TankSetup>();
    private ArrayList<TankSetup> listTS;
}
