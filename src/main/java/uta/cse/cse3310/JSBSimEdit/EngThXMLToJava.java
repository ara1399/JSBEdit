package uta.cse.cse3310.JSBSimEdit;

import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

public class EngThXMLToJava {
    public static void main(String[] args) {
		
		try {
			
			File file = new File("/home/arhamali25/code/cse3310_fa23_group_2/src/main/java/uta/cse/cse3310/JSBSimEdit/oldProgram/EgineManager.xml");
			
			JAXBContext jaxbContext = JAXBContext.newInstance(EngTh.class);

			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			
			EngTh engTh = (EngTh) unmarshaller.unmarshal(file);
			
			System.out.println(engTh.getName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
