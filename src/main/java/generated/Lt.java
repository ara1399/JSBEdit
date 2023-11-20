//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.20 at 04:34:29 PM CST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
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
 *       &lt;choice maxOccurs="2" minOccurs="2"&gt;
 *         &lt;group ref="{}func_group"/&gt;
 *         &lt;element ref="{}value"/&gt;
 *         &lt;element ref="{}property"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tableOrProductOrDifference"
})
@XmlRootElement(name = "lt")
public class Lt {

    @XmlElementRefs({
        @XmlElementRef(name = "table", type = Table.class, required = false),
        @XmlElementRef(name = "product", type = Product.class, required = false),
        @XmlElementRef(name = "difference", type = Difference.class, required = false),
        @XmlElementRef(name = "sum", type = Sum.class, required = false),
        @XmlElementRef(name = "quotient", type = Quotient.class, required = false),
        @XmlElementRef(name = "pow", type = Pow.class, required = false),
        @XmlElementRef(name = "abs", type = Abs.class, required = false),
        @XmlElementRef(name = "sin", type = Sin.class, required = false),
        @XmlElementRef(name = "cos", type = Cos.class, required = false),
        @XmlElementRef(name = "tan", type = Tan.class, required = false),
        @XmlElementRef(name = "asin", type = Asin.class, required = false),
        @XmlElementRef(name = "acos", type = Acos.class, required = false),
        @XmlElementRef(name = "atan", type = Atan.class, required = false),
        @XmlElementRef(name = "atan2", type = Atan2 .class, required = false),
        @XmlElementRef(name = "min", type = Min.class, required = false),
        @XmlElementRef(name = "max", type = Max.class, required = false),
        @XmlElementRef(name = "avg", type = Avg.class, required = false),
        @XmlElementRef(name = "fraction", type = Fraction.class, required = false),
        @XmlElementRef(name = "integer", type = Integer.class, required = false),
        @XmlElementRef(name = "mod", type = Mod.class, required = false),
        @XmlElementRef(name = "random", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "urandom", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pi", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lt", type = Lt.class, required = false),
        @XmlElementRef(name = "le", type = Le.class, required = false),
        @XmlElementRef(name = "gt", type = Gt.class, required = false),
        @XmlElementRef(name = "ge", type = Ge.class, required = false),
        @XmlElementRef(name = "eq", type = Eq.class, required = false),
        @XmlElementRef(name = "nq", type = Nq.class, required = false),
        @XmlElementRef(name = "and", type = And.class, required = false),
        @XmlElementRef(name = "or", type = Or.class, required = false),
        @XmlElementRef(name = "not", type = Not.class, required = false),
        @XmlElementRef(name = "ifthen", type = Ifthen.class, required = false),
        @XmlElementRef(name = "switch", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "interpolate1d", type = Interpolate1D.class, required = false),
        @XmlElementRef(name = "value", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "property", type = JAXBElement.class, required = false)
    })
    protected List<Object> tableOrProductOrDifference;

    /**
     * Gets the value of the tableOrProductOrDifference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tableOrProductOrDifference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableOrProductOrDifference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Table }
     * {@link Product }
     * {@link Difference }
     * {@link Sum }
     * {@link Quotient }
     * {@link Pow }
     * {@link Abs }
     * {@link Sin }
     * {@link Cos }
     * {@link Tan }
     * {@link Asin }
     * {@link Acos }
     * {@link Atan }
     * {@link Atan2 }
     * {@link Min }
     * {@link Max }
     * {@link Avg }
     * {@link Fraction }
     * {@link Integer }
     * {@link Mod }
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link Lt }
     * {@link Le }
     * {@link Gt }
     * {@link Ge }
     * {@link Eq }
     * {@link Nq }
     * {@link And }
     * {@link Or }
     * {@link Not }
     * {@link Ifthen }
     * {@link JAXBElement }{@code <}{@link Ifthen.Switch }{@code >}
     * {@link Interpolate1D }
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<Object> getTableOrProductOrDifference() {
        if (tableOrProductOrDifference == null) {
            tableOrProductOrDifference = new ArrayList<Object>();
        }
        return this.tableOrProductOrDifference;
    }

}
