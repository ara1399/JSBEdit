//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.21 at 11:44:31 AM CST 
//


package generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="rolling" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="side" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "force_lag_filter")
public class ForceLagFilter {

    protected float rolling;
    protected float side;

    /**
     * Gets the value of the rolling property.
     * 
     */
    public float getRolling() {
        return rolling;
    }

    /**
     * Sets the value of the rolling property.
     * 
     */
    public void setRolling(float value) {
        this.rolling = value;
    }

    /**
     * Gets the value of the side property.
     * 
     */
    public float getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     */
    public void setSide(float value) {
        this.side = value;
    }

}
