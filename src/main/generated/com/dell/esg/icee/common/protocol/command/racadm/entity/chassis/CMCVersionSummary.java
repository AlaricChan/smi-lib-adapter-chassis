//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.15 at 02:07:00 PM CDT 
//


package com.dell.esg.icee.common.protocol.command.racadm.entity.chassis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cMCVersionSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cMCVersionSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CMC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CMC_Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Updatable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cMCVersionSummary", propOrder = {
    "cmc",
    "cmcVersion",
    "updatable"
})
public class CMCVersionSummary {

    @XmlElement(name = "CMC")
    protected String cmc;
    @XmlElement(name = "CMC_Version")
    protected String cmcVersion;
    @XmlElement(name = "Updatable")
    protected String updatable;

    /**
     * Gets the value of the cmc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMC() {
        return cmc;
    }

    /**
     * Sets the value of the cmc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMC(String value) {
        this.cmc = value;
    }

    /**
     * Gets the value of the cmcVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMCVersion() {
        return cmcVersion;
    }

    /**
     * Sets the value of the cmcVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMCVersion(String value) {
        this.cmcVersion = value;
    }

    /**
     * Gets the value of the updatable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatable() {
        return updatable;
    }

    /**
     * Sets the value of the updatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatable(String value) {
        this.updatable = value;
    }

}