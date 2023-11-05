package uta.cse.cse3310.JSBSimEdit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import generated.FdmConfig;
import uta.cse.cse3310.JSBSimEdit.utils.DoubleUtils;

/*
 *  Tests Metrics.bindUIwithXML().
 *  -tests after Jaxb unmarshalling to Metrics UI
 *  -creates new, clean Jaxb object and binds it to UI
 *  -grabs text from UI result and checks validity
 *  -Does NOT test for invalid XML file input
 */
public class MetricsTest {
    
    private Metrics metrics = new Metrics();
    private FdmConfig cfg = new FdmConfig();
    private generated.Metrics m;
    List<Double> validDoubles = Arrays.asList(
        Double.MAX_VALUE, Double.MIN_NORMAL, Double.MIN_VALUE, 1.0, 1.1, 0.001, 0.0001
    );
    List<Double> invalidDoubles = Arrays.asList(
        -0.0, 0.0, -Double.MAX_VALUE, -Double.MIN_NORMAL, -Double.MIN_VALUE,-1.0, -1.1, -0.001, -0.0001
    );
    //List<Integer> validInts = Arrays.asList(1, 9999, 999999999);
    //List<String> validStrs = Arrays.asList("1", "9999", "999999999", "1.0", "1.1", "0.1", "0.01", "0.001", "0.0001");


    // Test Metrics.getWingAreaText()
    @Test
    public void validateWingAreaText() {

        // setup
        cfg.setMetrics(new generated.Metrics());
        this.m = cfg.getMetrics();

        // test starts here
        m.setWingarea(new generated.Wingarea());

        for(var d : validDoubles) {
            m.getWingarea().setValue(d);
            metrics.bindUIwithXML(cfg);
            assertTrue(DoubleUtils.isPositiveDouble(
                metrics.getWingAreaText().getText()
            ));
        }
        for(var d : invalidDoubles) {
            m.getWingarea().setValue(d);
            metrics.bindUIwithXML(cfg);
            assertFalse(DoubleUtils.isPositiveDouble(
                metrics.getWingAreaText().getText()
            ));
        }
    }

    // Test Metrics.getWingSpanText()
    @Test
    public void validateWingSpanText() {

        // setup
        cfg.setMetrics(new generated.Metrics());
        this.m = cfg.getMetrics();
        
        // test starts here
        m.setWingspan(new generated.Wingspan());

        for(var d : validDoubles) {
            m.getWingspan().setValue(d);
            metrics.bindUIwithXML(cfg);
            assertTrue(DoubleUtils.isPositiveDouble(
                metrics.getWingSpanText().getText()
            ));
        }
        for(var d : invalidDoubles) {
            m.getWingspan().setValue(d);
            metrics.bindUIwithXML(cfg);
            assertFalse(DoubleUtils.isPositiveDouble(
                metrics.getWingSpanText().getText()
            ));
        }
    }

    // Test Metrics.getChordText()
    @Test
    public void validateChordText() {

        // setup
        cfg.setMetrics(new generated.Metrics());
        this.m = cfg.getMetrics();
        
        // test starts here
        m.setChord(new generated.Chord());

        for(var d : validDoubles) {
            m.getChord().setValue(d);
            metrics.bindUIwithXML(cfg);
            assertTrue(DoubleUtils.isPositiveDouble(
                metrics.getChordText().getText()
            ));
        }
        for(var d : invalidDoubles) {
            m.getChord().setValue(d);
            metrics.bindUIwithXML(cfg);
            assertFalse(DoubleUtils.isPositiveDouble(
                metrics.getChordText().getText()
            ));
        }
    }

    // Test Metrics.gethTailAreaText()
    @Test
    public void validatehTailAreaText() {

        // setup
        cfg.setMetrics(new generated.Metrics());
        this.m = cfg.getMetrics();
        
        // test starts here
        m.setHtailarea(new generated.Htailarea());

        for(var d : validDoubles) {
            m.getHtailarea().setValue(d);
            metrics.bindUIwithXML(cfg);
            assertTrue(DoubleUtils.isPositiveDouble(
                metrics.gethTailAreaText().getText()
            ));
        }
        for(var d : invalidDoubles) {
            m.getHtailarea().setValue(d);
            metrics.bindUIwithXML(cfg);
            assertFalse(DoubleUtils.isPositiveDouble(
                metrics.gethTailAreaText().getText()
            ));
        }
    }

    // Test Metrics.gethTailArmText()
    @Test
    public void validatehTailArmText() {

        // setup
        cfg.setMetrics(new generated.Metrics());
        this.m = cfg.getMetrics();
        
        // test starts here
        m.setHtailarm(new generated.Htailarm());

        for(var d : validDoubles) {
            m.getHtailarm().setValue(d);
            metrics.bindUIwithXML(cfg);
            assertTrue(DoubleUtils.isPositiveDouble(
                metrics.gethTailArmText().getText()
            ));
        }
        for(var d : invalidDoubles) {
            m.getHtailarm().setValue(d);
            metrics.bindUIwithXML(cfg);
            assertFalse(DoubleUtils.isPositiveDouble(
                metrics.gethTailArmText().getText()
            ));
        }
    }

    // Test Metrics.getvTailAreaText()
    @Test
    public void validatevTailAreaText() {

        // setup
        cfg.setMetrics(new generated.Metrics());
        this.m = cfg.getMetrics();
        
        // test starts here
        m.setVtailarea(new generated.Vtailarea());

        for(var d : validDoubles) {
            m.getVtailarea().setValue(d);
            metrics.bindUIwithXML(cfg);
            assertTrue(DoubleUtils.isPositiveDouble(
                metrics.getvTailAreaText().getText()
            ));
        }
        for(var d : invalidDoubles) {
            m.getVtailarea().setValue(d);
            metrics.bindUIwithXML(cfg);
            assertFalse(DoubleUtils.isPositiveDouble(
                metrics.getvTailAreaText().getText()
            ));
        }
    }
}
