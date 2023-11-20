//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.20 at 10:49:45 AM CST 
//


package generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{}location"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{}orient"/&gt;
 *           &lt;element ref="{}pointing"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{}sense" minOccurs="0"/&gt;
 *         &lt;element ref="{}p_factor" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="file" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "location",
    "orient",
    "pointing",
    "sense",
    "pFactor"
})
@XmlRootElement(name = "thruster")
public class Thruster {

    @XmlElement(required = true)
    protected Location location;
    protected Orient orient;
    protected Pointing pointing;
    protected BigInteger sense;
    @XmlElement(name = "p_factor")
    protected BigDecimal pFactor;
    @XmlAttribute(name = "file", required = true)
    protected String file;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the orient property.
     * 
     * @return
     *     possible object is
     *     {@link Orient }
     *     
     */
    public Orient getOrient() {
        return orient;
    }

    /**
     * Sets the value of the orient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Orient }
     *     
     */
    public void setOrient(Orient value) {
        this.orient = value;
    }

    /**
     * Gets the value of the pointing property.
     * 
     * @return
     *     possible object is
     *     {@link Pointing }
     *     
     */
    public Pointing getPointing() {
        return pointing;
    }

    /**
     * Sets the value of the pointing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pointing }
     *     
     */
    public void setPointing(Pointing value) {
        this.pointing = value;
    }

    /**
     * Gets the value of the sense property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSense() {
        return sense;
    }

    /**
     * Sets the value of the sense property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSense(BigInteger value) {
        this.sense = value;
    }

    /**
     * Gets the value of the pFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPFactor() {
        return pFactor;
    }

    /**
     * Sets the value of the pFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPFactor(BigDecimal value) {
        this.pFactor = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFile(String value) {
        this.file = value;
    }

}
