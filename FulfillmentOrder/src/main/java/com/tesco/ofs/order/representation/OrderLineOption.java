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
 *         &lt;element name="CustomAttributes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="IsPriceLocked" type="{http://www.sterlingcommerce.com/documentation/types}Flag" />
 *       &lt;attribute name="OptionDescription" type="{http://www.sterlingcommerce.com/documentation/types}FreeText-200" />
 *       &lt;attribute name="OptionItemID" use="required" type="{http://www.sterlingcommerce.com/documentation/types}ItemID" />
 *       &lt;attribute name="OptionUOM" type="{http://www.sterlingcommerce.com/documentation/types}UOM" />
 *       &lt;attribute name="PricingUOM" type="{http://www.sterlingcommerce.com/documentation/types}UOM" />
 *       &lt;attribute name="UnitPrice" type="{http://www.sterlingcommerce.com/documentation/types}UnitPrice" />
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
@XmlRootElement(name = "OrderLineOption")
public class OrderLineOption {

    @XmlElement(name = "CustomAttributes")
    protected OrderLineOption.CustomAttributes customAttributes;
    @XmlAttribute(name = "IsPriceLocked")
    protected String isPriceLocked;
    @XmlAttribute(name = "OptionDescription")
    protected String optionDescription;
    @XmlAttribute(name = "OptionItemID", required = true)
    protected String optionItemID;
    @XmlAttribute(name = "OptionUOM")
    protected String optionUOM;
    @XmlAttribute(name = "PricingUOM")
    protected String pricingUOM;
    @XmlAttribute(name = "UnitPrice")
    protected BigDecimal unitPrice;

    /**
     * Gets the value of the customAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link OrderLineOption.CustomAttributes }
     *     
     */
    public OrderLineOption.CustomAttributes getCustomAttributes() {
        return customAttributes;
    }

    /**
     * Sets the value of the customAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderLineOption.CustomAttributes }
     *     
     */
    public void setCustomAttributes(OrderLineOption.CustomAttributes value) {
        this.customAttributes = value;
    }

    /**
     * Gets the value of the isPriceLocked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPriceLocked() {
        return isPriceLocked;
    }

    /**
     * Sets the value of the isPriceLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPriceLocked(String value) {
        this.isPriceLocked = value;
    }

    /**
     * Gets the value of the optionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionDescription() {
        return optionDescription;
    }

    /**
     * Sets the value of the optionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionDescription(String value) {
        this.optionDescription = value;
    }

    /**
     * Gets the value of the optionItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionItemID() {
        return optionItemID;
    }

    /**
     * Sets the value of the optionItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionItemID(String value) {
        this.optionItemID = value;
    }

    /**
     * Gets the value of the optionUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionUOM() {
        return optionUOM;
    }

    /**
     * Sets the value of the optionUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionUOM(String value) {
        this.optionUOM = value;
    }

    /**
     * Gets the value of the pricingUOM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingUOM() {
        return pricingUOM;
    }

    /**
     * Sets the value of the pricingUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingUOM(String value) {
        this.pricingUOM = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitPrice(BigDecimal value) {
        this.unitPrice = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CustomAttributes {


    }

}
