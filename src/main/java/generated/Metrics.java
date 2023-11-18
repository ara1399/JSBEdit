//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.18 at 04:48:55 PM CST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{}wingarea"/&gt;
 *         &lt;element ref="{}wingspan"/&gt;
 *         &lt;element ref="{}wing_incidence" minOccurs="0"/&gt;
 *         &lt;element ref="{}chord"/&gt;
 *         &lt;element ref="{}htailarea" minOccurs="0"/&gt;
 *         &lt;element ref="{}htailarm" minOccurs="0"/&gt;
 *         &lt;element ref="{}vtailarea" minOccurs="0"/&gt;
 *         &lt;element ref="{}vtailarm" minOccurs="0"/&gt;
 *         &lt;element ref="{}location" maxOccurs="3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wingarea",
    "wingspan",
    "wingIncidence",
    "chord",
    "htailarea",
    "htailarm",
    "vtailarea",
    "vtailarm",
    "location"
})
@XmlRootElement(name = "metrics")
public class Metrics {

    @XmlElement(required = true)
    protected Wingarea wingarea;
    @XmlElement(required = true)
    protected Wingspan wingspan;
    @XmlElement(name = "wing_incidence")
    protected WingIncidence wingIncidence;
    @XmlElement(required = true)
    protected Chord chord;
    protected Htailarea htailarea;
    protected Htailarm htailarm;
    protected Vtailarea vtailarea;
    protected Vtailarm vtailarm;
    @XmlElement(required = true)
    protected List<Location> location;

    /**
     * Gets the value of the wingarea property.
     * 
     * @return
     *     possible object is
     *     {@link Wingarea }
     *     
     */
    public Wingarea getWingarea() {
        return wingarea;
    }

    /**
     * Sets the value of the wingarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wingarea }
     *     
     */
    public void setWingarea(Wingarea value) {
        this.wingarea = value;
    }

    /**
     * Gets the value of the wingspan property.
     * 
     * @return
     *     possible object is
     *     {@link Wingspan }
     *     
     */
    public Wingspan getWingspan() {
        return wingspan;
    }

    /**
     * Sets the value of the wingspan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wingspan }
     *     
     */
    public void setWingspan(Wingspan value) {
        this.wingspan = value;
    }

    /**
     * Gets the value of the wingIncidence property.
     * 
     * @return
     *     possible object is
     *     {@link WingIncidence }
     *     
     */
    public WingIncidence getWingIncidence() {
        return wingIncidence;
    }

    /**
     * Sets the value of the wingIncidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link WingIncidence }
     *     
     */
    public void setWingIncidence(WingIncidence value) {
        this.wingIncidence = value;
    }

    /**
     * Gets the value of the chord property.
     * 
     * @return
     *     possible object is
     *     {@link Chord }
     *     
     */
    public Chord getChord() {
        return chord;
    }

    /**
     * Sets the value of the chord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chord }
     *     
     */
    public void setChord(Chord value) {
        this.chord = value;
    }

    /**
     * Gets the value of the htailarea property.
     * 
     * @return
     *     possible object is
     *     {@link Htailarea }
     *     
     */
    public Htailarea getHtailarea() {
        return htailarea;
    }

    /**
     * Sets the value of the htailarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Htailarea }
     *     
     */
    public void setHtailarea(Htailarea value) {
        this.htailarea = value;
    }

    /**
     * Gets the value of the htailarm property.
     * 
     * @return
     *     possible object is
     *     {@link Htailarm }
     *     
     */
    public Htailarm getHtailarm() {
        return htailarm;
    }

    /**
     * Sets the value of the htailarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Htailarm }
     *     
     */
    public void setHtailarm(Htailarm value) {
        this.htailarm = value;
    }

    /**
     * Gets the value of the vtailarea property.
     * 
     * @return
     *     possible object is
     *     {@link Vtailarea }
     *     
     */
    public Vtailarea getVtailarea() {
        return vtailarea;
    }

    /**
     * Sets the value of the vtailarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vtailarea }
     *     
     */
    public void setVtailarea(Vtailarea value) {
        this.vtailarea = value;
    }

    /**
     * Gets the value of the vtailarm property.
     * 
     * @return
     *     possible object is
     *     {@link Vtailarm }
     *     
     */
    public Vtailarm getVtailarm() {
        return vtailarm;
    }

    /**
     * Sets the value of the vtailarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vtailarm }
     *     
     */
    public void setVtailarm(Vtailarm value) {
        this.vtailarm = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getLocation() {
        if (location == null) {
            location = new ArrayList<Location>();
        }
        return this.location;
    }

}
