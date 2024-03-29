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
 *       &lt;attribute name="OrderLineKey" type="{http://www.sterlingcommerce.com/documentation/types}Key" />
 *       &lt;attribute name="PrimeLineNo" type="{http://www.sterlingcommerce.com/documentation/types}LineNo" />
 *       &lt;attribute name="SubLineNo" type="{http://www.sterlingcommerce.com/documentation/types}LineNo" />
 *       &lt;attribute name="TransactionalLineId" type="{http://www.sterlingcommerce.com/documentation/types}Text-40" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ParentLine")
public class ParentLine {

    @XmlAttribute(name = "OrderLineKey")
    protected String orderLineKey;
    @XmlAttribute(name = "PrimeLineNo")
    protected BigInteger primeLineNo;
    @XmlAttribute(name = "SubLineNo")
    protected BigInteger subLineNo;
    @XmlAttribute(name = "TransactionalLineId")
    protected String transactionalLineId;

    /**
     * Gets the value of the orderLineKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLineKey() {
        return orderLineKey;
    }

    /**
     * Sets the value of the orderLineKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLineKey(String value) {
        this.orderLineKey = value;
    }

    /**
     * Gets the value of the primeLineNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrimeLineNo() {
        return primeLineNo;
    }

    /**
     * Sets the value of the primeLineNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrimeLineNo(BigInteger value) {
        this.primeLineNo = value;
    }

    /**
     * Gets the value of the subLineNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubLineNo() {
        return subLineNo;
    }

    /**
     * Sets the value of the subLineNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubLineNo(BigInteger value) {
        this.subLineNo = value;
    }

    /**
     * Gets the value of the transactionalLineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionalLineId() {
        return transactionalLineId;
    }

    /**
     * Sets the value of the transactionalLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionalLineId(String value) {
        this.transactionalLineId = value;
    }

}
