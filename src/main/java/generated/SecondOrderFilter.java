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
 *         &lt;element name="c1" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="c2" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="c3" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="c4" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="c5" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="c6" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
@XmlRootElement(name = "second_order_filter")
public class SecondOrderFilter {

    protected String description;
    @XmlElement(required = true)
    protected String input;
    protected double c1;
    protected double c2;
    protected double c3;
    protected double c4;
    protected double c5;
    protected double c6;
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
     * Gets the value of the c1 property.
     * 
     */
    public double getC1() {
        return c1;
    }

    /**
     * Sets the value of the c1 property.
     * 
     */
    public void setC1(double value) {
        this.c1 = value;
    }

    /**
     * Gets the value of the c2 property.
     * 
     */
    public double getC2() {
        return c2;
    }

    /**
     * Sets the value of the c2 property.
     * 
     */
    public void setC2(double value) {
        this.c2 = value;
    }

    /**
     * Gets the value of the c3 property.
     * 
     */
    public double getC3() {
        return c3;
    }

    /**
     * Sets the value of the c3 property.
     * 
     */
    public void setC3(double value) {
        this.c3 = value;
    }

    /**
     * Gets the value of the c4 property.
     * 
     */
    public double getC4() {
        return c4;
    }

    /**
     * Sets the value of the c4 property.
     * 
     */
    public void setC4(double value) {
        this.c4 = value;
    }

    /**
     * Gets the value of the c5 property.
     * 
     */
    public double getC5() {
        return c5;
    }

    /**
     * Sets the value of the c5 property.
     * 
     */
    public void setC5(double value) {
        this.c5 = value;
    }

    /**
     * Gets the value of the c6 property.
     * 
     */
    public double getC6() {
        return c6;
    }

    /**
     * Sets the value of the c6 property.
     * 
     */
    public void setC6(double value) {
        this.c6 = value;
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
