//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.18 at 04:48:55 PM CST 
//


package generated;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}location"/&gt;
 *         &lt;element name="static_friction" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="dynamic_friction" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="spring_coeff"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;PositiveNumber"&gt;
 *                 &lt;attribute name="unit" type="{}SpringCoeffType" default="LBS/FT" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="damping_coeff"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;PositiveNumber"&gt;
 *                 &lt;attribute name="unit" type="{}DampingCoeffType" default="LBS/FT/SEC" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="damping_coeff_rebound" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;PositiveNumber"&gt;
 *                 &lt;attribute name="unit" type="{}DampingCoeffType" default="LBS/FT/SEC" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="rolling_friction" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="max_steer" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;&gt;PositiveNumber"&gt;
 *                 &lt;attribute name="unit" type="{}AngleType" default="DEG" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}brake_group" minOccurs="0"/&gt;
 *         &lt;element ref="{}retractable" minOccurs="0"/&gt;
 *         &lt;element name="relaxation_velocity" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="rolling"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;simpleContent&gt;
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;float"&gt;
 *                             &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="FT/SEC" /&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/simpleContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="side"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;simpleContent&gt;
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;float"&gt;
 *                             &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="FT/SEC" /&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/simpleContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{}force_lag_filter" minOccurs="0"/&gt;
 *         &lt;element name="wheel_slip_filter" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="type" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="BOGEY"/&gt;
 *             &lt;enumeration value="STRUCTURE"/&gt;
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

})
@XmlRootElement(name = "contact")
public class Contact {

