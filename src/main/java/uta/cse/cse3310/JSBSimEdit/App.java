package uta.cse.cse3310.JSBSimEdit;

import java.io.File;
import java.util.List;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.Marshaller;
import generated.FdmConfig;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    try {

      File file = new File("f16.xml");
      // JAXBContext jaxbContext = JAXBContext.newInstance(FdmConfig.class);

      // Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
      // FdmConfig cfg = (FdmConfig) jaxbUnmarshaller.unmarshal(file);

      // System.out.println(cfg.getName());

      JAXBContext jc = JAXBContext.newInstance("generated");

      Unmarshaller um = jc.createUnmarshaller();
      FdmConfig cfg = (FdmConfig) um.unmarshal(file);
    
      System.out.println(cfg);
      System.out.println(cfg.getFileheader().getCopyright());
      System.out.println(cfg.getFileheader().getVersion() );
      System.out.println(cfg.getAerodynamics().getAxis().get(0).getName());
      System.out.println(cfg.getAerodynamics().getAxis().get(0).getFunction());
      System.out.println(cfg.getAerodynamics().getAxis().get(0).getClass());


      //Marshaller m = jc.createMarshaller();
      //m.setProperty("jaxb.formatted.output", true);
      //m.marshal(cfg, System.out);

    } catch (JAXBException e) {
      e.printStackTrace();
    }

  }
}
