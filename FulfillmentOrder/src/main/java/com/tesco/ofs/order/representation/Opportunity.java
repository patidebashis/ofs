//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.25 at 03:34:08 AM GMT 
//


package com.tesco.ofs.order.representation;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


import com.fasterxml.jackson.annotation.JsonIgnore;



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
 *         &lt;element ref="{http://www.sterlingcommerce.com/documentation/YFS/createOrder/input}BuyerContactAddress" minOccurs="0"/>
 *         &lt;element name="Notes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Note" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="AuditTransactionId" type="{http://www.sterlingcommerce.com/documentation/types}TransactionID" />
 *                           &lt;attribute name="ContactReference" type="{http://www.sterlingcommerce.com/documentation/types}NotesContactReference" />
 *                           &lt;attribute name="ContactTime" type="{http://www.sterlingcommerce.com/documentation/types}TimeStamp" />
 *                           &lt;attribute name="ContactType" type="{http://www.sterlingcommerce.com/documentation/types}CommonCode" />
 *                           &lt;attribute name="ContactUser" type="{http://www.sterlingcommerce.com/documentation/types}UserId" />
 *                           &lt;attribute name="CustomerSatIndicator" type="{http://www.sterlingcommerce.com/documentation/types}CustomerSatisfactionLevel" />
 *                           &lt;attribute name="NoteText" use="required" type="{http://www.sterlingcommerce.com/documentation/types}NoteText" />
 *                           &lt;attribute name="Priority" type="{http://www.sterlingcommerce.com/documentation/types}PriorityWithDecimal" />
 *                           &lt;attribute name="ReasonCode" type="{http://www.sterlingcommerce.com/documentation/types}ReasonCode" />
 *                           &lt;attribute name="SequenceNo" type="{http://www.sterlingcommerce.com/documentation/types}Count" />
 *                           &lt;attribute name="Tranid" type="{http://www.sterlingcommerce.com/documentation/types}TranId" />
 *                           &lt;attribute name="VisibleToAll" type="{http://www.sterlingcommerce.com/documentation/types}Flag" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CustomAttributes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *       &lt;attribute name="BillToID" type="{http://www.sterlingcommerce.com/documentation/types}ID-40" />
 *       &lt;attribute name="BuyerContactAddressKey" type="{http://www.sterlingcommerce.com/documentation/types}Text-24" />
 *       &lt;attribute name="BuyerOrganizationCode" type="{http://www.sterlingcommerce.com/documentation/types}OrgCode" />
 *       &lt;attribute name="CoOwnerUserID" type="{http://www.sterlingcommerce.com/documentation/types}ID-40" />
 *       &lt;attribute name="CurrencyValue">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.sterlingcommerce.com/documentation/types}Amount">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value=""/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="CustomerContactID" type="{http://www.sterlingcommerce.com/documentation/types}ID-40" />
 *       &lt;attribute name="Description" type="{http://www.sterlingcommerce.com/documentation/types}Text-200" />
 *       &lt;attribute name="DocumentType" type="{http://www.sterlingcommerce.com/documentation/types}Text-40" />
 *       &lt;attribute name="EnterpriseCode" use="required" type="{http://www.sterlingcommerce.com/documentation/types}OrgCode" />
 *       &lt;attribute name="ExpectedCloseDate">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.sterlingcommerce.com/documentation/types}TimeStamp">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value=""/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="LeadOrigin" type="{http://www.sterlingcommerce.com/documentation/types}Text-40" />
 *       &lt;attribute name="LostReasonCode" type="{http://www.sterlingcommerce.com/documentation/types}Text-40" />
 *       &lt;attribute name="OpportunityDate">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.sterlingcommerce.com/documentation/types}TimeStamp">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value=""/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="OpportunityID" type="{http://www.sterlingcommerce.com/documentation/types}ID-40" />
 *       &lt;attribute name="OpportunityName" type="{http://www.sterlingcommerce.com/documentation/types}Text-100" />
 *       &lt;attribute name="OwnerUserID" type="{http://www.sterlingcommerce.com/documentation/types}ID-40" />
 *       &lt;attribute name="PipelineKey" type="{http://www.sterlingcommerce.com/documentation/types}Key" />
 *       &lt;attribute name="ProbableSuccessRate">
 *         &lt;simpleType>
 *           &lt;union>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.sterlingcommerce.com/documentation/types}Percentage">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;enumeration value=""/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/union>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TeamCode" type="{http://www.sterlingcommerce.com/documentation/types}CodeLongDescription" />
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
@XmlRootElement(name = "Opportunity")
public class Opportunity {

