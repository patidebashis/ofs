//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.25 at 03:34:08 AM GMT 
//


package com.tesco.ofs.order.representation;

import java.math.BigDecimal;
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
 *       &lt;attribute name="ChangeInQuantity" type="{http://www.sterlingcommerce.com/documentation/types}Quantity" />
 *       &lt;attribute name="TransactionalUOM" type="{http://www.sterlingcommerce.com/documentation/types}UOM" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ScheduleTranQuantity")
public class ScheduleTranQuantity {

    @XmlAttribute(name = "ChangeInQuantity")
    protected BigDecimal changeInQuantity;
    @XmlAttribute(name = "TransactionalUOM")
    protected String transactionalUOM;

    /**
     * Gets the value of the changeInQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChangeInQuantity() {
        return changeInQuantity;
    }

    /**
     * Sets the value of the changeInQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChangeInQuantity(BigDecimal value) {
        this.changeInQuantity = value;
    }

    /**
     * Gets the value of the transactionalUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionalUOM() {
        return transactionalUOM;
    }

    /**
     * Sets the value of the transactionalUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionalUOM(String value) {
        this.transactionalUOM = value;
    }

}
