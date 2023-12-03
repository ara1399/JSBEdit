package uta.cse.cse3310.JSBSimEdit;

import static org.junit.Assert.assertTrue;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import generated.FdmConfig;

public class InputTest {

    private Input input = new Input();
    private FdmConfig cfg = new FdmConfig();
    private generated.Input in;
    List<BigInteger> validBigIntegers = Arrays.asList(
        BigInteger.ONE, BigInteger.valueOf(9999), new BigInteger("999999999")
    );

    List<BigInteger> invalidBigIntegers = Arrays.asList(
        BigInteger.valueOf(-1), BigInteger.valueOf(0), new BigInteger("1000000000")
    );

    @Test
    public void validatePortText() {

        cfg.setInput(new generated.Input());
        this.in = cfg.getInput();

        for(BigInteger value : validBigIntegers) {
            in.setPort(value);
            input.bindUIwithXML(cfg);
            assertTrue(input.portText.getText().equals(value.toString()));
        }

        /*for(BigInteger value : invalidBigIntegers) {
            in.setPort(value);
            input.bindUIwithXML(cfg);
            assertTrue(input.portText.getText().equals(""));
        }*/

        input.portText.setText("12345");
        input.saveXMLfromUI(cfg);
        assertTrue(in.getPort().equals(new java.math.BigInteger("12345")));
    }
    
}
