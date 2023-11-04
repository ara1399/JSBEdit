package uta.cse.cse3310.JSBSimEdit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import generated.FdmConfig;
import uta.cse.cse3310.JSBSimEdit.utils.DoubleUtils;

public class MetricsTest {
    
    private Metrics metrics = new Metrics();
    private FdmConfig cfg = new FdmConfig();
    private generated.Metrics m;
    List<Double> validDoubles = Arrays.asList(1.0, 1.1, 0.1, 0.01, 0.001, 0.0001);
    //List<Integer> validInts = Arrays.asList(1, 9999, 999999999);
    //List<String> validStrs = Arrays.asList("1", "9999", "999999999", "1.0", "1.1", "0.1", "0.01", "0.001", "0.0001");
    List<Double> invalidDoubles = Arrays.asList(0.0, -1.0, -1.1, -0.1, -0.01, -0.001, -0.0001);

    @Test
    public void validateWingAreaText() {

        cfg.setMetrics(new generated.Metrics());
        this.m = cfg.getMetrics();

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
}
