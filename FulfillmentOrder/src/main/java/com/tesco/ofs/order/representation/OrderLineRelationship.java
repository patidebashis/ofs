//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.25 at 03:34:08 AM GMT 
//


package com.tesco.ofs.order.representation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;all>
 *         &lt;element ref="{http://www.sterlingcommerce.com/documentation/YFS/createOrder/input}ParentLine" minOccurs="0"/>
 *         &lt;element ref="{http://www.sterlingcommerce.com/documentation/YFS/createOrder/input}ChildLine" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="RelationshipType" use="required" type="{http://www.sterlingcommerce.com/documentation/types}Text-40" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "OrderLineRelationship")
public class OrderLineRelationship {

    @XmlElement(name = "ParentLine")
    protected ParentLine parentLine;
    @XmlElement(name = "ChildLine")
    protected ChildLine childLine;
    @XmlAttribute(name = "RelationshipType", required = true)
    protected String relationshipType;

    /**
     * Gets the value of the parentLine property.
     * 
     * @return
     *     possible object is
     *     {@link ParentLine }
     *     
     */
    public ParentLine getParentLine() {
        return parentLine;
    }

    /**
     * Sets the value of the parentLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentLine }
     *     
     */
    public void setParentLine(ParentLine value) {
        this.parentLine = value;
    }

    /**
     * Gets the value of the childLine property.
     * 
     * @return
     *     possible object is
     *     {@link ChildLine }
     *     
     */
    public ChildLine getChildLine() {
        return childLine;
    }

    /**
     * Sets the value of the childLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildLine }
     *     
     */
    public void setChildLine(ChildLine value) {
        this.childLine = value;
    }

    /**
     * Gets the value of the relationshipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipType(String value) {
        this.relationshipType = value;
    }

}