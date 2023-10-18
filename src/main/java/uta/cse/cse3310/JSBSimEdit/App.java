package uta.cse.cse3310.JSBSimEdit;

import java.io.File;
import java.util.List;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.util.SystemInfo;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.Marshaller;
import generated.FdmConfig;

import javax.swing.*;

public class App {
  public static void main(String[] args) {

    try {

      File file = new File("examples/f16.xml");
      // JAXBContext jaxbContext = JAXBContext.newInstance(FdmConfig.class);

      // Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
      // FdmConfig cfg = (FdmConfig) jaxbUnmarshaller.unmarshal(file);

      // System.out.println(cfg.getName());

      JAXBContext jc = JAXBContext.newInstance("generated");

      Unmarshaller um = jc.createUnmarshaller();
      FdmConfig cfg = (FdmConfig) um.unmarshal(file);
    
      /* System.out.println(cfg);
      System.out.println(cfg.getFileheader().getCopyright());
      System.out.println(cfg.getFileheader().getVersion() );
      System.out.println(cfg.getAerodynamics().getAxis().get(0).getName());
      System.out.println(cfg.getAerodynamics().getAxis().get(0).getFunction());
      System.out.println(cfg.getAerodynamics().getAxis().get(0).getClass()); */


      //Marshaller m = jc.createMarshaller();
      //m.setProperty("jaxb.formatted.output", true);
      //m.marshal(cfg, System.out);

    } catch (JAXBException e) {
      e.printStackTrace();
    }

    try {
        UIManager.setLookAndFeel(new FlatDarkLaf());
        if(SystemInfo.isLinux) {
            // enable custom window decorations
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
        }
    } catch(Exception ex) {
        ex.printStackTrace();
    }

    SwingUtilities.invokeLater(() -> {
        new MainWindow();
    });

  }
}
