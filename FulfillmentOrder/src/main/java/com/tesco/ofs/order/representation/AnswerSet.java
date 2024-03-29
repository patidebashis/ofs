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
 *         &lt;element ref="{http://www.sterlingcommerce.com/documentation/YFS/createOrder/input}Answers" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="PersonInfoKey" type="{http://www.sterlingcommerce.com/documentation/types}Key" />
 *       &lt;attribute name="QuestionType" use="required" type="{http://www.sterlingcommerce.com/documentation/types}Text-20" />
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
@XmlRootElement(name = "AnswerSet")
public class AnswerSet {

    @XmlElement(name = "Answers")
    protected Answers answers;
    @XmlAttribute(name = "PersonInfoKey")
    protected String personInfoKey;
    @XmlAttribute(name = "QuestionType", required = true)
    protected String questionType;

    /**
     * Gets the value of the answers property.
     * 
     * @return
     *     possible object is
     *     {@link Answers }
     *     
     */
    public Answers getAnswers() {
        return answers;
    }

    /**
     * Sets the value of the answers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Answers }
     *     
     */
    public void setAnswers(Answers value) {
        this.answers = value;
    }

    /**
     * Gets the value of the personInfoKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonInfoKey() {
        return personInfoKey;
    }

    /**
     * Sets the value of the personInfoKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonInfoKey(String value) {
        this.personInfoKey = value;
    }

    /**
     * Gets the value of the questionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionType() {
        return questionType;
    }

    /**
     * Sets the value of the questionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionType(String value) {
        this.questionType = value;
    }

}
