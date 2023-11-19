//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.19 at 04:22:12 PM CST 
//


package generated;

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
 *       &lt;all&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="input" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="lag" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="rate_limit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="bias" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="deadband_width" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="hysteresis_width" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element ref="{}clipto" minOccurs="0"/&gt;
 *         &lt;element name="output" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlRootElement(name = "actuator")
public class Actuator {

    protected String description;
    @XmlElement(required = true)
    protected String input;
    protected Float lag;
    @XmlElement(name = "rate_limit")
    protected Float rateLimit;
    protected Float bias;
    @XmlElement(name = "deadband_width")
    protected Float deadbandWidth;
    @XmlElement(name = "hysteresis_width")
    protected Float hysteresisWidth;
    protected Clipto clipto;
    protected String output;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInput(String value) {
        this.input = value;
    }

    /**
     * Gets the value of the lag property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLag() {
        return lag;
    }

    /**
     * Sets the value of the lag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLag(Float value) {
        this.lag = value;
    }

    /**
     * Gets the value of the rateLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRateLimit() {
        return rateLimit;
    }

    /**
     * Sets the value of the rateLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRateLimit(Float value) {
        this.rateLimit = value;
    }

    /**
     * Gets the value of the bias property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBias() {
        return bias;
    }

    /**
     * Sets the value of the bias property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBias(Float value) {
        this.bias = value;
    }

    /**
     * Gets the value of the deadbandWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDeadbandWidth() {
        return deadbandWidth;
    }

    /**
     * Sets the value of the deadbandWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDeadbandWidth(Float value) {
        this.deadbandWidth = value;
    }

    /**
     * Gets the value of the hysteresisWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHysteresisWidth() {
        return hysteresisWidth;
    }

    /**
     * Sets the value of the hysteresisWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHysteresisWidth(Float value) {
        this.hysteresisWidth = value;
    }

    /**
     * Gets the value of the clipto property.
     * 
     * @return
     *     possible object is
     *     {@link Clipto }
     *     
     */
    public Clipto getClipto() {
        return clipto;
    }

    /**
     * Sets the value of the clipto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Clipto }
     *     
     */
    public void setClipto(Clipto value) {
        this.clipto = value;
    }

    /**
     * Gets the value of the output property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutput() {
        return output;
    }

    /**
     * Sets the value of the output property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutput(String value) {
        this.output = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
