package uta.cse.cse3310.JSBSimEdit;

import java.awt.event.ActionEvent;
import java.util.Optional;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import generated.FdmConfig;
import net.miginfocom.swing.MigLayout;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;

public class SystemTab extends JPanel implements TabComponent {
    
    SystemTab() {
        initComponents();
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

	private void addProp(ActionEvent e) {
		// TODO add your code here
	}

	private void deleteProp(ActionEvent e) {
		// TODO add your code here
	}

	private void detailProp(ActionEvent e) {
		// TODO add your code here
	}

	private void addSensor(ActionEvent e) {
		Sensor currentSensor = new Sensor();
	}

	private void deleteSenor(ActionEvent e) {
		// TODO add your code here
	}

	private void detailSensor(ActionEvent e) {
		// TODO add your code here
	}

	private void addChannel(ActionEvent e) {
		// TODO add your code here
	}

	private void deleteChannel(ActionEvent e) {
		// TODO add your code here
	}

	private void detialChannel(ActionEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Educational license - Sean McElroy (Patrick McElroy)
		propertyL = new JLabel();
		sensorL = new JLabel();
		channelL = new JLabel();
		scrollProperty = new JScrollPane();
		listProperty = new JList();
		scrollSensor = new JScrollPane();
		listSensor = new JList();
		scrollChannel = new JScrollPane();
		listChannel = new JList();
		addProp = new JButton();
		deleteProp = new JButton();
		detailProp = new JButton();
		addSensor = new JButton();
		deleteSenor = new JButton();
		detailSensor = new JButton();
		addChannel = new JButton();
		deleteChannel = new JButton();
		detialChannel = new JButton();

		//======== this ========
		setLayout(new MigLayout(
			"fill,hidemode 3",
			// columns
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
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
			"[]"));

		//---- propertyL ----
		propertyL.setText("Property");
		add(propertyL, "cell 1 0,align center bottom,grow 0 0");

		//---- sensorL ----
		sensorL.setText("Sensor");
		add(sensorL, "cell 4 0,align center bottom,grow 0 0");

		//---- channelL ----
		channelL.setText("Channel");
		add(channelL, "cell 7 0,align center bottom,grow 0 0");

		//======== scrollProperty ========
		{
			scrollProperty.setViewportView(listProperty);
		}
		add(scrollProperty, "cell 0 1 3 7,growy");

		//======== scrollSensor ========
		{
			scrollSensor.setViewportView(listSensor);
		}
		add(scrollSensor, "cell 3 1 3 7,growy");

		//======== scrollChannel ========
		{
			scrollChannel.setViewportView(listChannel);
		}
		add(scrollChannel, "cell 6 1 3 7,growy");

		//---- addProp ----
		addProp.setText("Add Property");
		//addProp.addActionListener(e -> addProp(e));
		add(addProp, "cell 0 8");

		//---- deleteProp ----
		deleteProp.setText("Delete Property");
		//deleteProp.addActionListener(e -> deleteProp(e));
		add(deleteProp, "cell 1 8");

		//---- detailProp ----
		detailProp.setText("Detail Property");
		//detailProp.addActionListener(e -> detailProp(e));
		add(detailProp, "cell 2 8");

		//---- addSensor ----
		addSensor.setText("Add Sensor");
		addSensor.addActionListener(e -> addSensor(e));
		add(addSensor, "cell 3 8");

		//---- deleteSenor ----
		deleteSenor.setText("Delete Sensor");
		//deleteSenor.addActionListener(e -> deleteSenor(e));
		add(deleteSenor, "cell 4 8");

		//---- detailSensor ----
		detailSensor.setText("Detail Sensor");
		//detailSensor.addActionListener(e -> detailSensor(e));
		add(detailSensor, "cell 5 8");

		//---- addChannel ----
		addChannel.setText("Add Channel");
		//addChannel.addActionListener(e -> addChannel(e));
		add(addChannel, "cell 6 8");

		//---- deleteChannel ----
		deleteChannel.setText("Delete Channel");
		//deleteChannel.addActionListener(e -> deleteChannel(e));
		add(deleteChannel, "cell 7 8");

		//---- detialChannel ----
		detialChannel.setText("Detail Channel");
		//detialChannel.addActionListener(e -> detialChannel(e));
		add(detialChannel, "cell 8 8");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Educational license - Sean McElroy (Patrick McElroy)
	private JLabel propertyL;
	private JLabel sensorL;
	private JLabel channelL;
	private JScrollPane scrollProperty;
	private JList listProperty;
	private JScrollPane scrollSensor;
	private JList listSensor;
	private JScrollPane scrollChannel;
	private JList listChannel;
	private JButton addProp;
	private JButton deleteProp;
	private JButton detailProp;
	private JButton addSensor;
	private JButton deleteSenor;
	private JButton detailSensor;
	private JButton addChannel;
	private JButton deleteChannel;
	private JButton detialChannel;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
