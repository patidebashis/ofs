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
 *       &lt;attribute name="AnswerValue" type="{http://www.sterlingcommerce.com/documentation/types}Text-1000" />
 *       &lt;attribute name="QuestionID" type="{http://www.sterlingcommerce.com/documentation/types}Text-20" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Answer")
public class Answer {

    @XmlAttribute(name = "AnswerValue")
    protected String answerValue;
    @XmlAttribute(name = "QuestionID")
    protected String questionID;

    /**
     * Gets the value of the answerValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnswerValue() {
        return answerValue;
    }

    /**
     * Sets the value of the answerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnswerValue(String value) {
        this.answerValue = value;
    }

    /**
     * Gets the value of the questionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionID() {
        return questionID;
    }

    /**
     * Sets the value of the questionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionID(String value) {
        this.questionID = value;
    }

}
