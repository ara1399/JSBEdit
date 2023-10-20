package uta.cse.cse3310.JSBSimEdit;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import generated.FdmConfig;
import uta.cse.cse3310.JSBSimEdit.utils.Constants;
import uta.cse.cse3310.JSBSimEdit.utils.LoadSave;

import java.awt.*;
import java.io.File;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.lang.System;

public class MainWindow extends JFrame {

    public static FdmConfig cfg;
    
    //menu bar on top
    private JMenuBar menuBar = new JMenuBar();
    //button bar in menu bar
    private JPanel buttonPanel = new JPanel();
	private JToolBar buttonBar = new JToolBar();
	private JButton openButton = new JButton();
	private JButton saveButton = new JButton();
    //tabs
    private JTabbedPane mainWinTabs;
    private FileHeader fileHeader;
    
    public MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle(Constants.APP_NAME);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(Constants.APP_SIZEX, Constants.APP_SIZEY));

        add(menuBar, BorderLayout.NORTH);
        makeMenuBar();

        mainWinTabs = new JTabbedPane();
        add(mainWinTabs);
        makeTabs();

        pack();
        setVisible(true);
        getContentPane().requestFocusInWindow();
    }

    //////////////////////////////////////ADD TABS HERE///////////////////////////////////////
    private void makeTabs(){
        
        mainWinTabs.addTab("FileHeader", fileHeader = new FileHeader());
        mainWinTabs.addTab("Metrics", new Metrics());
        mainWinTabs.addTab("MassBalance", new MassBalance());
        mainWinTabs.addTab("GroundReactions", new GroundReactions());
        mainWinTabs.addTab("ExternalReactions", new ExternalReactions());
        mainWinTabs.addTab("BuoyantForces", new BuoyantForces());
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
                        Optional<File> xml = LoadSave.openFile();
                        if(xml.isPresent()) {
                            JAXBContext jc = JAXBContext.newInstance("generated");
                            Unmarshaller um = jc.createUnmarshaller();
                            cfg = (FdmConfig) um.unmarshal(xml.get());
                            bindUIwithXML();
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
                //saveButton.addActionListener(listener);
                //saveButton.setActionCommand("MainPanel.play");
                buttonBar.add(saveButton);
            }
            buttonPanel.add(buttonBar);
        }
        menuBar.add(buttonPanel);
    }

    private void bindUIwithXML() {
        //System.out.println(cfg);
        //System.out.println(cfg.getFileheader().getCopyright());
        //System.out.println(cfg.getFileheader().getVersion());
        //System.out.println(cfg.getAerodynamics().getAxis().get(0).getName());
        //System.out.println(cfg.getAerodynamics().getAxis().get(0).getFunction());
        //System.out.println(cfg.getAerodynamics().getAxis().get(0).getClass());

        fileHeader.getAircraftNameText().setText(cfg.getName());
        fileHeader.getReleaseLevelCombo().setSelectedItem(cfg.getRelease());
        fileHeader.getFlightModelVersionText().setText(cfg.getVersion());

        fileHeader.getLicenseText().setText(cfg.getFileheader().getLicense().getLicenseName());
        fileHeader.getLicenseURLText().setText(cfg.getFileheader().getLicense().getLicenseURL());
        fileHeader.getSensitivityText().setText(cfg.getFileheader().getSensitivity());
        fileHeader.getFileDateText().setText(cfg.getFileheader().getFilecreationdate().toString());
        fileHeader.getConfigVersionText().setText(cfg.getFileheader().getVersion());
        fileHeader.getCopyrightText().setText(cfg.getFileheader().getCopyright());

        List<JAXBElement<String>> aeo = cfg.getFileheader().getAuthorOrEmailOrOrganization();
        ListIterator<JAXBElement<String>> itr = aeo.listIterator();
        if(itr.hasNext()) {
            fileHeader.getAuthorText().setText(itr.next().getValue());
        }
        if(itr.hasNext()) {
            fileHeader.getEmailText().setText(itr.next().getValue());
        }
        if(itr.hasNext()) {
            fileHeader.getOrganizationTextArea().setText(itr.next().getValue());
        }
        
        fileHeader.getDescriptionTextArea().setText(cfg.getFileheader().getDescription());
        //fileHeader.getReferencesTable().setValueAt(cfg.getFileheader().getNoteOrLimitationOrReference().get(2).getClass().getName(), 0, 0);
        //fileHeader.getLimitationsTextArea().setText(cfg.getFileheader().getNoteOrLimitationOrReference().get(1).getClass().getName());
        //fileHeader.getNotesTextArea().setText(cfg.getFileheader().getNoteOrLimitationOrReference().get(0).getClass().getName());
    }
}
