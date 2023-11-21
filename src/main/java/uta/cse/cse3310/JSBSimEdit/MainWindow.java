package uta.cse.cse3310.JSBSimEdit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import generated.FdmConfig;
import uta.cse.cse3310.JSBSimEdit.interfaces.TabComponent;
import uta.cse.cse3310.JSBSimEdit.utils.Constants;
import uta.cse.cse3310.JSBSimEdit.utils.LoadSave;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.File;
import java.util.Optional;
import java.lang.System;

public class MainWindow extends JFrame {
    
    // jaxb object which is xml config
    private FdmConfig cfg;
    
    //menu bar on top
    private JMenuBar menuBar = new JMenuBar();
    //button bar in menu bar
    private JPanel buttonPanel = new JPanel();
	private JToolBar buttonBar = new JToolBar();
	private JButton openButton = new JButton();
	private JButton saveButton = new JButton();
    //tabs
    private JTabbedPane mainWinTabs = new JTabbedPane();
    private JLabel home = new JLabel();
    
    public MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle(Constants.APP_NAME);
        setMinimumSize(new Dimension(Constants.APP_SIZEX, Constants.APP_SIZEY));
        
        makeMenuBar();
        add(menuBar, BorderLayout.NORTH);

        home.setText("Open a xml config to begin.");
        home.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.BG_RES)));
        home.setHorizontalAlignment(JLabel.CENTER); 
        home.setVerticalAlignment(JLabel.CENTER);

        makeTabs();
        mainWinTabs.setEnabled(false);
        add(mainWinTabs);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().requestFocusInWindow();
    }

    //////////////////////////////////////ADD TABS HERE///////////////////////////////////////
    private void makeTabs(){
        
        mainWinTabs.addTab("Home", home);
        mainWinTabs.addTab("FileHeader", new FileHeader());
        mainWinTabs.addTab("Metrics", new Metrics());
        mainWinTabs.addTab("MassBalance", new MassBalance());
        mainWinTabs.addTab("GroundReactions", new GroundReactions());
        mainWinTabs.addTab("ExternalReactions", new ExternalReactions());
        mainWinTabs.addTab("Propulsion", new Propulsion());
        mainWinTabs.addTab("System", new SystemTab());
        mainWinTabs.addTab("AutoPilot", new AutoPilot());
        mainWinTabs.addTab("FlightControl", new FlightControl());
        mainWinTabs.addTab("Aerodynamics", new Aerodynamics());
        mainWinTabs.addTab("Input", new Input());
        mainWinTabs.addTab("Output", new Output());
    }

    private void makeMenuBar() {
        //======== buttonPanel ========
        { 
            buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 5));
            buttonPanel.setBackground(UIManager.getColor("MenuBar.background"));
        
            //======== buttonBar ========
            {
                buttonBar.setBackground(UIManager.getColor("MenuBar.background"));

                //---- openButton ----
                openButton.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.OPEN_RES)));
                openButton.setBorder(new EmptyBorder(5, 10, 5, 10));
                openButton.setBackground(null);
                openButton.setToolTipText("Open a XML config to edit");
                openButton.addActionListener(event -> {
                    try {
                        // load xml file
                        Optional<File> xml = LoadSave.openFile();
                        if(xml.isPresent()) {
                            //send xml into PropertiesWin to make its own unmarshaller
                            PropertiesWin.loadProperties(xml);
                            // unmarshall xml to jaxb object
                            JAXBContext jc = JAXBContext.newInstance("generated");
                            Unmarshaller um = jc.createUnmarshaller();
                            cfg = (FdmConfig) um.unmarshal(xml.get());
                            
                            // enable tabs and switch to FileHeader tab
                            mainWinTabs.setEnabled(true);
                            mainWinTabs.setSelectedIndex(1);
                            System.out.println(Constants.ANSI_GREEN + "XML loaded." + Constants.ANSI_RESET);
                            
                            // bind jaxb with each tab using interface
                            // start at 1 to skip home tab
                            // substitute for calling each tab. eg fileHeader.bindUIwithXML(cfg);
                            for(int i = 1; i < mainWinTabs.getTabCount(); i++) {
                                ((TabComponent) mainWinTabs.getComponentAt(i)).bindUIwithXML(cfg);
                            }
                        }
                    } catch (JAXBException e) {
                        System.out.println(Constants.ANSI_RED + "XML parsing Error." + Constants.ANSI_RESET);
                    }
                });
                buttonBar.add(openButton);

                //---- saveButton ----
                saveButton.setIcon(new ImageIcon(LoadSave.getContext().getResource(Constants.SAVE_RES)));
                saveButton.setBackground(null);
                saveButton.setBorder(new EmptyBorder(5, 10, 5, 10));
                saveButton.setToolTipText("Save the config to XML");
                saveButton.addActionListener(event -> {
                    
                    // check if cfg has been loaded
                    if(cfg == null) {
                        System.out.println(Constants.ANSI_RED + "No config loaded." + Constants.ANSI_RESET);
                        return;
                    }
                    
                    // save each tab to jaxb object using interface
                    // start at 1 to skip home tab
                    for(int i = 1; i < mainWinTabs.getTabCount(); i++) {
                        Optional<FdmConfig> tempCFG = ((TabComponent) mainWinTabs.getComponentAt(i)).saveXMLfromUI(cfg);
                        if(tempCFG.isPresent()) {
                            this.cfg = tempCFG.get();
                        }
                        else {
                            System.out.println("Schema Mismatch: skipped " + mainWinTabs.getTitleAt(i));
                        }
                    }

                    // save jaxb object to xml file
                    LoadSave.saveFile(cfg);
                });
                buttonBar.add(saveButton);
            }
            buttonPanel.add(buttonBar);
        }
        menuBar.add(buttonPanel);
    }
}
