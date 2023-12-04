package uta.cse.cse3310.JSBSimEdit;

/**
 *
 * @author Connor Baldwin <Connor.Baldwin at ctb2078@mavs.uta.edu>
 */

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import generated.FdmConfig;
import uta.cse.cse3310.JSBSimEdit.utils.DoubleUtils;


public class MassBalanceTest {
    private MassBalance massbal = new MassBalance();
    private FdmConfig cfg = new FdmConfig();
    private generated.MassBalance mb;
    
    List<Double> validDoubles = Arrays.asList(
        Double.MAX_VALUE, Double.MIN_NORMAL, Double.MIN_VALUE, 1.0, 1.1, 0.001, 0.0001
    );
    
    List<Double> invalidDoubles = Arrays.asList(
        -0.0, 0.0, -Double.MAX_VALUE, -Double.MIN_NORMAL, -Double.MIN_VALUE,-1.0, -1.1, -0.001, -0.0001
    );
    
    // Test massbal.getEw()
    @Test
    public void validateEmptyWeight(){
        
        // setup
        cfg.setMassBalance(new generated.MassBalance());
        mb = cfg.getMassBalance();
        
        // test starts here
        mb.setEmptywt(new generated.Emptywt());
        
        for(var d : validDoubles){ //test cases where it should be true
            mb.getEmptywt().setValue(d);
            massbal.bindUIwithXML(cfg);
            assertTrue(DoubleUtils.isPositiveDouble(
                massbal.getEw().getText()
            ));
        }
        for(var d : invalidDoubles) { //test cases where it should be false
            mb.getEmptywt().setValue(d);
            massbal.bindUIwithXML(cfg);
            assertFalse(DoubleUtils.isPositiveDouble(
                massbal.getEw().getText()
            ));
        }
    }
    
    // Test massbal.getXLoc()
    @Test
    public void validateX(){
        // setup
        cfg.setMassBalance(new generated.MassBalance());
        mb = cfg.getMassBalance();
        
        // test starts here
        mb.setLocation(new generated.Location());
                
        for(var d : validDoubles){ //test cases where it should be true
            mb.getLocation().setX(d);
            massbal.bindUIwithXML(cfg);
            assertTrue(DoubleUtils.isPositiveDouble(
                massbal.getXLoc().getText()
            ));
        }
        for(var d : invalidDoubles) { //test cases where it should be true still
            mb.getLocation().setX(d);
            massbal.bindUIwithXML(cfg);
            assertTrue(DoubleUtils.isDouble( //location should accept negative doubles
                massbal.getXLoc().getText()
            ));
        }
    }
    
    // Test massbal.getYLoc()
    @Test
    public void validateY(){
        // setup
        cfg.setMassBalance(new generated.MassBalance());
        mb = cfg.getMassBalance();
        
        // test starts here
        mb.setLocation(new generated.Location());
                
        for(var d : validDoubles){ //test cases where it should be true
            mb.getLocation().setY(d);
            massbal.bindUIwithXML(cfg);
            assertTrue(DoubleUtils.isPositiveDouble(
                massbal.getYLoc().getText()
            ));
        }
        for(var d : invalidDoubles) { //test cases where it should be true still
            mb.getLocation().setY(d);
            massbal.bindUIwithXML(cfg);
            assertTrue(DoubleUtils.isDouble( //location should accept negative doubles
                massbal.getYLoc().getText()
            ));
        }
    }
    
    // Test massbal.getZLoc()
    @Test
    public void validateZ(){
        // setup
        cfg.setMassBalance(new generated.MassBalance());
        mb = cfg.getMassBalance();
        
        // test starts here
        mb.setLocation(new generated.Location());
                
        for(var d : validDoubles){ //test cases where it should be true
            mb.getLocation().setZ(d);
            massbal.bindUIwithXML(cfg);
            assertTrue(DoubleUtils.isPositiveDouble(
                massbal.getZLoc().getText()
            ));
        }
        for(var d : invalidDoubles) { //test cases where it should be true still
            mb.getLocation().setZ(d);
            massbal.bindUIwithXML(cfg);
            assertTrue(DoubleUtils.isDouble( //location should accept negative doubles
                massbal.getZLoc().getText()
            ));
        }
    }
    
    // Test massbal.getPmList()
    @Test
    public void validatePointMass(){
        // setup
        cfg.setMassBalance(new generated.MassBalance());
        mb = cfg.getMassBalance();
        int i = 0;
        
        // test starts here
        for(var d : validDoubles){
            generated.Pointmass pm = new generated.Pointmass();
            
            pm.setName("john" + i); //setting name
            
            generated.Weight w = new generated.Weight(); //configuring and setting weight
            w.setValue(d);
            w.setUnit(generated.WeightType.LBS);
           
            pm.setWeight(w);
            
            generated.Location l = new generated.Location(); //setting location
            l.setX(d);
            l.setY(d);
            l.setZ(d);
            l.setUnit("M");
            pm.setLocation(l);
            
            mb.getPointmass().add(pm);
            i++;
        }
        massbal.bindUIwithXML(cfg);
        assertFalse(massbal.getPmList().isEmpty()); //make sure the list has something
        
        assertEquals(i, massbal.getPmList().size());
        
        mb.getPointmass().clear();
        massbal.bindUIwithXML(cfg);
        assertTrue(massbal.getPmList().isEmpty()); //make sure the list is empty
    }
}
