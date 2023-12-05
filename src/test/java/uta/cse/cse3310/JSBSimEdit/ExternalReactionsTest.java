package uta.cse.cse3310.JSBSimEdit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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

public class ExternalReactionsTest {
    private ExternalReactions externalReactionTest = new ExternalReactions();
    private FdmConfig config = new FdmConfig();
    private generated.ExternalReactions generatedReactions;

    List<Double> validDoubles = Arrays.asList(
        Double.MAX_VALUE, Double.MIN_NORMAL, Double.MIN_VALUE, 1.0, 1.1, 0.001, 0.0001
    );
    
    List<Double> invalidDoubles = Arrays.asList(
        -0.0, 0.0, -Double.MAX_VALUE, -Double.MIN_NORMAL, -Double.MIN_VALUE,-1.0, -1.1, -0.001, -0.0001
    );

    @Test
    public void reactionTest(){
        config.setExternalReactions(new generated.ExternalReactions());
        generatedReactions = config.getExternalReactions();
        int check = 0;


        for(var d : validDoubles){
            generated.Force force = new generated.Force();
            force.setName("Force Test");
            
            generated.Location forceLocation = new generated.Location();
            forceLocation.setX(d);
            forceLocation.setY(d);
            forceLocation.setZ(d);
            force.setLocation(forceLocation);

            generated.Direction forceDirection = new generated.Direction();
            forceDirection.setX(d);
            forceDirection.setY(d);
            forceDirection.setZ(d);
            force.setDirection(forceDirection);

            force.setFrame("BODY");

            generatedReactions.getForce().add(force);
            check++;
        }
        assertFalse(generatedReactions.getForce().isEmpty());
        externalReactionTest.bindUIwithXML(config);
        assertFalse(externalReactionTest.getArrayForce().isEmpty());

        assertEquals(check, externalReactionTest.getArrayForce().size());

        generatedReactions.getForce().clear();
        externalReactionTest.bindUIwithXML(config);
        assertTrue(externalReactionTest.getArrayForce().isEmpty());
    }
}
