//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.15 at 08:37:59 PM CST 
//


package generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="logic" default="AND"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="OR"/&gt;
 *             &lt;enumeration value="AND"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="xvalue" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "test")
public class Test {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "logic")
    protected String logic;
    @XmlAttribute(name = "xvalue", required = true)
    protected String xvalue;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the logic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogic() {
        if (logic == null) {
            return "AND";
        } else {
            return logic;
        }
    }

    /**
     * Sets the value of the logic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogic(String value) {
        this.logic = value;
    }

    /**
     * Gets the value of the xvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXvalue() {
        return xvalue;
    }

    /**
     * Sets the value of the xvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXvalue(String value) {
        this.xvalue = value;
    }

}
