//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.20 at 01:11:48 PM CST 
//


package generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpringCoeffType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SpringCoeffType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LBS/FT"/&gt;
 *     &lt;enumeration value="N/M"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SpringCoeffType")
@XmlEnum
public enum SpringCoeffType {

    @XmlEnumValue("LBS/FT")
    LBS_FT("LBS/FT"),
    @XmlEnumValue("N/M")
    N_M("N/M");
    private final String value;

    SpringCoeffType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpringCoeffType fromValue(String v) {
        for (SpringCoeffType c: SpringCoeffType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