    @XmlElement(name = "BuyerContactAddress")
    protected BuyerContactAddress buyerContactAddress;
    @XmlElement(name = "Notes")
    protected Opportunity.Notes notes;
    @XmlElement(name = "CustomAttributes")
    protected Opportunity.CustomAttributes customAttributes;
    @XmlAttribute(name = "BillToID")
    protected String billToID;
    @XmlAttribute(name = "BuyerContactAddressKey")
    protected String buyerContactAddressKey;
    @XmlAttribute(name = "BuyerOrganizationCode")
    protected String buyerOrganizationCode;
    @XmlAttribute(name = "CoOwnerUserID")
    protected String coOwnerUserID;
    @XmlAttribute(name = "CurrencyValue")
    protected String currencyValue;
    @XmlAttribute(name = "CustomerContactID")
    protected String customerContactID;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "DocumentType")
    protected String documentType;
    @XmlAttribute(name = "EnterpriseCode", required = true)
    protected String enterpriseCode;
    @XmlAttribute(name = "ExpectedCloseDate")
    protected String expectedCloseDate;
    @XmlAttribute(name = "LeadOrigin")
    protected String leadOrigin;
    @XmlAttribute(name = "LostReasonCode")
    protected String lostReasonCode;
    @XmlAttribute(name = "OpportunityDate")
    protected String opportunityDate;
    @XmlAttribute(name = "OpportunityID")
    protected String opportunityID;
    @XmlAttribute(name = "OpportunityName")
    protected String opportunityName;
    @XmlAttribute(name = "OwnerUserID")
    protected String ownerUserID;
    @XmlAttribute(name = "PipelineKey")
    protected String pipelineKey;
    @XmlAttribute(name = "ProbableSuccessRate")
    protected String probableSuccessRate;
    @XmlAttribute(name = "TeamCode")
    protected String teamCode;

    /**
     * Gets the value of the buyerContactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerContactAddress }
     *     
     */
    public BuyerContactAddress getBuyerContactAddress() {
        return buyerContactAddress;
    }

    /**
     * Sets the value of the buyerContactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerContactAddress }
     *     
     */
    public void setBuyerContactAddress(BuyerContactAddress value) {
        this.buyerContactAddress = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Opportunity.Notes }
     *     
     */
    public Opportunity.Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Opportunity.Notes }
     *     
     */
    public void setNotes(Opportunity.Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the customAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link Opportunity.CustomAttributes }
     *     
     */
    public Opportunity.CustomAttributes getCustomAttributes() {
        return customAttributes;
    }

    /**
     * Sets the value of the customAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Opportunity.CustomAttributes }
     *     
     */
    public void setCustomAttributes(Opportunity.CustomAttributes value) {
        this.customAttributes = value;
    }

    /**
     * Gets the value of the billToID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillToID() {
        return billToID;
    }

    /**
     * Sets the value of the billToID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillToID(String value) {
        this.billToID = value;
    }

    /**
     * Gets the value of the buyerContactAddressKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerContactAddressKey() {
        return buyerContactAddressKey;
    }

    /**
     * Sets the value of the buyerContactAddressKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerContactAddressKey(String value) {
        this.buyerContactAddressKey = value;
    }

    /**
     * Gets the value of the buyerOrganizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerOrganizationCode() {
        return buyerOrganizationCode;
    }

    /**
     * Sets the value of the buyerOrganizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerOrganizationCode(String value) {
        this.buyerOrganizationCode = value;
    }

    /**
     * Gets the value of the coOwnerUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoOwnerUserID() {
        return coOwnerUserID;
    }

    /**
     * Sets the value of the coOwnerUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoOwnerUserID(String value) {
        this.coOwnerUserID = value;
    }

    /**
     * Gets the value of the currencyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyValue() {
        return currencyValue;
    }

    /**
     * Sets the value of the currencyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyValue(String value) {
        this.currencyValue = value;
    }

    /**
     * Gets the value of the customerContactID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerContactID() {
        return customerContactID;
    }

    /**
     * Sets the value of the customerContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerContactID(String value) {
        this.customerContactID = value;
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
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the enterpriseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    /**
     * Sets the value of the enterpriseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseCode(String value) {
        this.enterpriseCode = value;
    }

    /**
     * Gets the value of the expectedCloseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedCloseDate() {
        return expectedCloseDate;
    }

    /**
     * Sets the value of the expectedCloseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedCloseDate(String value) {
        this.expectedCloseDate = value;
    }

    /**
     * Gets the value of the leadOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeadOrigin() {
        return leadOrigin;
    }

    /**
     * Sets the value of the leadOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeadOrigin(String value) {
        this.leadOrigin = value;
    }

    /**
     * Gets the value of the lostReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLostReasonCode() {
        return lostReasonCode;
    }

    /**
     * Sets the value of the lostReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLostReasonCode(String value) {
        this.lostReasonCode = value;
    }

    /**
     * Gets the value of the opportunityDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityDate() {
        return opportunityDate;
    }

    /**
     * Sets the value of the opportunityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityDate(String value) {
        this.opportunityDate = value;
    }

    /**
     * Gets the value of the opportunityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityID() {
        return opportunityID;
    }

    /**
     * Sets the value of the opportunityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityID(String value) {
        this.opportunityID = value;
    }

    /**
     * Gets the value of the opportunityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityName() {
        return opportunityName;
    }

    /**
     * Sets the value of the opportunityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityName(String value) {
        this.opportunityName = value;
    }

    /**
     * Gets the value of the ownerUserID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerUserID() {
        return ownerUserID;
    }

    /**
     * Sets the value of the ownerUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerUserID(String value) {
        this.ownerUserID = value;
    }

    /**
     * Gets the value of the pipelineKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPipelineKey() {
        return pipelineKey;
    }

    /**
     * Sets the value of the pipelineKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPipelineKey(String value) {
        this.pipelineKey = value;
    }

    /**
     * Gets the value of the probableSuccessRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProbableSuccessRate() {
        return probableSuccessRate;
    }

    /**
     * Sets the value of the probableSuccessRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProbableSuccessRate(String value) {
        this.probableSuccessRate = value;
    }

    /**
     * Gets the value of the teamCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeamCode() {
        return teamCode;
    }

    /**
     * Sets the value of the teamCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeamCode(String value) {
        this.teamCode = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Note" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="AuditTransactionId" type="{http://www.sterlingcommerce.com/documentation/types}TransactionID" />
     *                 &lt;attribute name="ContactReference" type="{http://www.sterlingcommerce.com/documentation/types}NotesContactReference" />
     *                 &lt;attribute name="ContactTime" type="{http://www.sterlingcommerce.com/documentation/types}TimeStamp" />
     *                 &lt;attribute name="ContactType" type="{http://www.sterlingcommerce.com/documentation/types}CommonCode" />
     *                 &lt;attribute name="ContactUser" type="{http://www.sterlingcommerce.com/documentation/types}UserId" />
     *                 &lt;attribute name="CustomerSatIndicator" type="{http://www.sterlingcommerce.com/documentation/types}CustomerSatisfactionLevel" />
     *                 &lt;attribute name="NoteText" use="required" type="{http://www.sterlingcommerce.com/documentation/types}NoteText" />
     *                 &lt;attribute name="Priority" type="{http://www.sterlingcommerce.com/documentation/types}PriorityWithDecimal" />
     *                 &lt;attribute name="ReasonCode" type="{http://www.sterlingcommerce.com/documentation/types}ReasonCode" />
     *                 &lt;attribute name="SequenceNo" type="{http://www.sterlingcommerce.com/documentation/types}Count" />
     *                 &lt;attribute name="Tranid" type="{http://www.sterlingcommerce.com/documentation/types}TranId" />
     *                 &lt;attribute name="VisibleToAll" type="{http://www.sterlingcommerce.com/documentation/types}Flag" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "note"
    })
    public static class Notes {

        @XmlElement(name = "Note")
        protected List<Opportunity.Notes.Note> note;

        /**
         * Gets the value of the note property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the note property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Opportunity.Notes.Note }
         * 
         * 
         */
        public List<Opportunity.Notes.Note> getNote() {
            if (note == null) {
                note = new ArrayList<Opportunity.Notes.Note>();
            }
            return this.note;
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
         *       &lt;attribute name="AuditTransactionId" type="{http://www.sterlingcommerce.com/documentation/types}TransactionID" />
         *       &lt;attribute name="ContactReference" type="{http://www.sterlingcommerce.com/documentation/types}NotesContactReference" />
         *       &lt;attribute name="ContactTime" type="{http://www.sterlingcommerce.com/documentation/types}TimeStamp" />
         *       &lt;attribute name="ContactType" type="{http://www.sterlingcommerce.com/documentation/types}CommonCode" />
         *       &lt;attribute name="ContactUser" type="{http://www.sterlingcommerce.com/documentation/types}UserId" />
         *       &lt;attribute name="CustomerSatIndicator" type="{http://www.sterlingcommerce.com/documentation/types}CustomerSatisfactionLevel" />
         *       &lt;attribute name="NoteText" use="required" type="{http://www.sterlingcommerce.com/documentation/types}NoteText" />
         *       &lt;attribute name="Priority" type="{http://www.sterlingcommerce.com/documentation/types}PriorityWithDecimal" />
         *       &lt;attribute name="ReasonCode" type="{http://www.sterlingcommerce.com/documentation/types}ReasonCode" />
         *       &lt;attribute name="SequenceNo" type="{http://www.sterlingcommerce.com/documentation/types}Count" />
         *       &lt;attribute name="Tranid" type="{http://www.sterlingcommerce.com/documentation/types}TranId" />
         *       &lt;attribute name="VisibleToAll" type="{http://www.sterlingcommerce.com/documentation/types}Flag" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Note {

            @XmlAttribute(name = "AuditTransactionId")
            protected String auditTransactionId;
            @XmlAttribute(name = "ContactReference")
            protected String contactReference;
            @XmlAttribute(name = "ContactTime")
            @JsonIgnore
            protected String contactTime;
            @XmlAttribute(name = "ContactType")
            protected String contactType;
            @XmlAttribute(name = "ContactUser")
            protected String contactUser;
            @XmlAttribute(name = "CustomerSatIndicator")
            protected String customerSatIndicator;
            @XmlAttribute(name = "NoteText", required = true)
            protected String noteText;
            @XmlAttribute(name = "Priority")
            protected BigDecimal priority;
            @XmlAttribute(name = "ReasonCode")
            protected String reasonCode;
            @XmlAttribute(name = "SequenceNo")
            protected BigInteger sequenceNo;
            @XmlAttribute(name = "Tranid")
            protected String tranid;
            @XmlAttribute(name = "VisibleToAll")
            protected String visibleToAll;

            /**
             * Gets the value of the auditTransactionId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAuditTransactionId() {
                return auditTransactionId;
            }

            /**
             * Sets the value of the auditTransactionId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuditTransactionId(String value) {
                this.auditTransactionId = value;
            }

            /**
             * Gets the value of the contactReference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactReference() {
                return contactReference;
            }

            /**
             * Sets the value of the contactReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactReference(String value) {
                this.contactReference = value;
            }

            /**
             * Gets the value of the contactTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactTime() {
                return contactTime;
            }

            /**
             * Sets the value of the contactTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactTime(String value) {
                this.contactTime = value;
            }

            /**
             * Gets the value of the contactType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactType() {
                return contactType;
            }

            /**
             * Sets the value of the contactType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactType(String value) {
                this.contactType = value;
            }

            /**
             * Gets the value of the contactUser property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getContactUser() {
                return contactUser;
            }

            /**
             * Sets the value of the contactUser property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setContactUser(String value) {
                this.contactUser = value;
            }

            /**
             * Gets the value of the customerSatIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCustomerSatIndicator() {
                return customerSatIndicator;
            }

            /**
             * Sets the value of the customerSatIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCustomerSatIndicator(String value) {
                this.customerSatIndicator = value;
            }

            /**
             * Gets the value of the noteText property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNoteText() {
                return noteText;
            }

            /**
             * Sets the value of the noteText property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNoteText(String value) {
                this.noteText = value;
            }

            /**
             * Gets the value of the priority property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPriority() {
                return priority;
            }

            /**
             * Sets the value of the priority property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPriority(BigDecimal value) {
                this.priority = value;
            }

            /**
             * Gets the value of the reasonCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReasonCode() {
                return reasonCode;
            }

            /**
             * Sets the value of the reasonCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReasonCode(String value) {
                this.reasonCode = value;
            }

            /**
             * Gets the value of the sequenceNo property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSequenceNo() {
                return sequenceNo;
            }

            /**
             * Sets the value of the sequenceNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSequenceNo(BigInteger value) {
                this.sequenceNo = value;
            }

            /**
             * Gets the value of the tranid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTranid() {
                return tranid;
            }

            /**
             * Sets the value of the tranid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTranid(String value) {
                this.tranid = value;
            }

            /**
             * Gets the value of the visibleToAll property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVisibleToAll() {
                return visibleToAll;
            }

            /**
             * Sets the value of the visibleToAll property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVisibleToAll(String value) {
                this.visibleToAll = value;
            }

        }

    }

}