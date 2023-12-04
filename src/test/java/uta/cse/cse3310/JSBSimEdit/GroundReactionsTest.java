package uta.cse.cse3310.JSBSimEdit;

/**
 *
 * @author Connor Baldwin <Connor.Baldwin at ctb2078@mavs.uta.edu>
 */

import generated.Contact;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import generated.FdmConfig;
import java.math.BigInteger;
import uta.cse.cse3310.JSBSimEdit.utils.DoubleUtils;

public class GroundReactionsTest {
    private GroundReactions groundreac = new GroundReactions();
    private FdmConfig cfg = new FdmConfig();
    private generated.GroundReactions gr;
    
    List<Double> validDoubles = Arrays.asList(
        Double.MAX_VALUE, Double.MIN_NORMAL, Double.MIN_VALUE, 1.0, 1.1, 0.001, 0.0001
    );
    
    List<Double> invalidDoubles = Arrays.asList(
        -0.0, 0.0, -Double.MAX_VALUE, -Double.MIN_NORMAL, -Double.MIN_VALUE,-1.0, -1.1, -0.001, -0.0001
    );
    
    // Test massbal.getListLGS()
    @Test
    public void validateList(){
        // setup
        cfg.setGroundReactions(new generated.GroundReactions());
        gr = cfg.getGroundReactions();
        int i = 0;
        
        // test starts here
        for(var d : validDoubles){ //must convert all lgs to generated.Contact and add them to cfg.getGroundReactions().getContent()
            generated.Contact c = new generated.Contact();
            c.setName("john");
            c.setType("type");
            generated.Location l = new generated.Location(); //location
            l.setX(d);
            l.setY(d);
            l.setZ(d);
            c.setLocation(l);
            
            c.setStaticFriction(d); //staticFric
            c.setDynamicFriction(d); //dynamicFric
            
            Contact.SpringCoeff sc = new Contact.SpringCoeff(); //springCo
            sc.setValue(d);
            sc.setUnit(generated.SpringCoeffType.LBS_FT);
            c.setSpringCoeff(sc);
            
            Contact.DampingCoeff dc = new Contact.DampingCoeff(); //dampCo
            dc.setValue(d);
            dc.setUnit(generated.DampingCoeffType.LBS_FT_SEC);
            c.setDampingCoeff(dc);
            
            Contact.DampingCoeffRebound dcr = new Contact.DampingCoeffRebound(); //dampCoRe
            dcr.setValue(d);
            dcr.setUnit(generated.DampingCoeffType.LBS_FT_SEC);    
            c.setDampingCoeffRebound(dcr);
            
            c.setRollingFriction(d); //rollingFric
            
            Contact.MaxSteer ms = new Contact.MaxSteer(); //steer
            ms.setValue(d);
            ms.setUnit(generated.AngleType.DEG);
            
            c.setBrakeGroup(null); //brakeGroup

            c.setRetractable(null); //retractable
            
            Contact.RelaxationVelocity rv = new Contact.RelaxationVelocity(); //relaxation velocity
            Contact.RelaxationVelocity.Rolling rl = new Contact.RelaxationVelocity.Rolling();//relaxRoll
            rl.setValue(d.floatValue()); 
            rl.setUnit("FT/SEC");
            rv.setRolling(rl);
            Contact.RelaxationVelocity.Side sd = new Contact.RelaxationVelocity.Side(); //relaxSide
            sd.setValue(d.floatValue());
            sd.setUnit("FT/SEC");
            rv.setSide(sd);
            c.setRelaxationVelocity(rv);
            
            generated.ForceLagFilter flf = new generated.ForceLagFilter(); //force lag filter
            flf.setRolling(d.floatValue());
            flf.setSide(d.floatValue());            
            c.setForceLagFilter(flf);
            
            c.setWheelSlipFilter(d.floatValue());//wheel slip filter
            
            //add new Contact into the list
            gr.getContent().add(c);
            i++;
        }
        assertFalse(gr.getContent().isEmpty());
        groundreac.bindUIwithXML(cfg);
        assertFalse(groundreac.getListLGS().isEmpty()); //make sure its not empty
        
        assertEquals(i, groundreac.getListLGS().size()); //make sure it has the right amount
        
        gr.getContent().clear();
        groundreac.bindUIwithXML(cfg);
        assertTrue(groundreac.getListLGS().isEmpty()); //make sure its empty
    }
}
