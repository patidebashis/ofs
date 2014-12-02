//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.25 at 03:34:08 AM GMT 
//


package com.tesco.ofs.order.representation;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DependentOnPrimeLineNo" type="{http://www.sterlingcommerce.com/documentation/types}LineNo" />
 *       &lt;attribute name="DependentOnSubLineNo" type="{http://www.sterlingcommerce.com/documentation/types}LineNo" />
 *       &lt;attribute name="DependentOnTransactionalLineId" type="{http://www.sterlingcommerce.com/documentation/types}Text-40" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Dependency")
public class Dependency {

    @XmlAttribute(name = "DependentOnPrimeLineNo")
    protected BigInteger dependentOnPrimeLineNo;
    @XmlAttribute(name = "DependentOnSubLineNo")
    protected BigInteger dependentOnSubLineNo;
    @XmlAttribute(name = "DependentOnTransactionalLineId")
    protected String dependentOnTransactionalLineId;

    /**
     * Gets the value of the dependentOnPrimeLineNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDependentOnPrimeLineNo() {
        return dependentOnPrimeLineNo;
    }

    /**
     * Sets the value of the dependentOnPrimeLineNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDependentOnPrimeLineNo(BigInteger value) {
        this.dependentOnPrimeLineNo = value;
    }

    /**
     * Gets the value of the dependentOnSubLineNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDependentOnSubLineNo() {
        return dependentOnSubLineNo;
    }

    /**
     * Sets the value of the dependentOnSubLineNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDependentOnSubLineNo(BigInteger value) {
        this.dependentOnSubLineNo = value;
    }

    /**
     * Gets the value of the dependentOnTransactionalLineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDependentOnTransactionalLineId() {
        return dependentOnTransactionalLineId;
    }

    /**
     * Sets the value of the dependentOnTransactionalLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDependentOnTransactionalLineId(String value) {
        this.dependentOnTransactionalLineId = value;
    }

}