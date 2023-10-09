//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.09 at 01:48:50 PM CDT 
//


package generated;

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
 *       &lt;all&gt;
 *         &lt;element name="priority" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element ref="{}location"/&gt;
 *         &lt;element ref="{}radius" minOccurs="0"/&gt;
 *         &lt;element name="inertia_factor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element ref="{}capacity" minOccurs="0"/&gt;
 *         &lt;element ref="{}standpipe" minOccurs="0"/&gt;
 *         &lt;element ref="{}contents" minOccurs="0"/&gt;
 *         &lt;element ref="{}drain_location" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
@XmlRootElement(name = "tank")
public class Tank {

    protected Double priority;
    protected Double temperature;
    @XmlElement(required = true)
    protected Location location;
    protected Radius radius;
    @XmlElement(name = "inertia_factor")
    protected Double inertiaFactor;
    protected Capacity capacity;
    protected Standpipe standpipe;
    protected Contents contents;
    @XmlElement(name = "drain_location")
    protected DrainLocation drainLocation;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "number")
    protected BigInteger number;

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPriority(Double value) {
        this.priority = value;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTemperature() {
        return temperature;
    }

    /**
     * Sets the value of the temperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTemperature(Double value) {
        this.temperature = value;
    }

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
     * Gets the value of the radius property.
     * 
     * @return
     *     possible object is
     *     {@link Radius }
     *     
     */
    public Radius getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     * @param value
     *     allowed object is
     *     {@link Radius }
     *     
     */
    public void setRadius(Radius value) {
        this.radius = value;
    }

    /**
     * Gets the value of the inertiaFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInertiaFactor() {
        return inertiaFactor;
    }

    /**
     * Sets the value of the inertiaFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInertiaFactor(Double value) {
        this.inertiaFactor = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     * @return
     *     possible object is
     *     {@link Capacity }
     *     
     */
    public Capacity getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Capacity }
     *     
     */
    public void setCapacity(Capacity value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the standpipe property.
     * 
     * @return
     *     possible object is
     *     {@link Standpipe }
     *     
     */
    public Standpipe getStandpipe() {
        return standpipe;
    }

    /**
     * Sets the value of the standpipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Standpipe }
     *     
     */
    public void setStandpipe(Standpipe value) {
        this.standpipe = value;
    }

    /**
     * Gets the value of the contents property.
     * 
     * @return
     *     possible object is
     *     {@link Contents }
     *     
     */
    public Contents getContents() {
        return contents;
    }

    /**
     * Sets the value of the contents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contents }
     *     
     */
    public void setContents(Contents value) {
        this.contents = value;
    }

    /**
     * Gets the value of the drainLocation property.
     * 
     * @return
     *     possible object is
     *     {@link DrainLocation }
     *     
     */
    public DrainLocation getDrainLocation() {
        return drainLocation;
    }

    /**
     * Sets the value of the drainLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DrainLocation }
     *     
     */
    public void setDrainLocation(DrainLocation value) {
        this.drainLocation = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

}