    @XmlElement(required = true)
    protected Location location;
    @XmlElement(name = "static_friction")
    protected double staticFriction;
    @XmlElement(name = "dynamic_friction")
    protected double dynamicFriction;
    @XmlElement(name = "spring_coeff", required = true)
    protected Contact.SpringCoeff springCoeff;
    @XmlElement(name = "damping_coeff", required = true)
    protected Contact.DampingCoeff dampingCoeff;
    @XmlElement(name = "damping_coeff_rebound")
    protected Contact.DampingCoeffRebound dampingCoeffRebound;
    @XmlElement(name = "rolling_friction")
    protected Double rollingFriction;
    @XmlElement(name = "max_steer")
    protected Contact.MaxSteer maxSteer;
    @XmlElement(name = "brake_group")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String brakeGroup;
    protected BigInteger retractable;
    @XmlElement(name = "relaxation_velocity")
    protected Contact.RelaxationVelocity relaxationVelocity;
    @XmlElement(name = "force_lag_filter")
    protected ForceLagFilter forceLagFilter;
    @XmlElement(name = "wheel_slip_filter")
    protected Float wheelSlipFilter;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "type", required = true)
    protected String type;

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
     * Gets the value of the staticFriction property.
     * 
     */
    public double getStaticFriction() {
        return staticFriction;
    }

    /**
     * Sets the value of the staticFriction property.
     * 
     */
    public void setStaticFriction(double value) {
        this.staticFriction = value;
    }

    /**
     * Gets the value of the dynamicFriction property.
     * 
     */
    public double getDynamicFriction() {
        return dynamicFriction;
    }

    /**
     * Sets the value of the dynamicFriction property.
     * 
     */
    public void setDynamicFriction(double value) {
        this.dynamicFriction = value;
    }

    /**
     * Gets the value of the springCoeff property.
     * 
     * @return
     *     possible object is
     *     {@link Contact.SpringCoeff }
     *     
     */
    public Contact.SpringCoeff getSpringCoeff() {
        return springCoeff;
    }

    /**
     * Sets the value of the springCoeff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact.SpringCoeff }
     *     
     */
    public void setSpringCoeff(Contact.SpringCoeff value) {
        this.springCoeff = value;
    }

    /**
     * Gets the value of the dampingCoeff property.
     * 
     * @return
     *     possible object is
     *     {@link Contact.DampingCoeff }
     *     
     */
    public Contact.DampingCoeff getDampingCoeff() {
        return dampingCoeff;
    }

    /**
     * Sets the value of the dampingCoeff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact.DampingCoeff }
     *     
     */
    public void setDampingCoeff(Contact.DampingCoeff value) {
        this.dampingCoeff = value;
    }

    /**
     * Gets the value of the dampingCoeffRebound property.
     * 
     * @return
     *     possible object is
     *     {@link Contact.DampingCoeffRebound }
     *     
     */
    public Contact.DampingCoeffRebound getDampingCoeffRebound() {
        return dampingCoeffRebound;
    }

    /**
     * Sets the value of the dampingCoeffRebound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact.DampingCoeffRebound }
     *     
     */
    public void setDampingCoeffRebound(Contact.DampingCoeffRebound value) {
        this.dampingCoeffRebound = value;
    }

    /**
     * Gets the value of the rollingFriction property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRollingFriction() {
        return rollingFriction;
    }

    /**
     * Sets the value of the rollingFriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRollingFriction(Double value) {
        this.rollingFriction = value;
    }

    /**
     * Gets the value of the maxSteer property.
     * 
     * @return
     *     possible object is
     *     {@link Contact.MaxSteer }
     *     
     */
    public Contact.MaxSteer getMaxSteer() {
        return maxSteer;
    }

    /**
     * Sets the value of the maxSteer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact.MaxSteer }
     *     
     */
    public void setMaxSteer(Contact.MaxSteer value) {
        this.maxSteer = value;
    }

    /**
     * Gets the value of the brakeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrakeGroup() {
        return brakeGroup;
    }

    /**
     * Sets the value of the brakeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrakeGroup(String value) {
        this.brakeGroup = value;
    }

    /**
     * Gets the value of the retractable property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRetractable() {
        return retractable;
    }

    /**
     * Sets the value of the retractable property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRetractable(BigInteger value) {
        this.retractable = value;
    }

    /**
     * Gets the value of the relaxationVelocity property.
     * 
     * @return
     *     possible object is
     *     {@link Contact.RelaxationVelocity }
     *     
     */
    public Contact.RelaxationVelocity getRelaxationVelocity() {
        return relaxationVelocity;
    }

    /**
     * Sets the value of the relaxationVelocity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact.RelaxationVelocity }
     *     
     */
    public void setRelaxationVelocity(Contact.RelaxationVelocity value) {
        this.relaxationVelocity = value;
    }

    /**
     * Gets the value of the forceLagFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ForceLagFilter }
     *     
     */
    public ForceLagFilter getForceLagFilter() {
        return forceLagFilter;
    }

    /**
     * Sets the value of the forceLagFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceLagFilter }
     *     
     */
    public void setForceLagFilter(ForceLagFilter value) {
        this.forceLagFilter = value;
    }

    /**
     * Gets the value of the wheelSlipFilter property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWheelSlipFilter() {
        return wheelSlipFilter;
    }

    /**
     * Sets the value of the wheelSlipFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWheelSlipFilter(Float value) {
        this.wheelSlipFilter = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;&gt;PositiveNumber"&gt;
     *       &lt;attribute name="unit" type="{}DampingCoeffType" default="LBS/FT/SEC" /&gt;
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
    public static class DampingCoeff {

        @XmlValue
        protected double value;
        @XmlAttribute(name = "unit")
        protected DampingCoeffType unit;

        /**
         * Gets the value of the value property.
         * 
         */
        public double getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(double value) {
            this.value = value;
        }

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link DampingCoeffType }
         *     
         */
        public DampingCoeffType getUnit() {
            if (unit == null) {
                return DampingCoeffType.LBS_FT_SEC;
            } else {
                return unit;
            }
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link DampingCoeffType }
         *     
         */
        public void setUnit(DampingCoeffType value) {
            this.unit = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;&gt;PositiveNumber"&gt;
     *       &lt;attribute name="unit" type="{}DampingCoeffType" default="LBS/FT/SEC" /&gt;
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
    public static class DampingCoeffRebound {

        @XmlValue
        protected double value;
        @XmlAttribute(name = "unit")
        protected DampingCoeffType unit;

        /**
         * Gets the value of the value property.
         * 
         */
        public double getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(double value) {
            this.value = value;
        }

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link DampingCoeffType }
         *     
         */
        public DampingCoeffType getUnit() {
            if (unit == null) {
                return DampingCoeffType.LBS_FT_SEC;
            } else {
                return unit;
            }
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link DampingCoeffType }
         *     
         */
        public void setUnit(DampingCoeffType value) {
            this.unit = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;&gt;PositiveNumber"&gt;
     *       &lt;attribute name="unit" type="{}AngleType" default="DEG" /&gt;
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
    public static class MaxSteer {

        @XmlValue
        protected double value;
        @XmlAttribute(name = "unit")
        protected AngleType unit;

        /**
         * Gets the value of the value property.
         * 
         */
        public double getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(double value) {
            this.value = value;
        }

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link AngleType }
         *     
         */
        public AngleType getUnit() {
            if (unit == null) {
                return AngleType.DEG;
            } else {
                return unit;
            }
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link AngleType }
         *     
         */
        public void setUnit(AngleType value) {
            this.unit = value;
        }

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
     *       &lt;sequence&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="rolling"&gt;
     *             &lt;complexType&gt;
     *               &lt;simpleContent&gt;
     *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;float"&gt;
     *                   &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="FT/SEC" /&gt;
     *                 &lt;/extension&gt;
     *               &lt;/simpleContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="side"&gt;
     *             &lt;complexType&gt;
     *               &lt;simpleContent&gt;
     *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;float"&gt;
     *                   &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="FT/SEC" /&gt;
     *                 &lt;/extension&gt;
     *               &lt;/simpleContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
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
        "rolling",
        "side"
    })
    public static class RelaxationVelocity {

        @XmlElement(required = true)
        protected Contact.RelaxationVelocity.Rolling rolling;
        @XmlElement(required = true)
        protected Contact.RelaxationVelocity.Side side;

        /**
         * Gets the value of the rolling property.
         * 
         * @return
         *     possible object is
         *     {@link Contact.RelaxationVelocity.Rolling }
         *     
         */
        public Contact.RelaxationVelocity.Rolling getRolling() {
            return rolling;
        }

        /**
         * Sets the value of the rolling property.
         * 
         * @param value
         *     allowed object is
         *     {@link Contact.RelaxationVelocity.Rolling }
         *     
         */
        public void setRolling(Contact.RelaxationVelocity.Rolling value) {
            this.rolling = value;
        }

        /**
         * Gets the value of the side property.
         * 
         * @return
         *     possible object is
         *     {@link Contact.RelaxationVelocity.Side }
         *     
         */
        public Contact.RelaxationVelocity.Side getSide() {
            return side;
        }

        /**
         * Sets the value of the side property.
         * 
         * @param value
         *     allowed object is
         *     {@link Contact.RelaxationVelocity.Side }
         *     
         */
        public void setSide(Contact.RelaxationVelocity.Side value) {
            this.side = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;float"&gt;
         *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="FT/SEC" /&gt;
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
        public static class Rolling {

            @XmlValue
            protected float value;
            @XmlAttribute(name = "unit")
            @XmlSchemaType(name = "anySimpleType")
            protected String unit;

            /**
             * Gets the value of the value property.
             * 
             */
            public float getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(float value) {
                this.value = value;
            }

            /**
             * Gets the value of the unit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnit() {
                if (unit == null) {
                    return "FT/SEC";
                } else {
                    return unit;
                }
            }

            /**
             * Sets the value of the unit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnit(String value) {
                this.unit = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;float"&gt;
         *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="FT/SEC" /&gt;
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
        public static class Side {

            @XmlValue
            protected float value;
            @XmlAttribute(name = "unit")
            @XmlSchemaType(name = "anySimpleType")
            protected String unit;

            /**
             * Gets the value of the value property.
             * 
             */
            public float getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(float value) {
                this.value = value;
            }

            /**
             * Gets the value of the unit property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUnit() {
                if (unit == null) {
                    return "FT/SEC";
                } else {
                    return unit;
                }
            }

            /**
             * Sets the value of the unit property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUnit(String value) {
                this.unit = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;&gt;PositiveNumber"&gt;
     *       &lt;attribute name="unit" type="{}SpringCoeffType" default="LBS/FT" /&gt;
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
    public static class SpringCoeff {

        @XmlValue
        protected double value;
        @XmlAttribute(name = "unit")
        protected SpringCoeffType unit;

        /**
         * Gets the value of the value property.
         * 
         */
        public double getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(double value) {
            this.value = value;
        }

        /**
         * Gets the value of the unit property.
         * 
         * @return
         *     possible object is
         *     {@link SpringCoeffType }
         *     
         */
        public SpringCoeffType getUnit() {
            if (unit == null) {
                return SpringCoeffType.LBS_FT;
            } else {
                return unit;
            }
        }

        /**
         * Sets the value of the unit property.
         * 
         * @param value
         *     allowed object is
         *     {@link SpringCoeffType }
         *     
         */
        public void setUnit(SpringCoeffType value) {
            this.unit = value;
        }

    }

}
