package uta.cse.cse3310.JSBSimEdit.utils;

import java.io.File;
import java.util.Optional;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

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


    public static Optional<File> openFile() {
        // Launch file chooser at current working directory
        JFileChooser fileChooser = new JFileChooser(new File("."));
        fileChooser.setDialogTitle("Select a XML file to load");
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
}
