package uta.cse.cse3310.JSBSimEdit;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Optional;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import generated.FdmConfig;
import net.miginfocom.swing.MigLayout;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;

public class Propulsion extends JPanel implements TabComponent {
    
    Propulsion() {
        propComponents();
		listTS = new ArrayList<TankSetup>();
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
    public JTable getEngineTable() {
		return engineTable;
	}

	private void propComponents() {
		enginesLabel = new JLabel();
		thrustersLabel = new JLabel();
		subEnginesLabel = new JLabel();
		tanksLabel = new JLabel();
		engineScrollPane = new JScrollPane();
		engineTable = new JTable();
		thrusterScrollPane = new JScrollPane();
		thrusterTAble = new JTable();
		engThScrollPane = new JScrollPane();
		engThTable = new JTable();
		tankScrollPane = new JScrollPane();
		tankTable = new JTable();
		optionsBar = new JToolBar();
		newP = new JButton();
		newT = new JButton();
		delP = new JButton();
		delT = new JButton();
		detailP = new JButton();
		detailT = new JButton();

		//======== panel ========
		setBorder(new CompoundBorder(
			new EmptyBorder(20, 20, 20, 20),
			new EmptyBorder(5, 5, 5, 5)));
		
		setLayout(new MigLayout(
			"align center center,gap 10 30",
			// columns
			"[grow,fill]" +
			"[grow,fill]" +
			"[fill]" +
			"[fill]" +
			"[grow,fill]" +
			"[grow,fill]" +
			"[grow,fill]" +
			"[grow,fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[150]" +
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- enginesLabel ----
		enginesLabel.setText("Available Engines");
		add(enginesLabel, "cell 0 0,alignx center,growx 0");

		//---- thrustersLabel ----
		thrustersLabel.setText("Available Thrusters");
		add(thrustersLabel, "cell 1 0,alignx center,growx 0");

		//---- subEnginesLabel ----
		subEnginesLabel.setText("Subscribed Engine(s)(*)");
		add(subEnginesLabel, "cell 2 0,alignx center,growx 0");

		//---- tanksLabel ----
		tanksLabel.setText("Tanks");
		add(tanksLabel, "cell 3 0,alignx center,growx 0");

		//======== engineScrollPane ========
		{

			//---- engineTable ----
			engineTable.setModel(new DefaultTableModel(
				new Object[][] {
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
				},
				new String[] {
					"Engine"
				}
			));
			engineScrollPane.setViewportView(engineTable);
		}
		add(engineScrollPane, "cell 0 1 1 9,growy");

		//======== thrusterScrollPane ========
		{

			//---- thrusterTAble ----
			thrusterTAble.setModel(new DefaultTableModel(
				new Object[][] {
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
				},
				new String[] {
					"Thruster"
				}
			));
			thrusterScrollPane.setViewportView(thrusterTAble);
		}
		add(thrusterScrollPane, "cell 1 1 1 9,growy");

		//======== engThScrollPane ========
		{

			//---- engThTable ----
			engThTable.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
					{null, null},
				},
				new String[] {
					"Engine", "Thruster"
				}
			));
			engThScrollPane.setViewportView(engThTable);
		}
		add(engThScrollPane, "cell 2 1 1 9,growy");

		//======== tankScrollPane ========
		{

			//---- tankTable ----
			tankTable.setModel(new DefaultTableModel(
				new Object[][] {
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
					{null},
				},
				new String[] {
					"Tank"
				}
			));
			tankScrollPane.setViewportView(tankTable);
		}
		add(tankScrollPane, "cell 3 1 1 9,growy");

		//======== optionsBar ========
		{

			//---- newP ----
			newP.setText("New Pair");
			newP.setBorder(LineBorder.createBlackLineBorder());
			newP.setMaximumSize(new Dimension(100, 32767));
			optionsBar.add(newP);

			//---- newT ----
			newT.setText("New Tank");
			newT.setBorder(LineBorder.createBlackLineBorder());
			newT.setMaximumSize(new Dimension(100, 32767));
			optionsBar.add(newT);

			//---- delP ----
			delP.setText("Delete Pair");
			delP.setBorder(LineBorder.createBlackLineBorder());
			delP.setMaximumSize(new Dimension(100, 32767));
			optionsBar.add(delP);

			//---- delT ----
			delT.setText("Delete Tank");
			delT.setBorder(LineBorder.createBlackLineBorder());
			delT.setMaximumSize(new Dimension(100, 32767));
			optionsBar.add(delT);

			//---- detailP ----
			detailP.setText("Detail Pair");
			detailP.setBorder(LineBorder.createBlackLineBorder());
			detailP.setMaximumSize(new Dimension(100, 32767));
			optionsBar.add(detailP);

			//---- detailT ----
			detailT.setText("Detail Tank");
			detailT.setBorder(LineBorder.createBlackLineBorder());
			detailT.setMaximumSize(new Dimension(100, 32767));
			optionsBar.add(detailT);
		}
		add(optionsBar, "cell 0 10 4 1,growx");
    
    }

	
	private JLabel enginesLabel;
	private JLabel thrustersLabel;
	private JLabel subEnginesLabel;
	private JLabel tanksLabel;
	private JScrollPane engineScrollPane;
	private JTable engineTable;
	private JScrollPane thrusterScrollPane;
	private JTable thrusterTAble;
	private JScrollPane engThScrollPane;
	private JTable engThTable;
	private JScrollPane tankScrollPane;
	private JTable tankTable;
	private JToolBar optionsBar;
	private JButton newP;
	private JButton newT;
	private JButton delP;
	private JButton delT;
	private JButton detailP;
	private JButton detailT;

	private DefaultListModel<TankSetup> model = new DefaultListModel<TankSetup>();
    private ArrayList<TankSetup> listTS;
}
