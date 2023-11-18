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
 *         &lt;element ref="{}fileheader"/&gt;
 *         &lt;element ref="{}metrics"/&gt;
 *         &lt;element ref="{}mass_balance"/&gt;
 *         &lt;element ref="{}ground_reactions" minOccurs="0"/&gt;
 *         &lt;element ref="{}external_reactions" minOccurs="0"/&gt;
 *         &lt;element ref="{}buoyant_forces" minOccurs="0"/&gt;
 *         &lt;element ref="{}propulsion" minOccurs="0"/&gt;
 *         &lt;element ref="{}system" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}autopilot" minOccurs="0"/&gt;
 *         &lt;element ref="{}flight_control" minOccurs="0"/&gt;
 *         &lt;element ref="{}aerodynamics" minOccurs="0"/&gt;
 *         &lt;element ref="{}input" minOccurs="0"/&gt;
 *         &lt;element ref="{}output" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="release" default="PRODUCTION"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="PRODUCTION"/&gt;
 *             &lt;enumeration value="ALPHA"/&gt;
 *             &lt;enumeration value="BETA"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="version" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;pattern value="[0-9](.[0-9])*"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fileheader",
    "metrics",
    "massBalance",
    "groundReactions",
    "externalReactions",
    "buoyantForces",
    "propulsion",
    "system",
    "autopilot",
    "flightControl",
    "aerodynamics",
    "input",
    "output"
})
@XmlRootElement(name = "fdm_config")
public class FdmConfig {

    @XmlElement(required = true)
    protected Fileheader fileheader;
    @XmlElement(required = true)
    protected Metrics metrics;
    @XmlElement(name = "mass_balance", required = true)
    protected MassBalance massBalance;
    @XmlElement(name = "ground_reactions")
    protected GroundReactions groundReactions;
    @XmlElement(name = "external_reactions")
    protected ExternalReactions externalReactions;
    @XmlElement(name = "buoyant_forces")
    protected Object buoyantForces;
    protected Propulsion propulsion;
    protected List<System> system;
    protected Autopilot autopilot;
    @XmlElement(name = "flight_control")
    protected FlightControl flightControl;
    protected Aerodynamics aerodynamics;
    protected Input input;
    protected List<Output> output;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "release")
    protected String release;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the fileheader property.
     * 
     * @return
     *     possible object is
     *     {@link Fileheader }
     *     
     */
    public Fileheader getFileheader() {
        return fileheader;
    }

    /**
     * Sets the value of the fileheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fileheader }
     *     
     */
    public void setFileheader(Fileheader value) {
        this.fileheader = value;
    }

    /**
     * Gets the value of the metrics property.
     * 
     * @return
     *     possible object is
     *     {@link Metrics }
     *     
     */
    public Metrics getMetrics() {
        return metrics;
    }

    /**
     * Sets the value of the metrics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Metrics }
     *     
     */
    public void setMetrics(Metrics value) {
        this.metrics = value;
    }

    /**
     * Gets the value of the massBalance property.
     * 
     * @return
     *     possible object is
     *     {@link MassBalance }
     *     
     */
    public MassBalance getMassBalance() {
        return massBalance;
    }

    /**
     * Sets the value of the massBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassBalance }
     *     
     */
    public void setMassBalance(MassBalance value) {
        this.massBalance = value;
    }

    /**
     * Gets the value of the groundReactions property.
     * 
     * @return
     *     possible object is
     *     {@link GroundReactions }
     *     
     */
    public GroundReactions getGroundReactions() {
        return groundReactions;
    }

    /**
     * Sets the value of the groundReactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroundReactions }
     *     
     */
    public void setGroundReactions(GroundReactions value) {
        this.groundReactions = value;
    }

    /**
     * Gets the value of the externalReactions property.
     * 
     * @return
     *     possible object is
     *     {@link ExternalReactions }
     *     
     */
    public ExternalReactions getExternalReactions() {
        return externalReactions;
    }

    /**
     * Sets the value of the externalReactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalReactions }
     *     
     */
    public void setExternalReactions(ExternalReactions value) {
        this.externalReactions = value;
    }

    /**
     * Gets the value of the buoyantForces property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBuoyantForces() {
        return buoyantForces;
    }

    /**
     * Sets the value of the buoyantForces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBuoyantForces(Object value) {
        this.buoyantForces = value;
    }

    /**
     * Gets the value of the propulsion property.
     * 
     * @return
     *     possible object is
     *     {@link Propulsion }
     *     
     */
    public Propulsion getPropulsion() {
        return propulsion;
    }

    /**
     * Sets the value of the propulsion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Propulsion }
     *     
     */
    public void setPropulsion(Propulsion value) {
        this.propulsion = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the system property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link System }
     * 
     * 
     */
    public List<System> getSystem() {
        if (system == null) {
            system = new ArrayList<System>();
        }
        return this.system;
    }

    /**
     * Gets the value of the autopilot property.
     * 
     * @return
     *     possible object is
     *     {@link Autopilot }
     *     
     */
    public Autopilot getAutopilot() {
        return autopilot;
    }

    /**
     * Sets the value of the autopilot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Autopilot }
     *     
     */
    public void setAutopilot(Autopilot value) {
        this.autopilot = value;
    }

    /**
     * Gets the value of the flightControl property.
     * 
     * @return
     *     possible object is
     *     {@link FlightControl }
     *     
     */
    public FlightControl getFlightControl() {
        return flightControl;
    }

    /**
     * Sets the value of the flightControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightControl }
     *     
     */
    public void setFlightControl(FlightControl value) {
        this.flightControl = value;
    }

    /**
     * Gets the value of the aerodynamics property.
     * 
     * @return
     *     possible object is
     *     {@link Aerodynamics }
     *     
     */
    public Aerodynamics getAerodynamics() {
        return aerodynamics;
    }

    /**
     * Sets the value of the aerodynamics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aerodynamics }
     *     
     */
    public void setAerodynamics(Aerodynamics value) {
        this.aerodynamics = value;
    }

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link Input }
     *     
     */
    public Input getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link Input }
     *     
     */
    public void setInput(Input value) {
        this.input = value;
    }

    /**
     * Gets the value of the output property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the output property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Output }
     * 
     * 
     */
    public List<Output> getOutput() {
        if (output == null) {
            output = new ArrayList<Output>();
        }
        return this.output;
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

    /**
     * Gets the value of the release property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelease() {
        if (release == null) {
            return "PRODUCTION";
        } else {
            return release;
        }
    }

    /**
     * Sets the value of the release property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelease(String value) {
        this.release = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
