//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.20 at 10:33:46 AM CST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="organization" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="license" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="licenseName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="licenseURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sensitivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filecreationdate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="copyright" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="limitation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element ref="{}reference"/&gt;
 *         &lt;/choice&gt;
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
    "authorOrEmailOrOrganization",
    "license",
    "sensitivity",
    "filecreationdate",
    "version",
    "copyright",
    "description",
    "noteOrLimitationOrReference"
})
@XmlRootElement(name = "fileheader")
public class Fileheader {

    @XmlElementRefs({
        @XmlElementRef(name = "author", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "email", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "organization", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> authorOrEmailOrOrganization;
    protected Fileheader.License license;
    protected String sensitivity;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar filecreationdate;
    protected String version;
    protected String copyright;
    protected String description;
    @XmlElementRefs({
        @XmlElementRef(name = "note", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "limitation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "reference", type = Reference.class, required = false)
    })
    protected List<Object> noteOrLimitationOrReference;

    /**
     * Gets the value of the authorOrEmailOrOrganization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the authorOrEmailOrOrganization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorOrEmailOrOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getAuthorOrEmailOrOrganization() {
        if (authorOrEmailOrOrganization == null) {
            authorOrEmailOrOrganization = new ArrayList<JAXBElement<String>>();
        }
        return this.authorOrEmailOrOrganization;
    }

    /**
     * Gets the value of the license property.
     * 
     * @return
     *     possible object is
     *     {@link Fileheader.License }
     *     
     */
    public Fileheader.License getLicense() {
        return license;
    }

    /**
     * Sets the value of the license property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fileheader.License }
     *     
     */
    public void setLicense(Fileheader.License value) {
        this.license = value;
    }

    /**
     * Gets the value of the sensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensitivity() {
        return sensitivity;
    }

    /**
     * Sets the value of the sensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensitivity(String value) {
        this.sensitivity = value;
    }

    /**
     * Gets the value of the filecreationdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFilecreationdate() {
        return filecreationdate;
    }

    /**
     * Sets the value of the filecreationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFilecreationdate(XMLGregorianCalendar value) {
        this.filecreationdate = value;
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

    /**
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyright(String value) {
        this.copyright = value;
    }

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
     * Gets the value of the noteOrLimitationOrReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the noteOrLimitationOrReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoteOrLimitationOrReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Reference }
     * 
     * 
     */
    public List<Object> getNoteOrLimitationOrReference() {
        if (noteOrLimitationOrReference == null) {
            noteOrLimitationOrReference = new ArrayList<Object>();
        }
        return this.noteOrLimitationOrReference;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="licenseName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="licenseURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class License {

        @XmlAttribute(name = "licenseName")
        protected String licenseName;
        @XmlAttribute(name = "licenseURL")
        @XmlSchemaType(name = "anyURI")
        protected String licenseURL;

        /**
         * Gets the value of the licenseName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenseName() {
            return licenseName;
        }

        /**
         * Sets the value of the licenseName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenseName(String value) {
            this.licenseName = value;
        }

        /**
         * Gets the value of the licenseURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenseURL() {
            return licenseURL;
        }

        /**
         * Sets the value of the licenseURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenseURL(String value) {
            this.licenseURL = value;
        }

    }

}
