package uta.cse.cse3310.JSBSimEdit;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
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
		list = new ArrayList<EngineList>();
		listTH = new ArrayList<ThrusterList>();
	}

	@Override
	public void bindUIwithXML(FdmConfig cfg) {

		ArrayList<generated.Engine> engine = new ArrayList<>();
		if (cfg.getPropulsion().getEngineOrTank() != null) {

			for (Object o : cfg.getPropulsion().getEngineOrTank()) {
				if (o instanceof generated.Engine) {
					generated.Engine e = (generated.Engine) o;
					engine.add(e);
				}
			}
			for (generated.Engine e : engine) {
				if (e.getFeed() != null && e.getDescription() != null && e.getFile() != null) {

					Double thrusterRoll, thrusterPitch, thrusterYaw,
							thrusterX, thrusterY, thrusterZ;
					int feed = 0;
					String thrusName, thrusterLocUnit, thrusterOrientUnit;

					if (e.getThruster() != null) { // springCo
						thrusName = e.getThruster().getFile();
						thrusterLocUnit = e.getThruster().getLocation().getUnit();
						thrusterOrientUnit = e.getThruster().getOrient().getUnit();

						thrusterRoll = e.getThruster().getOrient().getRoll();
						thrusterPitch = e.getThruster().getOrient().getPitch();
						thrusterYaw = e.getThruster().getOrient().getYaw();

						thrusterX = e.getThruster().getLocation().getX();
						thrusterY = e.getThruster().getLocation().getY();
						thrusterZ = e.getThruster().getLocation().getZ();
					} else {
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

					EngineThrusterSetup ets = new EngineThrusterSetup(// calling the constructor for loading
							// strings
							e.getFile(),
							feed,
							thrusName,
							thrusterLocUnit,
							thrusterOrientUnit,
							// doubles
							thrusterX,
							thrusterY,
							thrusterZ,
							thrusterRoll,
							thrusterPitch,
							thrusterYaw);
					listETS.add(ets);
				}
			}
			modelETS.addAll(listETS);

			model.addElement(new EngineList("AJ26-33A", "rocket_engine", "NO INFO"));
			model.addElement(new EngineList("CF6-80C2", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("CFM56", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("CFM56_5", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("electric_1mw", "electric_engine", "NO INFO"));
			model.addElement(new EngineList("engIO360C", "piston_engine", "NO INFO"));
			model.addElement(new EngineList("engIO470D", "piston_engine", "NO INFO"));
			model.addElement(new EngineList("engIO540AB1A5", "piston_engine", "NO INFO"));
			model.addElement(new EngineList("engRRMerlin61", "piston_engine", "NO INFO"));
			model.addElement(new EngineList("engRRMerlinXII", "piston_engine", "NO INFO"));
			model.addElement(new EngineList("engtm601", "turboprop_engine", "NO INFO"));
			model.addElement(new EngineList("eng_io320", "piston_engine", "NO INFO"));
			model.addElement(new EngineList("F100-PW-229", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("F119-PW1", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("GE-CF6-80C2-B1F", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("J33-A-35", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("J52", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("J69-T25", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("J79-GE-11A", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("J85-GE-5", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("JT9D-3", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("PT6A-27", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("PT6A-68", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("PW125B", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("RB211-524", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("RollsRoyce", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("t56", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("T76", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("Tay-651", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("TRENT-900", "turbine_engine", "NO INFO"));
			model.addElement(new EngineList("XLR99", "rocket_engine", "NO INFO"));
			model.addElement(new EngineList("Zenoah_G-26A", "electric_engine", "NO INFO"));

			modelTH.addElement(new ThrusterList("AJ26-33_nozzle", "nozzle", "NO INFO"));
			modelTH.addElement(new ThrusterList("direct", "direct", "NO INFO"));
			modelTH.addElement(new ThrusterList("HamiltonStd6243A-3", "propeller", "NO INFO"));
			modelTH.addElement(new ThrusterList("LMdescent", "FG_ROCKET", "NO INFO"));
			modelTH.addElement(new ThrusterList("LM_descent_nozzle", "FG_NOZZLE", "NO INFO"));
			modelTH.addElement(new ThrusterList("MerlinV1650", "piston_engine", "NO INFO"));
			modelTH.addElement(new ThrusterList("Olympus593Mrk610", "turbine_engine", "NO INFO"));
			modelTH.addElement(new ThrusterList("P51prop", "propeller", "NO INFO"));
			modelTH.addElement(new ThrusterList("prop30FP2B", "propeller", "NO INFO"));
			modelTH.addElement(new ThrusterList("propC10v", "propeller", "NO INFO"));
			modelTH.addElement(new ThrusterList("propC6v", "propeller", "NO INFO"));
			modelTH.addElement(new ThrusterList("propC8v", "propeller", "NO INFO"));
			modelTH.addElement(new ThrusterList("propDA-R352_6-123-F_2", "propeller", "NO INFO"));
			modelTH.addElement(new ThrusterList("prop_75in2f", "propeller", "NO INFO"));
			modelTH.addElement(new ThrusterList("prop_81in2v", "propeller", "NO INFO"));
			modelTH.addElement(new ThrusterList("prop_Clark_Y7570", "propeller", "NO INFO"));
			modelTH.addElement(new ThrusterList("prop_generic2f", "propeller", "NO INFO"));
			modelTH.addElement(new ThrusterList("prop_PT6", "propeller", "NO INFO"));
			modelTH.addElement(new ThrusterList("t56_prop", "propeller", "NO INFO"));
			modelTH.addElement(new ThrusterList("vrtule2", "propeller", "NO INFO"));

		}

		ArrayList<generated.Tank> tank = new ArrayList<>();
		if (cfg.getPropulsion().getEngineOrTank() != null) {

			for (Object o : cfg.getPropulsion().getEngineOrTank()) {
				if (o instanceof generated.Tank) {
					generated.Tank t = (generated.Tank) o;
					tank.add(t);
				}
			}
			for (generated.Tank t : tank) {
				if (t.getLocation() != null && t.getType() != null) {

					String capUnit, contUnit;
					Double contents, capacity;

					if (t.getCapacity() != null) { // springCo
						capUnit = t.getCapacity().getUnit().toString();
						capacity = t.getCapacity().getValue();
					} else {
						capUnit = null;
						capacity = null;
					}

					if (t.getContents() != null) { // dampCo
						contUnit = t.getContents().getUnit().toString();
						contents = t.getContents().getValue();
					} else {
						contUnit = null;
						contents = null;
					}

					TankSetup ts = new TankSetup(// calling the constructor for loading
							// strings
							t.getType(),
							t.getLocation().getUnit(),
							t.getCapacity().getUnit(),
							t.getContents().getUnit(),
							// doubles
							t.getLocation().getX(),
							t.getLocation().getY(),
							t.getLocation().getZ(),
							capacity,
							contents);
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

	private void openPropertiesDialog(EngineThrusterSetup engineThrusterSetup) {
		// Create and show the properties dialog using the EngineThrusterSetup information
		// You should implement this method based on how you display the properties dialog
		// Example:
		
		JOptionPane.showMessageDialog(
				this,
				"Engine Name: " + engineThrusterSetup.getEngineNameETS() + 
				"\nx: " + engineThrusterSetup.getEngineXLocETS() + 
				" y: " + engineThrusterSetup.getEngineYLocETS() + 
				" z: " + engineThrusterSetup.getEngineZLocETS() + 
				engineThrusterSetup.getEngineLocationUnitETS() +
				"\nRoll: " + engineThrusterSetup.getEngineRollETS() + 
				" Pitch: " + engineThrusterSetup.getEnginePitchETS() + 
				" Yaw: " + engineThrusterSetup.getEngineYawETS() + 
				engineThrusterSetup.getEngineOrientUnitETS() +
				"\nFeed: " + engineThrusterSetup.getEngineFeedETS() + 
				"\nThruster Name: " + engineThrusterSetup.getThrusterNameETS() +
				"\nx: " + engineThrusterSetup.getThrusterXLocETS() + 
				" y: " + engineThrusterSetup.getThrusterYLocETS() + 
				" z: " + engineThrusterSetup.getThrusterZLocETS() +
				engineThrusterSetup.getThrusterLocationUnitETS() +
				"\nRoll: " + engineThrusterSetup.getThrusterRollETS() + 
				" Pitch: " + engineThrusterSetup.getThrusterPitchETS() + 
				" Yaw: " + engineThrusterSetup.getThrusterYawETS() +
				engineThrusterSetup.getThrusterOrientUnitETS(),
				"Properties",
				JOptionPane.INFORMATION_MESSAGE
		);
	}
	
	private void addPair(ActionEvent e) {
		// Show dialog to select an engine
		EngineList selectedEngine = engineList.getSelectedValue();
		if (selectedEngine == null) {
			JOptionPane.showMessageDialog(this, "Please select an engine.", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
	
		// Show dialog to select a thruster
		ThrusterList selectedThruster = thrusterList.getSelectedValue();
		if (selectedThruster == null) {
			JOptionPane.showMessageDialog(this, "Please select a thruster.", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
	
		// Now you have the selected engine and thruster, use them to create a new pair
		EngineThrusterSetup engThSetup = new EngineThrusterSetup(
				selectedEngine.getName(),
				0, // Set the default feed value, you may need to adjust this based on your requirements
				selectedThruster.getName(),
				null, // You may need to set other properties based on your requirements
				null,
				null,
				null,
				null,
				null,
				null,
				null
		);
		if (engThSetup.getName() == null) {
			return;
		}
	
		// Open the properties dialog for the selected engine and thruster
		openPropertiesDialog(engThSetup);
	
		listETS.add(engThSetup);
		modelETS.clear();
		modelETS.addAll(listETS);
	}
	

	private void detailPair(ActionEvent e) {
		// Check if an EngineThrusterSetup is selected
		if (engList.getSelectedValue() != null) {
			EngineThrusterSetup oldPair = engList.getSelectedValue();
	
			// Create a copy of the selected pair
			EngineThrusterSetup newPair = new EngineThrusterSetup(oldPair);
	
			// Check if the user canceled (name is null in your case)
			if (newPair.getName() == null) {
				return;
			}
		}
	}
	
	private void deletePair(ActionEvent e) {// removing a GR/LGS from the displayed list
		if (engList.getSelectedValue() == null) {
			return;
		}
		int result = JOptionPane.showConfirmDialog(this, "Do you really want to delete the pair?", "Confirm",
				JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.YES_OPTION) {
			EngineThrusterSetup engTh = engList.getSelectedValue();
			modelETS.removeElement(engTh);
			listETS.remove(engTh);
		}
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

	private void detailTank(ActionEvent e) {
		// Check if a TankSetup is selected
		if (tankList.getSelectedValue() != null) {
			TankSetup oldTank = tankList.getSelectedValue();
			TankSetup newTank = new TankSetup(oldTank);
			
			// If the user canceled, do nothing
			if (newTank.getName() == null) {
				return;
			} else {
				// If the user pressed OK, remove the old tank and add the new tank
				listTS.remove(tankList.getSelectedValue());
				listTS.add(newTank);
				modelTS.clear(); // Refreshing the model to display on the tankList
				modelTS.addAll(listTS);
			}
		}
	}	

	private void deleteTank(ActionEvent e) {// removing a GR/LGS from the displayed list
		if (tankList.getSelectedValue() == null) {
			return;
		}
		int result = JOptionPane.showConfirmDialog(this, "Do you really want to delete the tank?", "Confirm",
				JOptionPane.YES_NO_OPTION);
		if (result == JOptionPane.YES_OPTION) {
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
		tankScrollPane = new JScrollPane();
		tankList = new JList<>();
		buttonPanel = new JPanel();
		newP = new JButton();
		newT = new JButton();
		deleteP = new JButton();
		deleteT = new JButton();
		detailP = new JButton();
		detailT = new JButton();

		// ======== Propulsion ========
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

			// ---- availableEngines ----
			availableEngines.setText("Available Engines");
			availableEngines.setHorizontalAlignment(SwingConstants.CENTER);
			Propulsion.add(availableEngines, "cell 0 0");

			// ---- availableThrusters ----
			availableThrusters.setText("Available Thrusters");
			availableThrusters.setHorizontalAlignment(SwingConstants.CENTER);
			Propulsion.add(availableThrusters, "cell 1 0");

			// ---- subscribedEngines ----
			subscribedEngines.setText("Subscribed Engines");
			subscribedEngines.setHorizontalAlignment(SwingConstants.CENTER);
			Propulsion.add(subscribedEngines, "cell 2 0 2 1");

			// ---- tanks ----
			tanks.setText("Tanks");
			tanks.setHorizontalAlignment(SwingConstants.CENTER);
			Propulsion.add(tanks, "cell 4 0");

			// ---- engine ----
			engine.setText("Engine");
			Propulsion.add(engine, "cell 0 2");

			// ---- thruster ----
			thruster.setText("Thruster");
			Propulsion.add(thruster, "cell 1 2");

			// ---- eng ----
			eng.setText("Engine");
			Propulsion.add(eng, "cell 2 2");

			// ---- th ----
			th.setText("Thruster");
			Propulsion.add(th, "cell 3 2");

			// ---- tank ----
			tank.setText("Tank");
			Propulsion.add(tank, "cell 4 2");

			// ======== engineScrollPane ========
			{
				engineList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				engineList.setModel(model);
				engineScrollPane.setViewportView(engineList);
			}
			Propulsion.add(engineScrollPane, "cell 0 3 1 29,growy,width 200::300,hmax 900");

			// ======== thrusterScrollPane ========
			{
				thrusterList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				thrusterList.setModel(modelTH);
				thrusterScrollPane.setViewportView(thrusterList);
			}
			Propulsion.add(thrusterScrollPane, "cell 1 3 1 29,growy,width 200::300,hmax 900");

			// ======== engScrollPane ========
			{
				engList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				engList.setModel(modelETS);
				engScrollPane.setViewportView(engList);
			}
			Propulsion.add(engScrollPane, "cell 2 3 2 29,growy,width 200::300,hmax 900");

			// ======== tankScrollPane ========
			{
				tankList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				tankList.setModel(modelTS);
				tankScrollPane.setViewportView(tankList);
			}
			Propulsion.add(tankScrollPane, "cell 4 3 1 29,growy,width 200::300,hmax 900");

			// ======== buttonPanel ========
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

				// ---- newP ----
				newP.setText("New Pair");
				newP.addActionListener(e -> addPair(e));
				buttonPanel.add(newP, "cell 0 0");

				// ---- newT ----
				newT.setText("New Tank");
				newT.addActionListener(e -> addTank(e));
				buttonPanel.add(newT, "cell 1 0");

				// ---- deleteP ----
				deleteP.setText("Delete Pair");
				deleteP.addActionListener(e -> deletePair(e));
				buttonPanel.add(deleteP, "cell 2 0");

				// ---- deleteT ----
				deleteT.setText("Delete Tank");
				deleteT.addActionListener(e -> deleteTank(e));
				buttonPanel.add(deleteT, "cell 3 0");

				// ---- detailP ----
				detailP.setText("Detail Pair");
				detailP.addActionListener(e -> detailPair(e));
				buttonPanel.add(detailP, "cell 4 0");

				// ---- detailT ----
				detailT.setText("Detail Tank");
				detailT.addActionListener(e -> detailTank(e));
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
	private JList<EngineList> engineList;
	private JScrollPane thrusterScrollPane;
	private JList<ThrusterList> thrusterList;
	private JScrollPane engScrollPane;
	private JList<EngineThrusterSetup> engList;
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

	private DefaultListModel<EngineList> model = new DefaultListModel<EngineList>();
	private ArrayList<EngineList> list;

	private DefaultListModel<ThrusterList> modelTH = new DefaultListModel<ThrusterList>();
	private ArrayList<ThrusterList> listTH;
}
