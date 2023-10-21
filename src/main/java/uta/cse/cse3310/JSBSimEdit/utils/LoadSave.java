package uta.cse.cse3310.JSBSimEdit.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Optional;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import generated.FdmConfig;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

public class LoadSave {

    // get current thread context of a resource (in Jar/nonJar)
    public static ClassLoader getContext() {
        return Thread.currentThread().getContextClassLoader();
    }


    // get file extension in lowercase
    public static String getFileExtension(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return ""; // empty extension
        }
        return name.substring(lastIndexOf + 1).toLowerCase();
    }


    // open XML file
    public static Optional<File> openFile() {
        // Launch file chooser at current working directory
        JFileChooser fileChooser = new JFileChooser(new File("."));
        fileChooser.setDialogTitle("Select a XML config to load");
        fileChooser.setFileFilter(new FileNameExtensionFilter(Constants.EXT_XML_DESC, Constants.EXT_XML));

        // Check if file was selected
        int result = fileChooser.showOpenDialog(null);
        if (!(result == JFileChooser.APPROVE_OPTION)) {
            //GUIController.main_panel.getStatusLabel().setText("Status: No file selected.");
            System.out.println(Constants.ANSI_RED + "No file selected." + Constants.ANSI_RESET);
            return Optional.empty();
        }
        
        // Check if file is XML
        File selectedFile = fileChooser.getSelectedFile();
        String extension = LoadSave.getFileExtension(selectedFile);
        if (!extension.equals(Constants.EXT_XML)) {
            //GUIController.main_panel.getStatusLabel().setText("Status: Non XML file selected.");
            System.out.println(Constants.ANSI_RED + "Non XML file selected." + Constants.ANSI_RESET);
            return Optional.empty();
        }

        System.out.println(Constants.ANSI_GREEN + "XML file selected." + Constants.ANSI_RESET);
        return Optional.ofNullable(selectedFile);
    }

    // save XML file
    public static void saveFile(FdmConfig cfg) {
        // Launch file chooser at current working directory
        JFileChooser fileChooser = new JFileChooser(new File("."));
        fileChooser.setDialogTitle("Save config to XML");
        fileChooser.setFileFilter(new FileNameExtensionFilter(Constants.EXT_XML_DESC, Constants.EXT_XML));

        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String extension = LoadSave.getFileExtension(selectedFile);
            
            // Add .xml extension if no extension
            if (extension.equals("")) {
                extension = Constants.EXT_XML;
                selectedFile = new File(selectedFile.toString() + "." + extension);
            }
            
            // Check for non .xml extension
            if (!extension.equals(Constants.EXT_XML)) {
                System.out.println(Constants.ANSI_RED + "Failed. Must save as .xml" + Constants.ANSI_RESET);
                return;
            }

            // try saving by marshalling
            try {
                JAXBContext jc = JAXBContext.newInstance("generated");
                Marshaller m = jc.createMarshaller();
                m.setProperty("jaxb.formatted.output", true);
                OutputStream out = new FileOutputStream(selectedFile);
                m.marshal(cfg, out);
                System.out.println(Constants.ANSI_GREEN + "Saved to XML" + Constants.ANSI_RESET);
            } catch (Exception e) {
                System.out.println(Constants.ANSI_RED + "XML parsing Error." + Constants.ANSI_RESET);
            }
        }
    }


    /* 
    // Note: Good info for future projects, but doesnt work with this legacy jaxb code
    // Given an input string such as "2014-01-07", return a `XMLGregorianCalendar` object
    // representing first moment of the day on that date as seen in UTC. 
    // From StackOverflow - https://shorturl.at/bglrV
    static public XMLGregorianCalendar getXMLGregorianCalendar ( String input )
    {
        Objects.requireNonNull( input );
        if( input.isBlank() ) {
            throw new IllegalArgumentException("Received empty/blank input string for date argument. Message # 11818896-7412-49ba-8f8f-9b3053690c5d.");
        }
        XMLGregorianCalendar xgc = null;
        ZonedDateTime zdt = null;

        try
        {
            zdt =
                    LocalDate
                            .parse( input )
                            .atStartOfDay( ZoneOffset.UTC );
        }
        catch ( DateTimeParseException e )
        {
            throw new IllegalArgumentException("Faulty input string for date does not comply with standard ISO 8601 format. Message # 568db0ef-d6bf-41c9-8228-cc3516558e68.");
        }

        GregorianCalendar gc = GregorianCalendar.from( zdt );
        try
        {
            xgc =
                    DatatypeFactory
                            .newInstance()
                            .newXMLGregorianCalendar( gc );
        }
        catch ( DatatypeConfigurationException e )
        {
            e.printStackTrace();
        }

        Objects.requireNonNull( xgc );
        return xgc ;
    }
    */
}
