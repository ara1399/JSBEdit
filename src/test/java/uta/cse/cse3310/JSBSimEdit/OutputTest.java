package uta.cse.cse3310.JSBSimEdit;

//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import generated.FdmConfig;
//import uta.cse.cse3310.JSBSimEdit.utils.DoubleUtils;

/*
 *  Tests Output.bindUIwithXML().
 *  -tests after Jaxb unmarshalling to Metrics UI
 *  -creates new, clean Jaxb object and binds it to UI
 *  -grabs text from UI result and checks validity
 *  -Does NOT test for invalid XML file input
 */
public class OutputTest {
    //private Output output = new Output();
    private FdmConfig cfg = new FdmConfig();
    private List<generated.Output> op;
    List<Double> validDoubles = Arrays.asList(
        Double.MAX_VALUE, Double.MIN_NORMAL, Double.MIN_VALUE, 1.0, 1.1, 0.001, 0.0001
    );
    List<Double> invalidDoubles = Arrays.asList(
        -0.0, 0.0, -Double.MAX_VALUE, -Double.MIN_NORMAL, -Double.MIN_VALUE,-1.0, -1.1, -0.001, -0.0001
    );
    List<Integer> validInts = Arrays.asList(1, 9999, 999999999);

    @Test
    public void validateNameText() {

        // setup
        //cfg.setOutput(new generated.Output());
        this.op = cfg.getOutput();

        // test starts here
        //((FdmConfig) op).setName(new generated.Output().getName());
    }
}
