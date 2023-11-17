package uta.cse.cse3310.JSBSimEdit;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Optional;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import generated.FdmConfig;
import net.miginfocom.swing.MigLayout;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;

public class Propulsion extends JPanel implements TabComponent {
    
    Propulsion() {
        propComponents();
		listTS = new ArrayList<EngineThrusterSetup>();
    }

    @Override
    public void bindUIwithXML(FdmConfig cfg) {
        // TODO
    }

    @Override
    public Optional<FdmConfig> saveXMLfromUI(FdmConfig cfg) {
        // TODO
        return Optional.ofNullable(cfg);
    }

	private void addPair(ActionEvent e) {
        EngineThrusterSetup tankSetup = new EngineThrusterSetup();
		if (tankSetup.getName() == null) {
			return;
		}
		listTS.add(tankSetup);
		model.clear();
		model.addAll(listTS);
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
		engineList = new JList();
		thrusterScrollPane = new JScrollPane();
		thrusterList = new JList();
		engScrollPane = new JScrollPane();
		engList = new JList();
		thScrollPane = new JScrollPane();
		thList = new JList();
		tankScrollPane = new JScrollPane();
		tankList = new JList();
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
				engineScrollPane.setViewportView(engineList);
			}
			Propulsion.add(engineScrollPane, "cell 0 3 1 29,growy");

			//======== thrusterScrollPane ========
			{
				thrusterScrollPane.setViewportView(thrusterList);
			}
			Propulsion.add(thrusterScrollPane, "cell 1 3 1 29,growy");

			//======== engScrollPane ========
			{
				engScrollPane.setViewportView(engList);
			}
			Propulsion.add(engScrollPane, "cell 2 3 1 29,growy");

			//======== thScrollPane ========
			{
				thScrollPane.setViewportView(thList);
			}
			Propulsion.add(thScrollPane, "cell 3 3 1 29,growy");

			//======== tankScrollPane ========
			{
				tankScrollPane.setViewportView(tankList);
			}
			Propulsion.add(tankScrollPane, "cell 4 3 1 29,growy");

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
				buttonPanel.add(newP, "cell 0 0");

				//---- newT ----
				newT.setText("New Tank");
				buttonPanel.add(newT, "cell 1 0");

				//---- deleteP ----
				deleteP.setText("Delete Pair");
				buttonPanel.add(deleteP, "cell 2 0");

				//---- deleteT ----
				deleteT.setText("Delete Tank");
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
	private JList engineList;
	private JScrollPane thrusterScrollPane;
	private JList thrusterList;
	private JScrollPane engScrollPane;
	private JList engList;
	private JScrollPane thScrollPane;
	private JList thList;
	private JScrollPane tankScrollPane;
	private JList tankList;
	private JPanel buttonPanel;
	private JButton newP;
	private JButton newT;
	private JButton deleteP;
	private JButton deleteT;
	private JButton detailP;
	private JButton detailT;
	
	private DefaultListModel<EngineThrusterSetup> model = new DefaultListModel<EngineThrusterSetup>();
    private ArrayList<EngineThrusterSetup> listTS;
}
